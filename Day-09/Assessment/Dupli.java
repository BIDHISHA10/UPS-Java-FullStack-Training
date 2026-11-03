
public class Dupli {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 4, 8, 2, 9, 4};

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            boolean alreadyPrinted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
