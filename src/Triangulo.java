import javax.swing.*;

public class Triangulo {
    /*
    Desarrolle un metodo que determine si un triangulo es equilatero, es decir, si sus lados
    son iguales, escaleno, es decir, si sus lados son difetentes,
    rectangulo si dos lados son iguales
    */
    public void tipoTriangulo(int lado1, int lado2, int lado3)
        { /*Equilatero*/
            if((lado1 == lado2) && ( lado2 == lado3))
            {
                JOptionPane.showMessageDialog(null,"Es un triangulo equilatero");
            }
            /*Escaleno*/
            else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3))
            {
                JOptionPane.showMessageDialog(null,"Es un triangulo escaleno");
            }
            /*Cuadrado*/
            else
            {
                JOptionPane.showMessageDialog(null,"Es un triangulo cuadrado");
            }
        }
    //pvsm
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 1"));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 2"));
        int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado 3"));
        t1.tipoTriangulo(lado1,lado2,lado3);
    }
}
