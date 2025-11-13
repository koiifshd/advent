import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {

    public static int countTrianglesA(String filename) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                int side1 = input.nextInt();
                int side2 = input.nextInt();
                int side3 = input.nextInt();
                if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                    count++;
                }
                if (input.hasNextLine()) {
                    input.nextLine();
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        return count;
    }

    public static int countTrianglesB(String filename) {
        int count = 0;
        try (Scanner sc = new Scanner(new File(filename))) {

            while (sc.hasNextInt()) {
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                int c1 = sc.nextInt();

                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                int c2 = sc.nextInt();

                int a3 = sc.nextInt();
                int b3 = sc.nextInt();
                int c3 = sc.nextInt();

              if (a1 + a2 > a3 && a1 + a3 > a2 && a2 + a3 > a1) count++;
               if (b1 + b2 > b3 && b1 + b3 > b2 && b2 + b3 > b1) count++;
               if (c1 + c2 > c3 && c1 + c3 > c2 && c2 + c3 > c1) count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
  }
