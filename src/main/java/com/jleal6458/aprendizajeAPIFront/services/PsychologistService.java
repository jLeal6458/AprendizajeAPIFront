package com.jleal6458.aprendizajeAPIFront.services;

import com.google.gson.Gson;
import com.jleal6458.aprendizajeAPIFront.models.PsychologistDTO;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
public class PsychologistService extends Service{

    private static final String PROFESSION = "psychologist";
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private OkHttpClient client = new OkHttpClient();
    private Gson gson = new Gson();

    public String doPost(String input) throws IOException {
        PsychologistDTO psychologistDTO = new PsychologistDTO(PROFESSION, input);
        String json = gson.toJson(psychologistDTO);
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(API_URL)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Error al realizar la solicitud HTTP: " + response);
            }
            return response.body().string();
        }
    }
}
