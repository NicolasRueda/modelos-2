/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegos;

/**
 *
 * @author Estudiantes
 */
public class Guayabita {
    
    public int Guayabita(int apuestaJugador1, int apuestaJugador2, 
            int apuestaMesa, int jugador, int turno, int dado, 
            int apuestaNueva, int dadoAnterior){
        if(apuestaJugador1 <= 0 || apuestaJugador2 <= 0 || apuestaMesa <= 0){
            if (apuestaJugador1 <= 0){
                System.out.println("dinero j1:" + apuestaJugador1);
                System.out.println("dinero j2:" + apuestaJugador2);
                System.out.println("dinero mesa:" + apuestaMesa);
                
                return 2;
            }else if (apuestaJugador2 <= 0){
                System.out.println("dinero j1:" + apuestaJugador1);
                System.out.println("dinero j2:" + apuestaJugador2);
                System.out.println("dinero mesa:" + apuestaMesa);
                return 1;
            }else{
                System.out.println("dinero j1:" + apuestaJugador1);
                System.out.println("dinero j2:" + apuestaJugador2);
                System.out.println("dinero mesa:" + apuestaMesa);
                return Guayabita(apuestaJugador1 - 1000,apuestaJugador2 - 1000, 
                        apuestaMesa + 2000,1 , 1, Dado(), 
                        100, 0);
            }
        }
        if(turno == 1){
            if(jugador == 1){
                if(dado == 1){
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1 - apuestaNueva,apuestaJugador2, 
                        apuestaMesa + apuestaNueva,2 , 1, Dado(), 
                        100, 0);
                }else if(dado == 6){
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1 + apuestaNueva,apuestaJugador2, 
                        apuestaMesa - apuestaNueva,2 , 1, Dado(), 
                        100, 0);
                }else{
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1,apuestaJugador2, 
                        apuestaMesa,1 , 2, Dado(), 
                        apuesta(), dado);
                }
            }else{
                if(dado == 1){
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1,apuestaJugador2 - apuestaNueva, 
                        apuestaMesa + apuestaNueva,1 , 1, Dado(), 
                        100, 0);
                }else if(dado == 6){
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1,apuestaJugador2 + apuestaNueva, 
                        apuestaMesa - apuestaNueva,1 , 1, Dado(), 
                        100, 0);
                }else{
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1,apuestaJugador2, 
                        apuestaMesa,2 , 2, Dado(), 
                        apuesta(), dado);
                }
            }
            
        }else if(turno == 2){
            if(jugador == 1){
                if(dadoAnterior > dado){
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1 - apuestaNueva,apuestaJugador2, 
                        apuestaMesa + apuestaNueva,2 , 1, Dado(), 
                        100, 0);
                }else{
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1 + apuestaNueva,apuestaJugador2, 
                        apuestaMesa- apuestaNueva,2 , 1, Dado(), 
                        100, 0);
                }
            }else if(jugador == 2){
                if(dadoAnterior > dado){
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1,apuestaJugador2 - apuestaNueva, 
                        apuestaMesa + apuestaNueva,1 , 1, Dado(), 
                        100, 0);
                }else{
                    System.out.println("dinero j1:" + apuestaJugador1);
                    System.out.println("dinero j2:" + apuestaJugador2);
                    System.out.println("dinero mesa:" + apuestaMesa);
                    System.out.println("Jugador:" + jugador);
                    System.out.println("Turno:" + turno);
                    System.out.println("Apuesta nueva:" + apuestaNueva);
                    System.out.println("Dado actual:" + dado);
                    System.out.println("Dado Anterior:" + dadoAnterior + "\n");

                    return Guayabita(apuestaJugador1,apuestaJugador2 + apuestaNueva, 
                        apuestaMesa- apuestaNueva,1 , 1, Dado(), 
                        100, 0);
                }
            }
        }
        return 0;
    }
    
    public int apuesta(){
        return (int) (Math.random() * 1000) + 100;
    }
    
    public int Dado(){
        return (int) (Math.random() * 6) + 1;
    }
    
}
