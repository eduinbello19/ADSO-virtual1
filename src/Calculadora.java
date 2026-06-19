import javax.swing.*;

//clase calculadora
public class Calculadora
{
    // metodo sumar
    public int sumar(int num1, int num2)
    {
        return num1+num2;
    }
    //metodo restar
    public int restar(int num1, int num2)
    {
        return num1-num2;
    }
    //metodo multiplicar
    public int multiplicar(int num1, int num2)
    {
        return num1*num2;
    }
    //metodo dividir
    public double dividir(double num1, double num2)
    {
        return num1/num2;
    }
    //psvm
    public static void main(String[] args)
    {
        //NombreClase NombreObjeto = newClase();
        Calculadora calculadora = new Calculadora();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del numero 2"));
        //Se muestra el valor por consola
        System.out.println("El resultado del procedimiento es "+calculadora.sumar(num1,num2));
        //se muestre el valor por GUI o pantalla
        JOptionPane.showMessageDialog(null,"El resultado del procedimiento es "+calculadora.sumar(num1,num2));
        ccc
    }
}
