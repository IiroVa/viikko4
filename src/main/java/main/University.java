package main;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {
    String sNimi;
    final private String FILENAME;
    ArrayList<Student> Students = new ArrayList<>();
    
public University (){
    this.sNimi = "LUT";
    FILENAME = "students.txt";
}

public void addStudent (Student Student){
    Students.add(Student);
    
}
public void listStudents(){
    System.out.println("Opiskelijat:");
    for(Student student : Students){
        student.printSpecs();


    }
}

public void listStudents2(){
    int i = 0;
    for(Student student : Students){
        String name = student.getName();
        System.out.println(i + ": " + name);
        i++;

    }
}

public void addGrade(int iIndeksi, String sKurssi, int iArvosana){
    Student student = Students.get(iIndeksi);
    student.addGrade(sKurssi, iArvosana);

}

public void listStudentgrades (int iIndeksi){
    Student student = Students.get(iIndeksi);
    student.listGrades();

}
public double countAverage (int iIndeksi){
    double dAverage;
    Student student = Students.get(iIndeksi);
    dAverage = student.countAverage();

    return(dAverage);
}

public double countMedian (int iIndeksi){
    double dMedian;
    Student student = Students.get(iIndeksi);
    dMedian = student.countMedian();
    return(dMedian);
}

public Student getStudent (int iIndeksi){
    Student student = Students.get(iIndeksi);
    return(student);
}

public void saveStudents () {
    ObjectOutputStream studentWriter;
    try {
        studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
        studentWriter.writeObject(Students);
        studentWriter.close();
    } catch (IOException e) {
        System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
        e.printStackTrace();
    }
    
    
}

public void readStudents () {

    
    try {
        ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
        Students = (ArrayList<Student>) studentReader.readObject();
        studentReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
        e.printStackTrace();
    } catch (IOException e) {
        System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
        e.printStackTrace();
    }
    
    

}

}