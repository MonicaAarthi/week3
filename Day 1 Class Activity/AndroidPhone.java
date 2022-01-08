package week3.day1;

public class AndroidPhone extends SmartPhone {

public void takeVideo() {
		
		System.out.println("video recorded");		
	}
		
public static void main(String[] args) {
	
AndroidPhone obj = new AndroidPhone();

//SmartPhone sp = new SmartPhone();

obj.sendMsg();
obj.makeCall();
obj.saveContact();
//sp.accessWhatsapp();

obj.takeVideo();

//sp.takeVideo();


obj.accessWhatsapp();

}	
	
}
