package com.company.factory.modell;

public abstract class Computer {
    public abstract String getCpu();
    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getSsd();
    public abstract String getVideoCard();

    public String toString(){
       return  "Cpu: " + this.getCpu() + ", Ram: " + this.getRam() +
               ", Hdd: " + this.getHdd() + ", Ssd: " + this.getSsd() +
               ", Video Card: " + this.getVideoCard() + ".";
    }
}
