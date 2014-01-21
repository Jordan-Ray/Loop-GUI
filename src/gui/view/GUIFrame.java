package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;


public class GUIFrame extends JFrame
{

	private GUIController baseController;
	private GUIPanel basePanel;
	
	/**
	 * Sets up the new Frame.
	 * @param baseController
	 */
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel();
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(650,650);
		this.setVisible(true);
		
	}
	

	
	
}
