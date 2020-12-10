package com.learning.design.factory.abstct;

import com.learning.design.factory.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
}
