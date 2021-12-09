public class Main {
    int a,b;

    public Main(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Main(int a) {
        this.a = a;
    }

    public int dodawanie() {
        return a + b;
    }

    public int odejmowanie() {
        return a - b;
    }

    public int mnozenie() {
        return a * b;
    }

    public int dzielenie() {
        return a / b;
    }

    public double potegowanie(){
        return Math.pow(a,b);
    }

    public double pierwiastek(){
        return Math.sqrt(a);
    }
}