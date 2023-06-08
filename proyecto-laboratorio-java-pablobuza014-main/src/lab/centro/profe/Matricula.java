package lab.centro.profe;

public record Matricula(String dni, Integer ida, Integer idg) {
	    
	    
	    public static Matricula of(String dni,Integer ida,Integer idg) {
	        return new Matricula(dni,ida,idg);
		}
	    
	    public static Matricula parse(String text) {
	        String[] partes = text.split(",");
	        return Matricula.of(partes[0],Integer.parseInt(partes[1]),Integer.parseInt(partes[2]));
	    }


	    public String toString() {
	        return String.format("%s,%s,%s",this.dni(),this.ida(),this.idg());
	    }

}
