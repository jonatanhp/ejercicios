/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.ejercicios_para_examen;
import java.util.Scanner;


/**
 *
 * @author jonatan
 */
public class ejercicios {
    static Scanner scanear=new Scanner(System.in);
    //ejercicio 2.13 (se crea un método por cada ejercicio
    //se crea el método ahorro_dinero
    public static void ahorro_dinero(){
        //definimos el tipo de las variables a usar
        double sueldo,ahorro;
        System.out.println("Ingrese su sueldo");
        sueldo=scanear.nextDouble();
        ahorro=sueldo*0.15*48;
        System.out.println("Su total de ahorro en un año es: "+ahorro);
        
    }
    //se crea el método cheque
    public static void cheque(){
        //definicion de variables
        double hotel, comida, diario, cheque;
        System.out.println("ingrese el monto destinado al hospedaje");
        hotel=scanear.nextDouble();
        System.out.println("ingrese el monto destinado a la comida");
        comida=scanear.nextDouble();
        diario=100;
        cheque=hotel+comida+diario;
        System.out.println("El monto total del cheque es: "+cheque);
    }
    public static void potencia_electrica(){
        double p,v,i,r;
        System.out.println("ingrese la intensidad en Amperios");
        i=scanear.nextDouble();
        System.out.println("ingrese la resistencia del receptor en Ohmios");
        r=scanear.nextDouble();
        v=r*i;
        p=v*i;
        System.out.println("la potencia eléctrica del circuito es igual a: "+p);
    }
    public static void promedio_notas(){
        double nota1, nota2, nota3, notaf;
        System.out.println("ingrese la primera nota");
        nota1=scanear.nextFloat();
        System.out.println("ingrese la segunda nota");
        nota2=scanear.nextFloat();
        System.out.println("ingrese la tercera nota");
        nota3=scanear.nextFloat();
        notaf=(nota1+nota2)*0.25+(nota3*0.5);
        System.out.println("su nota final es: "+notaf);
    }
    public static void tiempo_de_vida(){
        int edad, meses, semanas,dias,horas;
        System.out.println("introduzca su edad");
        edad=scanear.nextInt();
        meses=edad*12;
        semanas=edad*52;
        dias=edad*365;
        horas=edad*8760;
        System.out.println("usted ha vivido \n"+meses+" meses \n"+semanas+" semanas \n"+dias+" dias \n"
        +horas+" horas");
    }
    public static void llamada_telefonica(){
        double tpm,tiempo, costot;
        tpm=0.49;
        System.out.println("ingrese la cantidad de minutos");
        tiempo=scanear.nextFloat();
        costot=tiempo*tpm;
        System.out.println("El costo total de la llamda es: "+costot);
    }
    public static void bono(){
        int puntos, salario;
        System.out.println("introduzca la cantidad de puntos que posee");
        puntos=scanear.nextInt();
        if (puntos>=101)
        {
            if (puntos>=151)
                System.out.println("usted recibe tres sueldos de premio");
            {
                if (puntos<151)
                    System.out.println("usted recibe dos sueldos de premio");
            }
        }
            
        else
            System.out.println("ustede recibe un sueldo de premio");
    }
    public static void vacuna(){
        int edad;
        String sexo;
        System.out.println("introduzca su edad");
        edad=scanear.nextInt();
        if (edad>=16)
        {
            if (edad<=69)
            {
                System.out.println("indique su genero");
                   sexo=scanear.next();
                  
              
            {                         
                if(sexo.equals("F"));
                    System.out.println("le corresponde la vacuna A");
                
                {        
                    
                    if (sexo.equals("M"))
                        System.out.println("le corresponde la vacuna B");
                }
                
            } 
            
            }            
            {
                if (edad>70)
                    System.out.println("le corresponde la vacuna C");
            }
        }
        else
            System.out.println("le corresponde la vacuna A");
            
    }
    
    public static void comparacion(){
        
        double num1, num2;
        System.out.println("introduzca el primer numero");
        num1=scanear.nextDouble();
        System.out.println("introduzca el segundo numero");
        num2=scanear.nextDouble();
        if (num1==num2)
            System.out.println("los numeros son iguales");
        else if (num1>num2)
            System.out.println("el primer numero es el mayor");
        else
            System.out.println("el primer numero es el mas pequeño");
        
  }
    public static void numero_central(){
        double num1,num2,num3,may1,may2;
        int i;
        System.out.println("introduzca el primer numero");
        num1=scanear.nextDouble();
        System.out.println("introduzca el segundo numero");
        num2=scanear.nextDouble();
        System.out.println("introduzca el tercer numero");
        num3=scanear.nextDouble();
        if (num1>num2){
            may1=num1;
            may2=num2;
        }
        else 
            may1=num2;
            may2=num1;
        if (num2>may1){
            may2=may1;
            may1=num2;}
        else 
            if (num2>may2)
                may2=
            
    }
            
    //creación de la clase principal main, el cual se usará para llamar a los demás métodos (ejercicios)
    
    public static void main(String[] args){
        //creamos y declaramos la variable "nombreejercicio"
        String nombre_ejercicio;
        //introducir por teclado la opción que corresponde a cada ejercicio
        System.out.println("Seleccione el ejercicio que desea probar \n A1---->ahorro_dinero \n A2---->cheque"
        +"\n A3---->potencia_electrica \n A4---->promedio_notas \n A5---->tiempo_de_vida \n A6---->llamada_telefónica"
        +"\n A7---->bono \n A8---->vacuna"); 
        nombre_ejercicio=scanear.nextLine();
        switch (nombre_ejercicio){
            case "A1":{ahorro_dinero();}break;
            case "A2":{cheque();}break;
            case "A3":{potencia_electrica();}break;
            case "A4":{promedio_notas();}break;
            case "A5":{tiempo_de_vida();}break;
            case "A6":{llamada_telefonica();}break;
            case "A7":{bono();}break;
            case "A8":{vacuna();}break;
            case "A9":{comparacion();}break;
            
        }
    }
}
