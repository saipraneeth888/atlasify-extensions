package test.property;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;


/**
 * 
 * @author SaiPraneeth
 * sample code to communicate between front and back-end
 * task:test this and build from this to get the array from php
 * task2:may need to add code to getsr.php to make it return an array
 *
 */
public class SampleTest {

   public static void main(String[] args) throws ClientProtocolException, IOException{
	   HttpClient httpclient = new DefaultHttpClient();
	   HttpGet httpget = new HttpGet("http://downey-n1.cs.northwestern.edu/~websail/atlasify-web/getsr.php?q=12");
	   HttpResponse response = httpclient.execute(httpget);
	   HttpEntity entity = response.getEntity();
	   if (entity != null) {
	       InputStream instream = entity.getContent();
	       try {
	           // do something useful

	    	   System.out.println(instream.toString());
	       } finally {
	           instream.close();
	       }
	   }
   }
}
