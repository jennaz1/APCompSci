/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int[]arr={5,7,9,2,8,3,8,1};
        for(int i = 1; i<arr.length;i+=2){
            System.out.print(arr[i]);
        }
        int dupeCheck = 8;
        for(int i=0;i<arr.length-1; i++){
            if (Math.abs(arr[i] - arr[i+1])==3){
                System.out.println(i);
                
            }
        }
	}
}