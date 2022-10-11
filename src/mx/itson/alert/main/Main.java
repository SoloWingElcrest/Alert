/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.alert.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mx.itson.alert.enmueradores.Aproximidad;
import mx.itson.alert.entidades.Descripcion;
import mx.itson.alert.entidades.Instruccion;
import mx.itson.alert.entidades.Operacion;
import mx.itson.alert.entidades.Unidad;

/**
 * Despliega los datos en consola
 * @author Xylan
 */
public class Main {
    
     public static void main(String[] args) {
         /**
          * Se establecen los valores de la entidad Operacion
          */
         Operacion operacion = new Operacion();
         operacion.setCodename("Battle-Axe");
         operacion.setFecha("5/28/1995");
         operacion.setHora(1200);
         operacion.setTemperatura(39);
         operacion.setClima("Sunny");
         operacion.setLugar("Area B7R, Belka");
         operacion.setCoordenada("22°53'37\" N, 234°19'32\" E");
         operacion.setEstimacionHostil("Very high");
         
         /**
          * Se coloca un enumerador de proximidad
          */
         operacion.setAproximidad(Aproximidad.ATA);
         
         /**
          * Se inicia un ArrayList para la entidad Descripcion
          * Se hace en Arraylist y no directamente para acomodar el texto en consola
          */
         List<Descripcion> descripciones = new ArrayList<>();
         
         Descripcion descripcion1 = new Descripcion();
         descripcion1.setDescripcion("Orders have come in for an emergency sortie.");
         descripciones.add(descripcion1);
         
         Descripcion descripcion2 = new Descripcion();
         descripcion2.setDescripcion("A major air engagement is taking place as we speak between Belka and the Allied Forces near the border;");
         descripciones.add(descripcion2);
         
         Descripcion descripcion3 = new Descripcion();
         descripcion3.setDescripcion("In the B7R airspace, which Belka is committed to defend at all costs.");
         descripciones.add(descripcion3);
         
         Descripcion descripcion4 = new Descripcion();
         descripcion4.setDescripcion("B7R, commonly known as the \"Round Table\", has long been a symbol of Belka's political, military and industrial might.");
         descripciones.add(descripcion4);
         
         Descripcion descripcion5 = new Descripcion();
         descripcion5.setDescripcion("However, at noon today, along with its lightning-quick commencement of Operation Battle-Axe;");
         descripciones.add(descripcion5);
         
         Descripcion descripcion6 = new Descripcion();
         descripcion6.setDescripcion("The Allied Forces officially announced the permanent abrogation of its nonaggression treaty at the Assembly of Nations;");
         descripciones.add(descripcion6);
         
         Descripcion descripcion7 = new Descripcion();
         descripcion7.setDescripcion("and simultaneously attacked B7R with a massive fighter squadron.");
         descripciones.add(descripcion7);
         
         Descripcion descripcion8 = new Descripcion();
         descripcion8.setDescripcion("This mission may be our chance to finally end the Belkan War once and for all.");
         descripciones.add(descripcion8);
         
         Descripcion descripcion9 = new Descripcion();
         descripcion9.setDescripcion("I wish you luck.");
         descripciones.add(descripcion9);
         
         operacion.setDescripciones(descripciones);
         
         /**
          * Se inicia un Arraylist para la entidad Instruccion
          */
         List<Instruccion> instrucciones = new ArrayList<>();
         
         Instruccion instruccion1 = new Instruccion();
         instruccion1.setOrden(1);
         instruccion1.setDescripcion("Arrive at the stated destination at 1200hrs.");
         instrucciones.add(instruccion1);
         
         Instruccion instruccion2 = new Instruccion();
         instruccion2.setOrden(2);
         instruccion2.setDescripcion("Maintain radio silence until the ambush countdown reaches to zero.");
         instrucciones.add(instruccion2);
         
         Instruccion instruccion3 = new Instruccion();
         instruccion3.setOrden(3);
         instruccion3.setDescripcion("When the countdown reaches its limit, attack every aircraft in sight to get a safe place of engagement.");
         instrucciones.add(instruccion3);
         
         Instruccion instruccion4 = new Instruccion();
         instruccion4.setOrden(4);
         instruccion4.setDescripcion("Engage the enemy until they retreat or when the area is sanitized.");
         instrucciones.add(instruccion4);
         
         Instruccion instruccion5 = new Instruccion();
         instruccion5.setOrden(5);
         instruccion5.setDescripcion("Refrain to leave the operation airspace until the retreat order has given.");
         instrucciones.add(instruccion5);
         
         operacion.setInstrucciones(instrucciones);
                 
        /**
         * Se inicia un Arraylist para la entidad Unidad
         */
         List<Unidad> unidades = new ArrayList<>();
         
         Unidad unidad0 = new Unidad();
         unidad0.setNombre("Eagle Eye");
         unidad0.setNumIntegrante(1);
         unidad0.setTipo("AWACS");
         unidad0.setEquipamento("E-767");
         unidades.add(unidad0);
         
         Unidad unidad1 = new Unidad();
         unidad1.setNombre("Sorcerer");
         unidad1.setNumIntegrante(8);
         unidad1.setTipo("Aerial");
         unidad1.setEquipamento("8x F-15S/MTD");
         unidades.add(unidad1);
         
         Unidad unidad2 = new Unidad();
         unidad2 = new Unidad();
         unidad2.setNombre("Wizard");
         unidad2.setNumIntegrante(8);
         unidad2.setTipo("Aerial");
         unidad2.setEquipamento("8x F-18C Hornet");
         unidades.add(unidad2);
         
         Unidad unidad3 = new Unidad();
         unidad3.setNombre("Crow");
         unidad3.setNumIntegrante(3);
         unidad3.setTipo("Aerial");
         unidad3.setEquipamento("3x F-16C Fighting Falcon");
         unidades.add(unidad3);
         
         Unidad unidad4 = new Unidad();
         unidad4.setNombre("Heartbreak");
         unidad4.setNumIntegrante(1);
         unidad4.setTipo("Aerial");
         unidad4.setEquipamento("1x F-14D Super Tomcat");
         unidades.add(unidad4);
         
         Unidad unidad5 = new Unidad();
         unidad5.setNombre("Garm");
         unidad5.setNumIntegrante(2);
         unidad5.setTipo("Aerial");
         unidad5.setEquipamento("2x F-15C Eagle");
         unidades.add(unidad5);
         
         Unidad unidad6 = new Unidad();
         unidad6.setNombre("Scarface");
         unidad6.setNumIntegrante(1);
         unidad6.setTipo("Aerial Prototype");
         unidad6.setEquipamento("XFA-27 Scarface");
         unidades.add(unidad6);
         
         operacion.setUnidades(unidades);
         
         /**
          * Se imprimen todos los datos establecidos en consola
          */
         System.out.println("//////EMERGENCY TRANSMISSION FROM HQ//////");
         System.out.println(" ");
         System.out.println("Operation: " + operacion.getCodename());
         System.out.println("Mission type: " + operacion.getAproximidad());
         System.out.println("Start: " + operacion.getFecha() + ", " + operacion.getHora() + "hrs");
         System.out.println("At: " + operacion.getCoordenada() + ", " + operacion.getLugar());
         System.out.println("Weather: " + operacion.getTemperatura() + "°C, " + operacion.getClima());
         System.out.println("Hostile Estimate: " + operacion.getEstimacionHostil());
         System.out.println(" ");
         System.out.println("//////BRIEFING//////");
         System.out.println("");
         for (Descripcion d: operacion.getDescripciones()){
             System.out.println(d.getDescripcion());
         }
         System.out.println(" ");
         System.out.println("//////ORDERS//////");
           System.out.println(" ");
         for (Instruccion i: operacion.getInstrucciones()){
             System.out.println(i.getOrden() + ".- " + i.getDescripcion());
         }
           System.out.println(" ");
           System.out.println("//////REQUESTED UNITS//////");
           System.out.println(" ");
         for (Unidad u: operacion.getUnidades()){
               System.out.println("Unit name: " + u.getNombre() );
               System.out.println("Unit type: " + u.getTipo());
               System.out.println("Number of pilots: " + u.getNumIntegrante());
               System.out.println("Aircraft: " + u.getEquipamento());
               System.out.println(" ");
         }
     }
}
