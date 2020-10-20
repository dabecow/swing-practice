package edu.oreluniver.lab6;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame implements Runnable {

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

  }

  private JMenuBar createMenuBar(){
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem createItem = new JMenuItem("Create");
    fileMenu.add(createItem);
    menuBar.add(fileMenu);

    return menuBar;
  }

  @Override
  public void run() {

  }
}
