import com.sun.deploy.net.HttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpUrlConnectionClass {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
            if(httpURLConnection.getResponseMessage().equals(HttpURLConnection.HTTP_ACCEPTED)) {
                InputStream inputStream = httpURLConnection.getInputStream();
//                Work with the Input Stream of data
                StringBuilder stringBuilder = new StringBuilder();
                int c;
                while ((c=inputStream.read()) != -1)
                    stringBuilder.append(c);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
