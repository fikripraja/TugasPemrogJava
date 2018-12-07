package exceptionprogram;

/**
 *
 * @fikripraja
 */
public abstract class KalkulatorBeras implements CalculatorService  {

    public abstract double Ping();
    public abstract double Po();
    public abstract double Lan();
    public abstract double Do();

    public KalkulatorBeras() {
    }

    @Override
    public double Ping(double x, double y) {
        return x*y;
        
    }

    @Override
    public double Po(double x, double y) {
        return x/y;
        
    }

    @Override
    public double Lan(double x, double y) {
        return x+y;
         
    }

    @Override
    public double Do(double x, double y) {
        return x-y;
        
    }
    
}
