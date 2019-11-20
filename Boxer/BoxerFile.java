import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;


public class BoxerFile {

    public static String box = "box.txt";
    public static File boxers = new File(box);
    
    public static void main(String[] args) {

        System.out.println(printDetails());

        boolean running = true;

        while(running){

            System.out.println("Enter command: ");
            
            Scanner in = new Scanner(System.in);
            String job = in.nextLine();

            if(job.equals("add")){

                addBoxer();
            }   

            if(job.equals("r")){

                remove();
            }

            if(job.equals("all")){

                printAll();
            }

            if(job.equals("help")){

                System.out.println(printDetails());
            }

            if(job.equals("q")){

                running = false;
            }
        }
    }

    public static String printDetails(){

        return "Available commands.\n" +
            "'add' to add a boxer.\n" +
            "'r' to remove top boxer.\n" +
            "'all' to print the all boxers.\n" +
            "'help' to print commands.\n" +
            "'q' to quit.";
    }

    public static void addBoxer(){

        try(FileWriter f = new FileWriter(box, true);
            BufferedWriter bw = new BufferedWriter(f);
            PrintWriter file = new PrintWriter(bw)){

            System.out.println("Boxers have a name, a height, " + 
            "a reach, number of fights, number of wins, and " +
            "number of knockouts.");

            Scanner in = new Scanner(System.in);
            System.out.println("Enter the boxer's name: ");
            String name = in.nextLine();
            System.out.println("Enter their height: ");
            String height = in.nextLine();
            System.out.println("Enter their reach: ");
            String reach = in.nextLine();
            System.out.println("Enter number of fights: ");
            int fights = in.nextInt();
            System.out.println("Enter number of wins: ");
            int wins = in.nextInt();
            System.out.println("Enter number of knockouts: ");
            int ko = in.nextInt();

            file.println(name + ": " + height + ", " +
            reach + " --> "  + "fights: " + fights + 
            " (" + wins + "," + ko + ")");

        } 
        catch (IOException e){
            System.out.println("Unable to write to file.");
        }
    }

    public static void remove(){

        try{
            
            // temp file is called toDoList.temp
            File tempFile = new File(boxers.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(boxers));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line = null;

            String remove = br.readLine();
            while ((line = br.readLine()) != null) {
                pw.println(line);
                pw.flush();
            }
            pw.close();
            br.close();

            //Delete the original file
            if (!boxers.delete()){
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(boxers))
                System.out.println("Could not rename file");
            }
        catch(IOException e){
            System.out.println("File not found.");
        }
    }

    public static void printAll(){

        try{
            Scanner in = new Scanner(boxers);

            boolean notEmpty = boxers.length() != 0;
            if(notEmpty){

                while(in.hasNextLine()){

                    String boxer = in.nextLine();
                    System.out.println(boxer);
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}

//Boxer boxer = new Boxer(name, height, reach, fights, wins, ko);
//List<Boxer> boxList = new ArrayList<Boxer>();
//boxList.add(boxer);
