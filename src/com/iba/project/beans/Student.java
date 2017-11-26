package com.iba.project.beans;

public class Student
{
    int id;
    String firstName;
    String secondName;
    String groupName;
    float avgMark;

    public Student()
    {

    }


    public Student(int id, String firstName,String secondName,String groupNumber, float avgMark)
    {
        this.id=id;
        this.firstName=firstName;
        this.secondName=secondName;
        this.groupName=groupNumber;
        this.avgMark=avgMark;
    }


    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSecondName(String secondNamae) {
        this.secondName = secondNamae;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;


        if (Float.compare(student.getAvgMark(), getAvgMark()) != 0) return false;
        if (!getFirstName().equals(student.getFirstName())) return false;
        if (!getSecondName().equals(student.getSecondName())) return false;
        return getGroupName().equals(student.getGroupName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getSecondName().hashCode();
        result = 31 * result + getGroupName().hashCode();
        result = 31 * result + (getAvgMark() != +0.0f ? Float.floatToIntBits(getAvgMark()) : 0);
        return result;
    }
}
