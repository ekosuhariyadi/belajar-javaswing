/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.swing;

import com.codeimpact.swing.abstraction.CIFrame;
import java.util.HashMap;

/**
 *
 * @author eko
 */
public class AppContext {

    private static AppContext context;
    private CIFrame mainFrame;
    private HashMap<String, Object> contextMap = new HashMap<String, Object>();

    public static synchronized AppContext getInstance() {
        if (null == context) {
            context = new AppContext();
        }

        return context;
    }

    public CIFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(CIFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void putContext(String contextName, Object contextObject) {
        contextMap.put(contextName, contextObject);
    }

    public Object getContext(String contextName) {
        return contextMap.get(contextName);
    }
}
