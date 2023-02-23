package units;

public abstract  class infantry extends Human{


    int hits, maxHits;

    public infantry(String name, int att, int def, int hp, int hits, int maxHits) {
        super(name, att, def, hp);
        this.hits = hits;
        this.maxHits = maxHits;
    }
}

