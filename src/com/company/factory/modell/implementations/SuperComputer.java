package com.company.factory.modell.implementations;

import com.company.factory.modell.Computer;

public class SuperComputer extends Computer {

    private String cpu;
    private String ram;
    private String hdd;
    private String ssd;
    private String videoCard;

    public SuperComputer(String cpu, String ram, String hdd, String ssd, String videoCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.videoCard = videoCard;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getSsd() {
        return this.ssd;
    }

    @Override
    public String getVideoCard() {
        return this.videoCard;
    }
}
