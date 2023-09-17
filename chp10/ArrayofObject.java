import circleClassWithPrivateDataField.circleClassWithPrivateDataField;

public class ArrayofObject {
    public static void main(String[] args) {
        circleClassWithPrivateDataField[] circleArray;
        
        
        circleArray = createCircleArray();
        printCircleArray(circleArray);

        
    }

    public static circleClassWithPrivateDataField[] createCircleArray(){
        circleClassWithPrivateDataField[] circleArray = new circleClassWithPrivateDataField[5];
        for(int i = 0; i < circleArray.length; i++){
            circleArray[i] = new circleClassWithPrivateDataField(Math.random()*10);
        }
        return circleArray;
    }
    public static void printCircleArray(circleClassWithPrivateDataField[] circleArray){
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for(int i = 0; i < circleArray.length; i ++){
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
    }
    
}
