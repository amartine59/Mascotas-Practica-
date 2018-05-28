package com.example.bara.petsworld;

public class Mascota {
    private String Id,Apodo;
    private int imagen_animal,Animal,Edad,Sexo;

    public Mascota(){

    }

    public Mascota(String id, String apodo, int imagen_animal, int animal, int edad, int sexo) {
        Id = id;
        Apodo = apodo;
        this.imagen_animal = imagen_animal;
        Animal = animal;
        Edad = edad;
        Sexo = sexo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String apodo) {
        Apodo = apodo;
    }

    public int getAnimal() {
        return Animal;
    }

    public void setAnimal(int animal) {
        Animal = animal;
    }

    public int getImagen_animal() {
        return imagen_animal;
    }

    public void setImagen_animal(int imagen_animal) {
        this.imagen_animal = imagen_animal;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int sexo) {
        Sexo = sexo;
    }

    public void guardar(){
        Datos.guardar_mascota(this);
    }

    public void eliminar(){
        Datos.eliminar_mascota(this);
    }


}
