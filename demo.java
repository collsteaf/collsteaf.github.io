// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class vehicle
{
String name = "SUV "; 
String runs ()
{ 
    return "generic speed";
}

}
class car extends vehicle
{
String name = "Convertible"; 
String runs ()
{
return" faster speed";
} 
}
class maintenance
{
public static void main(String[] args)
{
new maintenance().go();
}
void go()
{ 
    vehicle v = new car(); 
    System.out.println(v.name+v.runs());
}
}
