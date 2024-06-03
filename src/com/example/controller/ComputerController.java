package com.example.controller;

import com.example.model.Component;
import com.example.singleton.ComputerManager;

public class ComputerController {
    private ComputerManager computerManager;

    public ComputerController() {
        this.computerManager = ComputerManager.getInstance();
    }

    public void addComponentToComputer(Component component) {
        computerManager.getComputer().addComponent(component);
    }

    public void showComputerComponents() {
        for (Component component : computerManager.getComputer().getComponents()) {
            System.out.println("Component: " + component.getName() + ", Type: " + component.getType() + ", Price: " + component.getPrice());
        }
    }
}
