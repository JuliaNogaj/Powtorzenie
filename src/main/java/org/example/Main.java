package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
int x,y,z;
int poleTrojkata;

System.out.println("Podaj bok pierwszego:");
x=getInt();

System.out.println("Podaj bok pierwszego:");
y=getInt();

System.out.println("Podaj bok pierwszego:");
z=getInt();

poleTrojkata=x+y+z;

System.out.println("Obwod wynosi:"+ poleTrojkata);


    }

    public static int getInt(){

        return new Scanner(System.in).nextInt();

    }
}
