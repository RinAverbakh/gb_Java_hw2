import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class task4 {

    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        
        int[] array = { 15 , 2 , 9 , -4 , 0 , 6 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        findMinAndMax(array);
    }

    public static void findMinAndMax (int[] array) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log, true);

            int min = array[0];
            int max = array[0];
            for (int i : array) {
                if (i > max) max = i;
                if (i < min) min = i;
            }

            logStep(min, max);

            System.out.println("min = " + min + "\nmax = " + max);

        } catch (IOException e){

            e.printStackTrace();

        } finally {
            try {

                fileWriter.close();

            } catch (IOException e) {

                e.printStackTrace();
            }        
        }
    }

    private static void logStep(int min, int max) {
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String timestamp = dateFormat.format(new Date());
            fileWriter.write(timestamp + " " + min + ", " + max + "\n");

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
