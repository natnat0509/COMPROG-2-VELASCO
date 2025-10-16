package game;

	class Character {
	    String name;
	    int health;
	    int stamina;
	    int manna;

	    Character(String name) {
	        this.name = name;
	        this.health = 100;
	        this.stamina = 100;
	        this.manna = 100;
	    }

	    void walk() {
	        stamina -= 1;
	    }

	    void run() {
	        stamina -= 3;
	    }

	    void showStats() {
	        System.out.println("Name: " + name);
	        System.out.println("Health: " + health);
	        System.out.println("Stamina: " + stamina);
	        System.out.println("Manna: " + manna);
	        System.out.println();
	    }
	}
