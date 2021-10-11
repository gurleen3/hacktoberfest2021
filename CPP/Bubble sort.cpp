#include<bits/stdc++.h>

using namespace std;
 
void BubbleSort (int arr[], int n)
{
   for (int i = 0; i < n - 1; ++i)
   { 
      bool swapped = false;
      for (int j = 0; j < n - i - 1; ++j)
      {
         if (arr[j] > arr[j+1]) //check if adjacent element is
                      //not in order
         {
            swap(arr[j], arr[j + 1]);
            swapped = true;
         }
      }
      // Value at n-i-1 will be maximum of all the values below this index.

      if(!swapped)
         break;
   } 
} 
 
int main()
{
    int n; 
    cin >> n;

   int arr[n] ;
   for(int i = 0; i < n; i++)
   cin >> arr[i];
 
   BubbleSort(arr, n);
  
   for ( int i = 0; i < n; i++)
        cout << arr[i] << " ";
 
   return 0;
}