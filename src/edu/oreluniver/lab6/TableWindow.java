package edu.oreluniver.lab6;

import java.awt.*;
import javax.swing.*;

public class TableWindow extends JFrame implements Runnable {
  public TableWindow(){
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screen = kit.getScreenSize();
    int w,h;
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    w = screen.width;
    h = screen.height;
    setSize(w/2,h/2);
    setLocation(w/4, h/4);
    setTitle("My Frame");
    Image img = kit.getImage("Icon.gif");
    setIconImage(img);
  }

  @Override
  public void run() {

  }
}
