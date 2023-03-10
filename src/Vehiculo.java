public class Vehiculo {
    String matricula;
    String marca;
    String modelo;
    String color;
    Double tarifa;
    boolean disponible;

    public Vehiculo(String matricula,
                    String marca,
                    String modelo,
                    String color,
                    Double tarifa,
                    boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("22 SDQ",
                "NISSAN",
                "SRV",
                "Blanco",
                150.0,
                true);

        System.out.println("Matricula " + vehiculo1.getMatricula());
        System.out.println("Marca y modelo " + " " + vehiculo1.getMarca() + " " + vehiculo1.getModelo());
        System.out.println("Color " + vehiculo1.getColor());
        System.out.println("tarifa " + vehiculo1.getTarifa());

        Vehiculo vehiculo2 = new Vehiculo("EST 3001",
                "Chevrolet",
                "tranxs",
                "Gris",
                80.0,
                false);

        System.out.println("Matricula " + vehiculo2.getMatricula());
        System.out.println("Marca y modelo " + " " + vehiculo2.getMarca() + " " + vehiculo2.getModelo());
        System.out.println("Color " + vehiculo2.getColor());
        System.out.println("tarifa " + vehiculo2.getTarifa());

    }
}

class Cliente {
    private final String nif;
    private final String nombre;
    private final String apellidos;

    public Cliente(String nif, String nombre, String apellidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }


    }



