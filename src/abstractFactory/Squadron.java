package abstractFactory;

public class Squadron {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    public Squadron(SquadronFactory factory){
        this.mage = factory.createMage();
        this.archer = factory.createArcher();
        this.warrior = factory.createWarrior();
    }

    public void fight(){
        mage.spell();
        archer.shoot();
        warrior.attack();
    }
}
