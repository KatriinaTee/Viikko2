package main;

import java.util.Scanner;

/**
 * Hello world!
 * 
 * /**
    Tehdään kerran alussa:
        1. git init
        2. git remote add .... (kopioi GitHub repositoryn sivulta)
        3. git branch -M main

    Tehdään aina kun halutaan tallentaa lokaalit muutokset GitHubiin:
        1.  git add .
        2.  git commit -m "VIESTI_TÄHÄN"
        3.  git push origin main   
   */
 
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );

        Hedgehog hedgehog = new Hedgehog();

        //hedgehog.speak();

        //Hedgehog hedgehogNew = new Hedgehog(); 

        Scanner sc = new Scanner(System.in);

        //Hedgehog newHedgehog = null;

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma"); 

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo: ");
                        String speak = sc.nextLine();   
                        if (speak == ""){
                            System.out.println("Olen " + hedgehog.getName() + " ja ikäni on " + hedgehog.getAge() + 
                            ", mutta antaisitko silti syötteen?");
                        } else {
                            System.out.println(hedgehog.getName() + ": " + speak);
                        }
                        
                        break;


                    case 2:
                        System.out.println("Anna siilin nimi: ");
                        String name = sc.nextLine();
                        System.out.println("Anna siilin ikä: ");
                        String ageString = sc.nextLine();
                        int age = Integer.parseInt(ageString);

                        hedgehog = new Hedgehog(name, age);
                        break;

                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        String run = sc.nextLine();
                        int laps = Integer.parseInt(run);
                        for (int j = 0; j < laps; j++) {
                            hedgehog.run();
                        }
                        break;


                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä0");
                        break;
                }
            }

        }
        sc.close();
    }
}
