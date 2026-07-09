import javax.swing.*;

public class Estudiante {

    //definicion de las variables
    String nombre;
    int edad;
    double nota1, nota2, nota3;
    double promedio;

    public void registrar() {
        //solicitud de datos para realizar el ejercicios
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2:"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3:"));
        //calculo del promedio de notas
        promedio = (nota1 + nota2 + nota3) / 3;
        //condiciones
        if (promedio < 3.0) {
            JOptionPane.showMessageDialog(null,
                    "El estudiante " + nombre +
                            " está en riesgo académico.\nPromedio: " + promedio);
        } else {
            JOptionPane.showMessageDialog(null,
                    "El estudiante " + nombre +
                            " NO está en riesgo académico.\nPromedio: " + promedio);
        }

    }
    //pvsm
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.registrar();

    }
}
