package processbase;

import java.io.*;
import java.net.URL;
public class URLProcessorImpl2 extends URLProcessorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {

        BufferedInputStream bufferedInputStream = new BufferedInputStream(input);
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {

            System.out.println(line);
        }
    }

    public static void main(String[] arg) throws IOException {
        URLProcessorImpl2 urlProcessorImpl2 = new URLProcessorImpl2();
        urlProcessorImpl2.process(new URL("http://google.com") );
    }

}
