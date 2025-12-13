import java.util.Scanner;
import java.util.Random;
import Combat.CharacterNode;
import Combat.partySort;
import Combat.CombatGui;
import Story_paths.pathA;
import Story_paths.pathB;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random randGen = new Random();

        String treeType1 = "ERROR"; //I don't know why but giving these a default value before defining them properly later on is necessary for the code to run.
        String partnerWeapon = "ERROR";

        
        System.out.print("Enter your character's name: ");
        String name = in.nextLine();

        System.out.print("Choose a pronoun subject (he/she/they): ");
        String proSubj = in.next().toLowerCase();         // e.g., he / she / they

        System.out.print("Choose a pronoun object (him/her/them): ");
        String proObj = in.next().toLowerCase();          // e.g., him / her / them

        System.out.print("Choose a possessive adjective (his/her/their): ");
        String proPossAdj = in.next().toLowerCase();      // e.g., his / her / their

        System.out.print("Enter your character's age: ");
        int age = in.nextInt();
        in.nextLine(); //This line is here to fix an issue where a nextLine following a next of any other variety ignores the nextLine

        int gold = 12;

        System.out.println("");
        System.out.println("~ ~ ~ Adventure Prologue ~ ~ ~");
        System.out.println(name + " set out at dawn, " + proPossAdj + " pack light and hopes high.");
        System.out.println("At only " + age + " years old, " + proSubj + " already carries stories that most would never dare to tell.");
        System.out.println("in the pouch at " + proPossAdj + " side clinked " + gold + " gold coins— "
                + "not much, but enough for bread and a bed in a quiet inn.");
        System.out.println("A weathered sign pointed toward the Whispering Woods, and " + proSubj
                + " felt a shiver that had nothing to do with the cold.");
        System.out.println("Whatever waited beyond the treeline would test " + proObj + ", but " + name
                + " walked on without looking back.");

        int randomValue = randGen.nextInt(10)+1; //gives random values to select from later on to make each run more unique

        if(randomValue <= 5 ){ //example of comment above. Random values being used to make each story more unique.
                treeType1 = "pine";

        }
        else if (randomValue <= 8){
                treeType1 = "oak";

        }
        else if (randomValue <= 10){
                treeType1 = "birch";

        }
        else{
                System.out.println(" ");
                System.out.println("A minor background error has occurred");
                treeType1 = "mangrove";

        }


        System.out.println(" ");
        System.out.println("Disappearing into the trees " + name + " found themselves enveloped by darkness and the sound of the forest with only the visage of nearby ");
        System.out.println(treeType1 + " trees guiding " + proPossAdj + " path.");
        System.out.println("Enter an emotion: ");
        String emotion = in.nextLine(); //should define emotion expressed in the following line
        System.out.println("As the forest got darker and darker " + name + " was filled with " + emotion + ".");
        System.out.println("That " + emotion + " would soon find an end in " + name + " as " + proSubj + " found themselves completely enveloped by the darkness");
        System.out.println("Enter an attack sound (whoosh/clink/thunk/etc...): ");
        String atkSound = in.nextLine();
        System.out.println("Enter the name of a body part: ");
        String bodyPart = in.nextLine();
        System.out.println("and a swift " + atkSound + ", followed by pain in " + proPossAdj + " " + bodyPart + " then true darkness"); //END "PARAGRAPH"

        System.out.println("");
        System.out.println("Enter the name of a fruit: ");
        String fruit = in.nextLine();
        System.out.println("Enter an amount of days: ");
        int daysUnconscious = in.nextInt();
        in.nextLine();
        System.out.println("");

        System.out.println(name + " found " + proObj + "self " + " lying down being stared at from above by a familiar face. In the old " + fruit + " orchard where he'd spent most of his life");
        System.out.print("this woman staring at " + proObj + " was " + proPossAdj + ": ");
        String relationship = in.nextLine();
        System.out.println("");
        System.out.println("this woman staring at " + proObj + " was " + proPossAdj + " " + relationship);
        System.out.println("The best " + relationship + " " + proSubj + " ever had and hopefully ever would. With a wonderous name being...");
        System.out.println("being...");
        System.out.println("being......");
        System.out.println("...being.........");
        System.out.println("being: ");
        String partnerName = in.nextLine();
        System.out.println("");
        System.out.println(partnerName + ": " + "thank goodness your okay " + name + " I found you lying unconscious in the " + treeType1 + " forest. " );
        System.out.println(partnerName + ": " + "It's been " + daysUnconscious + " days since you left on your mission.");
        System.out.println(partnerName + ": " + "what happened in there? " + "and how did you get the bruise near your " + bodyPart + "?");
        System.out.println(name + " recalled everything he could remember about the trip which wasn't a lot.");
        System.out.println(partnerName + ": " + "Well I think I'll go with you this time in order to keep your dumbarse safe and make the mission successful.");
        System.out.println("and so the two set off into the " + treeType1 + " forest");
        System.out.println("As " + partnerName + " and " + name + " were traveling they came across a monster one " + name + " was plenty familiar with." );
        System.out.println("It's gelatenous form, bouncy movement, transparent insides, and that ability to burn the skin off you with a mere touch this could be nothing other than a ");
        System.out.println("green...");
        System.out.println("a green...");
        System.out.println("a green......");
        System.out.print("a green: ");
        String monster1 = in.nextLine();

        int randomValue2 = randGen.nextInt(10)+1; //Not sure why but the program does not function when randomValue2 is left as randomValue hense the use of a new variable

        if(randomValue2 <= 5 ){
                partnerWeapon = "axe";

        }
        else if (randomValue2 <= 8){
                partnerWeapon = "rapier";

        }
        else if (randomValue2 <= 10){
                partnerWeapon = "spear";

        }
        else{
                System.out.println(" ");
                System.out.println("A minor background error has occurred"); //This is to denote to me that I messed up the math and randomValue2 has gone over the expected maximum of 10
                partnerWeapon = "scythe";

        }

        System.out.println(partnerName + " had sliced the beast in half with her " + partnerWeapon + ".");
        System.out.println(partnerName + ": " + "are you okay " + name + "?");
        System.out.println("While " + name + " responed as if there were no problem " + proSubj + " was stunned and concerned. For a moment " + proSubj + " had genuinely and fully forgotten the name of a common green " + monster1 + ".");
        System.out.println("Even more-so just earlier in the day " + proSubj + " had forgotten " + proPossAdj + " " + relationship + "'s name. What other information had " + proSubj + " forgotten...?"); 
        int worryAge = age + 5;
        System.out.println("Was it " + proPossAdj + " age? " + proSubj + " was " + age + " now and forgetting things what about when " + proSubj + " was " + worryAge + "? Would " + proSubj + " be able to remember anything at all?" );
        System.out.println(""); //End of project 1 code
        System.out.println("*Grumble*");
        System.out.println("It seems that all the worrying had made " + name + " quite famished.");
        System.out.println("Looking into their pack " + proSubj + " and " + partnerName + " had left without hardly packing anything." );
        System.out.println("Foolishly they presumed the bag was full because it was heavy. heavy with the weight of clothes and weapons" );
        System.out.println(partnerName + ": I'll go out to hunt down something for dinner. You set us up a camp for the night." );
        System.out.println(name + " began to fashion a tent with local sticks and the linens in the bag.");
        System.out.println("When suddenly flying through the bushes another green " + monster1 + " launched itself towards " + name);
        System.out.println(name + " rushed over to the bag to grab a: (please select with 1 2 or 3 and enter)");
        System.out.println("1: axe");
        System.out.println("2: broadsword");
        System.out.println("3: dagger");
        
        int proWep = in.nextInt();
        //############################################
                int hp = 1;
                int maxHp = 1;
                int spd = 1;
                int mp = 1;
                double dmgBonus = 1.0;
                String proWeapon = "needle";
                String move1;
                String move2;
                String move3 = "Heal";
                String move4 = "wait";
                int p1Move = 1;
                
        //############################################
        if (proWep == 1){ //implementation of more advanced if-else statemnt
                hp = 40;
                maxHp = 40;
                spd = 6;
                mp = 6;
                dmgBonus = 1.6;
                proWeapon = "axe";
                move1 = "Attack";
                move2 = "Heavy Slam";
        }
        else if (proWep == 2){
                hp = 40;
                maxHp = 40;
                spd = 6;
                mp = 8;
                dmgBonus = 1.0;
                proWeapon = "broadsword";
                move1 = "Attack";
                move2 = "Summon Sandstorm";
        }
        else{
                hp = 20;
                maxHp = 20;
                spd = 24;
                mp = 6;
                dmgBonus = 2.5;
                proWeapon = "dagger";
                move1 = "Attack";
                move2 = "Defensive Trap";
        }

        CharacterNode playerCharacter = new CharacterNode(name, maxHp, maxHp, dmgBonus, spd, mp, move1, move2, "null", "null", 1);//currently unused. will rewrite combat code next time.
        //ADD COMBAT HERE
        CharacterNode partnerA = new CharacterNode(partnerName, 30, 30, 1, 12, 10, move1, move2, "null", "null", 1);
        CharacterNode playerHead = new CharacterNode();
        playerHead.setNext(playerCharacter);
        playerHead.setLast(partnerA);

        partySort pSort = new partySort();
        pSort.sortParty(playerHead);

        System.out.println("After explaining to " + partnerName + " what occurred the two set up camp");//CREATE NEW CAMP FUNCTIONS

        System.out.println("After the two pick up camp they travel until they reach a fork in the road");
        System.out.println("They could either ");
        System.out.println("1: Go to town");
        System.out.println("2: Continue on the path");
        int selection = in.nextInt(); //allows player to decide which path to take leading to a new party member that changes depening on where they go.
        if(selection == 1){
                System.out.println("The two head to town. While at the local market they overhear a gruff voice arguing");
                System.out.println("with a blacksmith.");
                CharacterNode partnerB = new CharacterNode("Bernard", maxHp, maxHp, dmgBonus, 24, mp, move1, move2, "null", "null", 1);
                pathA currPathA = new pathA();
                currPathA.playPathA(playerCharacter, partnerA, partnerB);
        }
        else if(selection == 2){
                System.out.println("The two continue on the path until they run into a girl crouched down with a crossbow.");
                CharacterNode partnerB = new CharacterNode("Syldeva", maxHp, maxHp, dmgBonus, spd, mp, move1, move2, "null", "null", 1);
        }

        System.out.println("You've completed the game");
        System.out.println("A dog appears!");
        while(true){
                System.out.println("1: pet the dog");
                int dummyVal = in.nextInt();
                System.out.println("It looks happy.");
        }
    }

}