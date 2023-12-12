package trabajofinalcac;

import trabajofinalcac.Entidad.Orador;
import java.time.LocalDate;
import java.util.List;
import trabajofinalcac.dao.Conexion;
import trabajofinalcac.dao.OradorData;

public class TrabajoFinalCaC {

    public static void main(String[] args) {

        Conexion.getConexion();

        int idOradorBuscado = 13;

        OradorData oradorData = new OradorData();
//        Orador oradorEncontrado = oradorData.buscarOradorPorId(idOradorBuscado);
//
//        if (oradorEncontrado != null) {
//            System.out.println("Orador encontrado:");
//            System.out.println("ID: " + oradorEncontrado.getIdOrador());
//            System.out.println("Nombre: " + oradorEncontrado.getNombre());
//            System.out.println("Apellido: " + oradorEncontrado.getApellido());
//            System.out.println("Correo: " + oradorEncontrado.getMail());
//            System.out.println("Fecha de alta: " + oradorEncontrado.getFecha_alta());
//            // Imprime los demás atributos si es necesario
//        } else {
//            System.out.println("No se encontró ningún orador con el ID proporcionado.");
//        }
//    }
//    
        // Supongamos que queremos listar los oradores por el tema "Inteligencia Artificial"
//        String temaBuscado = "Desarrollo Web";
//
//        List<Orador> oradoresPorTema = oradorData.listarOradoresPorTema(temaBuscado);
//
//        if (!oradoresPorTema.isEmpty()) {
//            System.out.println("Oradores encontrados para el tema '" + temaBuscado + "':");
//            for (Orador orador : oradoresPorTema) {
//                System.out.println("ID: " + orador.getIdOrador());
//                System.out.println("Nombre: " + orador.getNombre());
//                System.out.println("Apellido: " + orador.getApellido());
//                System.out.println("Correo: " + orador.getMail());
//                System.out.println("Fecha de alta: " + orador.getFecha_alta());
//                // Imprime los demás atributos si es necesario
//                System.out.println("-----------------------------");
//            }
//        } else {
//            System.out.println("No se encontraron oradores para el tema '" + temaBuscado + "'.");
//        }
//    }

        List<Orador> oradores = oradorData.listarOradores();
        
        if (!oradores.isEmpty()) {
            
            for (Orador orador : oradores) {
                System.out.println("ID: " + orador.getIdOrador());
                System.out.println("Nombre: " + orador.getNombre());
                System.out.println("Apellido: " + orador.getApellido());
                System.out.println("Correo: " + orador.getMail());
                System.out.println("Tema: " + orador.getTema());
                System.out.println("Fecha de alta: " + orador.getFecha_alta());
                
                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("No se encontraron oradores");
        }
    }
}
