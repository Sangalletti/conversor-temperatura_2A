
//Classe filha
public class Kevin extends Temperatura{
    
    //Contrutor
    public Kevin(double valorGraus) {
        
        //Super se refera a classe pai
        super(valorGraus);
    }
    
    //===Metodos para converter===
    
    //Para Celsius
    public double paraCelsius(){
        return getGraus()-273;
    }
    
    //Para Fahrenheit
    public double paraFahrenheit(){
        return (paraCelsius()*9/5)+32;
    }
}
