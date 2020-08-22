#include<iostream>
using namespace std;
bool perfect_number(int x){
  int sum=0;
  for(int i=1;i*i<=x;i++){
    if(x%i==0){
      if(i*i==x){
        sum+=i;
      }
      else{
        sum+=i;
        sum+=x/i;
      }
    }
  }
  if(sum-x==x){
    return true;
  }
  else{
    return false;
  }
}
int main()
{
  int n;
  cin>>n;
  if(perfect_number(n)==true){
    cout<<"Yes"<<endl;
  }
  else{
    cout<<"No"<<endl;
  }
}