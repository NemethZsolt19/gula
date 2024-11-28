/*
* File: Pyramid.java
* Author: NÉmeth Zsolt
* Copyright: 2024, Németh Zsolt
* Group: Szoft II/II/N
* Date: 2024-11-28
* Github: https://github.com/janos12345/
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class Pyramid {
    public void startCalc(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Oldal: ");
        String sideStr=sc.nextLine();
        Double side = Double.parseDouble(sideStr);

        System.out.print("Magasság: ");
        String heightStr=sc.nextLine();
        Double height = Double.parseDouble(heightStr);

        Double volume = 1.0/3.0* Math.pow(side, 2)*height;
        System.out.printf("Térfogat: %f\n", volume);
        sc.close();
    }
}
