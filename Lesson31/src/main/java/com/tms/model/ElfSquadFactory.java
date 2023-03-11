package com.tms.model;

public class ElfSquadFactory implements SoldierAbstractFactory {

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Wizard createWizard() {
        return new ElfWizard();
    }
}
