import javax.swing.JOptionPane;

public class notasestructurada {
    public static void main(String[] args) throws Exception {
        for(int est = 1; est <=2; est++) {
        String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del estudiante");
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la nota 1 del estudiante"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "ingrese la nota 2 del estudiante"));
        float notaFinal = (nota1 + nota2) / 2;
        JOptionPane.showMessageDialog(null, "informacion del estudiante\nNombre: " + nombre + " Nota Final: " + notaFinal);
        if(notaFinal <= 3) {
            JOptionPane.showMessageDialog(null,"El estudiante reprobo el curso");
        }else {
            JOptionPane.showMessageDialog(null,"El estudiante aprobo el curso");
        }

    }


    }
}
