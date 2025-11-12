import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
// remember toreplace class name for each day
public class Template{
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            //replace input.txt with the input file for that day!
            Scanner scan = new Scanner(new File("input.txt")); 
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                if(!line.isEmpty()){
                    lines.add(line);
                }
                    
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            return;
        }
    }

}