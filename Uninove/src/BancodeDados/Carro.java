package BancodeDados;

public class Carro {
	 
    //Atributos possíveis de um carro para este sistema
    private String fabricante, modelo, cor;
    private int ano, idCarro;

 
    //Sets e gets dos atributos...:
    public String getFabricante() {
        return fabricante;
    }
 
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public String getCor() {
        return cor;
    }
 
    public void setCor(String cor) {
        this.cor = cor;
    }
 
    public int getAno() {
        return ano;
    }
 
    public void setAno(int ano) {
        this.ano = ano;
    }
 
    public int getIdCarro() {
        return idCarro;
    }
 
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
 
    //fim dos sets e gets
}