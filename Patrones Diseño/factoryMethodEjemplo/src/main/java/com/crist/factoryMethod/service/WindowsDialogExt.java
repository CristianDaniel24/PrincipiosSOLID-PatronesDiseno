package com.crist.factoryMethod.service;

import com.crist.factoryMethod.service.impl.WindowsButtonImpl;

public class WindowsDialogExt extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButtonImpl();
    }

}
