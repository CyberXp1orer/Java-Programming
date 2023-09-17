package circleClassWithPrivateDataField;

public class testcircleClasswithPrivateDataField {
    public static void main(String[] args) {
        
    
        circleClassWithPrivateDataField myCircle = new circleClassWithPrivateDataField(5.0);
        System.out.println("The area of the circle of radius "+ myCircle.getRadius()+" is "+ myCircle.getArea());
    
        myCircle.setRadius(myCircle.getRadius() *1.1);
        System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+ myCircle.getArea());
    
        System.out.println("The number of object created is"+circleClassWithPrivateDataField.getNumberOfObject());
        
        
    
    }
}
