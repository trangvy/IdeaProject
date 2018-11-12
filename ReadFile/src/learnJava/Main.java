package learnJava;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "hello" + new Date();

        /*try {
            File file = new File("/home/vytrang/IdeaProjects/ReadFile/src/learnJava/text.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }*/


        File file = new File("/home/vytrang/IdeaProjects/ReadFile/src/learnJava/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String regex;
        String str1;
        regex = "\\d+";
//        Pattern pattern = Pattern.compile(regex);

        while ((line = bufferedReader.readLine()) != null) {

            /*Matcher matcher = pattern.matcher(line);

            if (matcher.find()) {
                String string = matcher.group() ;
                System.out.println(string);
            }*/

            int start = line.lastIndexOf("/");
            int end = line.indexOf("?");

//            String string = line.replaceAll("[^0-9]","");
//            String[] string = line.split("/");
//            str1 = string[string.length-1];

//            int end = str1.indexOf("?");
            System.out.println(line.substring(start+1,end));
        }



    }
}
