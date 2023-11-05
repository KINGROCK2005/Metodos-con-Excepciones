import java.util.Scanner;


public class Metod_Exception  {
    public static Scanner lector = new Scanner(System.in);
    public static int opcion, intentos = 0, intentosMaximos = 3, intentosRestantes, intentos2;
    public static boolean comparar, again, run;
            public static char Calagain;
     
            public static void mostrarmenu(){

                System.out.println("Ingrese qué ejercicio desea que se ejecute. \n 1.Prisma \n 2.Cilindro \n 3.Pirámide \n 4.Cono \n 5.Esfera \n" +
                " 6.Tronco de Cono \n 7.Tronco de Pirámide \n 8.Huso Esférico  \n 9. Cuña Esférica \n 10.Tetraedro \n 11.Hexaedro \n 12.Octaedro \n 13.Dodecaedro" +
                " 14.Icosaedro \n 15.Ortoedro\n 16.Zona Esférica y Casquete Esférico \n 17.Cerrar programa ");

                do {
                    try {
                        System.out.println("Seleccione su opcion deseada: ");
                        opcion = Integer.parseInt(lector.nextLine());
        
                        if(opcion < 1 || opcion > 17) {intentos++;
                            throw new IllegalArgumentException("Opción fuera de rango.");
                            
                        } else if (opcion >= 1 || opcion <= 17){
                            menuOpciones(opcion);
                        } 
                    }
                      catch (NumberFormatException e) {
                         System.out.println("Error: Debe ingresar un número válido.");
                        intentos++;
                    }
                     catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                        break;
                    }
                     
                } while (intentos < 3);
                if (intentos >= 3) {
                    System.out.println("Maximo de intentos alcanzado.");
                    System.exit(0);
                }
            }
             
              

    //Metodo sobrecargao
    public static void figura(){//1
        
        double aL, aT,  voL,  h, aB, pB,  apo ,  lonLad;
        int canLad;

        System.out.println("Ingrese la altura: ");
        do{
         while (!lector.hasNextDouble() ) {
                          System.out.println("intente denuevo: ");
                          lector.next();
                      }
                      h=lector.nextDouble();intentos ++;
           }while(h <= 0 && intentos2 <=3);

        System.out.println("Ingrese la cantidad de lados: ");
        do{
        while (!lector.hasNextInt()) {
                          System.out.println("intente denuevo: ");
                          lector.next();
                      }
                      canLad=lector.nextInt();
            }while(canLad <= 0);

        System.out.println("Ingrese la longitud de los lados: ");
        do{
        while (!lector.hasNextDouble()) {
                          System.out.println("intente denuevo: ");
                          lector.next();
                      }
                      lonLad=lector.nextDouble();
                }while(lonLad <= 0);          

        pB = (canLad * lonLad);
        aL =(pB * h) ;
        double alfa = (Math.PI/180) * (360/canLad);
        apo =lonLad / (2 * Math.tan((alfa)/2));
        aB = (pB * apo)/2;
        aT = (aL + 2 * aB);
        voL = (aB * h);

        System.out.println("Area lateral: " + aL + " unidades cuadradas.");
        System.out.println("Area total: " + aT + " unidades cuadradas.");
        System.out.println("Volumen: " + voL + " unidades cubicas.");
    }
    
    
    public static void figura(double aL, double aT, double voL,double h ,double aB,double pB, double r){//2
            
            System.out.println("Ingrese la altura: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h=lector.nextDouble();
                    }while(h <= 0);

        System.out.println("Ingrese el radio: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        r=lector.nextDouble();
                    }while(r <= 0);

        aB= ( Math.PI * Math.pow(r, 2) );
        pB= ((2 * Math.PI) * r);
        aL = (pB * h);
        aT = ((aB * 2) +( aL));//Ta mal cambiar formula
        voL = (aB * h);
        System.out.println("Su area lateral es: " + aL );
        System.out.println("Su area Total es: " + aT);
        System.out.println("Su volumen es: " + voL);


        }

        public static void figura(double aL, double aT, double voL, double h ,double aB,double pB, double r, double lonLad, double apPir, double apo, double p){//3

            System.out.println("Ingrese el radio: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h=lector.nextDouble();
                    }while(h <= 0);

        System.out.println("Ingrese la altura: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h=lector.nextDouble();
                    }while(r <= 0);

        System.out.println("Ingrese la longitud de los lados: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        r=lector.nextDouble();
                    }while(r <= 0);

         System.out.println("ingrese el perimetro: ");
         do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        p=lector.nextDouble();
                    }while(p <= 0);

        aB= (((2 * p) * r) /(2 ));
        pB = ((2 * aB) / r); 
        apo = (Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
        apPir = (h * h + (apo * apo));
        aL = pB * apPir / 2;
        aT= aL + aB;
        voL = aB * h / 3;

        System.out.println("Su area lateral es: "  + aL);
        System.out.println("Su area Total es: " + aT);
        System.out.println("Su volumen es:" + voL);

        }


        public static void figura(double aL, double aT, double voL, double h ,double aB,double pB, double r, int canLad, double g){//4

            System.out.println("Ingrese la altura: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h=lector.nextDouble();
                    }while(h <= 0);

            System.out.println("Ingrese el radio: ");
           do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        r=lector.nextDouble();
                    }while(r <= 0);
            
        pB= (2 * (Math.PI * r));
        aB = (Math.PI * (r * r));
        g = (Math.sqrt(h * h + ( r * r)));
        aL = pB * g /2;
        aT = aL + aB;
        voL = aB * h /3;
            
        System.out.println("Su generatriz es: " + g);
        System.out.println("Su area lateral es: " + aL);
        System.out.println("Su area total es: " + aT);
        System.out.println("Su volumen es: " + voL);

        }

        public static void figura( double aT, double voL, double r){//5
            System.out.println("Ingrese el radio: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        r=lector.nextDouble();
                    }while(r <= 0);

        aT = 4 * (Math.PI * (r * r));
        voL = 4 * (double)(Math.PI *  Math.pow(r, 3)) / 3 ;

        System.out.println("Su area total es: " + aT);
        System.out.println("Su volumen es: " + voL);

        }

        public static void figura2(double areaTot,double areaLat,double  areaBM, double rM, double rm,double h,double areaBm,double vol,double g){//6

            System.out.println("Ingrese la altura: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h=lector.nextDouble();
                    }while(h <= 0);

        System.out.println("Ingrese el radio menor: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        rm=lector.nextDouble();
                    }while(rm <= 0);

        System.out.println("Ingrese el radio Mayor: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        rM=lector.nextDouble();
                    }while(rM <= 0);

         areaBM = Math.PI * (rM * rM);
         areaBm = Math.PI * (rm * rm);
         g = (Math.sqrt(h * h + ( rM * rM)));
         areaLat = (double) (Math.PI * g * (rM * rm));
         areaTot = areaLat +  areaBM + areaBm; 
         vol = 1 * Math.PI * h *(rM * rM + (rm * rm) + rM + rm )/3;

         System.out.println("Su area lateral es: " + areaLat);
         System.out.println("Su area Total es: " + areaTot);
         System.out.println("Su volumen es: " + vol);

        }

         public static void figura2(double areaTot,double areaLat, int canLad ,double  areaBM,double areaBm, double pBM, double pbm,double h,double aP,double vol,double g, double zx, double xz){//7
            System.out.println("Ingrese la altura: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h=lector.nextDouble();
                    }while(h <= 0);

        System.out.println("Ingrese el area base mayor en mtrs cuadrados: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        areaBM=lector.nextDouble();
                    }while(areaBM <= 0);

        System.out.println("Ingrese el area base menor en mtrs cuadrados: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        areaBm=lector.nextDouble();
                    }while(areaBm <= 0);

        System.out.println("Ingrese la cantidad de lados: ");
        canLad = lector.nextInt();
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        canLad=lector.nextInt();
                    }while(canLad <= 0);

        areaBM =(float) Math.sqrt(areaBM);
        areaBm=(float) Math.sqrt(areaBm);
        pBM = (areaBM * canLad);
        pbm = (areaBm * canLad);
        zx =(float) Math.sqrt(areaBM)/2 - (float) Math.sqrt(areaBm)/2;
        aP =(float) (Math.pow(zx, 2) + Math.pow(h, 2));
        xz =(float) (Math.sqrt(aP));
        areaLat= ((pBM + pbm) * (xz/2));
        areaTot= (areaLat + areaBM + areaBm);
        vol =(float)  (h/3 * (areaBM + areaBm) + (float)  (Math.sqrt(areaBM + areaBm)));

        System.out.println("Su area lateral es: " + areaLat + " metros cuadrados.");
        System.out.println("Su area total es de: " + areaTot + " metros cuadrados");
        System.out.println("Su volumen es: " + vol + " metros cubicos");

        }

        public static void figura3(double area, double ngrados, double r){//8

            System.out.println("Ingrese el radio: ");
           do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        r=lector.nextDouble();
                    }while(r <= 0);

        System.out.println("Ingrese los grados: ");
        do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        ngrados=lector.nextDouble();
                    }while(ngrados <= 0);

        area = (4 * Math.PI )* (Math.pow(r, 2) * ngrados)/ 360;

        System.out.println("El area total es: " + area + " cm. ");

        }

        public static void figura4( double ngrados, double r, double vol){//9
            System.out.println("Ingrese el radio: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        r=lector.nextDouble();
                    }while(r <= 0 );
                    
            System.out.println("Ingrese los grados de la esfera: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        ngrados=lector.nextDouble();
                    }while(ngrados <= 0 || ngrados >= 360 );

        vol= (float) (Math.PI * Math.pow(r, 3) * ngrados) / 270;

        System.out.println("El valor de volumen es: " + vol);
        }
        
        public static void figura3(double arista, double h, double vertice, double aTotal){//10
            System.out.println("Ingreese la arista: ");
            arista = lector.nextDouble();       
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        arista=lector.nextDouble();
                    }while(arista <= 0 );

        aTotal = Math.pow(arista, 2) * (Math.sqrt (3));
        vertice = (Math.sqrt(2) * (Math.pow(arista, 3)) /12);
        h= arista * (Math.sqrt(6))/3;

        System.out.println("El area total es: " + aTotal);
        System.out.println("El vertice es: " + vertice);
        System.out.println("La altura es: " + h);

        }

        public static void figura4(double arista, double vol, double diametro, double aTotal){//11

            System.out.println("Ingrese la arista: ");

            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        arista=lector.nextDouble();
                    }while(arista <= 0 );

        aTotal = 6 * (Math.pow(arista,2));
        vol = Math.pow(arista, 3);
        diametro =arista * (Math.sqrt(3));

        System.out.println("El area total es: " + aTotal);
        System.out.println("El volumen d=total es: " + vol);
        System.out.println("El diametro es de: " + diametro);
        
        }

        
        public static void figura1(double arista, double vol, double aTotal){//12
            System.out.println("Ingrese la arista: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        arista=lector.nextDouble();
                    }while(arista <= 0 );

        aTotal = 2 * (Math.pow(arista,2)* (Math.sqrt(3)));
        vol = (Math.sqrt(2) * Math.pow(arista,3))/3;

        System.out.println("El area total es: " + aTotal);
        System.out.println("El volumen es de: " + vol);
        }

        public static void figura0(double arista, double vol, double aTotal){//13

            System.out.println("Ingrese la arista: ");
            do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        arista =lector.nextDouble();
                    }while(arista <= 0 );

        aTotal = (double)3 * (arista * arista) * (Math.sqrt(25 + 10) * Math.sqrt(5));
        vol = (double)(15 +  (7 *Math.sqrt(5))) * Math.pow(arista,3)/4;

        System.out.println("El area Total es de: " + aTotal);
        System.out.println("Su volumen es: " + vol);
        }

            public static void figura14(double arista, double vol, double aTotal){//14

                System.out.println("Ingrese la arista");
                do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        arista =lector.nextDouble();
                    }while(arista <= 0 );

        aTotal = 5 * (Math.pow(arista,2))*(Math.sqrt(3));
        vol = 5 * (3 + Math.sqrt(5) *Math.pow(arista, 3)/12);

        System.out.println("El area total es de: " + aTotal);
        System.out.println("Su volumen es: " + vol);

            }

            
            public static void figura15(double diagonal, double vertice, double aTotal, double a, double b, double c, double angTot){//15

                System.out.println("Ingrese el lado mayor: ");
                do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        a =lector.nextDouble();
                    }while(a <= 0 );

                System.out.println("Ingrese el lado menor: ");
                do{
                while (!lector.hasNextDouble()) {
                                System.out.println("intente denuevo: ");
                                lector.next();
                            }
                            b =lector.nextDouble();
                        }while(b <= 0 );

                System.out.println("Ingresela altura de la cara");
                     do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        c =lector.nextDouble();
                    }while(c <= 0 );

                angTot = 2 * ((a * b) + (a * c) + (b * c));
                diagonal = (Math.sqrt((a * a) + (b * b) + (c * c)));
                vertice =  a * b *c;

                System.out.println("El angulo total es de: " + angTot);
                System.out.println("La diagonal tiene un valor de: " + diagonal);
                System.out.println("El vertice es de: " + vertice);

            }

            public static void figura16(double  volZonaEsf,double areazonaEsf,double rmen,double h, double volCasEsf,double areaCasEsf,double rMay){//16

                System.out.println("Ingrese el radio menor: ");
                do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        rmen =lector.nextDouble();
                    }while(rmen <= 0 );

                System.out.println("Ingrese el radio mayor: ");
                do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        rMay =lector.nextDouble();
                    }while(rMay <= 0 );

                System.out.println("Ingrese la altura: ");
                do{
            while (!lector.hasNextDouble()) {
                            System.out.println("intente denuevo: ");
                            lector.next();
                        }
                        h =lector.nextDouble();
                    }while(h <= 0 );

                areazonaEsf = 2 * (Math.PI * (rMay * h));
                volZonaEsf = (Math.PI * h * ((h * h) + (3 * (rmen * rmen) + (3 * (rmen * rmen))))) / 6;
                areaCasEsf = 2 * (Math.PI * (rMay * h));
                volCasEsf = (Math.PI * (h * h) * (3 * rMay) - h)/3; 

                System.out.println("El area de la zona esferica es: " + areazonaEsf);
                System.out.println("El volumen de la zona esferica es: " + volZonaEsf);
                System.out.println("El area del Casquete esferico es: " + areaCasEsf);
                System.out.println("El volumen del Casquete esferico es: " + volCasEsf);

            }

        public static boolean menuOpciones(int ejer){
        boolean repeat = true;

        switch(ejer){
            case 1:{
                figura();
                break;
            }
            case 2:{
                figura(0, 0, 0, 0, 0, 0, 0);
                break;
            }
            case 3:{
                figura(0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0);
                break;
            }
            case 4:{
                figura(0, 0, 0, 0,0,0, 0, 0,  0);
                break;
            }
            case 5:{
                figura( 0, 0, 0);
                break;
            }
            case 6:{
                figura2(0,0,0, 0, 0,0,0,0,0);
                break;
            }
            case 7:{
                 figura2(0,0, 0 ,0,0, 0, 0,0,0,0,0, 0, 0);
                break;
            }
            case 8:{
                figura3(0, 0, 0); 
                break;
            }
            case 9:{
                figura4( 0, 0, 0);
                break;
            }
            case 10:{
                figura3(0, 0, 0, 0);
                break;
            }
            case 11:{
                figura4(0, 0, 0, 0);
                break;
            }
            case 12:{
                figura1(0, 0, 0);
                break;
            }
            case 13:{
                figura0(0, 0, 0);
                break;
            }
            case 14:{
                figura14(0, 0, 0);
                break;
            }
            case 15:{
                figura15(0, 0, 0, 0, 0, 0, 0);
                break;
            }
            case 16:{
                figura16(0,0,0,0 ,0,0,0);
                break;
            }

            case 17:{
                repeat = false;
                System.out.println("Programa cerrado. Que tenga buen dia mi estimad@.");
                        
                }
        }
        return repeat;
        }
    
    public static void main(String[] args) {
        
        boolean run = true;
        while (run){
        mostrarmenu();
        
            run = menuOpciones(opcion);
        }
        
        }       
}
