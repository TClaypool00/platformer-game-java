package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class TetrisPanel extends JPanel {
    public TetrisPanel(int width, int height, Color color, boolean isPreferredSize) {
        super();
        setSize(width, height);
        construct(color, isPreferredSize);
    }

    public TetrisPanel(Dimension dimension, Color color, boolean isPreferredSize) {
        super();
        setSize(dimension);
        construct(color, isPreferredSize);
    }

    private void construct(Color color, boolean isPreferredSize) {
        setBackground(color);
        if (isPreferredSize) {
            setPreferredSize(getSize());
        }
        setLayout(new FlowLayout());
    }
}
