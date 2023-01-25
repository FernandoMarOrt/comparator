/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fer
 */
public class ordenacionbusqueda {

    public static void main(String[] args) {

        List<pais> paises = new ArrayList<>();
       
        paises.add(new pais("España", 46, 505_400, "Euro"));
        
        paises.add(new pais("Portugal", 23, 25_400, "Euro"));
        
        paises.add(new pais("Estados Unidos", 146, 1_505_400, "Dolar Americano"));
        
        paises.add(new pais("Italia", 46, 505_400, "Euro"));
        
        
        
        paises.forEach(System.out::println);
        //Ordenar por moneda
        

    }

}
