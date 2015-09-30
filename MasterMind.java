/* Develop a program to mimic the master mind game
 step 1: create a class that is a set of unique objects(coloreMarbles)
 step 2: Method of the class should implement a
 mathematical abstraction of a set and support the following operations
 (i) inquiring the number of unique colored in the set, (ii) check that the set is empty,
 (iii) add element to the set, (iv) check if a input object is in the set (v) clear the set*/

public class MasterMind{


    static void status(ColorBoxClass color_box) {
        System.out.println("Size of the color box is : " + color_box.size());
        System.out.println("Is  empty? " + color_box.isEmpty());
        System.out.println("Is RED there? " + color_box.isPresent(ColoredMarbleEnum.RED));
        System.out.println("Is GREEN there? " + color_box.isPresent(ColoredMarbleEnum.GREEN));
    }
    
    public static void main (String[] args){
 
        // color_box of class ColorBoxClass is created below:
        ColorBoxClass color_box = new ColorBoxClass();
        
        status(color_box);

        System.out.println("Adding color RED");
        color_box.add(ColoredMarbleEnum.RED);

        status(color_box);
        
        System.out.println("Adding color RED");
        color_box.add(ColoredMarbleEnum.RED);

        status(color_box);

        System.out.println("Adding color GREEN");
        color_box.add(ColoredMarbleEnum.GREEN);

        status(color_box);

        System.out.println("Clearing the set");
        color_box.clear();

        status(color_box);
    }
}


/// The class representing a colored marble.
enum ColoredMarbleEnum {
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE
};


/// The class contains a set of marbles of unique colors.
class ColorBoxClass{
    // maximum 8 marbles will fit here, but as only unique marbles are stored,
    // and there are only 6 different colors, 8 is enough.
    ColoredMarbleEnum[] box = new ColoredMarbleEnum[8];
    int nMarbles = 0; // number of marbles in the box is initially 0

    /// @Returns the number of unique marbles in the box
    public int size(){
         return nMarbles;
    };

    public boolean isEmpty(){
        // if nMarbles is 0, then the box is empty
        return (nMarbles==0);
    };

    //for the add method we are passing an argument: a reference to a marble object that is a member of ColoredMarbleEnum
    public void add(ColoredMarbleEnum marble){
        // we accept only unique colored marbles.
        if (isPresent(marble)) return;
        // every time a marble is added, nMarbles is updated.
        box[nMarbles]=marble;
        nMarbles++;
    };

    // check whether a marble of this color is present in the box
    public boolean isPresent(ColoredMarbleEnum marble) {
        for (int i=0; i<nMarbles; ++i) {
            if (box[i]==marble) return true;
        }
        return false;
    };

    // Empty the box
    public void clear() {
        nMarbles=0;
    }
}

