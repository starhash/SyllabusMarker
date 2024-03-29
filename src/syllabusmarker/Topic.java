/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syllabusmarker;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Mahe
 */
public class Topic extends javax.swing.JPanel {

    /**
     * Creates new form Topic
     */
    public Topic() {
        initComponents();
    }

    public boolean getDoneStatus() {
        return jCheckBox2.isSelected();
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
        try {
            if (jCheckBox1.isSelected()) {
                setBackground(Color.white);
                System.out.println("sel 1");
                jCheckBox2.setEnabled(true);
                jLabel1.setEnabled(true);
                if (jCheckBox2.isSelected()) {
                    System.out.println(">   sel 2");
                    jCheckBox2.setBackground(new Color(204, 255, 204));
                } else {
                    jCheckBox2.setBackground(new Color(255, 204, 204));
                }
            } else {
                jCheckBox2.setEnabled(false);
                setBackground(new Color(239, 239, 239));
                jLabel1.setEnabled(false);
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1920, 1920));
        setMinimumSize(new java.awt.Dimension(400, 0));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 150));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox1.setText("To Do");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox2.setText("Done");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("<Topic>");
        jLabel1.setOpaque(true);
        jScrollPane1.setViewportView(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                        .addComponent(jCheckBox2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            setBackground(Color.white);
            System.out.println("sel 1");
            jCheckBox2.setEnabled(true);
            jLabel1.setEnabled(true);
            if (jCheckBox2.isSelected()) {
                System.out.println(">   sel 2");
                jCheckBox2.setBackground(new Color(204, 255, 204));
            } else {
                jCheckBox2.setBackground(new Color(255, 204, 204));
            }
        } else {
            jCheckBox2.setEnabled(false);
            setBackground(new Color(239, 239, 239));
            jLabel1.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            System.out.println("sel 2");
            jCheckBox2.setBackground(new Color(204, 255, 204));
            Font f = jLabel1.getFont();
            jLabel1.setFont(new Font(f.getName(), Font.PLAIN, f.getSize()));
        } else {
            jCheckBox2.setBackground(new Color(255, 204, 204));
            Font f = jLabel1.getFont();
            jLabel1.setFont(new Font(f.getName(), Font.ITALIC, f.getSize()));
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    public void setTopic(String topic, boolean todo, boolean done) {
        jLabel1.setText(topic);
        jCheckBox1.setSelected(todo);
        jCheckBox2.setSelected(done);
        if (jCheckBox1.isSelected()) {
            setBackground(Color.white);
            System.out.println("sel 1");
            jCheckBox2.setEnabled(true);
            jLabel1.setEnabled(true);
            if (jCheckBox2.isSelected()) {
                System.out.println(">   sel 2");
                jCheckBox2.setBackground(new Color(204, 255, 204));
            } else {
                jCheckBox2.setBackground(new Color(255, 204, 204));
            }
        } else {
            jCheckBox2.setEnabled(false);
            jLabel1.setEnabled(false);
            setBackground(new Color(239, 239, 239));
        }
    }

    public String getTopic() {
        return jLabel1.getText();
    }

    public boolean getTodo() {
        return jCheckBox1.isSelected();
    }

    public boolean getDone() {
        return jCheckBox2.isSelected();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void setDone(boolean b) {
        jCheckBox2.setSelected(b);
    }

    public void setTodo(boolean b) {
        jCheckBox1.setSelected(b);
    }
}
