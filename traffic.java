public class traffic {

    public enum TrafficLight {
        RED,
        YELLOW,
        GREEN
    }
    
    private TrafficLight currentColor;
    
    public traffic(TrafficLight startingColor) {
        this.currentColor = startingColor;
    }
    
    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = TrafficLight.GREEN;
                break;
            case GREEN:
                currentColor = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currentColor = TrafficLight.RED;
                break;
        }
    }
    
    @Override
    public String toString() {
        return "the color of the traffic light is: " + currentColor;
    }

    public TrafficLight getCurrentColor() {
        return currentColor;
    }
    
    public static void main(String[] args) {
        
        traffic myTrafficLight = new traffic(TrafficLight.RED);
        
        for (int i = 0; i < 11; i++) {
            System.out.println(myTrafficLight.toString());
            myTrafficLight.changeColor();
        }
    }
}