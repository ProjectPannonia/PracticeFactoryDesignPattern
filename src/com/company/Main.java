package com.company;

import com.company.factory.ComputerFactory;
import com.company.factory.modell.Computer;
import com.company.factory.types.ComputerTypes;

public class Main {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.createComputerForMe(ComputerTypes.PC,"Intel i3","4 gb","500 gb","128 gb","GTX 1050");
        Computer server = ComputerFactory.createComputerForMe(ComputerTypes.SERVER,"Intel i7","32 gb","10 tb","1 tb","GTX 1060");
        Computer supercomputer = ComputerFactory.createComputerForMe(ComputerTypes.SUPERCOMPUTER,"Intel i9","64 gb","20 tb","10 tb","RTX 2080");


        System.out.println(pc.toString());
        System.out.println();

        System.out.println(server.toString());
        System.out.println();

        System.out.println(supercomputer.toString());
    }
}
