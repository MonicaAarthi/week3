package week3.day2;

public class Desktop implements Software {

	public void softwareResources() {
		
		System.out.println("Runs on Windows 7");
		
	}


	public void hardwareResources() {
		
		System.out.println("RAM is 4GB");
		
	}

	
    public void desktopModel() {
		
		System.out.println("HP computers");
		
	}


   public static void main(String[] args) {
		
		Desktop dk = new Desktop();
		
		dk.hardwareResources();
		dk.softwareResources();
		dk.desktopModel();
		

	}

}




