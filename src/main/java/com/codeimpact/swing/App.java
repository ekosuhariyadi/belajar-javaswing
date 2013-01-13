package com.codeimpact.swing;

import com.codeimpact.swing.ui.CIMainFrame;
import javax.swing.SwingUtilities;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CIMainFrame mainFrame = new CIMainFrame();
                AppContext.getInstance().setMainFrame(mainFrame);
                mainFrame.setVisible(true);
            }
        });
    }
}
