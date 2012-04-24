package my.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import swt_components.SwtHexEdit;

public class MainWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell mainShell = new Shell(display);
		mainShell.setLayout(new FillLayout());
		
		SwtHexEdit hxed = new SwtHexEdit(mainShell,SWT.BORDER,30,8,6);
		hxed.setInsertMode(true);
		hxed.setContent( new byte[]{(byte)0xDE,(byte)0xAD,(byte)0xBE,(byte)0xEF,'a','b','c','d','e','f','g','h','i'});

		// Loop
		mainShell.open();
		while (!mainShell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
