package tugas_kak_nina;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Agung Prasetyo Nugroho <672021077@student.uksw.edu>
 */
public class TesGui {
  private JButton add;
  private JPasswordField passwordField1;
  private JCheckBox checkBox1;
  private JTextField textField1;

  public TesGui() {
    add.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
      }
    });
  }

  private void createUIComponents() {
    // TODO: place custom component creation code here
  }
}
