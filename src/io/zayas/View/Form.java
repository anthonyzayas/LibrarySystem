package io.zayas.View;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.*;
import io.zayas.DataStructures.Arraybased;
import io.zayas.Objects.LibraryBook;

/**
 * Created by zayas on 3/2/17.
 */
public class Form extends Frame implements WindowListener, ActionListener {

    TextField title = new TextField(20);
    TextField author = new TextField(20);
    TextField genre = new TextField(20);
    TextField date = new TextField(20);
    Arraybased array = new Arraybased(20);

    Button submit;

    public Form() {
        setTitle("Library System");
        setSize(700, 700);
        this.setVisible(true);

        setLayout(new FlowLayout());
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
    public void actionPerformed(ActionEvent e) {

        String lbTitle = title.getText();
        String lbAuthor = author.getText();
        String lbGenre = genre.getText();
        int lbYear = Integer.parseInt(date.getText());
        array.add(new LibraryBook(lbTitle, lbAuthor, lbGenre, lbYear));

        this.removeAll();
    }

    @Override
    public void windowOpened(WindowEvent e) {


    }

    public void windowClosing(WindowEvent e) {
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

}
