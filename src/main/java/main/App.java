package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String sNimi;
        String sOpiskelijaNumero;
        String sKurssi;
        int iArvosana;
        int iIndeksi;
        float fAverage;

        University university = new University();
        while(exit == false){
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");
        if(sc.hasNext()){
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i){
                case 1:
                System.out.println("Anna opiskelijan nimi?");
                sNimi = sc.nextLine();
                

                System.out.println("Anna opiskelijan opiskelijanumero:");
                sOpiskelijaNumero = sc.nextLine();    
                
                university.addStudent(new Student(sNimi, sOpiskelijaNumero));

                break;
                case 2:
                university.listStudents();
                break;
                case 3:
                university.listStudents2();
                System.out.println("Mille opiskelijalle suorite lisätään?");
                iIndeksi = Integer.parseInt(sc.nextLine());
                System.out.println("Mille kurssille suorite lisätään");
                sKurssi = sc.nextLine();
                System.out.println("Mikä arvosana kurssille lisätään?");
                iArvosana = Integer.parseInt(sc.nextLine());
                university.addGrade(iIndeksi, sKurssi, iArvosana);
                break;
                case 4:
                university.listStudents2();
                System.out.println("Minkä opiskelijan suoritteet listataan?");
                iIndeksi= Integer.parseInt(sc.nextLine());
                university.listStudentgrades(iIndeksi);

                break;
                case 5:
                university.listStudents2();
                System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                iIndeksi= Integer.parseInt(sc.nextLine());
                fAverage = university.countAverage(iIndeksi);
                System.out.println("Keskiarvo on " + fAverage);
                break;
                case 6:
                university.listStudents2();
                System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                iIndeksi= Integer.parseInt(sc.nextLine());
                double dMedian = university.countMedian(iIndeksi);
                System.out.println("Mediaani on " + dMedian);

                break;
                case 7:
                break;
                case 8:
                break;
                case 0:
                System.out.println("Kiitos ohjelman käytöstä.");
                exit = true;
                break;
                default:
                System.out.println("Syöte oli väärä.");
                break;

            }
        }
        }
    
    sc.close();   
    }
    
}
