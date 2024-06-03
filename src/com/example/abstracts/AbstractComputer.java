package com.example.abstracts;

import com.example.model.Component;
import java.util.List;

public abstract class AbstractComputer {
    public abstract void addComponent(Component component);
    public abstract List<Component> getComponents();
}
