class factorial{
int  fact(int n)
{ if(n==1||n==0)
      return 1;
    else return fact(n--);}
    int main()
    {  int n;
        n=fact(5);
        System.out.println(n);}}