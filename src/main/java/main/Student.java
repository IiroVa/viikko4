package main;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;



public class Student implements Serializable {
    private String sOpiskelijanNimi;
    private String sOpiskelijanNumero;
    private static final long SerialVersionUID = 93429343;
    ArrayList<Grade> arraylistGrades = new ArrayList<>();
    
    



    
public Student (String sNimi, String sOpiskelijaNumero){
    this.sOpiskelijanNimi = sNimi;
    this.sOpiskelijanNumero = sOpiskelijaNumero;

}

public void printSpecs (){
    
    System.out.println(sOpiskelijanNumero + ": " + sOpiskelijanNimi);

}

public void addGrade(String course, int Grade){

    arraylistGrades.add(new Grade(course, Grade));

}

public String getName(){
    return(sOpiskelijanNimi);
}

public void listGrades(){
    for(Grade grade : arraylistGrades){
        grade.printSpecs();
        

    }
}

public double countAverage (){
    int iGrade;
    int iRounds = 0;
    float fSumma = 0;
    double dAverage;
    
    if(arraylistGrades.size()>0){
    for(Grade grade : arraylistGrades){
        iRounds++;
        iGrade = grade.getGrade();
        fSumma = iGrade + fSumma;
        ;
        

    }
    dAverage = fSumma/iRounds;
    

    
} else {
    dAverage = 0;

}
return(dAverage);
}

public double countMedian(){
    double dMedian;
    ArrayList<Integer> iNumbers = new ArrayList<>();

    if(arraylistGrades.size()>0){
    for(Grade grade : arraylistGrades){
        int iGrade = grade.getGrade();
        iNumbers.add(iGrade);
        
        
    }
    Collections.sort(iNumbers);
    
        int middle = iNumbers.size()/2;
        if (iNumbers.size()%2==1){
            
            dMedian = iNumbers.get(middle);
        } else {
            dMedian = (iNumbers.get(middle - 1) + iNumbers.get(middle))/2.0;
        }
    
}else{
    dMedian=0;
}
return(dMedian);
}

}


