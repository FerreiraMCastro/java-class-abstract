package model2;

public class Main {
    public static void main(String[] args){
        Drone drone = new Drone("DJI MAVIC", 15);

        drone.decolar(500);
        drone.decolar(500);
        drone.pousar();

        drone.decolar(500);
        drone.pousar();

        drone.decolar(500);
        drone.pousar();

        drone.carregar();
    }
}
