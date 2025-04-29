
//Classe filha
public class Celsius extends Temperatura {

    //Contrutor
    public Celsius(double valorGraus) {
        
        //Super se refere a classe pai
        super(valorGraus);
    }

    //===Metodos para converter===
    
    //Para Fahrenheit
    public double paraFahrenheit() {
        return (getGraus() * 9 / 5) + 32;
    }

    //Para Kevin
    public double paraKevin() {
        return getGraus()+273;
    }

}
