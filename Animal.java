import java.util.List;

public abstract class Animal {
    protected Field field;
    protected Location location;
    protected boolean alive;

    public Animal(Field field, Location location) {
        this.field = field;
        this.location = location;
        alive = true;
        field.place(this, location);
    }

    public abstract void act(List<Animal> newAnimals);

    public boolean isAlive() {
        return alive;
    }

    public void setDead() {
        alive = false;
        field.place(null, location);
    }

    public Location getLocation() {
        return location;
    }
}
