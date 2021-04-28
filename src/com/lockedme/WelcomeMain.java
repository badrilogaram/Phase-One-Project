package com.lockedme;

public class WelcomeMain {
	
	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOptions.mainFolderCreation("main");
		
		ApplicationMenu.printWelcomeScreen("LockedMe Application", "Badri Logaram");
				
		HandlingFunctions.handleWelcomeScreenInput();
		
	}
	
	
		
}


