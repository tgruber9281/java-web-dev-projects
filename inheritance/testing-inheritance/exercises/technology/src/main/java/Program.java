public class Program {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell",false,32, 10);
        Laptop hP = new Laptop("HP", true,16, 5,false,16,true,"Bucket of Lard");
        Smartphone samsung = new Smartphone("Samsung", true,8,30,"Tardis",8,false,true);
        
        System.out.println(dell.getObjectID());
        System.out.println(hP.getObjectID());
        System.out.println(samsung.getObjectID());
    }
}
