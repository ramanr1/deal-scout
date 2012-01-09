package com.parousia.dealscout.view;

public interface DealScoutScreenUpdater {

	public static final int DIALOG_PROGRESS = 101;
	public static final int DIALOG_MESSAGE = 102;
	public static final int DIALOG_MESSAGE_INFO = 103;
	
	public void update(Object data);
	public void displayMessage(String title, String message);

}
