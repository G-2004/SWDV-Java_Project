package Combat;
import java.util.Scanner;
import java.util.Random;
import Combat.CharacterNode;

public class Combat {

    private CharacterNode currUnit;
    private CharacterNode[] playerNodes;
    private int playerTeamHP;
    private int enemyTeamHP;
    private TurnState state;
    private String selectedMove;
    
    private int i = 0; //this is mostly for determining the active unit in the fighters array.
    private int turnNumber = 1;
    private moves moves = new moves();
    private CharacterNode[] fighters;

    public CharacterNode getCurrUnit(){
        return currUnit;
    }

    public void startCombat(CharacterNode playerLeader, CharacterNode monsterLeader){
        CharacterNode[] unitArray = CombatSort(playerLeader, monsterLeader); //Sorts fighters into a character node array based on speed
        fightTurn(unitArray); // sets up the window for combat
    }

    enum TurnState {
        PLAYER_CHOOSE_MOVE,
        PLAYER_CHOOSE_TARGET,
        AI_TURN,
        CHECK_END
        //Add one called display stats
    }

    private void startNextTurn(CombatGui gameWindow, CharacterNode[] fighters) {
        getTeamHealths(fighters);

        if (playerTeamHP <= 0 || enemyTeamHP <= 0) {//checks if one side has won
            endCombat(gameWindow);
            return;
        }

        currUnit = fighters[i];

        if (currUnit.getHp() <= 0) {//skip if unit dead
            advanceIndex();
            startNextTurn(gameWindow, fighters);
            return;
        }

        if (currUnit.getAllegiance() == 1) {//if player start player turn if ai go through ai processes
            playerTurn(gameWindow, fighters);
        } 
        else {
            aiTurn(gameWindow, fighters);
        }
    }

    private void playerTurn(CombatGui gameWindow, CharacterNode[] fighters) {
        state = TurnState.PLAYER_CHOOSE_MOVE; //updates state
        gameWindow.clearInputPanel();//reset the window accordingly

        gameWindow.setMoveCallback(move -> { //give the window a reference of what to do when an option is selected //This is not where anything actually happens
            selectedMove = move;
            chooseTarget(gameWindow, fighters);
        });

        gameWindow.moveSelectorMode(fighters, currUnit); //update screen to select a move menu for current unit
    }

    private void chooseTarget(CombatGui gameWindow, CharacterNode[] fighters) {
        state = TurnState.PLAYER_CHOOSE_TARGET;
        gameWindow.clearInputPanel();

        gameWindow.setTargetCallback(index -> {
            executeMove(gameWindow, fighters[index]);
            advanceIndex();
            startNextTurn(gameWindow, fighters);
        });

        gameWindow.targetSelectorMode(fighters);
    }

    private void executeMove(CombatGui gameWindow, CharacterNode target) {
        moves.findUsedMove(selectedMove, target, currUnit);
        gameWindow.clearInputPanel();
    }

    private void advanceIndex() {
        if (i == fighters.length - 1) {
            i = 0;
            turnNumber++;
            moves.checkActiveMTs();
        } else {
            i++;
        }
    }

    private void aiTurn(CombatGui gameWindow, CharacterNode[] fighters) {//currently just advances to the next turn
        // pick move + target
        // executeMove(...)
        advanceIndex();
        startNextTurn(gameWindow, fighters);
    }

    private void endCombat(CombatGui gameWindow) {
        if (enemyTeamHP <= 0) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }

        gameWindow.dispose();
    }

    public void fightTurn(CharacterNode[] fighters){

        this.fighters = fighters;

        CombatGui gameWindow = new CombatGui(fighters); //creates the gui window
        gameWindow.setVisible(true);

        startNextTurn(gameWindow, fighters);//starts the first turn
    }

    public CharacterNode findCurrUnit(){
        return currUnit;
    }

    public CharacterNode[] CombatSort(CharacterNode playerLeader, CharacterNode monsterLeader){//remember these should be head nodes

        CharacterNode[] allNodes = new CharacterNode[8]; //gathers all potential combatants in an array
        playerNodes = new CharacterNode[4];
        int index = 0;

        for (int i = 1; i <= 4; i++) {
            CharacterNode p = playerLeader.grabSlot(i);
            if (p != null) {
                playerNodes[i] = p;
                allNodes[index++] = p;
            }
            CharacterNode m = monsterLeader.grabSlot(i);
            if (m != null) {
                allNodes[index++] = m;
            }
        }

        CharacterNode[] fighters = new CharacterNode[index]; //creates an array of a size equaling the actual number of combatants
        for (int i = 0; i < index; i++) {
            fighters[i] = allNodes[i]; //fills in that array with those combatants
        }

        for (int i = 0; i < fighters.length - 1; i++) {//loop through all slots in array other than last (so we don't go out of bounds)
            for (int j = 0; j < fighters.length - 1 - i; j++) {//has the next position after j already been shown as slowest/sorted?
                if (fighters[j].getSpeed() < fighters[j + 1].getSpeed()) { //is j slower than what comes after it
                    CharacterNode temp = fighters[j];//if j is slower swap their positions so the faster is first
                    fighters[j] = fighters[j + 1];
                    fighters[j + 1] = temp;
                }
                //else j is faster and so whatever is after remains after j
            }
        }

        currUnit = fighters[0];

        for (int i = 0; i < fighters.length; i++) { //print all and their speeds
            CharacterNode node = fighters[i];
            System.out.println(node.getAllegiance() + " " + node.getName() + " Speed: " + node.getSpeed());
        }
        
        return fighters;
    }

    public void printUnits(CharacterNode[] fighters){
        for (int i = 0; i < fighters.length; i++) { //print all and their speeds
            CharacterNode node = fighters[i];
            int numberSelector = i+1;
            System.out.println( numberSelector + ": " + node.getName() + " Hp: " + node.getHp() + "/" + node.getHpMax());
        }
    }

    public void getTeamHealths(CharacterNode[] fighters){
        playerTeamHP=0;
        enemyTeamHP=0;
        for (int i = 0; i < fighters.length; i++) { //determines team health
            CharacterNode node = fighters[i];
            if(node.getAllegiance() == 1) {
                playerTeamHP = playerTeamHP + node.getHp();
            }
            else {
                enemyTeamHP = enemyTeamHP + node.getHp();
            }
            System.out.println("Team 1 hp: " + playerTeamHP);//remove these. these are for testing
            System.out.println("Team 2 hp: " + enemyTeamHP);
        }
    }


}