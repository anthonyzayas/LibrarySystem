package io.zayas.View;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by zayas on 3/2/17.
 */
public class Form extends Frame implements WindowListener, ActionListener{

    protected TextField title = new TextField(20);
    protected TextField author = new TextField(20);
    protected TextField genre = new TextField(20);
    protected TextField date = new TextField(20);

    Button submit;

    public Form(){
        setLayout(new FlowLayout());
        setTitle("Library System");
        setSize(700, 700);
        isVisible();

        addWindowListener(this);
        add(title);
        add(author);
        add(genre);
        add(date);

        submit = new Button("Submit");
        add(submit);
        submit.addActionListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    public void windowClosing(WindowEvent e){
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
