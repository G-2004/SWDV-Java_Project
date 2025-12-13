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

    public void targetSelectorMode(CharacterNode[] fighters){//gathers combatants and puts them in gui for selection
        inputPanel.setLayout(new GridBagLayout());
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

    public void moveSelectorMode(CharacterNode[] fighters, CharacterNode currUnit){//makes buttons for move selection
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

    public void clearInputPanel() {//remove existing window assets
    inputPanel.removeAll();
    inputPanel.revalidate();
    inputPanel.repaint();
    }

    private JButton createMoveButton(String text){//create a button for move 'text'
        JButton button = new JButton(text);

        button.addActionListener(e -> {
            if (moveCallback != null) {//if there is not already a move callback set and we have been pressed
                moveCallback.onMoveSelected(text);//then ???
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

    public void setMoveCallback(MoveCallback cb) {//saves a referece of what to do when button pressed
        this.moveCallback = cb;
    }
}
