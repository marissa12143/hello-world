/*package edu.umsl.learningcollecitons;

public class LearningConstructors {

	public static void main(String[] args) {
		
		Car c = new Car("Honda", "Civic", 2);
		//c.setName("Honda");
		//c.setNumberOfDoors(2);
		
		System.out.println("Make: " + c.getMake() + " Name: " + c.getName() + " Number of Doors: " +  c.getNumberOfDoors());
	}
}
*/
package edu.umsl.learningcollecitons;
import java.util.ArrayList;
import java.util.List;
public class LearningConstructors {

	public static void main(String[] args) {
		String[] cars = new String[5];
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Ford";
		cars[3] = "Audi";
		cars[4] = "Nissan";
		for(int i = 0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}