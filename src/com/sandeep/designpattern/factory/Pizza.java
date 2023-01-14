package com.sandeep.designpattern.factory;

public interface Pizza {
    String getDescription();
    String prepare();
    String cut();
    String pack();
}
