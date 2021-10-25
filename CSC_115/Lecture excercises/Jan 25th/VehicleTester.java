public class VehicleTester {

	public static void main(String[] args) {

		MotorCycle m = new MotorCycle("CB300R");
		System.out.println(m.getKMs() + "kms traveled");
		/* Q1 - what will be output after the following
			   call to the drive method? */

		m.drive(10);
		System.out.println(m.getKMs() + "kms traveled");



		/* Q2 - implement the AutomaticCar class and then
				uncomment and run the tests below */
    System.out.println("\nCar tests:");
		AutomaticCar a1 = new AutomaticCar("Mazda 3", 67000);
		System.out.println(a1.getKMs());
    a1.fastenSeatBelts();
		a1.drive(50);
		System.out.println(a1.getKMs());


		/* Q3 - Make an array of vehicles and drive
			  each vehicle in the array 120km */

		Vehicle mcycle = new MotorCycle("Harley Davidson");
		Vehicle car = new AutomaticCar("Mustang", 15000);

		Vehicle[] collection = {mcycle, car, a1, m};

    System.out.println("\nVehicle array tests:");
		for (int i = 0; i < collection.length; i++) {
			System.out.println("Let's go for a drive!");

      if (collection[i] instanceof MotorCycle) {
        System.out.println("This vehicle is a MotorCycle");
      }
      else if (collection[i] instanceof AutomaticCar) {
        System.out.println("This vehicle is an AutomaticCar");
        AutomaticCar c = (AutomaticCar) collection[i];
        c.fastenSeatBelts();
      }
			collection[i].drive(120);
			System.out.println();
		}
	}

}
