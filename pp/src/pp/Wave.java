package pp;

public class Wave {
	public Wave(double HZ) { // constructor 1
		System.out.println(HZ);
	}
	public Wave(double pulse, double t, double HZ) { // constructor 2
		this(HZ); // using the special variable this as a constructor
		System.out.println(pulse);
		System.out.println(t);
	}
}

class AnalogWave extends Wave{ // AnalogWave is a subclass of the super class Wave
	public AnalogWave() { // constructor
	super(300.0); // calling the constructor of Wave
	}
}

class DigitalWave extends Wave{ // DigitalWave is a subclass of the super class Wave
	public DigitalWave() { // constructor
	super(1.0, 4.5, 300); // calling the constructor of Wave
	}
}