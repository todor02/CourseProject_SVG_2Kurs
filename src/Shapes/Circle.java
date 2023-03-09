package Shapes;

public class Circle implements Shape{

    //Vse oshte mislq kak da napravq neshtata i s koe da pochana, i s kakvo da si napravq parsera(Json?, XML?).
    //Zaradi tova nqma golqm progres.
    private int cx;
    private int cy;
    private int r;

    public Circle() {

    }

    public Circle(int cx, int cy, int r) {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "cx=" + cx +
                ", cy=" + cy +
                ", r=" + r +
                '}';
    }
}
