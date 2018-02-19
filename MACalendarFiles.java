import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Prints the equivalent number of days left for the Master's thesis as text documents on the desktop.
 * The title of the documents represents the day, inside each of the text documents, the number of days left
 * is written.
 * @author  stephbysteph
 * @version 1.0
 * @since   19 February 2018
 */
public class MACalendarFiles {
    private String modifiableStart = "0103";
    private int modifiableStartInt = 103;
    private final int maxNum = 15;
    private final String path = "C:\\Users\\Nelson\\Desktop\\";

    /**
     * Method for printing the text documents and their content.
     */
    void printFiles() {
        PrintWriter writer;
        for (int i = 0; i < maxNum; i++) {
            try {
                writer = new PrintWriter(path + modifiableStart + ".txt", "UTF-8");
                writer.println("Days left: " + Integer.toString((1503-modifiableStartInt)/100));
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            modifiableStartInt = Integer.parseInt(modifiableStart);
            modifiableStartInt+=100;
            System.out.println(modifiableStartInt);
            modifiableStart = modifiableStartInt < 1000 ? "0" + Integer.toString(modifiableStartInt) : Integer.toString(modifiableStartInt);
        }
    }
}
