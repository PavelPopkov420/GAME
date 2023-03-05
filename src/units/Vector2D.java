package units;

public class Vector2D {
    protected int PosX,PosY;

    public Vector2D(int PosX, int PosY) {
        this.PosX = PosX;
        this.PosY = PosY;
    }
    protected double getDistance(Vector2D opponent){

        return Math.sqrt(Math.pow(PosX - opponent.PosX, 2) +  Math.pow(PosY - opponent.PosY,2));
    }
}
