package com.learning.design.proxy;

import java.util.Objects;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if(Objects.isNull(realImage)){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
