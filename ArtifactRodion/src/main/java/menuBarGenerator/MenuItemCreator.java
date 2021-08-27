package menuBarGenerator;

import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class MenuItemCreator {


	public static MenuItem MenuItemCreatorr(String s, Menu parent, int style) {

		MenuItem aItem = new MenuItem(parent, style);
		aItem.setText(s);
		return aItem;

	}
	
	public static MenuItem MenuItemCreatorr(String s, Menu parent, int style, Label newLabel) {

		MenuItem aItem = new MenuItem(parent, style);
		aItem.setText(s);
		aItem.addSelectionListener(new MenuListener("" + s, newLabel));
		return aItem;

	}

	/*
	 * Menu dropDownMenu = new Menu(shell, SWT.DROP_DOWN);
	 * dropDownMenuHeader.setMenu(dropDownMenu);
	 * 
	 * 
	 * Label newLabel = new Label(shell, SWT.NONE);
	 * newLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
	 * newLabel.setBounds(387, 183, 152, 47);
	 * 
	 * 
	 * menuItem1.addSelectionListener(new MenuListenerrr("Menu Item 1",newLabel));
	 * menuItem2.addSelectionListener(new MenuListenerrr("Menu Item 2",newLabel));
	 */
}
