import java.awt.*;
import java.io.File;
import java.io.IOException;
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

    public String ChangeHamletToLeon(){
        String answer;
        Pattern pattern = Pattern.compile(Hamlet);
        Matcher matcher = pattern.matcher(hamletData);
        answer = matcher.replaceAll(Leon);


        Pattern pattern1 = Pattern.compile("HALMET");
        Matcher matcher1 = pattern1.matcher(answer);
        answer = matcher1.replaceAll(Leon);


        hamletData = answer;


        return answer;
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
