package com.crist.factoryMethod.service.impl;

import com.crist.factoryMethod.service.Button;

public class HtmlButtonImpl implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
