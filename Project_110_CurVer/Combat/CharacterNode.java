package Combat;

public class CharacterNode {

        //private variables
        private CharacterNode nextNode;
        private String name;
        private int hp;
        private int maxHp;
        private double bonus;
        private int spd;
        private int mp;
        private int allegiance;

        private String move1;
        private String move2;
        private String move3;
        private String move4;

        //set CharacterNode details automatically--------------------------------------------------------------------------------
        public CharacterNode(){
                this.name = "nullbert";
                this.hp = 1;
                this.maxHp = 1;
                this.bonus = 2;
                this.spd = 3;
                this.mp = 4;
                this.move1 = "slash";
                this.move2 = "slash";
                this.move3 = "slash";
                this.move4 = "slash";
                this.allegiance = 0;
        }
        public CharacterNode(String name,int hp,int maxHp, double bonus, int spd, int mp, String move1, String move2, String move3, String move4, int allegiance){
                this.name = name;
                this.hp = hp;
                this.maxHp = maxHp;
                this.bonus = bonus;
                this.spd = spd;
                this.mp = mp;
                this.move1 = move1;
                this.move2 = move2;
                this.move3 = move3;
                this.move4 = move4;
                this.allegiance = allegiance;
        }
        //set CharacterNode details manually-------------------------------------------------------------------------------------
        public void setStats(){
                this.name = "null";
                this.hp = 1;
                this.bonus = 2;
                this.spd = 3;
                this.mp = 4;
                this.allegiance = 0;
        }
        public void setStats(String name,int hp, int maxHp, double bonus, int spd, int mp, int allegiance){
                //exists just so you can put in the above details //fix this. this is not how this works.
        }
        public void setMoves(){
                this.move1 = "slash";
                this.move2 = "slash";
                this.move3 = "slash";
                this.move4 = "slash";
        }
        public void setMoves(String move1,String move2,String move3,String move4){
                //exists just so you can put in the above details //fix this. this is not how this works.
        }
        //Print CharacterNode details--------------------------------------------------------------------------------------------
        public void printStats(){
                System.out.println("Stats:");
                System.out.println(name);
                System.out.println(hp);
                System.out.println(bonus);
                System.out.println(spd);
                System.out.println(mp);
        }
        public void printMoves(){
                System.out.println("Moves:");
                System.out.println(move1);
                System.out.println(move2);
                System.out.println(move3);
                System.out.println(move4);
        }
        public void printAll(){
                System.out.println("Stats:");
                System.out.println(name);
                System.out.println(hp);
                System.out.println(bonus);
                System.out.println(spd);
                System.out.println(mp);
                System.out.println("");
                System.out.println("Moves:");
                System.out.println(move1);
                System.out.println(move2);
                System.out.println(move3);
                System.out.println(move4);
        }
        //return values------------------------------------------------------------------------------------------------------
        public String getName(){
                return name;
        }
        public int getHp(){
                return hp;
        }
        public int getHpMax(){
                return maxHp;
        }
        public double getBonus(){
                return bonus;
        }
        public int getSpeed(){
                return spd;
        }
        public int getMp(){
                return mp;
        }
        public String getMove(int slot){
                if(slot == 1){
                        return move1;
                }
                else if(slot == 2){
                        return move2;
                }
                else if(slot == 3){
                        return move3;
                }
                else{
                        return move4;
                }
        }
        public int getAllegiance(){
                return allegiance;
        }
        //used for ordering------------------------------------------------------------------------------------------------------
        public void setLast(CharacterNode lastLoc){
                if (nextNode != null) {
                        CharacterNode tmpNext = this.getNext();
                        tmpNext.setLast(lastLoc);
                }
                else{
                        this.setNext(lastLoc);
                }
        }
        public void setNext(CharacterNode nextLoc) {
                this.nextNode = nextLoc;
        }
        public CharacterNode getNext() {
                return this.nextNode;
        }
        public void printParty(){
                System.out.println(this.name);
                if (nextNode != null){
                        CharacterNode tmpNext = this.getNext();
                        tmpNext.printParty();
                }
        }
        
}