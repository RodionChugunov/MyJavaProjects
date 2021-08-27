package menuBarGenerator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class MenuCreator {

	public static void MenuCreation(String string[][], Shell shell, Label newLabel) {

		Menu menuBar = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menuBar);
		
		
		
		for(int i = 0; i<string.length; i++)
		{
			//header creation
			MenuItem header = MenuItemCreator.MenuItemCreatorr(string[i][0], menuBar, SWT.CASCADE);
			
			//drop down menu creation
			DropDownMenu.DropDownMenuCreation(shell,header,string[i],newLabel);
		}
		
	}
}
