public class SimulatorView {
    private Field field;

    public SimulatorView(Field field) {
        this.field = field;
    }

    public void showStatus(int step, Field field) {
        System.out.println("Step: " + step);
        for (int row = 0; row < field.getDepth(); row++) {
            for (int col = 0; col < field.getWidth(); col++) {
                Object obj = field.getObjectAt(new Location(row, col));
                if (obj instanceof Rabbit) {
                    System.out.print("R ");
                } else if (obj instanceof Fox) {
                    System.out.print("F ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
