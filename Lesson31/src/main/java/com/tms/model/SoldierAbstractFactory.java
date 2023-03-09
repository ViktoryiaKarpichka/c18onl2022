package com.tms.model;

public interface SoldierAbstractFactory {

    Warrior createWarrior();

    Archer createArcher();

    Wizard createWizard();

}
