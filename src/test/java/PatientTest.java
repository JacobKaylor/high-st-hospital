import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PatientTest {
	
	public void shouldBeAbleToRemoveBlood() {
		Patient patient = new Patient();
	patient.removeBlood(3);	
	
	int currentBloods = patient.getBloods();
	
	assertThat(currentBloods, is(Patient.DEFAULT_BLOODS - 3));
	}

}
