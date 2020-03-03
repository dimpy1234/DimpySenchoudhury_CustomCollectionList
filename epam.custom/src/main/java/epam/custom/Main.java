package epam.custom;
public class Main
{
    public static void main(String[] args) 
    {
        App<Integer> list = new App<Integer>();
        
 
        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        
        System.out.println(list);
         
        //Remove elements from index
        list.remove(2);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
        
        //Print elements
        System.out.println(list.size());
        System.out.println(list.toString());
    }
}

