#include <stdio.h>
int main() {
	//Type your code
   int n,count=0;
  scanf("%d",&n);
  int temp=n;
  int a=temp%10;
  while(n>0)
  {
      count+=1;
       n=n/10;
  }
  while(count>1)
  {
       temp=temp/10;
      count--;
    
  }
  printf("%d",a+temp);
	return 0;                                            
}