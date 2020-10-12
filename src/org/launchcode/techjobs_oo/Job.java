package org.launchcode.techjobs_oo;

import java.util.Objects;
import java.util.ArrayList;

public class Job {

    private int id; // used to identify Job objects
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() { //constructor 1
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) { //constructor 2
        this();
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        //Pass testBlankLineBeforeAndAfterToStringMethod()
        //return "\n" + "Job info goes here" + '\n';
        String emptyNameField = "Data not available.";
        String emptyEmployerField = "Data not available.";
        String emptyLocationField = "Data not available.";
        String emptyPositionTypeField = "Data not available.";
        String emptyCoreCompetency = "Data not available.";
        String doesNotExist = "What you are looking for does not exist."; //BONUS

        if(this.name != null){
            emptyNameField = "Data not available.";
        }

        if(this.employer != null) { //checks to see if field is empty
            emptyEmployerField = this.employer.getValue();
        }

        if(this.location != null) {
            emptyLocationField = this.location.getValue();
        }

        if(this.positionType != null) {
            emptyPositionTypeField = this.positionType.getValue();
        }

        if(this.coreCompetency != null) {
            emptyCoreCompetency = this.coreCompetency.getValue();
        }

        if(this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null) {
            return doesNotExist;
        } else {

            return '\n' + "ID: " + this.id + '\n' +
                    "Name: " + emptyNameField + '\n' +
                    "Employer: " + emptyEmployerField + '\n' +
                    "Location: " + emptyLocationField + '\n' +
                    "Position Type: " + emptyPositionTypeField + '\n' +
                    "Core Competency: " + emptyCoreCompetency + '\n';

        }



//        return '\n' + "ID: " + this.id + '\n' +
//                "Name: " + emptyNameField + '\n' +
//                "Employer: " + emptyEmployerField + '\n' +
//                "Location: " + emptyLocationField + '\n' +
//                "Position Type: " + emptyPositionTypeField + '\n' +
//                "Core Competency: " + emptyCoreCompetency + '\n';
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
