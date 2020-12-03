package integration;

public class integrationgui extends javax.swing.JFrame {

    /**
     * Creates new form integrationgui
     */
    public integrationgui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaoutput = new javax.swing.JTextPane();
        x4 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        x0 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        x4explain = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        x3explain = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        x2explain = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        x1explain = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        x0explain = new javax.swing.JTextPane();
        xaxis1 = new javax.swing.JTextField();
        xaxis2 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        xaxis1explain = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        xaxis2explain = new javax.swing.JTextPane();
        integrateequations = new javax.swing.JButton();
        differentiate = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane7.setViewportView(jTextArea1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaoutput.setText("Area or gradient will appear here");
        jScrollPane1.setViewportView(areaoutput);

        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });

        x4explain.setText("x^4 coefficient goes here");
        jScrollPane2.setViewportView(x4explain);

        x3explain.setText("x^3 coefficient goes here");
        jScrollPane3.setViewportView(x3explain);

        x2explain.setText("x^2 coefficient goes here");
        jScrollPane4.setViewportView(x2explain);

        x1explain.setText("x coefficient goes here");
        jScrollPane5.setViewportView(x1explain);

        x0explain.setText("y intercept goes here");
        jScrollPane6.setViewportView(x0explain);

        xaxis1explain.setText("x coordinate 1 goes here or x coordinate to find the gradient at");
        jScrollPane8.setViewportView(xaxis1explain);

        xaxis2explain.setText("x coordinate 2 goes here (leave blank if differentiating)");
        jScrollPane9.setViewportView(xaxis2explain);

        integrateequations.setText("Integrate");
        integrateequations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrateequationsActionPerformed(evt);
            }
        });

        differentiate.setText("Differentiate");
        differentiate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                differentiateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(xaxis2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(x0, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xaxis1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(integrateequations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(differentiate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane9)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(integrateequations)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(differentiate))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xaxis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xaxis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void integrateequationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_integrateequationsActionPerformed
        try {
            double fourcoefficient = Double.parseDouble(x4.getText());
            double threecoefficient = Double.parseDouble(x3.getText());
            double twocoefficient = Double.parseDouble(x2.getText());
            double onecoefficient = Double.parseDouble(x1.getText());
            double yintercept = Double.parseDouble(x0.getText());
            double firstx = Double.parseDouble(xaxis1.getText());
            double secondx = Double.parseDouble(xaxis2.getText());
            integrate(fourcoefficient, threecoefficient, twocoefficient, onecoefficient, yintercept, firstx, secondx);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_integrateequationsActionPerformed

    private void differentiateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_differentiateActionPerformed
        try {
            double fourcoefficient = Double.parseDouble(x4.getText());
            double threecoefficient = Double.parseDouble(x3.getText());
            double twocoefficient = Double.parseDouble(x2.getText());
            double onecoefficient = Double.parseDouble(x1.getText());
            double gradientat = Double.parseDouble(xaxis1.getText());
            differentiate(fourcoefficient, threecoefficient, twocoefficient, onecoefficient, gradientat);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_differentiateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(integrationgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(integrationgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(integrationgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(integrationgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new integrationgui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaoutput;
    private javax.swing.JButton differentiate;
    private javax.swing.JButton integrateequations;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField x0;
    private javax.swing.JTextPane x0explain;
    private javax.swing.JTextField x1;
    private javax.swing.JTextPane x1explain;
    private javax.swing.JTextField x2;
    private javax.swing.JTextPane x2explain;
    private javax.swing.JTextField x3;
    private javax.swing.JTextPane x3explain;
    private javax.swing.JTextField x4;
    private javax.swing.JTextPane x4explain;
    private javax.swing.JTextField xaxis1;
    private javax.swing.JTextPane xaxis1explain;
    private javax.swing.JTextField xaxis2;
    private javax.swing.JTextPane xaxis2explain;
    // End of variables declaration//GEN-END:variables

    public void integrate(double xto5, double xto4, double xto3, double xto2, double xto1, double point1, double point2) {
        xto5 = xto5 / 5;

        xto4 = xto4 / 4;

        xto3 = xto3 / 3;

        xto2 = xto2 / 2;

        //finds the inegrated function
        double area1 = (xto5 * Math.pow(point1, 5)) + (xto4 * Math.pow(point1, 4)) + (xto3 * Math.pow(point1, 3)) + (xto2 * Math.pow(point1, 2)) + (xto1 * point1);
        double area2 = (xto5 * Math.pow(point2, 5)) + (xto4 * Math.pow(point2, 4)) + (xto3 * Math.pow(point2, 3)) + (xto2 * Math.pow(point2, 2)) + (xto1 * point2);

        //calculates the value with the first and second x value
        double areaunderneath = area2 - area1;
        if (areaunderneath < 0) {
            areaunderneath = 0 - areaunderneath;
        }

        //finds the area under the graph and evaluates it
        areaoutput.setText("area = " + areaunderneath);

    }

    public void differentiate(double xto3, double xto2, double xto1, double xto0, double xcoord) {
        xto3 = xto3 * 4;
        xto2 = xto2 * 3;
        xto1 = xto1 * 2;

        //finds the derivative
        double gradient = (xto3 * Math.pow(xcoord, 3)) + (xto2 * Math.pow(xcoord, 2)) + (xto1 * xcoord) + xto0;

        //calculates the gradient at a given x coordinate
        areaoutput.setText("gradient at x = " + xcoord + ", is " + gradient);
    }

}
