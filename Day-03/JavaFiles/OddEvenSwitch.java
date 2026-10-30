class OddEvenSwitch {
    public static void main(String[] args) {
        int number = 17;
        int remainder = number % 2;

        switch (remainder) {
            case 0:
                System.out.println(number + " is Even");
                break;
            default:
                System.out.println(number + " is Odd");
        }
    }
}

