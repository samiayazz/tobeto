package com.tobeto.day2.homeworks.oop.oopdersi;

public class MilitaryCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandi.");
    }

    @Override
    public void save() {
        System.out.println("Asker kredisi verildi.");
    }
}
