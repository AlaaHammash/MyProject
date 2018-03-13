package com.myproject;

import com.google.gson.Gson;
import com.myproject.model.Program;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


 public class Util  {
    private static final String baseURL = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

    public static String generateURLPath(Map<String, String> fields) {
        StringBuilder generatedURL = new StringBuilder(baseURL);
        for (String fieldKey :
                fields.keySet()) {
            generatedURL.append("&").append(fieldKey).append("=").append(fields.get(fieldKey));
        }
        return generatedURL.toString();
    }

    public static Program getContentForPath(String urlString) {

                StringBuilder content = new StringBuilder();
                String filterURL;
                if(urlString != "")
                    filterURL = urlString;
                else
                    filterURL = baseURL;

                try {
                    URL url = new URL(filterURL);
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(url.openStream()));

                    String inputLine;

                    while ((inputLine = reader.readLine()) != null)
                        content.append(inputLine);

                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }


                Gson rec = new Gson();
                Program program = rec.fromJson(content.toString(), Program.class);

                return program;
            }

}

