package com.tms.service;

import com.tms.model.ElfSquadFactory;
import com.tms.model.HumanSquadFactory;
import com.tms.model.OrcSquadFactory;
import com.tms.model.SoldierAbstractFactory;

public class ApplicationConfiguration {

    enum Type {
        ORC, HUMAN, ELF
    }

    SoldierAbstractFactory createSquad(Type type) {
        return switch (type) {
            case ELF -> new ElfSquadFactory();
            case ORC -> new OrcSquadFactory();
            case HUMAN -> new HumanSquadFactory();
        };
    }
}
