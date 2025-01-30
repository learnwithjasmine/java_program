class Adding {
    void add(int x, int y) {
        int sum = x + y;
        System.out.println("sum of two nums:" + sum);
    }

    void add(int x, int y, int k) {
        int sum = x + y + k;
        System.out.println("sum of three nums:" + sum);
    }
}
    class jas2 {
        public static void main(String[] args) {
            Adding obj = new Adding();
            obj.add(2, 3);
            obj.add(3, 4, 5);
        }
    }

