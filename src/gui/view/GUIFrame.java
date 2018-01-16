package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	private GUIPanel firstPanel;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		this.firstPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	/**
	 * Sets up the framework
	 */
	private void setupFrame()
	{
		this.setContentPane(firstPanel);
		this.setTitle("The Window Title");
		this.setSize(500,500);
		this.setVisible(true);
	}
}
