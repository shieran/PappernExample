package abstractFactory;

abstract public class SquadronFactory {
    abstract Mage createMage();
    abstract Archer createArcher();
    abstract Warrior createWarrior();
}
