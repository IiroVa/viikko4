package main;

public class Calculator {
    
    
public Calculator (){
    
}

public double getAverageGrade(Student s){

    double dAverage = s.countAverage();
    
    

    return(dAverage);
    

}
public double getMedianGrade(Student s){

    double dMedian = s.countMedian();


    return(dMedian);
}
}
