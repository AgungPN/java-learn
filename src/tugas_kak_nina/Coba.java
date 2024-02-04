package tugas_kak_nina;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class Coba {
  private JButton button1;
  private JTextField textField1;
  private JPasswordField passwordField1;
  private JTextField textField2;
  private JTable table1;

  public Coba() {
    button1.addActionListener(e -> {
      JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"error");
    });
  }
}
