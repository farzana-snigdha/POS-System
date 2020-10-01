package OracleConnection;

import javax.swing.*;
import java.awt.*;

public class BackgroundColor {
    private final JFrame frame;

    public BackgroundColor(JFrame frame) {
        this.frame=frame;
    }


    public JPanel setGradientPanel() {
        return new JPanel() {
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(0xFFFFFF),
                                    getWidth(), getHeight(), new Color(100, 161, 236, 255), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                } else {
                    super.paintComponent(g);
                }
            }
        };
    }

    public void setButtonColor(JButton button) {
        button.setBackground(new Color(34, 97, 224, 255));
        button.setForeground(Color.white);
    }

    public void setScreenSize(JFrame frame) {
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("POS SYSTEM");

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        int xsize = (int) toolkit.getScreenSize().getWidth();
        int ysize = (int) toolkit.getScreenSize().getHeight();
        frame.setSize(xsize, ysize);
        System.out.println(xsize);
    }
public void setTableDesign(JTable jTable,Font f1){
    jTable.setFont(f1);
    jTable.setBackground(new Color(0xB8D0E8));
    jTable.setSelectionBackground(new Color(0x80B2E3));
    jTable.setRowHeight(30);
    jTable.setAutoCreateRowSorter(true);
}

}
