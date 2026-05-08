/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author john2
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;

public class JsonUtil {
    
     private static final Gson gson =
        new GsonBuilder().setPrettyPrinting().create();

    public static void guardar(String ruta, Object datos) {

        try (FileWriter writer = new FileWriter(ruta)) {

            gson.toJson(datos, writer);

        } catch (Exception e) {

            System.out.println(
                "Error guardando JSON: " + e.getMessage()
            );
        }
    }

    public static <T> T cargar(
        String ruta,
        Class<T> clase
    ) {

        try (FileReader reader = new FileReader(ruta)) {

            return gson.fromJson(reader, clase);

        } catch (Exception e) {

            return null;
        }
    }
}
