public class Automovil {

   String fabricante;
   String modelo;
   String color="negro";
   double cilindrada;

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
         this.fabricante = fabricante;
         this.modelo = modelo;
         this.color = color;
         this.cilindrada = cilindrada;
    }

    public void mostrarCaracteristicas() {
         System.out.println("Este automovil es un " + this.fabricante + " " + this.modelo + " " + this.color + " " + this.cilindrada);
    }

    //Getters and Setters
    public String getFabricante() {
         return fabricante;
    }

    public void setFabricante(String fabricante) {
         this.fabricante = fabricante;
    }

    public String getModelo() {
         return modelo;
    }

    public void setModelo(String modelo) {
         this.modelo = modelo;
    }

    public String getColor() {
         return color;
    }

    public void setColor(String color) {
         this.color = color;
    }

    public double getCilindrada() {
         return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
         this.cilindrada = cilindrada;
    }


}
