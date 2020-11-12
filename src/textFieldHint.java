/* Daniel Lopez Quintero 
    18401150
*/

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class textFieldHint extends javax.swing.JPanel  implements FocusListener {
    String hints = "Hint por defecto";
    boolean mostrarHint;
    
    public textFieldHint() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        mostrarHint = true;
        txtField.setText("");
        txtField.addFocusListener(this);
    }
    
    public void setHint(String h) {
        hints = h;
    }
    
    public String getHint() {
        return hints;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtField = new javax.swing.JTextField();

        txtField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void focusGained(FocusEvent e) {
        if(!txtField.getText().isEmpty()){
            txtField.setText("");
            mostrarHint = false;
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(txtField.getText().isEmpty()){
            txtField.setText(hints);
            mostrarHint = true;
        }
    }
}
