import java.awt.event.*;
import javax.swing.*;

// This class must have extends JFrame
public class GUIController extends JFrame
{
	/**
	 * Declaration Section (Goes underneath the class name, and above the
	 * constructor.) Every variable that will be used in more than one method
	 * needs to be declared here. Not initialized.
	 */
	
	//visibility Object variableName
	private SpringLayout baseLayout;
	private JButton simpleButton;

	/**
	 * Constructor (Goes directly under the declaration section) Where variables
	 * that will be used throughout the class, or in more than one method, will
	 * be initialized. Also where you call other methods. [Variables from the
	 * Declaration Section]
	 */
	public GUIController()
	{
		//variableName = new Object();
		baseLayout = new SpringLayout();
		simpleButton = new JButton("A Text for the Button");

		buildFrame();
		buildPanel();
		buildPlacements();
		buildListeners();
	}

	/**
	 * setDefaultCloseOperation : Closes the java process. [Highly Recommended]
	 * setLayout : Sets the layout type into for the Panel. [Needed] 
	 * setTitle : Sets the window bar title. [Highly Recommended] 
	 * setSize : Sets the window size in pixels. [Needed]
	 * setResizable : Decides if the user can resize the window frame. [Optional]
	 * setVisible : Decides if the program is visible. [Needed] (Last line of code in that method)
	 */
	public void buildFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(baseLayout);
		setTitle("Window Title");
		setResizable(false);
		setSize(250, 250);

		// setVisible has to be the last line of this method.
		setVisible(true);
	}

	/**
	 * Puts Buttons, Text Fields, etc into the Program. Where you add all the components into the Panel. 
	 * add(buttonName)
	 */
	private void buildPanel()
	{
		add(simpleButton);
	}

	/**
	 * Everything in here will be from the WindowBuilder code. It will look like garbage.
	 */
	private void buildPlacements()
	{
		
	}
	
	/**
	 * Sets what the button will do when it has been clicked.
	 * (When you click the simpleButton, change the button text to...
	 */
	private void buildListeners()
	{
		simpleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				simpleButton.setText("You clicked the button!");
			}
		});
	}
}

/**	Step by Step Instructions. **Add imports, then add extends JFrame at the end of the class name**
 * 		1) Make the constructor.
 * 			- public classname()
 * 		2) Make the required methods.
 * 			- buildFrame
 * 			- buildPanel
 * 			- buildPlacements
 * 			- buildListeners
 * 		3) Call the methods from the constructor in order.
 * 		4) Declare, then initialize a layout.
 * 		5) Start to declare, initialize, and add buttons, text fields, etc.
 * 		6) Make the listeners for the buttons.
 */
