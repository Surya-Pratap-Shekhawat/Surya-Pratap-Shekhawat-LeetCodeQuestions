class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // for(int i = 0 ; i < image.length ; i++){
        //     for(int j = 0 ; j < (image[i].length+1)/2 ; j++){
        //         int temp = image[i][j];
        //         image[i][j] = image[i][image[i].length - 1 - j];
        //         image[i][image[i].length - 1 - j] = temp;
        //         if(j == image[i].length -1-j){
        //             if(image[i][j] == 0){
        //                 image[i][j] = 1;
        //             }
        //             else{
        //                 image[i][j] = 0;
        //             }
        //         }
        //         else{
        //             if(image[i][j] == 0){
        //                 image[i][j] = 1;
        //             }
        //             else if(image[i][j] == 1){
        //                 image[i][j] = 0;
        //             }
        //             if(image[i][image[i].length -1-j] == 0){
        //                 image[i][image[i].length -1-j] =1;
        //             }
        //             else if(image[i][image[i].length -1-j] == 1){
        //                 image[i][image[i].length -1-j] = 0;
        //             }
        //         }
        //     }
        // }
        // return image;











        //2nd time revision
        // for(int i = 0 ; i < image.length ; i++){
        //     for(int j = 0 ; j < (image[i].length)/2 ; j++){
        //         int temp = image[i][j];
        //         image[i][j] = image[i][image[i].length -1 - j];
        //         image[i][image[i].length -1 - j] = temp;
        //     }
        //     for(int j = 0 ; j < image[i].length; j++){
        //         if(image[i][j] == 0){
        //             image[i][j] = 1;
        //         }
        //         else{
        //             image[i][j] = 0;
        //         }
        //     }
        // }
        // return image;

        //3rd time revision

        for(int i = 0 ; i < image.length ; i++){
            int start = 0 ;
            int end = image[i].length-1;
            while(start <= end){
                if(start == end){
                    image[i][start] ^= 1;
                }
                else if(image[i][start] == image[i][end]){
                    image[i][start] ^= 1;
                    image[i][end] ^= 1;
                }
                start++;
                end--;
            }
        }
        return image;
    }
}