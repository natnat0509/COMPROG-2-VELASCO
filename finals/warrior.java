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

// Example subclass 2: Mage
class Mage extends Character {
    Mage(String name) {
        super(name, 90, 120, 60);
    }

    void fireball(Character enemy) {
        if (mp >= 25) {
            mp -= 25;
            int damage = 20;
            enemy.hp -= damage;
            System.out.println(name + " casts Fireball! Deals " + damage + " magic damage.");
        } else {
            System.out.println("Not enough MP!");
        }
    }
}
