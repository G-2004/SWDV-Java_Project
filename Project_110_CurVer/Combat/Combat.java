package Combat;
import java.util.Scanner;
import java.util.Random;
import Combat.Character;

public class Combat {

    public void CombatSort(Character head){
        Character p1 = head;
        p1.printAll();
        Character p2 = head.getNext();
        p2.printAll();
        Character p3 = p2.getNext();
        p3.printAll();
        Character p4 = p3.getNext(); //write code so that if there is no next node it skips or uses a default dummy character
        p4.printAll();
    }

}