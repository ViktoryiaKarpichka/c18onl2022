package com.tms.model;

public class OrcSquadFactory implements SoldierAbstractFactory {

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Wizard createWizard() {
        return new OrcWizard();
    }
}
