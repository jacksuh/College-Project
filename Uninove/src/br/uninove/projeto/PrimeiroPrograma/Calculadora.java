package br.uninove.projeto.PrimeiroPrograma;

public class Calculadora {
	 
    //Atributos locais privados
    private float a, b;
 
    //get do A. Repare que ele tem o mesmo TIPO do a (float)
    public float getA() {
        return a;
    }
 
    //set do A. Repare que ele recebe um float no parâmetro
    public void setA(float a) {
        this.a = a;
    }
 
    //get do B
    public float getB() {
        return b;
    }
 
    //set do B
    public void setB(float b) {
        this.b = b;
    }
 
    //repare que o método não recebe nenhum atributo
    //pois ele usuará os locais, que devem ser
    //setados antes pela classe que chama esta
    public float soma() {
        return a + b;
    }
 
    public float subtrai() {
        return a - b;
    }
 
    public float multiplica() {
        return a * b;
    }
 
    public float divide() {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}