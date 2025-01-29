package RegularPolygon;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon(5,5);

        polygon1.setR(7);
        System.out.println(polygon1.getArea());

    }
}
