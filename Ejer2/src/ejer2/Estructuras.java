/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import static java.time.Clock.system;

/**
 *
 * @author hicham
 */
 import java.util.Random;
public class Estructuras {

     public static void random(){
      Random rnd = new Random();
      int valor = rnd.nextInt((200-100+1)+100); 
      if((valor%2)==0){
          System.out.println("El numero "+valor+" es par");
      }else{
          System.out.println("El numero "+valor+" es impar");
        }
  }
  public static void numeros(){
    int numero=2;
      do{
          if((numero%5)!=0)
          System.out.println(numero);
          numero+=2;
      }while(numero<=124);
  }
public static int potencia(int base, int exponente){
      int res=base;//se ejecuta las veces determinadas antes del codigo
          for(int i=0;i<exponente-1;i++){
            res=res*base;
          }
          return res;          
}     
public static void main(String[]args){
random();
numeros();
potencia(1,2);
            int posicion=3;
            System.out.println("Break");
switch(posicion){  //la comparacion se realiza en este punto y te salta a la linea a la que se le asigna
  case 1:System.out.println("Oro");break;
  case 2:System.out.println("Plata");break;
  case 3:System.out.println("Bronce");break;
  case 4:System.out.println("Diploma");break;
  case 5:System.out.println("Diploma");break;
  default:System.out.println("Sin premio");break;
}


  }       
}
