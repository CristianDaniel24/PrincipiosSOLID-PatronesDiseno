package com.crist.factoryMethod;

import com.crist.factoryMethod.service.Dialog;
import com.crist.factoryMethod.service.HtmlDialogExt;
import com.crist.factoryMethod.service.WindowsDialogExt;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialogExt();
        } else {
            dialog = new HtmlDialogExt();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
