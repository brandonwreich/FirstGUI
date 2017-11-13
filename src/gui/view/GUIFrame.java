package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	private GUIAppController appController;
	
	public GUIFrame(GUIAppController appController)
	{
		super();
		this.appController = appController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		
		this.setTitle("The Window Title");
		this.setSize(500,500);
		this.setVisible(true);
	}
}
