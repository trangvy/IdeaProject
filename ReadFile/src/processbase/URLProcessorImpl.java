package processbase;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLProcessorImpl extends URLProcessorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();

        while (data != -1){
            System.out.println((char) data);
            data = input.read();
        }
    }

    public static void main(String[] args) throws IOException {
        URLProcessorImpl urlProcessor = new URLProcessorImpl();
        urlProcessor.process(new URL("http://google.com"));
    }
}

