package json;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();
        File file = new File("/home/vytrang/IdeaProjects/ReadFile/src/json/test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        FileInputStream fileInputStream = new FileInputStream(file);
//        BufferedInputStream filter = new BufferedInputStream(fileInputStream);
//
//        JsonReader jsonReader = new JsonReader(new FileReader(file));
//
//
//        int i = 0;
//        Stream<String> str = null;
//        while ( (i = filter.read()) != -1 ) {
//            System.out.println((char) i);
//        }

        Result result = gson.fromJson(bufferedReader,Result.class);
//        List<Student> result = gson.(bufferedReader,Result.class);
        JsonParser jsonParser = new JsonParser();
//        String json = "{ \"f1\":\"Hello\",\"f2\":{\"f3:\":\"World\"}}";


        for (Student student : result.students) {
            System.out.println(student.fullName);
        }
    }
}
