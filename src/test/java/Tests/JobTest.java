package Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.launchcode.techjobs_oo.*;


public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Web Developer", new Employer("Boeing"), new Location("Saint Louis"), new PositionType("Development"), new CoreCompetency("JavaScript"));
        test_job5 = new Job("Web Developer", new Employer("Boeing"), new Location("Saint Louis"), new PositionType("Development"), new CoreCompetency("JavaScript"));
    }

    @Test
    public void testSettingJobID() {
        assertEquals(test_job1.getId() + 1, test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job3 instanceof Job);
        assertTrue(test_job3.getEmployer() instanceof Employer);
        assertTrue(test_job3.getLocation() instanceof Location);
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(3, test_job3.getId());
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job4.equals(test_job5));
    }
}


