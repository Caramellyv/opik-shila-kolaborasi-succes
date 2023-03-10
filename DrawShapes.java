import java.awt.*;
import java.applet.*;
public class DrawShapes extends Applet{
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    public void init(){
        //The Font is Arial size, 18 and is italicized
        font = new Font("Arial", Font.ITALIC,18);
        
        //Some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //Colors can be created using Red, Green, Blue values
        blueColor = new Color(0,0,122);
        
        //Set the background Color of the applet
        setBackground(backgroundColor);
    }
    public void stop(){       
    }
    public void paint(Graphics graph){
        //Set font
        graph.setFont(font);
        //Create a title
        graph.drawString("Draw Shapes", 90, 20);
        
        //Set the color for the first shape
        graph.setColor(blueColor);
        
        //Draw a rectangle using drawRect(int x, int y, int width, int height
        graph.drawRect(120, 120, 120, 120);
        
        //This will fill a rectangle
        graph.fillRect(115, 115, 90, 90);
        
        // Set the color for the next shape
        graph.setColor(redColor);
        
        //Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        //Set color for next shape
        graph.setColor(Color.CYAN);
        
        //Draw another rectangle
        graph.drawRect(50, 50, 50, 50);
        
        //This will fill a rectangle
        graph.fillRect(50, 50, 60, 60);
    }
     static class A{
        void callthis(){
            System.out.println("Inside Class A's Method!");
        }
    }
    static class B extends A {
        void callthis(){
            System.out.println("Inside Class B's Method!");
        }
    }
    static class C extends A{
        void callthis(){
            System.out.println("Inside Class C's Method!");
        }
    }
        public static class Animal {
        public void makeNoise() {
            System.out.println("talk");
            
        }
    }
    public static class Dog extends Animal {
        public void makeNoise() {
            System.out.println("Bark");
        }
    }
        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
            A ref;
            
            ref =b;
            ref.callthis();
            
            ref =c;
            ref.callthis();
            
            ref =a;
            ref.callthis();
             Animal animal = new Animal();
    animal.makeNoise();
    Dog dog = new Dog();
    dog.makeNoise();
    Animal animaldog = new Dog();
    animaldog.makeNoise();
    
    if (animal instanceof Animal)
        System.out.println("animal is Animal");
    if (dog instanceof Animal)
        System.out.println("dog is Animal");
    if (animaldog instanceof Animal)
        System.out.println("animaldog is Animal");
    if (animal instanceof Dog)
        System.out.println("animal is Dog");
              
        }
}    

   