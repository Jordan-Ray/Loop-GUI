package gui.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUIPanel 
extends JPanel
{
	private JButton bombButton;
	private JTextArea textArea;
	private JScrollPane textPane;
	
	public GUIPanel()
	{
		
		textArea = new JTextArea(10,30);
		bombButton = new JButton("CLICK ME!!");
		textPane = new JScrollPane(textArea);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupListeners()
	{
		
		
	}

	private void setupLayout()
	{
		
		
	}

	private void setupPanel()
	{
		
		
	}
}
