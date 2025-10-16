package game;

	class Shaman extends Character{
	    Shaman(String name) {
	        super(name);
	        this.health = 150;
	    }

	    void heal() {
	        health += 5;
	        stamina += 5;
	        manna += 5;
	    }
	}
