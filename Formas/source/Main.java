/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author sev
 */
public class Main {

    public static void main(String[] args) {

        Forma quadrado = new Quadrado(2, 2);
        Forma circulo = new Circulo(2, 2);
        Forma triangulo = new Triangulo(2, 4);
        Forma cubo = new Cubo(2, 4, 2);
        Forma esfera = new Esfera(2, 4, 2);
        Forma tetraedro = new Tetraedro(2, 4, 2);

        TrataForma teste = new TrataForma();
        teste.getFormas().add(quadrado);
        teste.getFormas().add(circulo);
        teste.getFormas().add(triangulo);
        teste.getFormas().add(cubo);
        teste.getFormas().add(esfera);
        teste.getFormas().add(tetraedro);

        for (Forma f : teste.getFormas()) {
            teste.imprimirForma(f);

        }
    }
}
