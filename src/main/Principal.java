package main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Homem Aranha: Sem volta para casa",
                                "Ação, comédia, aventura", 148);

        Titulo titulo2 = new Titulo("Rambo: Programado para Matar",
                                "Ação", 97);

        List<Titulo> filmes = new ArrayList<>();
        filmes.add(titulo);
        filmes.add(titulo2);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(filmes);
        System.out.println(json);
    }
}
