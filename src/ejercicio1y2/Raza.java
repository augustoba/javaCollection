
package ejercicio1y2;

public class Raza {
 private String raza;

    public Raza() {
    }

    public Raza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "raza: " + raza ;
    }
 
 
}
