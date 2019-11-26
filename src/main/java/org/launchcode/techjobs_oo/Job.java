package org.launchcode.techjobs_oo;

import java.lang.reflect.Constructor;
import java.util.*;

import static java.util.Objects.isNull;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String returnString = "\n";
        returnString += "ID: " + getId() + "\n";
        if (name == "") {
            returnString += "Name: " + "Data not available" + "\n";
        } else {
            returnString += "Name: " + getName() + "\n";
        }
        if (employer.getValue() == "") {
            returnString += "Employer: " + "Data not available" + "\n";
        } else {
            returnString += "Employer: " + getEmployer() + "\n";
        }
        if (location.getValue() == "") {
            returnString += "Location: " + "Data not available" + "\n";
        } else {
            returnString += "Location: " + getLocation() + "\n";
        }
        if(positionType.getValue() == "") {
            returnString += "Position Type: " + "Data not available" + "\n";
        } else {
            returnString += "Position Type: " + getPositionType() + "\n";
        }
        if (coreCompetency.getValue() == "") {
            returnString += "Core Competency: " + "Data not available" + "\n";
        } else {
            returnString += "Core Competency: " + getCoreCompetency() + "\n";
        }

        return returnString;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


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

    public int getId() {
        return id;
    }
}
