package org.launchcode.techjobs_oo.tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    //constructor (below) is needed for most tests that follow
    Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    //variable (below) will be needed for tests that follow
    String testOne = object.toString();



@Test
    public void testSettingJobId() {
        Job emptyObject1 = new Job();
        Job emptyObject2 = new Job();

        assertEquals(emptyObject1.getId() + 1 ,emptyObject2.getId(),0);
}

@Test //using instanceof keyword
    public void testJobConstructorSetsAllFields() {
    //Job a = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            //new PositionType("Quality Control"), new CoreCompetency("Persistence"));

    assertTrue(object.getName() instanceof String);
    assertTrue(object.getEmployer() instanceof Employer);
    assertTrue(object.getLocation() instanceof Location);
    assertTrue(object.getPositionType() instanceof PositionType);
    assertTrue(object.getCoreCompetency() instanceof CoreCompetency);

}

@Test //testing for equality
    public void testJobsforEquality() {
    //Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            //new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    Job object2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    assertFalse(object.equals(object2));
}

@Test //TDD Build The toString Method
    public void testBlankLineBeforeAndAfterToStringMethod(){

    //Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            //new PositionType("Quality Control"), new CoreCompetency("Persistence")); //constructor for test

    //String testOne = object.toString();

    assertTrue(testOne.charAt(0) == '\n' ); //testing for blank line before the string
    assertEquals(testOne.charAt(testOne.length()- 1), '\n'); // testing for blank line after the string
}

@Test //2.1
    public void testIdLabelToStringMethod(){

    //Job object = new Job("Product Tester", new Employer("ACME"), new Location("Desert"),
            //new PositionType("Quality Control"), new CoreCompetency("Persistence")); //constructor for test

    //String testOne = object.toString();
    assertTrue(object.toString().contains('\n' + "ID: " + object.getId() + '\n'));




}

@Test //2.2
    public void testNameLabelToStringMethod(){
    assertTrue(object.toString().contains("Name: " + object.getName() + '\n'));
}

@Test //2.3
    public void testEmployerLabelToStringMethod(){
    assertTrue(object.toString().contains("Employer: " + object.getEmployer() + '\n'));

}

@Test //2.4
    public void testLocationLabelToStringMethod(){
    assertTrue(object.toString().contains("Location: " + object.getLocation() + '\n'));
}

@Test //2.5
    public void testPositionTypeLabelToStringMethod(){
    assertTrue(object.toString().contains("Position Type: " + object.getPositionType() + '\n'));
}

@Test //2.6
    public void testCoreCompetencyLabelToStringMethod(){
    assertTrue(object.toString().contains("Core Competency: " + object.getCoreCompetency()));
}

@Test //3
   public void testIfFieldIsEmptyToStringMethod(){
    Job nullObject = new Job(null , null , null ,
            null , new CoreCompetency("Not very competent"));

    assertTrue(nullObject.toString().contains("Employer: Data not available."));
}

@Test //4 Bonus
    public void testIfAllFieldsAreEmpty() {
    Job nullObject2 = new Job(null , null , null ,
            null , null);

    assertTrue(nullObject2.toString().contains("What you are looking for does not exist."));

}



}

