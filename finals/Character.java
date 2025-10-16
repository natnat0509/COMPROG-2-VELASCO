package game;

import java.util.Scanner;

class Character {
    String name;
    int hp, mp, sp;
    int healPotion = 2;
    int manaPotion = 2;

    Character(String name, int hp, int mp, int sp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.sp = sp;
    }

    void attack(Character enemy) {
        if (sp >= 2) {
            int damage = 10;
            sp -= 2;
            enemy.hp -= damage;
            System.out.println(name + " attacks and deals " + damage + " damage!");
        } else {
            System.out.println(name + " is too tired to attack!");
        }
    }

    void defend() {
        if (sp >= 3) {
            sp -= 3;
            System.out.println(name + " defends and takes reduced damage this turn!");
        } else {
            System.out.println(name + " doesn’t have enough stamina to defend!");
        }
    }

    void useItem() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Choose item to use: ");
			System.out.println("[1] Healing Potion (" + healPotion + " left)");
			System.out.println("[2] Mana Potion (" + manaPotion + " left)");
			int choice = sc.nextInt();

			if (choice == 1 && healPotion > 0) {
			    hp += 30;
			    healPotion--;
			    System.out.println(name + " used a Healing Potion! HP restored by 30.");
			} else if (choice == 2 && manaPotion > 0) {
			    mp += 30;
			    manaPotion--;
			    System.out.println(name + " used a Mana Potion! MP restored by 30.");
			} else {
			    System.out.println("No potions left!");
			}
		}
    }

    boolean isAlive() {
        return hp > 0;
    }

    void showStats() {
        System.out.println("\n=== " + name + " STATS ===");
        System.out.println("HP: " + hp);
        System.out.println("MP: " + mp);
        System.out.println("SP: " + sp);
        System.out.println("Healing Potions: " + healPotion);
        System.out.println("Mana Potions: " + manaPotion);
        System.out.println("====================\n");
    }
}