package abstractFactory;

public class ElfsSquadronFactory extends SquadronFactory {
    @Override
    Mage createMage() {
        return new ElfMage();
    }

    @Override
    Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    Warrior createWarrior() {
        return new ElfWarrior();
    }
}
