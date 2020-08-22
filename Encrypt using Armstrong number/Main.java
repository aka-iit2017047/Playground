#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}

int arm(int n)
{
  int t=n;
  int q=n;
    int count=0;
    while(n>0){
       count++;
       n=n/10;
    }
  
     int w=0;
     int y=0;
     while(t>0){
          y=t%10;
          w=w+(power(y,count));
          t=t/10;
      }
     if(q==w){
       return 1;
     }
  else{
    return 0;
  }
}

int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}