package com.alk.kucoinsdk.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;


/**
 * Created by alksentrs (aleksander medella) on 12/01/18.
 */
public class HttpsClient {

    public String connect(String https_url, Map<String,String> headers) throws IOException {

        URL url;
        url = new URL(https_url);

        HttpsURLConnection con = (HttpsURLConnection)url.openConnection();

        if (null!=headers) {
            Iterator<String> it = headers.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                con.setRequestProperty(key, headers.get(key));
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String input = br.readLine();
        br.close();
        return input;
    }
}
