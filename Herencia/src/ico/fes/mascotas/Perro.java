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
public class Perro extends Animal {

    private String Raza;
    private String EmiteSonido;
    private String Pesa;
    private int Edad;

    public Perro() {
    }

    public Perro(String Raza, String EmiteSonido, String Pesa, int Edad) {
        this.Raza = Raza;
        this.EmiteSonido = EmiteSonido;
        this.Pesa = Pesa;
        this.Edad = Edad;
    }
    public Perro(String Raza, String EmiteSonido, String Pesa, int edad, int NumeroPatas, String Tipo, String Tamanio) {
        super(NumeroPatas, Tipo, Tamanio);
        this.Raza = Raza;
        this.EmiteSonido = EmiteSonido;
        this.Pesa = Pesa;
        this.Edad = Edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getEmiteSonido() {
        return EmiteSonido;
    }

    public void setEmiteSonido(String EmiteSonido) {
        this.EmiteSonido = EmiteSonido;
    }

    public String getPesa() {
        return Pesa;
    }

    public void setPesa(String Pesa) {
        this.Pesa = Pesa;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "Raza=" + Raza + ", EmiteSonido=" + EmiteSonido + ", Pesa=" + Pesa + ", Edad=" + Edad + '}';
    }

    
}
