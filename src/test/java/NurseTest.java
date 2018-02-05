import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {
	@Test
	public void shouldHaveSalary() {
		Employee underTest = new Nurse();
		
		int salary = underTest.getSalary();
		
		assertThat(salary, is(50000));
	}
}
