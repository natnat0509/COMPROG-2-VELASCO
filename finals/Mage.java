package game;

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