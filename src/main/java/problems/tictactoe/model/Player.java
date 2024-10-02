package problems.tictactoe.model;

public class Player{
    private int id;

    private String name;

    private Piece piece;

    //constructor
    public Player(int id, String name, Piece piece){
        this.id = id;
        this.name = name;
        this.piece = piece;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
