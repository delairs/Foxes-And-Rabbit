public class Field {
    private Object[][] field;

    public Field(int depth, int width) {
        field = new Object[depth][width];
    }

    public int getDepth() {
        return field.length;
    }

    public int getWidth() {
        return field[0].length;
    }

    public void place(Object object, Location location) {
        field[location.getRow()][location.getCol()] = object;
    }

    public Object getObjectAt(Location location) {
        return field[location.getRow()][location.getCol()];
    }

    public void clear() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = null;
            }
        }
    }
}
