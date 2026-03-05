package notes;
import java.util.*;

public class Secure {
	class Secure {
	    private int pin = 1234;

	    public void setPin(int pin) {
	        if(pin > 999)
	            this.pin = pin;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Secure s = new Secure();
	        s.setPin(99);
	        s.setPin(5678);
	    }
	}

}
