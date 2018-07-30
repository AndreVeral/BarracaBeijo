/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executa;

import java.util.Scanner;

/**
 *
 * @author Senac Sistemas
 */
public class ImpBeija {

    public static void main(String[] args) throws InterruptedException {
        int nota;
        Beija b = new Beija();
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a nota da prenda de 0 a 10");
        nota = s.nextInt();
        b.executaBeijo(nota);
    }
}
