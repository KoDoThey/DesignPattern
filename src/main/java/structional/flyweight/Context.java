package structional.flyweight;

/**
 * Extrinsic State
 */

public class Context {
    private String id;
    private int star;

    public Context(String id, int star){
        this.id = id;
        this.star = star;
    }

    public String getId(){
        return id;
    }

    public int getStar(){
        return star;
    }
}
