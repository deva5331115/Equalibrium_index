import java.util.Scanner;

public class Equalibrium_index {
    int equalibrium() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[] = new int[size];
        array[0] = scan.nextInt();
        for (int i = 1; i < size; i++) {
            array[i]=scan.nextInt();
            array[i] = array[i] + array[i - 1];
        }
        for(int i = 1; i<size;i++)
    {
        if (array[i - 1] == array[size - 1] - array[i]) {
            return i;
        }
    }
        return -1;

}
    public static void main(String[] args) {
        Equalibrium_index index=new Equalibrium_index();
        System.out.println(index.equalibrium());

        }
    }

