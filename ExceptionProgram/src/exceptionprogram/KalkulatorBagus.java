package exceptionprogram;

/**
 *
 * @fikripraja
 */
public abstract class KalkulatorBagus implements CalculatorAdvanceService {

    public abstract double Akar();
    public abstract double Pangkat();
    
    @Override
    public double Akar(double x) {
        return Math.sqrt(x);
      
    }

    @Override
    public double Pangkat(double x, double y) {
        return Math.pow(x, y);
        
    }
    
}
