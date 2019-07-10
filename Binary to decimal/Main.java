#include<stdio.h>
int main()
{
  //Type your code here
  int n,i=1,rem,dec=0;
  scanf("%d",&n);
  while(n!=0)
  {
        rem=n%10;
        dec+=rem*i;
        n=n/10;i=i*2;
  }
  printf("%d",dec);
  return 0;
}