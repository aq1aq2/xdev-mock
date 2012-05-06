package dn.tool.tcp.minatcpclient;

import dn.tool.tcp.minatcpclient.gui.view.MainWindow;


/**
 * Start main GUI window
 * 
 * @author NhanLD
 *
 */
public class App {

	public static void main(String[] args) throws Throwable {
		MainWindow mainwindow = new MainWindow();
		mainwindow.open();
	}
	
}
