/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executa;

/**
 *
 * @author Senac Sistemas
 */
public class Beija {

    public void executaBeijo(Integer nota) throws InterruptedException {
        if (nota >= 7) {
            System.out.println("Seja feliz e beije!");
            System.out.println("Você tem 15 segundos de alegria.");
            for (int i = 15; i > 0; i--) {
                Thread.sleep(1000);
                if (i == 5) {
                    System.out.println("Você tem 5 segundos!");
                } else {
                    System.out.println(i);
                }
            }
            System.out.println("Tempo encerrado");
        } else {
            System.out.println("Saia correndo!");
        }
    }

}
