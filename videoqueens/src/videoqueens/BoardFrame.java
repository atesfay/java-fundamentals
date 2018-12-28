package videoqueens;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


class BoardFrame extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BoardPanel			boardPanel;
	private JToggleButton		runBtn;
	
	
	BoardFrame() 
	{
		boardPanel = new BoardPanel(4);
		add(boardPanel, BorderLayout.CENTER);
		
		JPanel pan = new JPanel();
		runBtn = new JToggleButton("Run");
		runBtn.addActionListener(this);
		pan.add(runBtn);
		add(pan, BorderLayout.NORTH);
		pack();
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == runBtn)
			boardPanel.solve();	
	}
	
	
	public static void main(String[] args)
	{
		BoardFrame frame = new BoardFrame();
		frame.setVisible(true);
	}
}
