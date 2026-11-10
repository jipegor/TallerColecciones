public class PruebaBiblioteca {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        sistema.registrarMaterial(new Libro("BK-001", "Java desde cero", 2024, true, "Ana", "978-1"));
        sistema.registrarMaterial(new Libro("BK-002", "Estructuras de datos", 2022, false, "Luis", "978-2"));
        sistema.registrarMaterial(new Revista("RV-001", "Tech Hoy", 2025, true, 12, "tecnología"));
        sistema.registrarMaterial(new Revista("RV-002", "Ciencia Viva", 2023, true, 5, "ciencias"));
        System.out.println("Buscar BK-001: " + sistema.buscarMaterial("BK-001").getTitulo());
        System.out.println("Buscar XX-999: " + sistema.buscarMaterial("XX-999"));
        sistema.mostrarCatalogo();
        sistema.agregarEspera("BK-002", "Tommy");
        sistema.agregarEspera("BK-002", "Jennie");
        sistema.agregarEspera("BK-002", "Sandra");
        System.out.println("Primero en espera: " + sistema.siguienteEnEspera("BK-002"));
        System.out.println("Segundo en espera: " + sistema.siguienteEnEspera("BK-002"));
        System.out.println("Registrar Tommy: " + sistema.registrarMiembro("Tommy"));
        System.out.println("Registrar Tommy otra vez: " + sistema.registrarMiembro("Tommy"));
        System.out.println("¿Tommy tiene membresía? " + sistema.tieneMembresia("Tommy"));
        System.out.println("¿Zoe tiene membresía? " + sistema.tieneMembresia("Zoe"));
    }
}