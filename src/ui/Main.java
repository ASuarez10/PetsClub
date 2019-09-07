package ui;
import model.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Main {

    private Scanner reader;
    private Information information;

    public Main (){

      init();
      reader = new Scanner(System.in);
    }

      public static void main(String[] args) {

        Main m = new Main ();
        m. showMessageExample();
    }
      
    public void showMessageExample () {

        System.out.println("-----------------------------------------------------------");
        System.out.println("--------------------Club de mascotas-----------------------");
        System.out.println("-----------------------------------------------------------");
        int a;
        Scanner Menu = new Scanner(System.in);

        do{
          System.out.println("-----------------Introduce una opcion valida---------------------");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("1. Registrar un club");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("2. Registrar un dueño");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("3. Registrar una mascota");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("4. Borrar un club");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("5. Borrar un dueño");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("6. Borrar una mascota");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("7. Generar archivo plano con la informacion de los clubes");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("8. Generar archivo serializado con la informacion de los dueños");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("9. Generar archivo serializado con la informacion de las mascotas");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("10. Generar un listado ordenado por criterio");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("11. Generar un listado ordenado de los dueños segun el numero de mascotas");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("12. Generar un listado ordenado de los clubes según el número de dueños");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("13. Realizar la busqueda de la un club, dueño o mascota");
          System.out.println("-----------------------------------------------------------------");

          a = Menu.nextInt();



          switch (a){
              case 1:
            	  System.out.println("Ingresa la identificacion del club");
            	  String idCA = reader.nextLine();
            	  
            	  System.out.println("Ingresa el nombre del club");
            	  String nCA = reader.nextLine();
            	  
            	  System.out.println("Ingresa la fecha de creacion del club");
            	  String cDT = reader.nextLine();
            	  
            	  System.out.println("Ingresa los tipos de mascotas del club");
            	  String pTp = reader.nextLine();
            	  
            	  Club nC = new Club(idCA, nCA, cDT, pTp);
            	  
            	  information.addClub(nC);
            	  
            	  System.out.println("El club ha sido agregado");
            	 break;
              case 2:
            	  System.out.println("Ingresa la identificacion del club al que le quieres agregar el socio");
            	  String idC = reader.nextLine();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa la identificacion del socio");
            	  String idS = reader.nextLine();
            	  
            	  System.out.println("Ingresa el nombre del socio");
            	  String noS = reader.nextLine();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa los apellidos del socio");
            	  String apS = reader.nextLine();
            	  
            	  System.out.println("Ingresa el dia de nacimiento del socio en numeros");
            	  int dNS = reader.nextInt();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa el mes de nacimiento del socio en numeros");
            	  int mNS = reader.nextInt();
            	  
            	  System.out.println("Ingresa el año de nacimiento del socio en numeros");
            	  int aNS = reader.nextInt();
            	  
            	  Calendar c = new GregorianCalendar(aNS, mNS, dNS);
            	  
            	  System.out.println("Ingresa la mascota favorita del socio");
            	  String fpS = reader.nextLine();
            	  
            	  Partner nS = new Partner(idS, noS, apS, c, fpS);
            	  
            	  information.addPartner(idC, nS);
            	  
            	  System.out.println("Se ha agregado al socio");
            	 break;

              case 3:
            	  System.out.println("Ingresa la identificacion del club al que le quieres agregar la mascota");
            	  String idCP = reader.nextLine();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa la identificacion del socio al que le quieres agregar la mascota");
            	  String idSP = reader.nextLine();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa la identificacion de la mascota");
            	  String idP = reader.nextLine();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa el nombre de la mascota");
            	  String noP = reader.nextLine();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa el dia de nacimiento de la mascota en numeros");
            	  int dNP = reader.nextInt();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa el mes de nacimiento de la mascota en numeros");
            	  int mNP = reader.nextInt();
            	  
            	  System.out.println("Ingresa el año de nacimiento de la mascota en numeros");
            	  int aNP = reader.nextInt();
            	  
            	  Calendar p = new GregorianCalendar(aNP, mNP, dNP);
            	  
            	  System.out.println("Ingresa 1 si es macho o 2 si es hembra");
            	  int gender = reader.nextInt();
            	  boolean bien = false;
            	  
            	  while(!bien) {
            		  
            		  if(gender != 1 && gender != 2) {
            			  System.out.println("Valor equivocado. Ingresa 1 si es macho o 2 si es hembra");
            		  }else {
            			  bien = true;
            		  }
            	  }
            	  
            	  System.out.println("Ingresa el tipo de mascota");
            	  String tyP = reader.nextLine();
            	  
            	  Pet nP = new Pet(idP, noP, p, gender, tyP);
            	  
            	  information.addPet(idCP, idSP, nP);
            	  
            	  System.out.println("Se ha agregado la mascota");
            	 break;
              case 4:
            	  System.out.println("Ingresa el ID o el nombre del club que quieres borrar");
            	  String cTD = reader.nextLine();
            	  
            	  information.deleteClub(cTD);
            	  
            	  System.out.println("El club ha sido borrado");
            	 break;
              case 5:

            	  break;
              case 6:

            	 break;
              case 7:

            	 break;
              case 8:

            	 break;
              case 9:

            	 break;
             case 10:

            	 break;
             case 11:

                 break;
             case 12:

                 break;
             case 13:

                 break;

          }
        }while(a != 14);

    }

    public void init(){

    }
}
