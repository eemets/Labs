public class Building {
    int floor;
    String address;
    int flat;
    float cost;

    public Building(){
        floor = flat = 0;
        cost = 0;
        address = "noname";
    }
    public Building(int floor, String address, int flat, float cost){
        this.floor = floor;
        this.address = address;
        this.flat = flat;
        this.cost = cost;
    }
    public int getFloor(){return floor;}
    public String getAddress(){return address;}
    public int getFlat(){return flat;}
    public float getCost(){return cost;}
    public void setFloor(int floor){this.floor=floor;}
    public void setAddress(String address){this.address=address;}
    public void setFlat(int flat){this.flat=flat;}
    public void setCost(float cost){this.cost=cost;}
}
