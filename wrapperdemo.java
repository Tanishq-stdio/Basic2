class Wrapperdemo

{
    public static void main(String Arr[])
    {
        int No1 =11;
        Integer No2 =11;

        System.out.println(No1);
        System.out.println(No2);

        int x = No2;                //unboxing 
        System.out.println(x);

        Integer y = No1;            //boxing
        System.out.println(y);
    }
}