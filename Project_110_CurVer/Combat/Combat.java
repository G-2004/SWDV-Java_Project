package Combat;
import java.util.Scanner;
import java.util.Random;
import Combat.CharacterNode;

public class Combat {

    public void CombatSort(CharacterNode playerLeader, CharacterNode monsterLeader){
        CharacterNode player = playerLeader;
        CharacterNode monster = monsterLeader;
        System.out.println("Player Party:");
        player.printParty();
        System.out.println("");
        System.out.println("Monster Party:");
        monster.printParty();
    }

}