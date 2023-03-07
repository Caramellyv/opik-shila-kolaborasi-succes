class Enemy {
    String enemy;
    int healthEnemy, attackEnemy, defenseEnemy;
    boolean flagEnemy;

    public Enemy() {
        enemy = "Taufik Mulyawan";
        healthEnemy = 100;
        attackEnemy = 15;
        defenseEnemy = 15;
        flagEnemy = false;
    }
}

public class Shilla extends Enemy {
    String hero;
    int healthPlayer, attackPlayer, defensePlayer;
    boolean flagPlayer;

    public Shilla() {
        hero = "Shilla Agni Nurafifah";
        healthPlayer = 100;
        attackPlayer = 100;
        defensePlayer = 10;
        flagPlayer = true;
    }

    public static void main(String[] args) {
        Shilla objP = new Shilla();

        while(true) {
            if(objP.healthEnemy <= 0) {
                System.out.println("\n============== HERO WIN =============\n"); 
                System.out.println(objP.hero + " memenangkan pertandingan ini");
                break;
            }
            if(objP.healthPlayer <= 0) {
                System.out.println("\n============== ENEMY WIN =============\n");
                System.out.println(objP.enemy + " memenangkan pertandingan ini");
                break;
            } 
            if(objP.flagPlayer) {
                System.out.println("============== HERO TURN =============\n");
                System.out.println(objP.hero + " Menyerang " + objP.enemy + " dengan " + objP.attackPlayer + " damage");
                objP.healthEnemy = objP.healthEnemy - objP.attackPlayer;
                System.out.println("Sisa darah " + objP.enemy + " sebanyak " + objP.healthEnemy);
                objP.flagPlayer = false;
                objP.flagEnemy = true;  
            }else if(objP.flagEnemy) {
                System.out.println("\n============== ENEMY TURN =============\n");
                System.out.println(objP.enemy + " Menyerang " + objP.hero + " dengan " + objP.attackEnemy + " damage");
                objP.healthPlayer = objP.healthPlayer - objP.attackEnemy;
                System.out.println("Sisa darah " + objP.hero + " sebanyak " + objP.healthPlayer);
                objP.flagPlayer = true;
                objP.flagEnemy = false;  
            }
        }
    }
}