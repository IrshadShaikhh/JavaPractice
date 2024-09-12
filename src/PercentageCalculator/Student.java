package PercentageCalculator;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private   String name;
    private  List<Subject> subjects;
    private double totalPossibleMarks;

    public Student(String name,double totalPercentage)
    {
        this.name=name;
        this.totalPossibleMarks=totalPossibleMarks;
        this.subjects = new ArrayList<>();
    }
    public void addSub(Subject subject)
    {
        subjects.add(subject);
    }
    public double getTotalMarks()
    {
        return subjects.stream().mapToDouble(Subject::getMarks).sum();
    }
    public double getTotalPossibleMarks()
    {
        return totalPossibleMarks*subjects.size();
    }
    public double calculatePercentage() {
        double totalMarks = getTotalMarks();
        double totalPossibleMarksOverall = getTotalPossibleMarks();
        return (totalMarks / totalPossibleMarksOverall) * 100;
    }

    public String getName()
    {
        return name;
    }
    public List<Subject> getSubjects()
    {
        return subjects;
    }
}
