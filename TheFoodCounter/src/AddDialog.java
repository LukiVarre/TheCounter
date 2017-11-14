import javax.swing.*;
import java.awt.*;

/**
 * Created by Lukas Varli on 2017-11-04.
 */
public class AddDialog extends JFrame {
    JButton okButton;

    public AddDialog(){
        JPanel northernPanel = new JPanel();
        add(northernPanel, BorderLayout.NORTH);


        JPanel southernPanel = new JPanel();
        southernPanel.setLayout(new FlowLayout());
        add(southernPanel, BorderLayout.SOUTH);


        okButton = new JButton("OK");
        southernPanel.add(okButton);


        JLabel productName = new JLabel("Produktnamn");

        setLayout(new BorderLayout());
        setSize(400,200);
        setVisible(true);
        
    }
}
