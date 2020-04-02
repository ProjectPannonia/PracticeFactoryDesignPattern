package com.company.factory;

import com.company.factory.modell.Computer;
import com.company.factory.modell.implementations.Pc;
import com.company.factory.modell.implementations.Server;
import com.company.factory.modell.implementations.SuperComputer;
import com.company.factory.types.ComputerTypes;

public class ComputerFactory {
    public static Computer createComputerForMe(ComputerTypes type, String cpu,String ram,String hdd,String ssd,String videoCard){
        Computer computer = null;

        if(type.equals(ComputerTypes.PC)){
            computer = new Pc(cpu,ram,hdd,ssd,videoCard);
        }else if(type.equals(ComputerTypes.SERVER)){
            computer = new Server(cpu,ram,hdd,ssd,videoCard);
        }else if(type.equals(ComputerTypes.SUPERCOMPUTER)){
            computer = new SuperComputer(cpu,ram,hdd,ssd,videoCard);
        }

        return computer;
    }
}
