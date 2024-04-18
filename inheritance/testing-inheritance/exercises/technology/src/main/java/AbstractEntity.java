public abstract class AbstractEntity {
    private int nextObjectID = 0;
    private int objectID;
    
    public AbstractEntity(){
        objectID = nextObjectID;
        nextObjectID ++;
    }
    
    public int getObjectID() {
        return objectID;
    }
}
