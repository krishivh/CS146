package HW11;

public class HW11 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image.length == 0 || image[0].length == 0) {
            return image;
        }
        
        //base case if the original color and the new color is the same then just return the image
        if(image[sr][sc] == color){
            return image;
        }
        //use the helper function to fill the 2d array
        fill(image, sr, sc, image[sr][sc], color);
        //finally return the 2d array after the recursion is complete
        return image;
}
    //helper parameter to fill each pixel
    public void fill(int[][] image, int sr, int sc, int oldColor, int color){
        //base case to see if all of the parameters are valid or if it doesn't fit the correct characteristics for filling the neighboring pixel
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] !=oldColor){
            //returns out if it doesn't fit the characteristics
            return;
        }
        //change the pixel to the new color
        image[sr][sc] = color;
        //all 4 ways it fill do the fill
        fill(image, sr-1, sc, oldColor, color);
        fill(image, sr+1, sc, oldColor, color);
        fill(image, sr, sc-1, oldColor, color);
        fill(image, sr, sc+1, oldColor, color);

    }

    public static void main(String[] args){
        /* 
        HW11 hw11 = new HW11();

        int[][] image1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sr1 = 0, sc1 = 0, color1 = 1;

        hw11.floodFill(image1, sr1, sc1, color1);
        for (int i = 0; i < image1.length; i++) {
            for (int j = 0; j < image1[i].length; j++) {
                System.out.print(image1[i][j] + " ");
            }
            System.out.println();
    }
    */
}
}
