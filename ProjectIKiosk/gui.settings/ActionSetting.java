package guI.settings;

import javax.swing.JFrame;


public class ActionSetting {
    
    public static void setVisible(JFrame oldFrame, JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
}

