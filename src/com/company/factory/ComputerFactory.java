package com.company.factory;

import com.company.factory.modells.Computer;
import com.company.factory.modells.Pc;
import com.company.factory.modells.Server;
import com.company.factory.modells.SuperComputer;
import com.company.factory.types.ComputerTypes;

public class ComputerFactory {
    public static Computer createComputerForMe(ComputerTypes type, String cpu,String ram,String hdd,String ssd,String videoCard){
        Computer computer = null;

        if(type.equals("PC")){
            computer = new Pc(cpu,ram,hdd,ssd,videoCard);
        }else if(type.equals("SERVER")){
            computer = new Server(cpu,ram,hdd,ssd,videoCard);
        }else if(type.equals("SUPERCOMPUTER")){
            computer = new SuperComputer(cpu,ram,hdd,ssd,videoCard);
        }

        return computer;
    }
}
