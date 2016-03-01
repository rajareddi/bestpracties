package servletscods;
import org.eclipse.jetty.util.*;

import java.net.MalformedURLException;
import java.net.URL;

public class URLHandletr {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.example.com/index.php?foo=bar&bla=blub");
		MultiMap<String> params = new MultiMap<String>();
		UrlEncoded.decodeTo(url.getQuery(), params, "UTF-8");
		System.out.println(params.getString("foo"));
	}

}
