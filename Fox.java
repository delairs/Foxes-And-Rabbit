import java.util.List;

public class Fox extends Animal {
    public Fox(Field field, Location location) {
        super(field, location);
    }

    @Override
    public void act(List<Animal> newAnimals) {
        // Add behavior: hunt rabbits, reproduce, etc.
    }
}
