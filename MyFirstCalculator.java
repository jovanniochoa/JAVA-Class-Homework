import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MyFirstCalculator {

	public static void main(String[] args) {
		
		//composition has a relationship
		CalculatorFrame myCalculator = new CalculatorFrame();
		myCalculator.setTitle("My first calculator at UTD");
		myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myCalculator.setVisible(true);
		myCalculator.setSize(350, 592);
		
	}

}

class CalculatorFrame extends JFrame { //inheritance is a relationship
	private static final long serialVersionUID = 1L;
	OutputPanel outputPanel;
	KeyBoardPanel keyPanel;
	
	public CalculatorFrame() {
		
		outputPanel = new OutputPanel();
		keyPanel = new KeyBoardPanel();
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		add(keyPanel, c);
	}
	
}


class OutputPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	JTextField outputField;
	
	public OutputPanel() {
		outputField = new JTextField("0");
		
		add(outputField);
	}
}

class KeyBoardPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	ArrayList<JLabel> keyLabelList;
	public KeyBoardPanel() {
		keyLabelList = new ArrayList<JLabel>(16);
		
		int j = 0;
		keyLabelList.add(new JLabel());
		keyLabelList.get(j++).setIcon(new ImageIcon("percent.JPG"));
		keyLabelList.add(new JLabel());
		keyLabelList.get(j++).setIcon(new ImageIcon("sqroot.JPG"));
		keyLabelList.add(new JLabel("x^2"));
		keyLabelList.add(new JLabel("1/x"));
		keyLabelList.add(new JLabel("CE"));
		keyLabelList.add(new JLabel("C"));
		keyLabelList.add(new JLabel("<-"));
		keyLabelList.add(new JLabel("/"));
		keyLabelList.add(new JLabel("7"));
		keyLabelList.add(new JLabel("8"));
		keyLabelList.add(new JLabel("9"));
		keyLabelList.add(new JLabel("X"));
		keyLabelList.add(new JLabel("4"));
		keyLabelList.add(new JLabel("5"));
		keyLabelList.add(new JLabel("6"));
		keyLabelList.add(new JLabel("-"));
		keyLabelList.add(new JLabel("1"));
		keyLabelList.add(new JLabel("2"));
		keyLabelList.add(new JLabel("3"));
		keyLabelList.add(new JLabel("+"));
		
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		int x = 0;
		int y = 0;
		int i = 0;
		
		//add(percentLabel, c, x++, y);
		add(keyLabelList.get(i++), c, x++, y);
		add(keyLabelList.get(i++), c, x++, y);
		//add(keyLabelList.get(i++), c, x++, y);
		//c.gridwidth = GridBagConstraints.REMAINDER;
		//add(keyLabelList.get(i), c, x, y);
	}
	public void add(JComponent obj, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		add(obj, c);
	}
}
