package ie.atu.oop.week7;

public class Workshop{
    private String workshopName;
    private int capacity;
    private boolean studentID;

    public Workshop(String workshopName, int capacity, boolean studentID){
        this.workshopName;
        this.capacity;
        this.studentID;
    }

    public String getWorkshopName(){
        return workshopName;
    }

    public String getCapacity(){
        return capacity;
    }

    public int getWorkshopName(){
        return studentID;
    }

    if (Workshop == null || Workshop.isBlank()){
        throw new IllegalArgumentException("Workshop is null or empty");
    }

    if (capacity < 1){
        throw new IllegalArgumentException("Count cannot be less than 1");
    }

}
