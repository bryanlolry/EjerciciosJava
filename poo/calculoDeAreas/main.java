package ejeFiguraGeometrica;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args){
        int ladoCuadrado, baseRect, alturaRect, baseTri, alturaTri;
        figuraGeometrica FigGeo = new figuraGeometrica();
        ladoCuadrado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado: "));
        int cuadrado = FigGeo.Cuadrado(ladoCuadrado);
        //JOptionPane.showMessageDialog(null, "El area es= " + cuadrado);
        
        baseRect = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del rectangulo: "));
        alturaRect = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del rectangulo: "));
        int rectangulo = FigGeo.Rectangulo(baseRect, alturaRect);
        //JOptionPane.showMessageDialog(null, "El area es= " + rectangulo);
        
        baseTri = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo: "));
        alturaTri = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo: "));
        int triangulo = FigGeo.Rectangulo(alturaTri, baseTri);
        //JOptionPane.showMessageDialog(null, "El area es= " + triangulo);
        FigGeo.retornar(cuadrado, triangulo, rectangulo);
        
    }
}

