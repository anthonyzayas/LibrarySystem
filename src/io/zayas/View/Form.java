package io.zayas.View;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by zayas on 3/2/17.
 */
public class Form extends Frame{

    public Form(){
        setTitle("Library System");
        setSize(700, 700);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
            }
        });
    }

}
