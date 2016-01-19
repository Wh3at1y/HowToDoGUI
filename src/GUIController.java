import java.awt.*;
import javax.swing.*;

public class GUIController extends JFrame
	{
		/** 	Declaration Section (Goes underneath the class name, and above the constructor.)
		 * 	Every variable that will be used in more than one method needs to be declared here. Not initialized.
		 */
		private GridLayout baseLayout;
		
		
		/** 	Constructor (Goes directly under the declaration section)
		 * 	Where variables that will be used throughout the class, or in more than one method, will be initialized. 
		 * 	[Variables from the Declaration Section]
		 */
		public GUIController()
		{
			baseLayout = new GridLayout();
		}
		
		/**
		 * setDefaultCloseOperation : Closes the java process. 	[Highly Recommended]
		 * setLayout 	: Sets the layout type into for the Panel. 	[Needed]
		 * setTitle		: Sets the window bar title. 							[Highly Recommended]
		 * setSize			: Sets the window size in pixels. 					[Needed]
		 * setVisible	: Decides if the program is visible. 				[Needed]
		 */
		public void buildFrame()
		{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(baseLayout);
			setTitle("Window Title");
			setSize(400,400);
			
			//setVisible has to be the last line of this method.
			setVisible(true);
		}
	}
