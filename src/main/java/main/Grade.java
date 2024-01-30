package main;

public class Grade {
    String sKurssinimi;
    int iKurssiArvosana;

public Grade (String sNimi, int iLuku){
    this.sKurssinimi = sNimi;
    this.iKurssiArvosana = iLuku; 
}

public void printSpecs(){
    System.err.println(sKurssinimi + ": " + iKurssiArvosana);
}

public int getGrade(){
    int grade = iKurssiArvosana;

    return(grade);
}

}
