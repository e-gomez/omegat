/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.dialogs;

import org.omegat.util.OStrings;

/**
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class KeyStrokeEditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form KeyShortcutInputPanel
     */
    public KeyStrokeEditorPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descriptionTextArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        shortcutLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(okButton.getFont());
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setText(OStrings.getString("KEYSTROKE_EDITOR_MESSAGE")); // NOI18N
        descriptionTextArea.setWrapStyleWord(true);
        descriptionTextArea.setAlignmentX(0.0F);
        descriptionTextArea.setFocusable(false);
        descriptionTextArea.setOpaque(false);
        add(descriptionTextArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, OStrings.getString("KEYSTROKE_EDITOR_CURRENT_LABEL")); // NOI18N
        jLabel1.setFocusable(false);
        jPanel1.add(jLabel1);
        jPanel1.add(filler1);

        shortcutLabel.setFont(shortcutLabel.getFont().deriveFont(shortcutLabel.getFont().getStyle() | java.awt.Font.BOLD));
        org.openide.awt.Mnemonics.setLocalizedText(shortcutLabel, OStrings.getString("KEYSTROKE_EDITOR_NOT_SET")); // NOI18N
        shortcutLabel.setFocusable(false);
        jPanel1.add(shortcutLabel);

        add(jPanel1);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(clearButton, OStrings.getString("KEYSTROKE_EDITOR_CLEAR_BUTTON")); // NOI18N
        clearButton.setFocusable(false);
        jPanel4.add(clearButton);

        jPanel2.add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        org.openide.awt.Mnemonics.setLocalizedText(okButton, OStrings.getString("BUTTON_OK")); // NOI18N
        okButton.setFocusable(false);
        jPanel3.add(okButton);

        org.openide.awt.Mnemonics.setLocalizedText(cancelButton, OStrings.getString("BUTTON_CANCEL")); // NOI18N
        cancelButton.setFocusable(false);
        jPanel3.add(cancelButton);

        jPanel2.add(jPanel3, java.awt.BorderLayout.EAST);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton cancelButton;
    javax.swing.JButton clearButton;
    public javax.swing.JTextArea descriptionTextArea;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    javax.swing.JButton okButton;
    javax.swing.JLabel shortcutLabel;
    // End of variables declaration//GEN-END:variables
}