package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor

    public static String greetings(String name) {
        return "Hola. Bienvenido "+name;
    }

    // Esto es una funcion, ya que devuelve un valor

    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es "+nombre ;
    }

    //Esto es un procedimiento, ya que no devuelve un valor

    public static void checkUser(String user, String pass) {

        if(user.equals("Sebas") && pass.equals("sebas01")){
            System.out.println(greetings(user));
        }else{
            System.out.println(error("Sebas"));
        }
    }


    public static void main(String[] args) {
        checkUser("Sebas","sebas01");
        checkUser("Mario","Mario01");
    }
}
