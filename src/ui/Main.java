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
          System.out.println("13. Realizar la busqueda de un club, dueño o mascota");
          System.out.println("-----------------------------------------------------------------");

          a = Menu.nextInt();



          switch (a){
              case 1:
            	  System.out.println("Ingresa la identificacion del club");
            	  String idCA = reader.nextLine();
            	  
            	  System.out.println("Ingresa el nombre del club");
            	  String nCA = reader.nextLine();
            	  
            	  System.out.println("Ingresa el dia de nacimiento del socio en numeros");
            	  int dCC = reader.nextInt();
            	  reader.nextLine();
            	  
            	  System.out.println("Ingresa el mes de nacimiento del socio en numeros");
            	  int mCC = reader.nextInt();
            	  
            	  System.out.println("Ingresa el año de nacimiento del socio en numeros");
            	  int aCC = reader.nextInt();
            	  
            	  Calendar cC = new GregorianCalendar(aCC, mCC, dCC);
            	  
            	  System.out.println("Ingresa los tipos de mascotas del club");
            	  String pTp = reader.nextLine();
            	  
            	  Club nC = new Club(idCA, nCA, cC, pTp);
            	  
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
            	  System.out.println("Ingresa el ID del club que quieres borrar");
            	  String cTD = reader.nextLine();
            	  
            	  information.deleteClub(cTD);
            	  
            	  System.out.println("El club ha sido borrado");
            	 break;
              case 5:
            	  System.out.println("Ingresa el ID del club donde esta el socio");
            	  String idCR = reader.nextLine();
            	  
            	  System.out.println("Ingresa el ID del socio que quieres borrar");
            	  String partToDelete = reader.nextLine();
            	  
            	  information.deletePartner(idCR, partToDelete);
            	  
            	  System.out.println("El socio ha sido borrado");
            	  break;
              case 6:
            	  System.out.println("Ingresa la ID del club donde esta la mascota");
            	  String idCM = reader.nextLine();
            	  
            	  System.out.println("Ingresa la ID del socio que tiene la mascota");
            	  String idPa = reader.nextLine();
            	  
            	  System.out.println("Ingresa el nombre de la mascota a borrar");
            	  String petToDelete = reader.nextLine();
            	  
            	  information.deletePet(idCM, idPa, petToDelete);
            	  
            	  System.out.println("Se ha borrado a la mascota");
            	 break;
              case 7:
            	  information.clubsList();
            	 break;
              case 8:
            	  //TODO
            	 break;
              case 9:
            	  //TODO
            	 break;
             case 10:
            	  System.out.println("Ingresa generar:\n 1. Listado ordenado de clubs \n 2. Listado ordenado de socios \n 3. Listado ordenado de mascotas" );
            	  int selection = reader.nextInt();
            	  boolean bien1 = false;
            	  
            	  while(!bien1) {
            		  
            		  if(selection != 1 && selection != 2 && selection != 3) {
            			  System.out.println("Valor equivocado. Ingresa 1 para club, 2 para socio o 3 para mascota");
            		  }else {
            			  bien1 = true;
            		  }
            	  }
            	  
            	  if(selection == 1) {
            		  System.out.println("Selecciona el criterio para organizar \n "
            		  		+ "1. ID \n"
            		  		+ "2. Nombre \n"
            		  		+ "3. Fecha de creacion \n"
            		  		+ "4. Tipos de mascotas");
            		  int criterio1 = reader.nextInt();
            		  boolean crit1B = false;
            		  while(!crit1B) {
                		  
                		  if(criterio1 < 1 || criterio1 > 4) {
                			  System.out.println("Valor equivocado. Ingresa 1. ID, 2. Nombre, 3. Fecha de creacion, 4. Tipos de mascotas");
                		  }else {
                			  crit1B = true;
                		  }
                	  }
            		  if(criterio1 == 1) {
            			  information.listClubByID();
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio1 == 2) {
            			  information.listClubByName();
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio1 == 3) {
            			  information.listClubByAge();
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio1 == 4) {
            			  information.listClubByPetsType();
            			  System.out.println("Se ha generado la lista");
            		  }
            	  }else if(selection == 2) {
            		  System.out.println("Selecciona el criterio para organizar \n "
              		  		+ "1. ID \n"
              		  		+ "2. Nombre \n"
              		  		+ "3. Apellido \n"
              		  		+ "4. Edad \n"
              		  		+ "5. Mascota favorita");
            		  int criterio2 = reader.nextInt();
            		  boolean crit2B = false;
            		  while(!crit2B) {
                		  
                		  if(criterio2 < 1 || criterio2 > 5) {
                			  System.out.println("Valor equivocado. Ingresa 1. ID, 2. Nombre, 3. Apellido, 4. Edad, 5. Mascota favorita");
                		  }else {
                			  crit2B = true;
                		  }
                	  }
            		  if(criterio2 == 1) {
            			  System.out.println("Ingresa la ID del club del cual quieres generar la lista");
            			  String pClubID = reader.nextLine();
            			  information.listPartnerByID(pClubID);
            		  }else if(criterio2 == 2) {
            			  System.out.println("Ingresa la ID del club del cual quieres generar la lista");
            			  String pClubName = reader.nextLine();
            			  information.listPartnerByID(pClubName);
            		  }else if(criterio2 == 3) {
            			  System.out.println("Ingresa la ID del club del cual quieres generar la lista");
            			  String pClubLastName = reader.nextLine();
            			  information.listPartnerByLastName(pClubLastName);
            		  }else if(criterio2 == 4) {
            			  System.out.println("Ingresa la ID del club del cual quieres generar la lista");
            			  String pClubAge = reader.nextLine();
            			  information.listPartnerByAge(pClubAge);
            		  }else if(criterio2 == 5) {
            			  System.out.println("Ingresa la ID del club del cual quieres generar la lista");
            			  String pClubFavoritePet = reader.nextLine();
            			  information.listPartnerByFavoritePet(pClubFavoritePet);
            		  }
            	  }else if(selection == 3) {
            		  System.out.println("Selecciona el criterio para organizar \n "
                		  		+ "1. ID \n"
                		  		+ "2. Nombre \n"
                		  		+ "3. Edad \n"
                		  		+ "4. Genero \n"
                		  		+ "5. Tipo"); 
            		  int criterio3 = reader.nextInt();
            		  boolean crit3B = false;
            		  while(!crit3B) {
                		  
                		  if(criterio3 < 1 || criterio3 > 5) {
                			  System.out.println("Valor equivocado. Ingresa 1. ID, 2. Nombre, 3. Edad, 4. Genero, 5. Tipo");
                		  }else {
                			  crit3B = true;
                		  }
                	  }
            		  if(criterio3 == 1) {
            			  System.out.println("Ingresa la ID del club donde esta la mascota");
            			  String clubID = reader.nextLine();
            			  
            			  System.out.println("Ingresa la ID del dueño que tiene la mascota");
            			  String partID = reader.nextLine();
            			  
            			  information.listPetByID(clubID, partID);
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio3 == 2) {
            			  System.out.println("Ingresa la ID del club donde esta la mascota");
            			  String clubName = reader.nextLine();
            			  
            			  System.out.println("Ingresa la ID del dueño que tiene la mascota");
            			  String partName = reader.nextLine();
            			  
            			  information.listPetByName(clubName, partName);
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio3 == 3) {
            			  System.out.println("Ingresa la ID del club donde esta la mascota");
            			  String clubAge = reader.nextLine();
            			  
            			  System.out.println("Ingresa la ID del dueño que tiene la mascota");
            			  String partAge = reader.nextLine();
            			  
            			  information.listPetByAge(clubAge, partAge);
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio3 == 4) {
            			  System.out.println("Ingresa la ID del club donde esta la mascota");
            			  String clubGender = reader.nextLine();
            			  
            			  System.out.println("Ingresa la ID del dueño que tiene la mascota");
            			  String partGender = reader.nextLine();
            			  
            			  information.listPetByGender(clubGender, partGender);
            			  System.out.println("Se ha generado la lista");
            		  }else if(criterio3 == 5) {
            			  System.out.println("Ingresa la ID del club donde esta la mascota");
            			  String clubType = reader.nextLine();
            			  
            			  System.out.println("Ingresa la ID del dueño que tiene la mascota");
            			  String partType = reader.nextLine();
            			  
            			  information.listPetByType(clubType, partType);
            			  System.out.println("Se ha generado la lista");
            		  }
            	  }
            	 break;
             case 11:
            	  System.out.println("Ingresa el club del que quieres generar un listado de socios");
            	  String idClub = reader.nextLine();
            	  
            	  System.out.println(information.orderByPets(idClub));
                 break;
             case 12:
            	  information.orderByPartners();
                 break;
             case 13:

                 break;

          }
        }while(a != 14);

    }

    public void init(){

    }
}
