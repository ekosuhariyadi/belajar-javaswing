/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeimpact.swing.abstraction;

import javax.swing.JInternalFrame;

/**
 *
 * @author eko
 */
public class CIInternalFrame extends JInternalFrame {

    public CIInternalFrame() {
        this(null);
    }

    public CIInternalFrame(String title) {
        this.setTitle(title);
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.setResizable(true);
        this.setClosable(true);
    }
}
