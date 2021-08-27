package menuBarGenerator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class DropDownMenu {

	public static void DropDownMenuCreation(Shell shell, MenuItem parentItem, String[] string, Label newLabel)
	{
		Menu menuHeader = new Menu(shell, SWT.DROP_DOWN);
		parentItem.setMenu(menuHeader);
		
		for(int j = 1; j<string.length; j++)
		{
			
			MenuItemCreator.MenuItemCreatorr(string[j],menuHeader, SWT.PUSH, newLabel);
			
		}
	}
}
