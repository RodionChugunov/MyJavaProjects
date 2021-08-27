package menuBarGenerator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public final class TextButtonLabelCreator {
	/**
	 * @wbp.parser.entryPoint
	 */
	static void TextButtonCreatorMethod(Shell shell) {
		Text text = new Text(shell, SWT.BORDER);
		text.setBounds(66, 38, 76, 21);

		Button okButton = new Button(shell, SWT.NONE);
		okButton.setText("OK");
		okButton.setBounds(66, 81, 75, 25);
		okButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				
				text.setEnabled(false);
				
				for (int i = 0; i < Integer.parseInt(text.getText()); i++) {
					Label label = new Label(shell, SWT.NONE);
					label.setText("Label: " + (i + 1));
					label.setBounds(53, 90 + (21 + 20) * (i + 1), 70, 21);
				}
			}
		});
	}
}
