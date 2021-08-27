package menuBarGenerator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class NewWindow {

	private Shell shell;

	public NewWindow() {

		shell = new Shell(Display.getCurrent());
		Label label = new Label(shell, SWT.NONE);

	}

	public void open() {
		shell.open();
	}

	public void close() {
		shell.setVisible(false);
	}
}
