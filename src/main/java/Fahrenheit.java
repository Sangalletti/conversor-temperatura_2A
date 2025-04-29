
//Classe filha
public class Fahrenheit extends Temperatura{
    
    //Contrutor
    public Fahrenheit(double valorGraus) {
        
        //Super se refera a classe pai
        super(valorGraus);
    }
    
    //===Metodos para converter===
    
    //Para Celsius
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    
    //Para Kevin
    public double paraKevin(){
        return paraCelsius()+273;
    }
    
}
