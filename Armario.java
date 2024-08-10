import java.util.Scanner;
import java.util.*;

public class Armario {
    public String cor;
    public String marca;
    public float altura;
    public float comprimento;
    public int quantPrateleiras;
    public boolean aberto = false;
    public boolean fechado = false;
    public boolean trancado = false;


    public Armario(String Cor, String Marca, float Altura, float Comprimento, int QuantPrateleiras){
        this.cor = Cor;
        this.marca = Marca;
        this.altura = Altura;
        this.comprimento = Comprimento;
        this.quantPrateleiras = QuantPrateleiras;
    }


}