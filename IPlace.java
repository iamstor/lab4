public abstract class IPlace {

    String name;
    Double x;
    Double y;

    public Double getX() {
        return x;

    }

    public Double getY() {

        return y;
    }


    IPlace() {
    }

    public IPlace(String name) {
        this.name = name;

    }

    public IPlace(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }
}

