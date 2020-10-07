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

@Test //using instanceof keyword
    public void testJobConstructorSetsAllFields() {
    Job a = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    assertTrue(a.getName() instanceof String);
    assertTrue(a.getEmployer() instanceof Employer);
    assertTrue(a.getLocation() instanceof Location);
    assertTrue(a.getPositionType() instanceof PositionType);
    assertTrue(a.getCoreCompetency() instanceof CoreCompetency);

}

@Test //testing for equality
    public void testJobsforEquality() {
    Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job object2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertFalse(object.equals(object2));
}

@Test //TDD Build The toString Method
    public void testOnetoStringMethod(){

    Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    String testOne = object.toString();

    assertTrue(testOne.charAt(0) == '\n' ); //testing for blank line before the string
    assertEquals(testOne.charAt(testOne.length()- 1), '\n'); // testing for blank line after the string
}

@Test //TDD
}

