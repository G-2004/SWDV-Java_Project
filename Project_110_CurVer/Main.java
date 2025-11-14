import java.util.Scanner;
import java.util.Random;
import Combat.CharacterNode;
import Combat.partySort;
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

        System.out.println();
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

        /* party = checkParty(party);
        for (int i=0; i < party.length; i++){
        System.out.print(party[i] + ", ");
        }
        System.out.println("");

        System.out.println("End Final Project."); */
        System.out.println("you should not see this until the end of the game.");
    }

    //#####################################################################################################################
    //#############################################Combat Code#############################################################
    //#####################################################################################################################
    /*
    public static boolean combat(int hp, int maxHp, int spd, int mp, String move1, String move2, String move3, String move4, int enemyHp, int enemySpd, int enemyDmg, String enemyName, String p1Name, double dmgBonus){

        Scanner in = new Scanner(System.in);
        Random randGen = new Random();
        
        int randomHeal = randGen.nextInt(6)+3; // Min 3 Max 8
        int randomDamage = randGen.nextInt(8)+1;
        int randomDamageEnemy = randGen.nextInt(4)+1;
        int randomSandstormDmg = randGen.nextInt(4)+1;

        int roundNum = 1;
        int damageTotal = 1;
        int sandstormTimer = 0;

        boolean sandstormActive = false;
        boolean trapActive = false;

        //########### Move list ########### A list full of all move names that could be called
        String moveAttack = "Attack";
        String moveDefensiveTrap = "Defensive Trap";
        String moveSummonSandstorm = "Summon Sandstorm";
        String moveHeavySlam = "Heavy Slam";
        String moveHeal = "Heal";
        //######### End Move list #########
        String[] moves = {move1, move2, move3, move4}; //Loads moves into the 4 slots


        while ( hp > 0 && enemyHp > 0) {
                System.out.println("Round " + roundNum + "!");
                System.out.println("#################");
                System.out.println("hp       : " + hp);
                System.out.println("speed    : " + spd);
                System.out.println("mana pool: " + mp);
                System.out.println("#################");//these lines provide a visual barrier between your stats and your opponents
                System.out.println("Opponent hp: " + enemyHp);
                System.out.println("#################");
                System.out.println("Select Move:");
                for (int i = 0; i < moves.length; i++) {
                        System.out.println((i + 1) + ": " + moves[i]);
                }
                
                //Below handles most randomizations
                randomHeal = randGen.nextInt(6)+3;
                randomDamage = randGen.nextInt(8)+1;
                randomDamageEnemy = randGen.nextInt(4)+1;
                //Below Takes player input to determine move choice
                int p1Move = in.nextInt();
                String chosenMove = moves[p1Move - 1]; //converts input to string
                //########################################################################################################################
                //Below Determines Which move has been chosen and which code to execute based on if chosenMove equals the move (moves displayed in move list)
                if (chosenMove.equals(moveHeavySlam)) {
                        damageTotal = (int)(randomDamage * dmgBonus + 8);
                        enemyHp -= damageTotal;
                        System.out.println(p1Name + " used Heavy Slam and dealt " + damageTotal + " damage!");
                }
                else if (chosenMove.equals(moveHeal)) {
                        hp += randomHeal;
                        if (hp > maxHp) {
                                hp = maxHp;
                        } 
                        System.out.println(p1Name + " used Heal and recovered " + randomHeal + " HP!");
                }
                else if (chosenMove.equals(moveDefensiveTrap)) {
                        if (trapActive) {
                                System.out.println("... But Defensive Trap is already active.");
                        } else if (mp >= 2) {
                                mp -= 2;
                                trapActive = true;
                                System.out.println(p1Name + " set a Defensive Trap!");
                        } else {
                                System.out.println("... But they lack the needed mana.");
                        }
                }
                else if (chosenMove.equals(moveSummonSandstorm)) {
                        if (sandstormActive) {
                                System.out.println("... But Sandstorm is already active.");
                        } else if (mp >= 3) {
                                mp -= 3;
                                sandstormActive = true;
                                sandstormTimer = 4;
                                System.out.println(p1Name + " summoned a raging Sandstorm!");
                        } else {
                                System.out.println("... But they lack the needed mana.");
                        }
                }
                else if (chosenMove.equals(moveAttack)) {
                        enemyHp = (int)(enemyHp - ((randomDamage * dmgBonus)));
                        damageTotal = (int)(randomDamage * dmgBonus);
                        System.out.println(p1Name + " dealt " + damageTotal + " damage!");
                }
                else {
                        System.out.println("Unknown action!");
                }
//########################################################################################################################
                //Below checks if sandstorm is active and deals damage accordingly
                randomSandstormDmg = randGen.nextInt(4)+1;

                if (sandstormActive == true && !(sandstormTimer < 1)){
                        sandstormTimer = sandstormTimer -1;
                        enemyHp = enemyHp - randomSandstormDmg;
                        System.out.println("The sandstorm battered green " + enemyName + " for " + randomSandstormDmg + " damage.");
                }
                else if ((sandstormActive==true && sandstormTimer < 1)) {
                        sandstormTimer = 0;
                        sandstormActive = false;
                        System.out.println("The sandstorm petered out...");
                }
                else{
                        //null
                }
                //logic that dictates if you won/lost this round below this comment
                if (enemyHp <= 0){
                        System.out.println(p1Name + " is victorious!");
                        return true;
                }
                else if (hp <= 0){
                        while (true){ //An intentional infinate loop requiring a program restart to play any more
                                System.out.println("I lost..?");
                                String dummy = in.nextLine(); 
                        }
                }
                else{
                        for (int i =0; i < 1; ++i) {
                                roundNum++;
                        }
                }
                //Below both checks if the trap is set off and deals damage to the player.
                hp = hp - randomDamageEnemy;
                damageTotal = randomDamageEnemy;
                System.out.println("Green " + enemyName + " slammed into " + p1Name + " for " + damageTotal + " damage.");
                if (trapActive == true && damageTotal > 0) { //this will always activate but I'm just playing with ideas. Maybe I can let it miss later but I'm lazy rn.
                        enemyHp = enemyHp -10;
                        trapActive = false;
                        System.out.println("but also got caught in " + p1Name + "'s trap! dealing 10 damage!");
                }

                //logic that dictates if you won/lost this round below this comment
                if (enemyHp <= 0){
                        System.out.println(p1Name + " is victorious!");
                        return true;
                }
                else if (hp <= 0){
                        while (true){ //An intentional infinate loop requiring a program restart to play any more
                                System.out.println("I lost..?");
                                String dummy = in.nextLine(); 
                        }
                }
                else{
                        for (int i =0; i < 1; ++i) {
                                roundNum++;
                        }
                }

        }
        return false;
    }
        */
    /*public static String[] checkParty(String[] party){
        //the c1 c2 variables stand for choice
        Scanner in = new Scanner(System.in);

        int selection = 1;

        while (selection == 1){
                System.out.println("1: swap party");
                System.out.println("2: leave?"); //we don't actually care what number the user inputs as long as it is indeed a number and is not the number 1

                selection = in.nextInt();

                if(selection == 1){
                        for (int i=0; i < party.length; i++){
                                System.out.print(party[i] + ", ");
                        }
                        System.out.println("Use numbers 1 - 4");
                        System.out.println("swap slot:");
                        int c1 = in.nextInt()-1; // the minus 1 allows users to input numbers that make more sense to the average person
                        System.out.println("with slot:");
                        int c2 = in.nextInt()-1;
                        String temp = party[c1]; //stores value so we don't lose it
                        party[c1] = party[c2];
                        party[c2] = temp;
                        if(c1 > 3 || c2 > 3 || c1 < 0 || c2 < 0){
                                System.out.println("invalid input");
                        }
                        else{
                                for (int i=0; i < party.length; i++){
                                        System.out.print(party[i] + ", ");
                                }
                        }
                        System.out.println("");

                }
                else{
                        return party;
                        //do nothing basically
                }
        }

        return party;// just in case the user does something unexpected that somehow doesn't crash the program
    }
    public static String[] addParty(String newGuy, String[] party){
        for (int i=0; i < party.length; i++){ //This does not currently account for if you already have 4 members.
                if(party[i].equals("")){
                        party[i] = newGuy;
                        return party;
                }
        }

        return party;// if party is full it will simply return the existing party
    }
    public static String[] addParty(String newGuy, String[] party, int slot){ // I could not think of a great use for an overloaded method
        for (int i=slot; i < party.length; i++){
                if(party[i].equals("")){
                        party[i] = newGuy;
                        return party;
                }
        }

        return party;
    }*/

}