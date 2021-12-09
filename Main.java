public class Main {
    double a,b;

    public Main(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Main(double a) {
        this.a = a;
    }

    public double dodawanie() {

        return a + b;
    }

    public double odejmowanie() {

        return a - b;
    }

    public double mnozenie() {

        return a * b;
    }

    public Number dzielenie() {
        if(b==0 || a==0){
           return null;
        }
        else{
            return a/b;
        }
    }

    public double potegowanie(){

        return Math.pow(a,b);
    }

    public double pierwiastek(){

        return Math.sqrt(a);
    }
}
