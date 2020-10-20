package edu.oreluniver.lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class TableWindow extends JFrame implements Runnable {

  public TableWindow(){
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screen = kit.getScreenSize();
    int w,h;
    w = screen.width;
    h = screen.height;
    setSize(w/2,h/2);
    setLocation(w/4, h/4);
    setTitle("My Frame");
    Image img = kit.getImage("Icon.gif");
    setIconImage(img);

    initComponents();
}

  void initComponents(){
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    ButtonGroup buttonGroup = new ButtonGroup();

    JRadioButton sumRButton = new JRadioButton("Sum table");
    buttonGroup.add(sumRButton);
    panel.add(sumRButton);

    JRadioButton multiplyRButton = new JRadioButton("Multiplying table");
    buttonGroup.add(multiplyRButton);
    panel.add(multiplyRButton);


    JButton showTableButton = new JButton(new AbstractAction("Choose") {
      @Override
      public void actionPerformed(ActionEvent e) {
        if (sumRButton.isSelected()){
//          stuff;
        } else {
//          another stuff;
        }
      }
    });

    panel.add(showTableButton);

    add(panel);
  }

  @Override
  public void run() {

  }
}
