package game;

class Warrior extends Character {
    Warrior(String name) {
        super(name, 120, 50, 100);
    }

    void bloodthirst() {
        if (sp >= 30) {
            sp -= 30;
            System.out.println(name + " used Bloodthirst! Next attack heals for 50% of the damage.");
            hp += 5; // small heal to show effect
        } else {
            System.out.println("Not enough SP!");
        }
    }
}
