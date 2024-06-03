package com.example.singleton;

import com.example.model.Computer;

public class ComputerManager {
    private static ComputerManager instance;
    private Computer computer;

    private ComputerManager() {
        computer = new Computer("Default Computer", "Gaming", 1500.0);
    }

    public static ComputerManager getInstance() {
        if (instance == null) {
            instance = new ComputerManager();
        }
        return instance;
    }

    public Computer getComputer() {
        return computer;
    }
}
