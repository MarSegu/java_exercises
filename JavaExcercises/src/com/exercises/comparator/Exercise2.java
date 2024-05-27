package com.exercises.comparator;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Checker2 implements Comparator<Student>{
    @Override
    public int compare(Student a, Student b){
        //int comparision = Integer.compare(a.score, b.score);
        if(b.getCgpa() != a.getCgpa()){
            return Double.compare(b.getCgpa(), a.getCgpa());
        }else{
            if(a.getFname() != b.getFname()){
                return a.getFname().compareTo(b.getFname());
            }else{
                return Integer.compare(a.getId(),b.getId());
            }
        }
    }
}

//Complete the code
public class Exercise2
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Checker2 checker = new Checker2();

        Collections.sort(studentList, checker);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}




