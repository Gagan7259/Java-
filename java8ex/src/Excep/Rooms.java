package Excep;
class notAvilabele extends Exception{
    public String toString(){
        return "Rooms not avilable right now ";
    }
}
public class Rooms {
    int avilablerooms=100;
    public void something(int notavilable) throws notAvilabele{
        if(avilablerooms>notavilable){
            System.out.println("U got only one room");
        }else{
            throw new notAvilabele();
        }
    }
    public static void main(String[] args) throws notAvilabele {
        Rooms r=new Rooms();
        r.something(30);
    }
}
