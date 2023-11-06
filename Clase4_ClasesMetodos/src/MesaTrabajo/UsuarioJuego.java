package MesaTrabajo;

public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

        public UsuarioJuego(String nombre, String clave){
            this.nombre = nombre;
            this.clave = clave;
            this.puntaje = 0.0;
            this.nivel = 0;
        }
        // Métodos
        public void aumentarPuntaje(){
            this.puntaje += 1;
        }
        public void subirNivel(){
            nivel += 1;
        }
        public void bonus(int valor){
            puntaje += valor;
        }

        public Double getPuntaje(){
            return puntaje;
        }
        public int getNivel(){
            return nivel;
        }
        public String getNombre(){
            return nombre;
        }
        public String getClave(){
            return clave;
        }
}
