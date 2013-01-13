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
public interface CIFrame {

    public void doExit();

    public void addInternalFrame(JInternalFrame iFrame);

    public void addInternalFrame(JInternalFrame iFrame, boolean maximize);
}
