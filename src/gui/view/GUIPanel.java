package gui.view;

import gui.controller.GUIAppController;

//Needed for the class
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

//Needed for the layout
import javax.swing.SpringLayout;

//Needed for the button to work
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Used to add all the components to the subclass of JPanel
	 * This installs them into the panel so they are seen in the GUI
	 */
	
	private void setupPanel()
	{
		this.setBackground(Color.PINK);
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	
	/**
	 * This is used to hold all the layout and arrangement code for SpringLayout.
	 * SpringLayout is very customizable and is a lot better than the default.
	 */
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -134, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -150, SpringLayout.EAST, this);
	}
	
	/**
	 * This helper method is used to link any GUI components to the associated listeners
	 */
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
		});
	}
	
	private void changeBackgroundColor()
	{
		int red= (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
