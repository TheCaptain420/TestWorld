public class Klasserogobjekter {
    public static void main(String[] args) {
        LægToSammen ToTal = new LægToSammen();
        System.out.println(ToTal.LiggerToSammen(10,25));
    }
}

class LægToSammen{
    public int LiggerToSammen(int i, int k){
        return i+k;
    }
}
