package Mesas;

public abstract class Objeto {
    private Integer posx;
    private Integer posy;
    private Character direccion;

    public Objeto(Integer posx, Integer posy, Character direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public abstract void irA(Integer posx, Integer posy, Character direccion);

    // Getter y Setter

    public Integer getPosx() {
        return posx;
    }

    public void setPosx(Integer posx) {
        this.posx = posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public void setPosy(Integer posy) {
        this.posy = posy;
    }

    public Character getDireccion() {
        return direccion;
    }

    public void setDireccion(Character direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Posición: (" + posx + ", " + posy + ")";
    }

    @Override
    public int hashCode() {
        int hash = 31;
        hash = hash*posx.hashCode();
        hash = hash*posy.hashCode();
        hash = hash*direccion.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object o){
        if (o == null)
            return false;
        if(!(o instanceof Objeto))
            return false;
        else{
            Objeto objetoAuxiliar = (Objeto)o;
            return
                    this.getDireccion().equals(objetoAuxiliar.getDireccion());
        }
    }
}
