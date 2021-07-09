
package ejeFiguraGeometrica;
import javax.swing.JOptionPane;
public class figuraGeometrica {
    public int lado;
    public int base;
    public int altura;
    int area;
    public figuraGeometrica(){}
    public int Cuadrado(int lado){
        this.lado = lado;
        area = lado*lado;
        return area;
    }
    public int Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
        area = altura*base;
        return area;
    }
    public int Triangulo(int altura, int base){
        this.base = base;
        this.altura = altura;
        area = ((altura*base)/2);
        return area;
    }
    public void retornar(int cuadrado, int triangulo, int rectangulo){
        JOptionPane.showMessageDialog(null, 
                "El area del cuadrado es: " + cuadrado  +
                "\nEl area del triangulo es: " + triangulo + 
                "\nEl area del rectangulo es: " + rectangulo);
    }
}
