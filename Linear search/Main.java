#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,ele;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
     scanf("%d",&a[i]);
 scanf("%d",&ele);
 for(i=0;i<n;i++)
 {
          if(a[i]==ele)
          {
              printf("%d",i+1);
              return 0;
          }
 }
  printf("%d isn't present in the array.",ele);
  return 0;
}