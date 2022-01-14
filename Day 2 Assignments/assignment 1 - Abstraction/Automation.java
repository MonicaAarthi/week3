package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void selenium() {
		
		System.out.println("Selenium is an open source automation tool for web applications.");
		
	}

	public void java() {
		
		System.out.println("Java is the most popular programming language");
		
	}

	
	
	public static void main(String[] args) {
		
		Automation at = new Automation();
		
		at.java();
		at.selenium();
		at.python();
		at.ruby();
		
		
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby is also a programming language.");
		
		
		
	}
		
}
