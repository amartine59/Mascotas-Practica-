package com.example.bara.petsworld;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {
    private static String database = "Mascotas";
    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private static ArrayList<Mascota> Mascotas = new ArrayList();

    public static void guardar_mascota(Mascota m){
        databaseReference.child(database).child(m.getId()).setValue(m);
    }

    public static ArrayList<Mascota> obtener_lista(){
        return Mascotas;
    }

    public static String getID(){
        return databaseReference.getKey();
    }

    public static void setMascotas(ArrayList<Mascota> mascotas) {
        Mascotas = mascotas;
    }

    public static void eliminar_mascota(Mascota m){
        databaseReference.child(database).child(m.getId()).removeValue();
    }

    public static void modificar_mascota(Mascota m){
        databaseReference.child(database).child(m.getId()).setValue(m);
    }
}
