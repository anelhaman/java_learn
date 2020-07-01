public class mainApp {
    public static void main(String[]args){

        double[] numSet = {1,3,4,5,6,8,9};

        SimpleLogic objSimpleLogic = new SimpleLogic();

        System.out.println(objSimpleLogic.sum(numSet));
        System.out.println(objSimpleLogic.min(numSet));
        System.out.println(objSimpleLogic.max(numSet));

        System.out.print("forward: ");
        for (double val : numSet)
        System.out.printf("%.0f ",val);

        objSimpleLogic.reverse(numSet);

        System.out.print("\nreverse: ");
        for (double val : numSet)
        System.out.printf("%.0f ",val);
    }
}