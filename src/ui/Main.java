package ui;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;
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
          System.out.println("4. Generar archivo plano con la informacion de los clubes");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("5. Generar archivo serializado con la informacion de los dueños");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("6. Generar archivo serializado con la informacion de las mascotas");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("7. Generar un listado ordenado por criterio");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("8. Generar un listado ordenado de los dueños segun el numero de mascotas");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("9. Generar un listado ordenado de los clubes según el número de dueños");
          System.out.println("-----------------------------------------------------------------");
          System.out.println("10. Realizar la busqueda de la un club, dueño o mascota");
          System.out.println("-----------------------------------------------------------------");

          a = Menu.nextInt();



          switch (a){
              case 1:
            	  
                break;
              case 2:
            	  
                break;

              case 3:

                break;
              case 4:
            	  
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

          }
        }while(a != 16);

    }

    public void init(){

    }
}
