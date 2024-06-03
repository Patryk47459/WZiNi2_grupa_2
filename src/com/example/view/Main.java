package com.example.view;

import com.example.controller.ComputerController;
import com.example.model.Component;

public class Main {
    public static void main(String[] args) {
        ComputerController controller = new ComputerController();

        Component cpu = new Component("Intel i7", "CPU", 300.0);
        Component gpu = new Component("NVIDIA GTX 3080", "GPU", 700.0);

        controller.addComponentToComputer(cpu);
        controller.addComponentToComputer(gpu);

        controller.showComputerComponents();
    }
}
