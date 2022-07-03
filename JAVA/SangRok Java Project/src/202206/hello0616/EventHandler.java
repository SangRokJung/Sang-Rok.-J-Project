package hello0616;

import java.awt.*;
import java.awt.event.*;


public class EventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e)  {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
