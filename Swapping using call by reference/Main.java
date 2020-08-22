#include <iostream>
using namespace std;

void swapi(int &x,int &y){
  int t;
  t=x;
  x=y;
  y=t;
}
int main()
{
   int a,b;
  scanf("%d%d",&a,&b);
  printf("Before swapping a= %d and b=%d\n",a,b);
  swapi(a,b);
  printf("After swapping a= %d and b=%d\n",a,b);
   return 0;
}