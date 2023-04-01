package com.tms.service;

import static com.tms.service.ApplicationConfiguration.Type.ELF;
import static com.tms.service.ApplicationConfiguration.Type.HUMAN;
import static com.tms.service.ApplicationConfiguration.Type.ORC;

import com.tms.model.SoldierAbstractFactory;
import java.util.Arrays;
import java.util.List;

public class AbstractFactoryApplication {

    public static void main(String[] args) {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        List<SoldierAbstractFactory> squads = Arrays.asList(configuration.createSquad(HUMAN),
                                                            configuration.createSquad(ORC),
                                                            configuration.createSquad(ELF));
        for (SoldierAbstractFactory factory : squads) {
            factory.createWizard().act();
            factory.createArcher().act();
            factory.createWarrior().act();
        }
    }
}
