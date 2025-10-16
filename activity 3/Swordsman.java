package game;

class Swordsman extends Character {
    Swordsman(String name) {
        super(name);
        this.health = 170;
    }

    void slash() {
        manna -= 10;
    }

    void showStats() {
        System.out.println("I am powerful!");
        super.showStats();
    }
}

