package org.launchcode.techjobs_oo.tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

@Test
    public void testSettingJobId() {
        Job emptyObject1 = new Job();
        Job emptyObject2 = new Job();

        assertEquals(emptyObject1.getId() + 1 ,emptyObject2.getId(),0);
}

@Test
    public void testJobConstructorSetsAllFields() {
    Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertTrue(object instanceof Job);

}

@Test
    public void testJobsforEquality() {
    Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job object2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertFalse(object.equals(object2));
}


}

