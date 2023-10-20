package lab2p1_juanponciano;

import java.util.Scanner;

public class Lab2P1_JuanPonciano {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        char respuesta1 = 's';
        while (respuesta1 == 'S' || respuesta1 == 's') {
            System.out.println("**Opciones**");
            System.out.println("1. Calcular longitudes de un triángulo");
            System.out.println("2. Calcular área de figuras");
            System.out.println("3. Evaluar números");
            int opcion = leer.nextInt();

            while (opcion > 0 || opcion < 4) {

                if (opcion == 1) {
                    System.out.println("Ingrese la primera longitud");
                    int longitud1 = leer.nextInt();
                    System.out.println("Ingrese la segunda longitud");
                    int longitud2 = leer.nextInt();
                    System.out.println("Ingrese la tercera longitud");
                    int longitud3 = leer.nextInt();

                    if (longitud1 > 0 && longitud2 > 0 && longitud3 > 0) {

                        if (longitud1 + longitud2 > longitud3 && longitud1 + longitud3 > longitud2 && longitud3 + longitud2 > longitud1) {
                            System.out.println("Las longitudes ingresadas forman un triángulo.");
                        } else {
                            System.out.println("Las longitudes ingresadas no forman un triángulo.");
                        }
                    } else {
                        System.out.println("Las longitudes no pueden ser negativas");
                    }
                }

                else if (opcion == 2) {
                    char respuesta = 's';
                    while (respuesta == 's' || respuesta == 'S') {
                        System.out.println("**Ingrese la figura a evaluar**");
                        System.out.println("1. Rectángulo");
                        System.out.println("2. Triángulo");
                        System.out.println("3. Círuclo");
                        System.out.print("Opcion ");
                        int figura = leer.nextInt();
                        if (figura == 1) {
                            System.out.print("Ingrese la base: ");
                            double base = leer.nextDouble();
                            System.out.print("Ingrese la altura: ");
                            double altura = leer.nextDouble();
                            System.out.println(" El área del rectángulo es: " + base * altura);
                        }
                        if (figura == 2) {
                            System.out.print("Ingrese la base: ");
                            double base = leer.nextDouble();
                            System.out.print("Ingrese la altura: ");
                            double altura = leer.nextDouble();
                            System.out.println("El área del Triángulo es " + base * altura * 1 / 2);
                        }
                        if (figura == 3) {
                            System.out.print("Ingrese el radio: ");
                            double radio = leer.nextDouble();
                            System.out.println("El área del círculo es: " + Math.PI * radio * radio);
                        }
                        System.out.print("Desea calcular el área otra figura? [s/n]: ");
                        respuesta = leer.next().charAt(0);
                        
                    }
                    System.out.println("Saliendo del while.");
                    
                }
                else if (opcion == 3) {
                    System.out.print("Ingrese el número a evaluar: ");
                    int numero = leer.nextInt();
                    boolean par = false;
                    boolean primo = false;
                    int divisores = 0;
                    int contador = 1;

                    if (numero % 2 == 0) {
                        par = true;
                    }
                    while (contador <= numero) {
                        if (numero % contador == 0) {
                            divisores++;
                        }
                        contador++;

                    }

                    if (divisores == 2) {
                        primo = true;

                        if (primo == true && par == true) {
                            System.out.println("El numero es par y primo");

                            if (primo == true && par == false) {
                                System.out.println("El numero es primo y primo");
                            }

                            if (par == true) {
                                System.out.println("El numero es par");
                            }

                            if (par == false) {
                                System.out.println("El numero es impar");
                            }

                        }
                    }
                }
            System.out.println("Desea ingresar al lugar inicial? [s/n]");
            respuesta1 = leer.next().charAt(0);
            }
            
            
        }

    }
}
