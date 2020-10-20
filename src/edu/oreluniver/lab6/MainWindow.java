package edu.oreluniver.lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MainWindow extends JFrame implements Runnable {

  DialogWindow dialogWindow;
  MainWindow mainInstance;

  public MainWindow getMainInstance() {
    return mainInstance;
  }

  public MainWindow(){
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screens = kit.getScreenSize();
    int w,h;
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    w = screens.width;
    h = screens.height;
    setSize(w/2,h/2);
    setLocation(w/4, h/4);
    setTitle("My Frame");
    Image img = kit.getImage("Icon.gif");
    setIconImage(img);
    setJMenuBar(createMenuBar());

    mainInstance = this;
  }

  private JMenuBar createMenuBar(){
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem createItem = new JMenuItem(new AbstractAction("Create") {
      @Override
      public void actionPerformed(ActionEvent e) {

        dialogWindow = new DialogWindow();
        dialogWindow.setMainWindow(getMainInstance());
        dialogWindow.setVisible(true);
      }
    });

    fileMenu.add(createItem);
    menuBar.add(fileMenu);

    return menuBar;
  }

  public void showSumTable(){
    System.out.println("it has to be a sum table");
  }

  public void showMultiplyingTable(){
    System.out.println("it has to be a multiplying table");

  }

  @Override
  public void run() {

  }
}
