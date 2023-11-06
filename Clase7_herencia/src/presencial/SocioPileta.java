package presencial;

public class SocioPileta extends Socio {
    private Double costoPileta;
    private Boolean estaHabilitado; //true o false

//genero un superConstructor(atributos del padre y del hijo)
    public SocioPileta(Integer numeroSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }
    //hago el metodo para saber si el socio esta habilitado
    public void habilitadoParaPileta(){
        estaHabilitado= true;
    }
    public void deshabilitarPileta(){
        estaHabilitado= false;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override //un metodo y firmarlo posteriormente
    public Double calcularCostoMensual() {
        if(estaHabilitado){
            //por si
            return super.calcularCostoMensual()+costoPileta;
        }else{
            //por no
            return super.calcularCostoMensual();
        }

    }
}
