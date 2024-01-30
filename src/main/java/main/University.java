package main;

import java.util.ArrayList;

public class University {
    String sNimi;
    ArrayList<Student> arraylistStudents = new ArrayList<>();
    
public University (){
    this.sNimi = "LUT";
}

public void addStudent (Student Student){
    arraylistStudents.add(Student);
    
}
public void listStudents(){
    System.out.println("Opiskelijat:");
    for(Student student : arraylistStudents){
        student.printSpecs();


    }
}

public void listStudents2(){
    int i = 0;
    for(Student student : arraylistStudents){
        String name = student.getName();
        System.out.println(i + ": " + name);
        i++;

    }
}

public void addGrade(int iIndeksi, String sKurssi, int iArvosana){
    Student student = arraylistStudents.get(iIndeksi);
    student.addGrade(sKurssi, iArvosana);

}

public void listStudentgrades (int iIndeksi){
    Student student = arraylistStudents.get(iIndeksi);
    student.listGrades();

}
public float countAverage (int iIndeksi){
    float fAverage;
    Student student = arraylistStudents.get(iIndeksi);
    fAverage = student.countAverage();

    return(fAverage);
}

public double countMedian (int iIndeksi){
    double dMedian;
    Student student = arraylistStudents.get(iIndeksi);
    dMedian = student.countMedian();
    return(dMedian);
}

}
