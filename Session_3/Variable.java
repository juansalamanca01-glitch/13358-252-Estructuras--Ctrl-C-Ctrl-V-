

public class Variable {
    public static void main(String[] args) {
        
        double ladoCuadrado = 5;
        double baseRectangulo = 8;
        double alturaRectangulo = 4;
        double radioCirculo = 3;
        double baseTriangulo = 6;
        double alturaTriangulo = 5;

        
        double areaCuadrado = ladoCuadrado * ladoCuadrado;
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        
        System.out.println("=== ÁREAS DE FIGURAS GEOMÉTRICAS ===");
        System.out.println("Área del cuadrado (lado " + ladoCuadrado + "): " + areaCuadrado);
        System.out.println("Área del rectángulo (" + baseRectangulo + " x " + alturaRectangulo + "): " + areaRectangulo);
        System.out.println("Área del círculo (radio " + radioCirculo + "): " + areaCirculo);
        System.out.println("Área del triángulo (base " + baseTriangulo + ", altura " + alturaTriangulo + "): " + areaTriangulo);
    }
}
