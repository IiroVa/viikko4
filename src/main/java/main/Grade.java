package main;

import java.io.Serializable;

public class Grade implements Serializable{
    String sKurssinimi;
    int iKurssiArvosana;
    private static final long serialVersionUID = 95732453;

public Grade (String sNimi, int iLuku){
    this.sKurssinimi = sNimi;
    this.iKurssiArvosana = iLuku; 
}

public void printSpecs(){
    System.out.println(sKurssinimi + ": " + iKurssiArvosana);
}

public int getGrade(){
    int grade = iKurssiArvosana;

    return(grade);
}

}
