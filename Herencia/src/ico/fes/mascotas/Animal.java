/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.mascotas;

/**
 *
 * @author Ivan
 */
public class Animal {

    private int NumeroPatas;
    private String Tipo;
    private String Tamanio;

    public Animal() {
    }

    public Animal(int NumeroPatas, String Tipo, String Tamanio) {
        this.NumeroPatas = NumeroPatas;
        this.Tipo = Tipo;
        this.Tamanio = Tamanio;
    }

    public int getNumeroPatas() {
        return NumeroPatas;
    }

    public void setNumeroPatas(int NumeroPatas) {
        this.NumeroPatas = NumeroPatas;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

    @Override
    public String toString() {
        return "Animal{" + "NumeroPatas=" + NumeroPatas + ", Tipo=" + Tipo + ", Tamanio=" + Tamanio + '}';
    }

    public static void main(String[] args) {

        Animal a1 = new Animal(4, "Domesticos", "Medianos");
        System.out.println(a1);

        Perro p1 = new Perro("Basset Hound", "Si", "25 kg", 9);
        System.out.println(p1);

        Gato g1 = new Gato("Bengala", "Si", "4 kg", 7);
        System.out.println(g1);

    }

}
