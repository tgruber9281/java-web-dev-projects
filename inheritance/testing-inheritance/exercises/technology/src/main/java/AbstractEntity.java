public abstract class AbstractEntity {
    private static int nextObjectID = 0;
    private int objectID;
    
    public AbstractEntity(){
        objectID = nextObjectID;
        nextObjectID ++;
    }
    
    public int getObjectID() {
        return objectID;
    }
    
}
