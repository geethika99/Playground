#include<stdio.h>

int main()
{
  //Type your code here
     char s[100],i,count=0;
    scanf("%[^\n]s",s);
    for(i=0;s[i]!='\0';i++)
    {
          if(s[i]==' ')
             count++;
    }
  printf("%d",count+1);
}