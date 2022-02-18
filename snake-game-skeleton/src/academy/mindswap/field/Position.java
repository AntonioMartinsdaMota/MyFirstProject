package academy.mindswap.field;

public class Position {

    int col;
    int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {

        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Position)) return false;
        Position position = (Position) o;
        return col == position.col && row == position.row;
    }

    public int getRow() {
        return row;
    }
}
