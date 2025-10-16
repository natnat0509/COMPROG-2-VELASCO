package game;

public class Main {

	public static void main(String[] args) {
       
        Character character = new Character("Hero");
        character.walk();
        character.walk();
        character.walk();
        character.run();
        character.run();
        character.showStats();

        Shaman shaman = new Shaman("Mystic");
        shaman.walk();
        shaman.walk();
        shaman.walk();
        shaman.run();
        shaman.run();
        shaman.heal();
        shaman.showStats();

        Swordsman swordsman = new Swordsman("Blade");
        swordsman.walk();
        swordsman.walk();
        swordsman.walk();
        swordsman.run();
        swordsman.run();
        swordsman.slash();
        swordsman.showStats();

        
    }
}
