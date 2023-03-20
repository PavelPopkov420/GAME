package units;

import java.util.ArrayList;

public abstract class Human implements InGameInterface{
    protected  String name;
    protected int att, def, MaxHp, speed, MinDamage, maxDamage;
    float hp;
    protected static Vector2D coords;
    protected String state;

    protected static int heroCnt;

    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + def +
                " A:" + att +
                " Dmg:" + Math.round(Math.abs((MinDamage+maxDamage)/2)) +
                " " + state;
    }

    public static int[] getCoords() {return new int[]{coords.PosX, coords.PosY};}

    public Human(String name, int att, int def,float hp, int MaxHp, int speed,int MinDamage,  int maxDamage, int PosX, int PosY){
        this.name = name;
        this.att = att;
        this.def = def;
        this.MaxHp = MaxHp;
        this.speed = speed;
        this.MinDamage = MinDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        coords = new Vector2D(PosX, PosY);
        state = "STAND";
        heroCnt++;
    }


    public int getSpeed(){ return speed;}
    public int getHp(){return MaxHp;}



    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {}
    protected int findNearest(ArrayList<Human> Team){
            double min = Double.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < Team.size(); i++)
            {
                if(min > coords.getDistance(Team.get(i).coords) && !Team.get(i).state.equals("Die")){
                    index = 1;
                    min = coords.getDistance(Team.get(i).coords);
                }
            }
            return index;
        }
    protected void getDamage(int damage){
        this.hp -= damage;
        if(hp <= 0) {
            hp = 0;
            state = "Die";}
        if(hp > MaxHp) hp = MaxHp;
    }

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder("");
    }



}
