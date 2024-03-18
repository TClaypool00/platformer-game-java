package frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import panels.TetrisPanel;

public class MainFrame extends JFrame {
    public TetrisPanel tetrisPanel;
    public TetrisPanel nextBlockPanel;
    public TetrisPanel scorePanel;

    public JLabel label;

    public Dimension screenSize;

    public void load() {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setTitle("Platformer Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(screenSize);
        setLayout(new FlowLayout());

        label = new JLabel("Score");
        scorePanel = new TetrisPanel(getPercentWidth(20), getPercentHeight(20), Color.yellow, true);
        scorePanel.add(label);
        add(scorePanel);

        tetrisPanel = new TetrisPanel(getPercentWidth(50), getPercentHeight(90), Color.blue, true);
        add(tetrisPanel);

        label = new JLabel("Next Block");
        nextBlockPanel = new TetrisPanel(getPercentWidth(20), getPercentHeight(20), Color.green, true);
        nextBlockPanel.add(label);
        add(nextBlockPanel);

        setVisible(true);
    }

    private int getPercentHeight(int height) {
        return (int) (getSize().height / 100) * height;
    }

    private int getPercentWidth(int width) {
        return (int)(getSize().width / 100) * width;
    }
}
