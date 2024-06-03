package com.example.interfaces;

import com.example.model.Component;

public interface ComponentOperations {
    void addComponent(Component component);
    void removeComponent(Component component);
    Component getComponent(String name);
}
