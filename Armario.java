public class Armario {
    public String cor;
    public String marca;
    public float altura;
    public float comprimento;
    public int quantPrateleiras;
    public boolean aberto = false;
    public boolean fechado = false;

    public boolean trancado = false;

    public boolean isOpen(){
        return aberto;
    }

    public void abrir(){

    }

    public boolean isClose(){
        return fechado;
    }
    public boolean isBlock(){
        return trancado;
    }

}
