/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D1;
import java.util.Scanner;
/**
 *
 * @author luisr
 */
public class Datos {
    
    
    String nombre,email,direccion,numeroTel,cumpleaños,usuario,sangre;
    int id;
    double peso,altura;
    public void leeDatos()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingresa de email");
        email = teclado.nextLine();
        System.out.println("Ingresa tu direccion");
        direccion = teclado.nextLine();
        System.out.println("Ingresa tu numero de telefono");
        numeroTel = teclado.nextLine();
        System.out.println("Ingresa tu ID");
        id = teclado.nextInt();
        System.out.println("Eres un Usuario, Doctor o Efermero");
        usuario = teclado.nextLine();
        System.out.println("Ingresa tu fecha de cumpleaños");
        cumpleaños = teclado.nextLine();
        System.out.println("ingresa tu peso en lb");
        peso = teclado.nextDouble();
        System.out.println("Ingresa tu altura en m");
        altura = teclado.nextDouble();
        System.out.println("Ingresa tu tipo de sangre");
        sangre = teclado.nextLine();
        
        
    }
    public void mostrarDatos()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tu email es: "+email);
        System.out.println("Tu direccion es: "+direccion);
        System.out.println("Tu numero de telefono es: "+numeroTel);
        System.out.println("Tu eres un: "+usuario);
        System.out.println("Tu cumpleaños es: "+cumpleaños);
        System.out.println("Tu peso es: "+peso);
        System.out.println("Tu altura es: "+altura);
        System.out.println("Tu tipo de sangre es: "+sangre);
                
    }
}
