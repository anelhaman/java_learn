public class SimpleLogic {

    public double sum(double[] data){
        double total=0;

        for(int j=0; j<data.length;j++){
            total += data[j];
        }

        return total;
    }
    public double min(double[] data){
        double currentMin=data[0];

        for (int j=1;j<data.length;j++){
            if (data[j] < currentMin){
                currentMin = data[j];
            }
        }

        return currentMin;
    }
    public double max(double[] data){
        double currentMax=data[0];

        for (int j=1;j<data.length;j++){
            if (data[j] > currentMax){
                currentMax = data[j];
            }
        }

        return currentMax;
    }

}