public class testBooks {
    public static void main(String[] args) {

        Books Books1 = new Books("John Doe", "Java Programming", 50000, 123);
        Books Books2 = new Books("Jane Smith", "Python Basics", 40000, 456);
        Books Books3 = new Books("David Brown", "C++ Fundamentals", 60000, 789);

        int totalHarga = Books1.getHarga() + Books2.getHarga() + Books3.getHarga();

        System.out.println("Total harga semua Books yang dibeli: Rp." + totalHarga);
    }
}

