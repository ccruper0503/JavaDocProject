/**
 * Representa un automóvil con sus características básicas.
 * Almacena información sobre marca, modelo, año y precio de un vehículo.
 * Proporciona métodos para acceder y modificar esta información.
 * @author Christian De La Cruz Pérez
 */
public class Car {
    /** La marca o fabricante del vehículo */
    private String make;
    /** El nombre específico del modelo del vehículo */
    private String model;
    /** El año de fabricación del vehículo */
    private int year;
    /** El costo del vehículo en dólares */
    private double price;

    /**
     * Construye un nuevo objeto Car con los datos proporcionados.
     * @param make La marca del vehículo
     * @param model El modelo del vehículo
     * @param year El año de fabricación
     * @param price El precio de venta
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Obtiene la marca del vehículo.
     * @return La marca actual
     */
    public String getMake() {
        return make;
    }

    /**
     * Actualiza la marca del vehículo.
     * @param make La nueva marca
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Obtiene el modelo del vehículo.
     * @return El modelo actual
     */
    public String getModel() {
        return model;
    }

    /**
     * Actualiza el modelo del vehículo.
     * @param model El nuevo modelo
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Obtiene el año de fabricación.
     * @return El año actual
     */
    public int getYear() {
        return year;
    }

    /**
     * Actualiza el año de fabricación.
     * @param year El nuevo año
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Obtiene el precio del vehículo.
     * @return El precio actual
     */
    public double getPrice() {
        return price;
    }

    /**
     * Actualiza el precio del vehículo.
     * @param price El nuevo precio
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Genera una descripción textual completa del vehículo.
     * Combina todos los atributos en una sola cadena legible.
     * @return Descripción completa del vehículo
     */
    public String carDescription() {
        return "The car is a " + year + " " + make + " " + model + " priced at $" + price;
    }

    /**
     * Proporciona una representación del objeto Car.
     * Utiliza la descripción completa generada por carDescription.
     * @return Representación textual del vehículo
     */
    @Override
    public String toString() {
        return carDescription();
    }

    /**
     * Método de demostración del funcionamiento de la clase. 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2025, 26800);
        System.out.println(car);
    }
}