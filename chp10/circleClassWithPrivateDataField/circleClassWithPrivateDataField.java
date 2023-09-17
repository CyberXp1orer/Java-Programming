package circleClassWithPrivateDataField;

public class circleClassWithPrivateDataField {
    private double radius = 1;
    private static int numberOfObject = 0;

    public circleClassWithPrivateDataField(){
        numberOfObject++;
    }
    public circleClassWithPrivateDataField(double radius){
        this.radius = radius;
        numberOfObject++;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newradius) {
        radius = (newradius >= 0)? newradius : 0;
        
    }
    public static void setNumberOfObject(int numberOfObject) {
        circleClassWithPrivateDataField.numberOfObject = numberOfObject;
    }
    
    
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public static int getNumberOfObject() {
        return numberOfObject;
    }
}
