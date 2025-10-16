package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			Random rand = new Random();

			System.out.println("=== TEXT-BASED FIGHTING GAME ===");
			System.out.println("Choose your class:");
			System.out.println("[1] Warrior");
			System.out.println("[2] Mage");
			int choice = sc.nextInt();

			Character player;
			Character enemy;

			if (choice == 1) {
			    player = new Warrior("Player (Warrior)");
			    enemy = new Mage("Enemy Mage");
			} else {
			    player = new Mage("Player (Mage)");
			    enemy = new Warrior("Enemy Warrior");
			}

			// Game loop
			while (player.isAlive() && enemy.isAlive()) {
			    player.showStats();
			    enemy.showStats();

			    System.out.println("Choose an action:");
			    System.out.println("[1] Attack");
			    System.out.println("[2] Defend");
			    System.out.println("[3] Use Item");
			    if (player instanceof Warrior) System.out.println("[4] Bloodthirst");
			    if (player instanceof Mage) System.out.println("[4] Fireball");
			    int action = sc.nextInt();

			    switch (action) {
			        case 1: player.attack(enemy); break;
			        case 2: player.defend(); break;
			        case 3: player.useItem(); break;
			        case 4:
			            if (player instanceof Warrior) ((Warrior) player).bloodthirst();
			            else if (player instanceof Mage) ((Mage) player).fireball(enemy);
			            break;
			        default: System.out.println("Invalid action!");
			    }

			    if (enemy.isAlive()) {
			        int enemyAction = rand.nextInt(2);
			        if (enemyAction == 0) enemy.attack(player);
			        else enemy.defend();
			    }
			}

			if (player.isAlive())
			    System.out.println("You win!");
			else
			    System.out.println("You were defeated...");
		}
    }
}
