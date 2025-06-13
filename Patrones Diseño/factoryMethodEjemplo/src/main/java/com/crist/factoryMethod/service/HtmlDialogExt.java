package com.crist.factoryMethod.service;

import com.crist.factoryMethod.service.impl.HtmlButtonImpl;

public class HtmlDialogExt extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButtonImpl();
    }
}
