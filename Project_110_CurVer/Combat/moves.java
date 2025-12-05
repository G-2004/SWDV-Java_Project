package Combat;
import java.util.Scanner;
import Combat.CharacterNode;
import Combat.Combat;
import java.util.Random;

public class moves {

    private CharacterNode target;
    private CharacterNode actor;

    //private boolean sandstormActive;

    public void checkActiveMTs(){
        
    }
    /* activateSandstorm(target, actor){
        sandstorm Active = true;    
    }
     */

    public void findUsedMove(String moveName, CharacterNode targ, CharacterNode act){

        target = targ;
        actor = act;

        if(moveName.equals("Attack")){
            useAttack();
        }
        else if(moveName.equals("Summon Sandstorm")){
            useSandstorm();
            //activateSandstorm();
        }
        else{
            System.out.println("something went wrong");
        }
    }

    public void useAttack(){
        int targHp = target.getHp();
        Random randGen = new Random();
        int randomDamage = randGen.nextInt(8)+1;
        int damageTotal = (int)(randomDamage * actor.getBonus() + 8);
        target.setHp(targHp - damageTotal);
    }

    public void useSandstorm(){
        //should do between 1-3 damage between every round

        //should initialize itself with 3 turns remaining

        //each time the command is run it should decrease those turns by 1

        //if = 0 turns remaining sandstorm active is set to false
    }
}