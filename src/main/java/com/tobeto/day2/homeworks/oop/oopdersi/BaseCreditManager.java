package com.tobeto.day2.homeworks.oop.oopdersi;

public abstract class BaseCreditManager implements ICreditManager {
    @Override
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi.");
    }
}
