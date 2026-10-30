class ValidLogin {
    public static void main(String[] args) {
        String username = "Bidhisha";
        String password = "java123";

        if (username.equals("Bidhisha")) {
            System.out.println("Valid User");

            if (password.equals("java123")) {
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Please enter a valid password");
            }
        } else {
            System.out.println("Please enter a valid username");
        }
    }
}

