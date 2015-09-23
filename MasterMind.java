/* Develop a program to mimic the master mind game
 step 1: create a class that is a set of unique objects(colors)
 step 2: Method of the class should implement a
 mathematical abstraction of a set and support the following operations
 (i) inquiring the number of unique elements in the set, (ii) check that the set is empty,
 (iii) add element to the set, (iv) check if a input object is in the set (v) clear the set*/

//main calls the class Objectset to creat an object called Objectset.

class ObjectSet{
    //declare set as a object variable that contains only unique objects. 

    Object [] set;
    int nadd = 0; //number elements added in the set is initialized to zero.
    
    
    //Objectset is a constructor

    ObjectSet(int maxcapacity){
        System.out.println("Inside the constructor in class ObjectSet:allocating " + maxcapacity);
        set = new Object[maxcapacity];
        //our array can contain maxcapacity elements.. as of now nothing is filled--it is just the dimension of
        //the array
    }
      
    public int size(){
        // if nadd is some positive number, then that is the size of the array
         return nadd;
    };

    
    public bool isEmpty(){
        // if nadd is 0, then the set is empty
    };
    public void add(Object){
        //everytime an object is created nadd is updated.   
    };
    
    public bool isPresent(Object){};
    
    public voic clear(){};    
}

public class Mastermind{
    public static void main (String[] args){
        //implement a set first
        //set of n elements as an array [unique element1, unique element2... unique element n]

        //Objectset of class Objectset is created below:
        ObjectSet myset = new ObjectSet(100);

        System.out.println("Size of myset is : " + myset.size());
        
        
    }
}
