static void main(String[] args)
{
    println("Enter the first num")
    def a=System.in.newReader().readLine() as Integer
    println("Enter the second number")
    def b=System.in.newReader().readLine() as Integer

    println("answer: "+func(a,b))
}

static def func(Integer x, Integer y)
{
    return x+y;
}
