
public class Doctor extends Employee{

	public void drawBlood(Bleedable patient) {
		patient.removeBlood(1);
	}

	public int getSalary() {
		
		return 90000;
	}

}
