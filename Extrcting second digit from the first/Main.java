#include <stdio.h>
int main() {
	//Type your code
  int n,count=0,rem;
  scanf("%d",&n);
  int temp=n;
  while(n>0)
  {
       count+=1;
        n=n/10;
  }
  while(count>2)
  {
               temp=temp/10;
               count--;
  }
  rem=temp%10;
  printf("%d",rem);
	return 0;
}