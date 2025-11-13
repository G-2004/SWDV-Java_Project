package Combat;
import java.util.Scanner;
import java.util.Random;
import Combat.CharacterNode;

public class Combat {

    public void CombatSort(CharacterNode playerLeader, CharacterNode monsterLeader){//remember these should be head nodes

        CharacterNode[] allNodes = new CharacterNode[8]; //gathers all potential combatants in an array
        int index = 0;

        for (int i = 1; i <= 4; i++) {
            CharacterNode p = playerLeader.grabSlot(i);
            if (p != null) {
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

        for (int i = 0; i < fighters.length; i++) { //print all and their speeds
            CharacterNode node = fighters[i];
            System.out.println(node.getAllegiance() + " " + node.getName() + " Speed: " + node.getSpeed());
        }
    }
}