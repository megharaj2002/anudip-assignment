class Addition {

    int add(int a, int b) {     
        int c = a + b;          
        return c;              
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        int result = obj.add(10, 20); 
        System.out.println("Sum = " + result);
    }
}
