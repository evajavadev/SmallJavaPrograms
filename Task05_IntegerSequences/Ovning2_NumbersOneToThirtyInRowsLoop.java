public class Ovning2_NumbersOneToThirtyInRowsLoop {

    public static void main(String[] args) {
        Ovning2_NumbersOneToThirtyInRowsLoop ovn2 = new Ovning2_NumbersOneToThirtyInRowsLoop();
        ovn2.kubic();
    }

    public void kubic() {
        System.out.println();

        int i = 1;
        while (i<=30) {
            System.out.print(i+" ");
            if(i%5 == 0){
                System.out.print("\n");
            }
            i++;
        }
    }
}