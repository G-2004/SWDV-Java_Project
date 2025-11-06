public class Character {

        //I think this is how I'm
        private String name;
        private int hp;
        private int bonus;
        private int spd;
        private int mp;

        private String move1;
        private String move2;
        private String move3;
        private String move4;

        //set character details automatically--------------------------------------------------------------------------------
        public Character(){
                name = "null";
                hp = 1;
                bonus = 2;
                spd = 3;
                mp = 4;
                move1 = "slash";
                move2 = "slash";
                move3 = "slash";
                move4 = "slash";
        }
        public Character(String name,int hp, int bonus, int spd, int mp, String move1, String move2, String move3, String move4){
                //exists just so you can put in the above details
        }
        //set character details manually-------------------------------------------------------------------------------------
        public void setStats(){
                name = "null";
                hp = 1;
                bonus = 2;
                spd = 3;
                mp = 4;
        }
        public void setStats(String name,int hp, int bonus, int spd, int mp){
        }
        public void setMoves(){
                move1 = "slash";
                move2 = "slash";
                move3 = "slash";
                move4 = "slash";
        }
        //Print character details--------------------------------------------------------------------------------------------
        public void printStats(){
                System.out.println(name);
                System.out.println(hp);
                System.out.println(bonus);
                System.out.println(spd);
                System.out.println(mp);
        }
        public void printMoves(){
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
        public int getBonus(){
                return bonus;
        }
        public int getSpeed(){
                return spd;
        }
        public int getMp(){
                return mp;
        }
}