import java.awt.*;
import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        simple frame = new simple();
        frame.setVisible(true);
      }
    });
  }


}

class simple extends JFrame {
  public simple() {
//    Toolkit kit = Toolkit.getDefaultToolkit();
//    Dimension screens = kit.getScreenSize();
//    int w,h;
//    setDefaultCloseOperation(EXIT_ON_CLOSE);

//    w = screens.width;
//    h = screens.height;
//    setSize(w/2,h/2);
//    setLocation(w/4, h/4);
//    setTitle("My Frame");
//    Image img = kit.getImage("Icon.gif"); setIconImage(img);


    JDesktopPane desktopPane = new JDesktopPane();
    add(desktopPane);
    JInternalFrame frame1 = new JInternalFrame("Frame1", true);
    JInternalFrame frame2 = new JInternalFrame(
        "Frame2", true, true, true, true);
    desktopPane.add(frame2);

    frame1.setMinimumSize(new Dimension(100, 100));
    frame1.setLocation(80, 100);
    frame1.setVisible(true);
    frame2.setSize(200, 60);
    frame2.setVisible(true);

//    setVisible(true);
  }
}
