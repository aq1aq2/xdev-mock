/**
 * 
 */
package dn.tool.minatcpclient.gui.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author NhanLD
 *
 */
public class TcpView {
	
	/*
	 * GUI core components 
	 */
	
	private Display display;
	private Shell mainShell;
	
	/*
	 * GUI Input Fields
	 */
	
	Image dogImage;
	Text dogNameText;
	Combo dogBreedCombo;
	Canvas dogPhoto;
	List categories;
	Text nameText;
	Text phoneText;
	
	Text addressInput;
	Text portInput;
	
	Button connectButton;
	Button disconnectButton;
	
	/*
	 * GUI Containers
	 */
	
	Group settingGroup;
	Composite connectBtnContainer;
	
	/*
	 * GUI Labels
	 */
	
	Label addressLabel;
	Label portLabel;
	
	/*
	 * GUI content constants
	 */
	
	final String WINDOW_TITLE = "TCP Client";
	final int WINDOW_WIDTH = 640;
	final int WINDOW_HEIGHT = 480;
	
	final String GROUP_SETTING_TITLE = "Settings";
	
	final String LABEL_ADDRESS = "Address";
	final String LABEL_PORT = "Port";
	
	final String BUTTON_CONNECT = "Connect";
	final String BUTTON_DISCONNECT = "Disconnect";
	

	public TcpView(Shell shell) {
		mainShell = shell;
		display = mainShell.getDisplay();
		
		makeContent(mainShell);
		makeLayout();
	}
	
	/**
	 * Initialize content of the window.
	 * Setting fixed properties such as title, size, etc.
	 * 
	 * @param shell main shell
	 */
	public void makeContent(final Shell shell) {
		
		// Main Window
		shell.setText(WINDOW_TITLE);
		shell.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Group Settings
		settingGroup = new Group(shell, SWT.NONE);
		settingGroup.setText(GROUP_SETTING_TITLE);
		
		addressLabel = new Label(settingGroup, SWT.NULL);
		addressLabel.setText(LABEL_ADDRESS);
		addressInput = new Text(settingGroup, SWT.SINGLE | SWT.BORDER);
		
		portLabel = new Label(settingGroup, SWT.PUSH);
		portLabel.setText(LABEL_PORT);
		portInput = new Text(settingGroup, SWT.SINGLE | SWT.BORDER);
		
		// Connect buttons
		connectBtnContainer = new Composite(shell, SWT.NONE);
		
		connectButton = new Button(connectBtnContainer, SWT.PUSH);
		connectButton.setText(BUTTON_CONNECT);
		
		disconnectButton = new Button(connectBtnContainer, SWT.PUSH);
		disconnectButton.setText(BUTTON_DISCONNECT);
		
	}
	
	/**
	 * Initialize layout of the window.
	 * To positioning components in the window.
	 */
	public void makeLayout() {
		
		FormData formLayoutData;
		GridData gridLayoutData;
		
		// Main Window layout
		FormLayout formLayout = new FormLayout();
		formLayout.marginWidth = 5;
		formLayout.marginHeight = 5;
		mainShell.setLayout(formLayout);
		
		// Group Settings layout
		formLayoutData = new FormData();
		formLayoutData.top = new FormAttachment(0, 0);
		formLayoutData.left = new FormAttachment(0, 0);
		formLayoutData.right = new FormAttachment(connectBtnContainer, 0);
		settingGroup.setLayoutData(formLayoutData);
		
		GridLayout settingGroupLayout = new GridLayout();
		settingGroupLayout.numColumns = 2;
		settingGroup.setLayout(settingGroupLayout);
		
		gridLayoutData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		addressInput.setLayoutData(gridLayoutData);
		portInput.setLayoutData(gridLayoutData);
		
		// Connect buttons layout
		RowLayout connectBtnContainerLayout = new RowLayout();
		connectBtnContainerLayout.wrap = false;
		connectBtnContainerLayout.pack = false;
		connectBtnContainerLayout.justify = true;
		connectBtnContainerLayout.type = SWT.VERTICAL;
		connectBtnContainerLayout.marginLeft = 5;
		connectBtnContainerLayout.marginTop = 5;
		connectBtnContainerLayout.marginRight = 0;
		connectBtnContainerLayout.marginBottom = 5;
		connectBtnContainerLayout.spacing = 0;
		connectBtnContainer.setLayout(connectBtnContainerLayout);
		
		formLayoutData = new FormData();
		formLayoutData.top = new FormAttachment(settingGroup, 0, SWT.CENTER);
		formLayoutData.right = new FormAttachment(100, 0);
		connectBtnContainer.setLayoutData(formLayoutData);
		
	}
	
	public void makeLayout2(final Shell shell) {
		FormLayout layout = new FormLayout();
		layout.marginWidth = 5;
		layout.marginHeight = 5;
		shell.setLayout(layout);
		shell.setText(WINDOW_TITLE);
		
		Group settingGroup = new Group(shell, SWT.NONE);
		settingGroup.setText(GROUP_SETTING_TITLE);
		FormLayout settingGroupLayout = new FormLayout();
		settingGroupLayout.marginWidth = 5;
		settingGroupLayout.marginHeight = 5;
		settingGroup.setLayout(settingGroupLayout);
		
		Label dogName = new Label(shell, SWT.NONE);
		dogName.setText("Dog's Name:");
		dogNameText = new Text(shell, SWT.SINGLE | SWT.BORDER);
		
		Label dogBreed = new Label(shell, SWT.NONE);
		dogBreed.setText("Breed:");
		
		dogBreedCombo = new Combo(shell, SWT.NONE);
		dogBreedCombo.setItems(new String[] { "Collie", "Pitbull", "Poodle",
				"Scottie", "Black Lab" });
		
		Label photo = new Label(shell, SWT.NONE);
		photo.setText("Photo:");
		dogPhoto = new Canvas(shell, SWT.BORDER);
		
		Button browse = new Button(shell, SWT.PUSH);
		browse.setText("Browse...");
		
		Button delete = new Button(shell, SWT.PUSH);
		delete.setText("Delete");
		
		Label cats = new Label(shell, SWT.NONE);
		cats.setText("Categories");
		categories = new List(shell, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		categories.setItems(new String[] { "Best of Breed", "Prettiest Female",
				"Handsomest Male", "Best Dressed", "Fluffiest Ears",
				"Most Colors", "Best Performer", "Loudest Bark",
				"Best Behaved", "Prettiest Eyes", "Most Hair", "Longest Tail",
				"Cutest Trick" });
		
		Button enter = new Button(shell, SWT.PUSH);
		enter.setText("Enter");
		FormData data = new FormData();
		data.top = new FormAttachment(dogNameText, 0, SWT.CENTER);
		dogName.setLayoutData(data);
		data = new FormData();
		data.left = new FormAttachment(dogName, 5);
		data.right = new FormAttachment(100, 0);
		dogNameText.setLayoutData(data);
		
		data = new FormData();
		data.top = new FormAttachment(dogBreedCombo, 0, SWT.CENTER);
		dogBreed.setLayoutData(data);
		data = new FormData();
		data.top = new FormAttachment(dogNameText, 5);
		data.left = new FormAttachment(dogNameText, 0, SWT.LEFT);
		data.right = new FormAttachment(categories, -5);
		dogBreedCombo.setLayoutData(data);
		
		data = new FormData(80, 80);
		data.top = new FormAttachment(dogBreedCombo, 5);
		data.left = new FormAttachment(dogNameText, 0, SWT.LEFT);
		data.right = new FormAttachment(categories, -5);
		data.bottom = new FormAttachment(settingGroup, -5);
		dogPhoto.setLayoutData(data);
		dogPhoto.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent event) {
				if (dogImage != null) {
					event.gc.drawImage(dogImage, 0, 0);
				}
			}
		});
		data = new FormData();
		data.top = new FormAttachment(dogPhoto, 0, SWT.TOP);
		photo.setLayoutData(data);
		data = new FormData();
		data.top = new FormAttachment(photo, 5);
		data.right = new FormAttachment(dogPhoto, -5);
		browse.setLayoutData(data);
		browse.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				String fileName = new FileDialog(shell).open();
				if (fileName != null) {
					dogImage = new Image(display, fileName);
				}
			}
		});
		
		data = new FormData();
		data.left = new FormAttachment(browse, 0, SWT.LEFT);
		data.top = new FormAttachment(browse, 5);
		data.right = new FormAttachment(dogPhoto, -5);
		delete.setLayoutData(data);
		delete.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if (dogImage != null) {
					dogImage.dispose();
					dogImage = null;
					dogPhoto.redraw();
				}
			}
		});
		
		data = new FormData(90, 140);
		data.top = new FormAttachment(dogPhoto, 0, SWT.TOP);
		data.right = new FormAttachment(100, 0);
		data.bottom = new FormAttachment(enter, -5);
		categories.setLayoutData(data);
		
		data = new FormData();
		data.bottom = new FormAttachment(categories, -5);
		data.left = new FormAttachment(categories, 0, SWT.CENTER);
		cats.setLayoutData(data);
		
		data = new FormData();
		data.right = new FormAttachment(100, 0);
		data.bottom = new FormAttachment(100, 0);
		enter.setLayoutData(data);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				System.out.println("\nDog Name: " + dogNameText.getText());
				System.out.println("Dog Breed: " + dogBreedCombo.getText());
				System.out.println("Owner Name: " + nameText.getText());
				System.out.println("Owner Phone: " + phoneText.getText());
				System.out.println("Categories:");
				String cats[] = categories.getSelection();
				for (int i = 0; i < cats.length; i++) {
					System.out.println("\t" + cats[i]);
				}
			}
		});
		
		data = new FormData();
		data.bottom = new FormAttachment(enter, -5);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(categories, -5);
		settingGroup.setLayoutData(data);
		
		Label name = new Label(settingGroup, SWT.NULL);
		name.setText("Name:");
		
		Label phone = new Label(settingGroup, SWT.PUSH);
		phone.setText("Phone:");
		
		nameText = new Text(settingGroup, SWT.SINGLE | SWT.BORDER);
		phoneText = new Text(settingGroup, SWT.SINGLE | SWT.BORDER);
		
		data = new FormData();
		data.top = new FormAttachment(nameText, 0, SWT.CENTER);
		name.setLayoutData(data);
		
		data = new FormData();
		data.top = new FormAttachment(phoneText, 0, SWT.CENTER);
		phone.setLayoutData(data);
		
		data = new FormData();
		data.left = new FormAttachment(phone, 5);
		data.right = new FormAttachment(100, 0);
		nameText.setLayoutData(data);
		
		data = new FormData();
		data.left = new FormAttachment(nameText, 0, SWT.LEFT);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(55, 0);
		phoneText.setLayoutData(data);
		
		shell.pack();
	}

}
