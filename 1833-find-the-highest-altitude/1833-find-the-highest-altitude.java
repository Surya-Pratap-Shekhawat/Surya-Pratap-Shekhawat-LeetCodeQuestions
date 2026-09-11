class Solution {
    public int largestAltitude(int[] gain) {
    //     int[] arr = new int[gain.length + 1];
    //     arr[0] = 0;
    //     for(int i = 1 ; i <= gain.length ; i++){
    //         arr[i] = arr[i-1] + gain[i-1];
    //     }
    //     int max = Integer.MIN_VALUE;
    //     for(int ele : arr){
    //         if(ele>max){
    //             max = ele;
    //         }
    //     }
    //     return max;
    // }





    //SOLUTION WHILE REVISING
    // int alt = 0;
    // int[] alts = new int[gain.length +1];
    // alts[0] = 0;
    // int max = 0;
    // for(int i = 1 ; i <= gain.length ; i++){
    //     alt += gain[i-1];
    //     alts[i] = alt;
    //     if(alts[i] > max){
    //         max = alts[i];
    //     }
    // }
    // return max;








    //Revising second time
    // int alt=0;
    // int highest=0;
    // for(int i = 0 ; i < gain.length ; i++){
    //     alt+= gain[i];
    //     if(alt > highest){
    //         highest = alt;
    //     }
    // }
    // return highest;




    //Revising third time
    int len = gain.length;
    int[] arr = new int[len+1];
    int max = 0;

    for(int i = 1 ; i < arr.length ; i++){
        arr[i] = arr[i-1]+gain[i-1];
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
    
}}