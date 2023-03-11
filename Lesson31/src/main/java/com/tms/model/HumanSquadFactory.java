package com.tms.model;

public class HumanSquadFactory implements SoldierAbstractFactory {

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }

    @Override
    public Wizard createWizard() {
        return new HumanWizard();
    }
}
