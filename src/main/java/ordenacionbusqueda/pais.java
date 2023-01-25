/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.Objects;

/**
 *
 * @author fer
 */
public class pais implements Comparable<pais>{
    
    private String nombre;
    
    private long poblacion;
    
    private long superficie;
    
    private String moneda;

    public pais(String nombre, long poblacion, long superficie, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.moneda = moneda;
    }

    public pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final pais other = (pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("pais{");
        sb.append("nombre=").append(nombre);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", superficie=").append(superficie);
        sb.append(", moneda=").append(moneda);
        sb.append('}');
        return sb.toString();
    }

    @Override //ESTA WASHIWOWEA HAY QUE EDITARLA CON EL RETURN
    public int compareTo(pais o) {
      return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    
    
}
