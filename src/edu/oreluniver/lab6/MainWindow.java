package edu.oreluniver.lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class MainWindow extends JFrame implements Runnable {

  DialogWindow dialogWindow;
  MainWindow mainInstance;
  JTable table;

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
    createTable();
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

  private void createTable(){
    TableModel tableModel = new AbstractTableModel() {
      Object rowData[][] = new Object[10][10];

      @Override
      public int getRowCount() {
        return 10;
      }

      @Override
      public int getColumnCount() {
        return 10;
      }

      @Override
      public Object getValueAt(int rowIndex, int columnIndex) {
        return rowData[rowIndex][columnIndex];
      }

      @Override
      public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        rowData[rowIndex][columnIndex] = aValue;
      }
    };

    table = new JTable(tableModel);

//    table.setGridColor(Color.black);

    JScrollPane jScrollPane = new JScrollPane(table);
    table.setVisible(true);
    add(jScrollPane);
    setVisible(true);
  }

  public void showSumTable(){

    for (int i = 0; i < table.getColumnCount(); i++) {
      table.getModel().setValueAt(i, i, 0);
      for (int j = 1; j < table.getRowCount(); j++) {
        if (i == 0)
          table.getModel().setValueAt(j, i, j);
        else
          table.getModel().setValueAt( i+j, i, j);
      }
    }
  }

  public void showMultiplicationTable(){
    for (int i = 0; i < table.getColumnCount(); i++) {
      table.getModel().setValueAt(i, i, 0);
      for (int j = 1; j < table.getRowCount(); j++) {
        if (i == 0)
          table.getModel().setValueAt(j, i, j);
        else
          table.getModel().setValueAt( i*j, i, j);
      }
    }
  }



  @Override
  public void run() {

  }
}
