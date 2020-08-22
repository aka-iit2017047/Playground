#include <stdio.h>
int gcd(int a,int b){
  if(b==0){
    return a;
  }
  else{
     return gcd(b,a%b);
  }
}
int main()
{
   int a,b,c,t;
   scanf("%d%d%d%d",&a,&b,&c,&t);
   int y=gcd(a,b);
   int x=gcd(c,y);
   if(x==t){
     printf("Answer is correct.");
   }
  else{
    printf("Answer is wrong.");
  }
   return 0;
}