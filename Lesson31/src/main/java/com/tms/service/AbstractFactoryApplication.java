package com.tms.service;

import static com.tms.service.ApplicationConfiguration.Type.ELF;
import static com.tms.service.ApplicationConfiguration.Type.HUMAN;
import static com.tms.service.ApplicationConfiguration.Type.ORC;

import com.tms.model.Archer;
import com.tms.model.SoldierAbstractFactory;
import com.tms.model.Warrior;
import com.tms.model.Wizard;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        SoldierAbstractFactory squadHuman = configuration.createSquad(HUMAN);
        {
            Warrior warrior = squadHuman.createWarrior();
            warrior.act();
            Wizard wizard = squadHuman.createWizard();
            wizard.act();
            Archer archer = squadHuman.createArcher();
            archer.act();
        }

        {
            SoldierAbstractFactory squadOrc = configuration.createSquad(ORC);
            Warrior warrior = squadOrc.createWarrior();
            warrior.act();
            Wizard wizard = squadOrc.createWizard();
            wizard.act();
            Archer archer = squadOrc.createArcher();
            archer.act();
        }

        {
            SoldierAbstractFactory squadElf = configuration.createSquad(ELF);
            Warrior warrior = squadElf.createWarrior();
            warrior.act();
            Wizard wizard = squadElf.createWizard();
            wizard.act();
            Archer archer = squadElf.createArcher();
            archer.act();
        }

    }
}
