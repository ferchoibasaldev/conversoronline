package com.nandothedeveloper.conversor.util;

import com.nandothedeveloper.conversor.model.ConversionResult;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {
    private final String apiKey = "21d2fdbc19b3bb58e8d839a7";
    private final String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public ConversionResult fetchConversion(String from, String to, double amount) throws Exception {
        String requestUrl = String.format("%s%s/pair/%s/%s/%.2f",
                baseUrl, apiKey, from, to, amount);

        URL url = new URL(requestUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int status = conn.getResponseCode();
        if (status != 200) {
            throw new Exception("Error en la solicitud HTTP: Código " + status);
        }

        BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        StringBuilder jsonBuilder = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            jsonBuilder.append(line);
        }
        in.close();
        conn.disconnect();

        JSONObject json = new JSONObject(jsonBuilder.toString());

        return new ConversionResult(
                json.getString("result"),
                json.getDouble("conversion_rate"),
                json.getDouble("conversion_result"));
    }
}
