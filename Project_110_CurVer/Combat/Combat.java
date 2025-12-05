package Combat;
import java.util.Scanner;
import java.util.Random;
import Combat.CharacterNode;

public class Combat {

    private CharacterNode currUnit;
    private CharacterNode[] playerNodes;
    private int playerTeamHP;
    private int enemyTeamHP;
    Scanner in = new Scanner(System.in);

    public void startCombat(CharacterNode playerLeader, CharacterNode monsterLeader){
        CharacterNode[] unitArray = CombatSort(playerLeader, monsterLeader);
        fightTurn(unitArray);
    }

    public void fightTurn(CharacterNode[] fighters){
        int turnNumber = 1;
        boolean fightActive = true;
        int i = 0;
        currUnit = fighters[i];
        moves moves = new moves();

        while(fightActive){
            System.out.println("Round: " + turnNumber);
            getTeamHealths(fighters);
            currUnit = fighters[i];

            System.out.println( currUnit.getName() + "'s turn");

            if(playerTeamHP <= 0 || enemyTeamHP <= 0){
                fightActive = false;
            }
            else if(currUnit.getHp() <= 0){
                //currUnit = fighters[i+1];
            }
            else{
                if(currUnit.getAllegiance() == 1){//allow player input
                    System.out.println("Pick a move:");
                    currUnit.printMoves();
                    int moveSelection = in.nextInt();
                    String moveName = currUnit.getMove(moveSelection);
                    System.out.println("Pick a target:");
                    printUnits(fighters);
                    int targetSelection = in.nextInt();
                    
                    moves.findUsedMove(moveName, fighters[targetSelection - 1], currUnit);
                    
                    
                }

                else{//use ai input
                    

                    //to use ai select a move 1-4 at random.
                    //then select a random target from playerNodes.
                    //if said target does not exist or has 0 hp try again. after a certain number of attempts we should automatically check 1 2 3 4 (0 1 2 3) in order until we find one to hit.
                }

                //make current unit attack
            }

            if(currUnit == fighters[fighters.length-1]){//after the attack phase check all active multi-turn effects.
                moves.checkActiveMTs();
            }

            if(i == fighters.length-1){
                turnNumber = turnNumber + 1;
                i = 0;
            }
            else{
                i = i+1;
            }
        }

        //after fightActive = false
        //decide if game over or not
        getTeamHealths(fighters);
        if(enemyTeamHP <= 0){
            //continue
            System.out.println("You won the battle!");
        }
        else{
            while(true){
                System.out.println("You Lost. Please restart the program.");
                String dummy = in.nextLine();
            }
        }
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