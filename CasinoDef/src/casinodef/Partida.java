/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

package casinodef;

import java.util.Scanner;

/**
 *
 * @author alemt
 */
public class Partida {
    Scanner entrada = new Scanner (System.in);
    String jugador1, jugador2;
    Turno pers1 = new Turno();
    Turno pers2 = new Turno();
    private int res1, res2;
    private int contador1 = 0;
    private int contador2=0;
    
    public void pedirNombre(){
    System.out.print("Introduzca el nombre del jugador1: ");
    jugador1= entrada.nextLine();
    System.out.print("Introduzca el nombre del jugador2: ");
    jugador2= entrada.nextLine();
    }
    
    public void devenirPartida(int res1, int res2){
        if (res1>res2){
            contador1 +=1; 
            System.out.println( jugador1+" ha ganado el turno");
        }
        else if(res1<res2){
            contador2 +=1;
            System.out.println(jugador2+" ha ganado el turno");
        }
        else if(res1 == res2){
            contador1 +=1;
            contador2 +=1;
            System.out.println("   Se ha producido un empate");
        }
    }
    
    public void mostrarGanador(){
        if(contador1>contador2){
            System.out.println("Ha ganado "+jugador1+" la partida\n");
        }
        else if(contador1<contador2){
            System.out.println("Ha ganado "+jugador2+" la partida\n");
        }
        else if (contador1 == contador2){
            System.out.println("Increible, pero se ha producido un empate en la partida");
        }
    }
    
    public void jugarPartida(){
        int i = 1; 
        do{
            System.out.println("Turno "+i);
            System.out.println("Juega "+jugador1);
            pers1.jugarTurno();
            res1 = pers1.resultadoTurno();
            System.out.println("Juega "+jugador2);
            pers2.jugarTurno();
            res2 = pers2.resultadoTurno();
            if (res1 == 2 &&res2 !=2){
               System.out.println("¡Es un escandalo! " + jugador1+ " ha sacado ojos de tigre y ha ganado");
               System.exit(0);
           }
           if (res2 == 2 &&res1!=2){
               System.out.println("¡Es un escandalo! " +jugador2+ " ha sacado ojos de tigre y ha ganado");
                System.exit(0);
           }
           devenirPartida(res1, res2);
           i++;
        }
      while(i<=5);
      mostrarGanador(); 
    }
}
