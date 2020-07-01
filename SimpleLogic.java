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
    public void reverse(double[] data){
        double temp=data[0];
        int mid = data.length/2;
        int index_end = data.length-1;
        
        for (int j=0;j<mid;j++){

            data[j] = data[index_end];
            data[index_end] = temp;
            temp = data[j+1];

            index_end--;

        }
    }

}