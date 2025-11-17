package Combat;
import java.util.Scanner;
import Combat.CharacterNode;
import Combat.Combat;



public class partySort {

    private int selection;

    public void sortParty(CharacterNode headNode){
        Scanner in = new Scanner(System.in);
        
        this.selection = 1;
        while(this.selection == 1){
            System.out.println("Adjust Party?");
            System.out.println("1: yes");
            System.out.println("2: no");
            this.selection = in.nextInt();
            System.out.println("place who in what spot?");
            headNode.printParty();
            System.out.println("Who to move?");
            int choice = in.nextInt();
            CharacterNode moveMe = headNode.grabSlot(choice);
            System.out.println("Who to put them after?");
            choice = in.nextInt();
            CharacterNode withMe = headNode.grabSlot(choice);
            moveMe.swapPosition(withMe, headNode);
        }
    }
}