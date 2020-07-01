public class SimpleLogic {

    public double sum(double[] data){
        double total=0;

        for(int j=0; j<data.length;j++){
            total += data[j];
        }

        return total;
    }
    
}