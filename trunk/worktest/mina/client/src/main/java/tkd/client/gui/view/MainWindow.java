package tkd.client.gui.view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MainWindow {
	
	/*
	 * GUI core components 
	 */
	
	private Display display;
	private Shell mainShell;
	
	
	public void open() {
		
		// Initialize
		initialize();
		
		// Loop
		mainShell.open();
		while (!mainShell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	
	private void initialize() {
		display = new Display();
		mainShell = new Shell(display);
		makeContent(mainShell);
	}
	
	private void makeContent(final Shell shell) {
		//TestView testView = new TestView(shell);
		TcpView tcpView = new TcpView(shell);
	}
}
