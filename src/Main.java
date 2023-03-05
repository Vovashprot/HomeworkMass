public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        System.out.println("Task1/2");
        int[] mass = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        double[] mass2 = {1.57,7.654,9.986};
        int[] mass3 = {22,44,22,5};
        for (int i=0; i<=1;i++){
            System.out.print(mass[i]+", ");
        }
        System.out.println(mass[2]);

        for (int i=0; i<=1;i++){
            System.out.print(mass2[i]+", ");
        }
        System.out.println(mass2[2]);

        for (int i=0; i<=2;i++){
            System.out.print(mass3[i]+", ");
        }
        System.out.println(mass3[3]);

    }
}