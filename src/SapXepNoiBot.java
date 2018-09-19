public class SapXepNoiBot {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list){
        boolean needNextPast = true;

        for (int k = 0; k < list.length && needNextPast; k++) {
            needNextPast = false;
            for (int i = 0; i < list.length - k; i++) {

                int temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;

                needNextPast = true;
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"");
        }
    }
}
