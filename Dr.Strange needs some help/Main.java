#include <stdio.h>
int powerr(int m,int n){
  int x=1;
  for(int i=0;i<n;i++){
    x=x*m;
  }
  return x;
}
int main()
{
  int m,n,req;
  scanf("%d%d%d",&m,&n,&req);
  if(powerr(m,n)>=req){
    printf("Doctor, you can proceed with your experiment.");
  }
  else{
    printf("Sorry Doctor! You need more bacteria.");
  }
  return 0;
}