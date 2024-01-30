package main;


import java.util.ArrayList;
import java.util.Collections;

//Studentille tarvitaan varmaankin lista jonne laitetaan opintosuoritukset eli Grade luokan oliot?

public class Student {
    private String sOpiskelijanNimi;
    private String sOpiskelijanNumero;
    ArrayList<Grade> arraylistGrades = new ArrayList<>();
    
    



    
public Student (String sNimi, String sOpiskelijaNumero){
    this.sOpiskelijanNimi = sNimi;
    this.sOpiskelijanNumero = sOpiskelijaNumero;

}

public void printSpecs (){
    
    System.out.println(sOpiskelijanNumero + ": " + sOpiskelijanNimi);

}

public void addGrade(String sKurssi, int iArvosana){

    arraylistGrades.add(new Grade(sKurssi, iArvosana));

}

public String getName(){
    return(sOpiskelijanNimi);
}

public void listGrades(){
    for(Grade grade : arraylistGrades){
        grade.printSpecs();
        

    }
}

public float countAverage (){
    int iGrade;
    int iRounds = 0;
    float fSumma = 0;
    float fAverage;
    for(Grade grade : arraylistGrades){
        iRounds++;
        iGrade = grade.getGrade();
        fSumma = iGrade + fSumma;
        System.out.println(iRounds);
        

    }
    fAverage = fSumma/iRounds;
    System.out.println(fAverage);

    return(fAverage);
}

public double countMedian(){
    double dMedian;
    ArrayList<Integer> iNumbers = new ArrayList<>();
    for(Grade grade : arraylistGrades){
        int iGrade = grade.getGrade();
        iNumbers.add(iGrade);
        
        
    }
    Collections.sort(iNumbers);
    
        int middle = iNumbers.size()/2;
        if (iNumbers.size()%2==1){
            //fMedian = (iNumbers.get(iNumbers.size()/2) + iNumbers.get(iNumbers.size()/2-1))/2;
            dMedian = iNumbers.get(middle);
        } else {
            dMedian = (iNumbers.get(middle - 1) + iNumbers.get(middle))/2.0;
        }
    return(dMedian);
}

}


