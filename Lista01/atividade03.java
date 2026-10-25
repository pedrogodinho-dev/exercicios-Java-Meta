public class atividade03 {

    public static void main(String[] args) {
        double celsius = 28.5;
        double fahrenheit;
        double kelvin;
        
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        System.out.printf("Temperatura Celsius: %.2f%n", celsius);
        System.out.printf("Temperatura Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Temperatura Kelvin: %.2f%n", kelvin);
    }
}

