package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Computer extends Component {
    private List<Component> components;

    public Computer(String name, String type, double price) {
        super(name, type, price);
        this.components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }
}
