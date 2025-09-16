public class InterfaceImplementationByUsingAnonymous
{
    public static void main(String[] args)
    {
        PrinterDemo pd=new PrinterDemo();
        pd.getPrinter().print();
    }   
}
@FunctionalInterface
interface Printer
{
    public abstract void print();

}
class PrinterDemo
{
    public Printer getPrinter()
    {
        return new Printer()
        {
    
        public void print()
        {
        System.out.println("Hello from Printer implemented using Anonymous Inner Class!");
        }
        };
    }
}
