package Story_paths;
import java.util.Scanner;
import Combat.Character;
import Combat.Combat;

public class pathA {
    public void playPathA(Character playerChar, Character partnerA, Character partnerB){
        
        
            Scanner in = new Scanner(System.in);
            
            String nameC = partnerB.getName();
            String name = playerChar.getName();

            playerChar.setNext(partnerA);//REMOVE THIS
            partnerA.setNext(partnerB);//REMOVE THIS
            Combat currCombat = new Combat();//REMOVE THIS
            currCombat.CombatSort(playerChar);//REMOVE THIS

            System.out.println("blacksmith: " + nameC + "! How many times do I have to explain this to you!");
            System.out.println("I can not forge you a blade made of dead bees and rocks you found on");
            System.out.println("the side of the road. they simply are not practical materials for a weapon.");
            System.out.println(nameC + ": but I need this. all I have is my hive, and I really need a weapon to go");
            System.out.println("and save my wife from the demon prince");
            System.out.println("enter the princes name:");
            String bigBadName = in.nextLine();
            System.out.println(name + ": " + bigBadName + "... " + name + " mutters.");
            System.out.println(nameC + " darts over to " + name + " upon hearing the name " + bigBadName);
            System.out.println(nameC + " looks you up and down.");
            System.out.println(nameC + ": I know you. you're the hero of Cherlonn!");
            System.out.println(nameC + ": Please I presume you are on your way to defeat the demon prince. Let me come with you");
            System.out.println("let him come with you?");
            System.out.println("1: yes");
            System.out.println("2: yes");
            int dummy = in.nextInt();
            System.out.println(nameC + " has joined your party.");
            System.out.println("...");
            System.out.println(name + ": Cherlonn... isn't that where I fought that ... in that castle? Count ...");
            System.out.println("enter a monster name:");
            String monster2 = in.nextLine();
            System.out.println("enter the counts name:");
            String countName = in.nextLine();
            System.out.println("right the wretched " + monster2 + ", Count " + countName);
            System.out.println("there was no creature " + name + " saw as more vile than a " + monster2);
            //And then we will add in a small shop and a combat against a monster2 later that night.
    }
}