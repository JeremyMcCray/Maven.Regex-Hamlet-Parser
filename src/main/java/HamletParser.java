import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;
    String Horatio = "Horatio";
    String Hamlet = "Hamlet";
    String Leon = "Leon";
    String Tariq = "Tariq";


    public String ChangeHoratioToTariq(){
        String regexWord = "Horatio";
        String replaceWord = "Tariq";

        Pattern pattern = Pattern.compile(regexWord);
        Matcher matcher = pattern.matcher(hamletData);
        String answer = matcher.replaceAll(replaceWord);



        regexWord = "HORATIO";
        replaceWord = "TARIQ";
        pattern = Pattern.compile(regexWord);
        matcher = pattern.matcher(answer);
        answer = matcher.replaceAll(replaceWord);
        hamletData = answer;


        return hamletData;
    }
    public String ChangeHamletToLeon(){
        String regexWord = "Hamlet";
        String replaceWord = "Leon";

        Pattern pattern = Pattern.compile(regexWord);
        Matcher matcher = pattern.matcher(hamletData);
        String answer = matcher.replaceAll(replaceWord);



        regexWord = "HAMLET";
        replaceWord = "LEON";
        pattern = Pattern.compile(regexWord);
        matcher = pattern.matcher(answer);
        answer = matcher.replaceAll(replaceWord);
        hamletData = answer;


        return hamletData;
    }
    public String changeBoth(){
        ChangeHamletToLeon();
        ChangeHoratioToTariq();
        return hamletData;
    }


    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }


}
