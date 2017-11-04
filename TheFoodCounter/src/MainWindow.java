import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by lukas on 2017-10-17.
 */
public class MainWindow extends JFrame{
    JButton removeButton;
    JButton addButton;

    public MainWindow(){
        super("The Food Counter");

        setLayout(new BorderLayout());
        northernPanel();
        middlePanel();

        setSize(1000,500);

        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void northernPanel() {
        JPanel northernPanel = new JPanel();
        northernPanel.setLayout(new FlowLayout());
        add(northernPanel, BorderLayout.NORTH);
        addButton = new JButton("Lägg till");
        northernPanel.add(addButton);
        addButton.addActionListener(new addButtonListerner());
        removeButton = new JButton("Ta bort");
        northernPanel.add(removeButton);

    }

   private void middlePanel(){

   }

   class addButtonListerner implements ActionListener{
       @Override
       public void actionPerformed(ActionEvent e) {

       }
   }
}
