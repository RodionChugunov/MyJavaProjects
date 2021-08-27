package menuBarGenerator;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class MenuListener extends SelectionAdapter {

	private String string;
	private Label label;

	public MenuListener(String s, Label label) {

		string = s;
		this.label = label;
	}

	public void widgetSelected(SelectionEvent event) {
		label.setText(string);
	}

}
