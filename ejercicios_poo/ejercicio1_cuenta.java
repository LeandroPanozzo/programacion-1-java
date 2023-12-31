/*
Ejercicio 1:
Crea una clase llamada ejercicio1_cuenta que tendrá los siguientes atributos:
1. titular y cantidad (puede tener decimales). Crear sus métodos get, set.
2. Crear dos constructores que permitan crear una cuenta para un titular y la cantidad.

Tendrá dos métodos especiales:
1. ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
es negativa, no se hará nada.
2. retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual
a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
 */
package ejercicios_poo;

/**
 *
 * @author Leandro
 */
public class ejercicio1_cuenta {
    private String titular;
    private double cantidad;

    //getters
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    //setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    //constructores
    public ejercicio1_cuenta(String titular) {
        this.titular = titular;
    }

    public ejercicio1_cuenta(double cantidad) {
        this.cantidad = cantidad;
    }

    //metodos
    public void ingresar(double cantidad){
        if (cantidad>0) {
            this.cantidad +=cantidad;
        }
    }

    public void retirar(double cantidad){
        if (this.cantidad-cantidad < 0) {
            this.cantidad=0;
        }else{
            this.cantidad -= cantidad;
        }
    }
    
    
    
}
