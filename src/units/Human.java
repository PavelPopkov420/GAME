package units;

import java.util.ArrayList;

public abstract class Human implements InGameInterface{
    protected  String name;
    protected int att, def, MaxHp, speed, MinDamage, maxDamage;
    float hp;
    protected  Vector2D coords;
    protected String state;

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
    }

    protected Human() {

    }

    public int getSpeed(){ return this.speed;}
    public int getHp(){return  this.MaxHp;}



    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {}
    protected int findNearest(ArrayList<Human> Team){
            double min = 100;
            int index = 0;
            for (int i = 0; i < Team.size(); i++)
            {
                if(min > coords.getDistance(Team.get(i).coords)){
                    index = 1;
                    min = coords.getDistance(Team.get(i).coords);
                }
            }
            return index;
        }
    protected void getDamage(float damage){
        this.hp -= damage;
        if(hp <= 0) {
            hp = 0;
            state = "Die";}
        if(hp > MaxHp) hp = MaxHp;
    }


    @Override
    public String getInfo() {
        return "null";
    }
}
