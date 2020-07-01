public class SimpleLogic {

    public double sum(double[] data){
        double total=0;

        for(int j=0; j<data.length;j++){
            total += data[j];
        }

        return total;
    }
    public double min(double[] data){
        double currentMin= data[0];

        for (int j=1;j<data.length;j++){
            if (data[j] < currentMin){
                currentMin = data[j];
            }
        }

        return currentMin;
    }
    

}