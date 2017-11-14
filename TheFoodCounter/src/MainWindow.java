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
    AddDialog addDialog;
    JPanel middlePanel;

    public MainWindow(){
        super("The Food Counter");

        setLayout(new BorderLayout());
        addNorthernPanel();
        addMiddlePanel();

        setSize(1000,500);

        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void addNorthernPanel() {
        JPanel northernPanel = new JPanel();
        northernPanel.setLayout(new FlowLayout());
        add(northernPanel, BorderLayout.NORTH);
        addButtonToProgram(northernPanel);
        removeButton = new JButton("Ta bort");
        northernPanel.add(removeButton);

    }

    private void addButtonToProgram(JPanel northernPanel) {
        addButton = new JButton("Lägg till");
        northernPanel.add(addButton);
        addButton.addActionListener(new addButtonListerner());
    }

    private void addMiddlePanel(){
        middlePanel = new JPanel();
   }

   class addButtonListerner implements ActionListener{
       @Override
       public void actionPerformed(ActionEvent e) {
           addDialog = new AddDialog();
       }
   }
}
