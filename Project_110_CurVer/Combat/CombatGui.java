package Combat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CombatGui extends JFrame {

    private JTextArea currDialogue;
    private JTextArea inputField;
    private GridBagConstraints coords = new GridBagConstraints();
    private JPanel inputPanel = new JPanel();
    private TargetCallback targetCallback;
    private MoveCallback moveCallback;

    public CombatGui(CharacterNode[] fighters) {
        setTitle("Combat");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(inputPanel, BorderLayout.CENTER);
    }

    public void targetSelectorMode(CharacterNode[] fighters){
        // User input area
        inputPanel.setLayout(new GridBagLayout());//this creates an empty grid
        // GridBagConstraints coords = new GridBagConstraints(); Used to be here; now it's a private
        coords.insets = new Insets(5,5,5,5);//this sets spacing

        //Headers & Initial fields.
        int goodTotal = -1;
        int badTotal = -1;
        int activeTotal;
        Color goodGuyColor = new Color(0x304696);
        Color badGuyColor  = new Color(0x963030);
        Color activeColor;
        for(int i=0; i < fighters.length; i++){
        CharacterNode current = fighters[i];
        if(current.getAllegiance() == 1){
        goodTotal += 1;
        activeTotal = goodTotal;
        activeColor = goodGuyColor;
        }
        else{
        badTotal += 1;
        activeTotal = badTotal;
        activeColor = badGuyColor;
        }
        coords.gridx = activeTotal;
        coords.gridy = current.getAllegiance();
        inputPanel.add(createTargetButton(current.getName(), activeColor, i), coords);
        }

        this.add(inputPanel, BorderLayout.CENTER);

        inputPanel.revalidate();
        inputPanel.repaint();
    }

    public void moveSelectorMode(CharacterNode[] fighters, CharacterNode currUnit){
        inputPanel.setLayout(new GridBagLayout());
        for(int i=0; i < 4; i++){
        coords.gridx = i;
        coords.gridy = 0;
        inputPanel.add(createMoveButton(currUnit.getMove(i)), coords);
        }

        this.add(inputPanel, BorderLayout.CENTER);

        inputPanel.revalidate();
        inputPanel.repaint();
    }

    public void clearInputPanel() {
    inputPanel.removeAll();   // remove all buttons/components
    inputPanel.revalidate();  // tell Swing the layout changed
    inputPanel.repaint();     // redraw the panel
    }

    private JButton createMoveButton(String text){
        JButton button = new JButton(text);

        button.addActionListener(e -> {
            if (moveCallback != null) {
                moveCallback.onMoveSelected(text);
            }
        });

        return button;
    }

    private JButton createTargetButton(String text, Color color, int number) {
        JButton button = new JButton(text);
        button.setBackground(color);
        button.setOpaque(true);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setForeground(Color.BLACK);

        button.addActionListener(e -> {
            if (targetCallback != null) {
                targetCallback.onTargetSelected(number);
            }
        });

        return button;
    }

    public void println(String text) {
        currDialogue.append(text + "\n");
    }

    public void print(String text) {
        currDialogue.append(text);
    }

    //Callbacks
    public interface TargetCallback {
        void onTargetSelected(int index);
    }

    public interface MoveCallback {
        void onMoveSelected(String moveName);
    }

    public void setTargetCallback(TargetCallback cb) {
        this.targetCallback = cb;
    }

    public void setMoveCallback(MoveCallback cb) {
        this.moveCallback = cb;
    }
}
