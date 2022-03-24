package com.company.DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double length, width, height = 0;
        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

//        BigDecimal volume1 = new BigDecimal((length * width * height) / 3 );
//        System.out.printf("Pyramid Volume: %.2f", volume1);

    }
}
