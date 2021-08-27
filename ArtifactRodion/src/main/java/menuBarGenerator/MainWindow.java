package menuBarGenerator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public final class MainWindow {

	private static Shell shell = new Shell();

	public static void mainWindowInitialization() {
		shell.setToolTipText("");
		shell.setSize(900, 585);
		shell.setText("SWT Application");
		shell.setLayout(null);

		
		Label newLabel = new Label(shell, SWT.NONE);
		newLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		newLabel.setBounds(387, 183, 152, 47);
		
		TextButtonLabelCreator.TextButtonCreatorMethod(shell);
		
		String [][] string = {{"header 1", "item 1", "item 2"},{"header 2", "item 3", "item 4"}};
		MenuCreator.MenuCreation(string,shell, newLabel);
		
		
		shell.open();
		shell.layout();
	}

	public static void isMainWindowOpen() {
		Display display = Display.getDefault();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
