import java.util.List;
import java.util.ArrayList;

public class Simulator {
    private Field field;
    private SimulatorView view;
    private List<Animal> animals;

    public Simulator(int width, int height) {
        field = new Field(width, height);
        view = new SimulatorView(field);
        animals = new ArrayList<>();
        populate();
    }

    public void simulate(int steps) {
        for (int step = 0; step < steps; step++) {
            List<Animal> newAnimals = new ArrayList<>();
            for (Animal animal : animals) {
                animal.act(newAnimals);
            }
            animals.addAll(newAnimals);
            view.showStatus(step, field);
        }
    }

    private void populate() {
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                if (Randomizer.getRandom().nextDouble() <= 0.08) {
                    Fox fox = new Fox(field, new Location(row, col));
                    animals.add(fox);
                } else if (Randomizer.getRandom().nextDouble() <= 0.2) {
                    Rabbit rabbit = new Rabbit(field, new Location(row, col));
                    animals.add(rabbit);
                }
            }
        }
    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator(50, 50);
        simulator.simulate(100);
    }
}
