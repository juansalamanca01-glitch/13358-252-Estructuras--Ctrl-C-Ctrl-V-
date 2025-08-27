public class CalculoAreas {
    public static void main(String[] args) {
        
        // =======================
        // ÁREA DE UN CUADRADO
        // =======================
        double lado = 5; // valor fijo
        double areaCuadrado = lado * lado;
        System.out.println("El área del cuadrado con lado " + lado + " es: " + areaCuadrado);

        // =======================
        // ÁREA DE UN RECTÁNGULO
        // =======================
        double base = 8; // valor fijo
        double altura = 4; // valor fijo
        double areaRectangulo = base * altura;
        System.out.println("El área del rectángulo de base " + base + " y altura " + altura + " es: " + areaRectangulo);

        // =======================
        // ÁREA DE UN CÍRCULO
        // =======================
        double radio = 3; // valor fijo
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo con radio " + radio + " es: " + areaCirculo);
    }
}
