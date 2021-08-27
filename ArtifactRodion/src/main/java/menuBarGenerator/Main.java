package menuBarGenerator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.wb.swt.SWTResourceManager;

public class Main {
	public static void main(String[] args) {
		
		MainWindow.mainWindowInitialization();


		
		//Menu menuBar = new Menu(shell, SWT.BAR);
		//shell.setMenuBar(menuBar);
		
		/*MenuCreator menuBar = new MenuCreator(shell, SWT.BAR);

		MenuItem dropDownMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
		dropDownMenuHeader.setText("Items");

		//Menu dropDownMenu = new Menu(shell, SWT.DROP_DOWN);
		//dropDownMenuHeader.setMenu(dropDownMenu);
		
		MenuCreator dropDownMenu = new MenuCreator(shell, SWT.DROP_DOWN,dropDownMenuHeader);

		MenuItem menuItem1 = new MenuItem(dropDownMenu, SWT.PUSH);
		menuItem1.setText("Menu Item 1");

		MenuItem menuItem2 = new MenuItem(dropDownMenu, SWT.PUSH);
		menuItem2.setText("Menu Item 2");
		
		Label newLabel = new Label(shell, SWT.NONE);
		newLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		newLabel.setBounds(387, 183, 152, 47);
		
		
		menuItem1.addSelectionListener(new MenuListenerrr("Menu Item 1",newLabel));
		menuItem2.addSelectionListener(new MenuListenerrr("Menu Item 2",newLabel));

		*/


		MainWindow.isMainWindowOpen();
	}
}
