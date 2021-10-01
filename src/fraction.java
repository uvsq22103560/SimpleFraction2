public class fraction {
    private int numerateur;
    private int denomirateur;

     fraction(int num, int denom) {
        this.numerateur = num;
        this.denomirateur = denom;
    }

    public String toString() {
        String str = this.numerateur + " et " + this.denomirateur;
        return str;
     }

}

