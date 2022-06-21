import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest
{
    public static void createGUI()
    {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Test label");
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(400, 200));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}