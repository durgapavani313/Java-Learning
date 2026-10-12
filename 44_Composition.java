class Room {
    void display() {

        System.out.println("This is a Room");
    }
}
class House {
    private Room room;

    House() {
        room = new Room();
    }
    void display() {
        room.display();
        
        System.out.println("This is a House");
    }
}
class Main {
    public static void main(String[] args) {
        House h = new House();
        h.display();
    }
}