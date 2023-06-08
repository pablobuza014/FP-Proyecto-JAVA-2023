package lab.centro.profe;

public record Asignacion(String dni, Integer ida, Integer idg) {
    
    public static Asignacion of(String dni,Integer ida,Integer idg) {
        return new Asignacion(dni,ida,idg);
    }
    
    public static Asignacion parse(String text) {
        String[] partes = text.split(",");
        return Asignacion.of(partes[0],Integer.parseInt(partes[1]),Integer.parseInt(partes[2]));
	}

}