#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b;
  scanf("%d",&n);
  a=n%10;
  b=n/100;
  printf("%d",a+b);
  
  return 0;
}