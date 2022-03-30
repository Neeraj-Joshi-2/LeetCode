class Search2dMatrix {
public boolean searchMatrix(int[][] matrix, int target) {
	
	int row_num = matrix.length;
	int col_num = matrix[0].length;
	
	int begin = 0, end = row_num * col_num - 1;
	
	while(begin <= end){
		int mid = (begin + end) / 2;
		int mid_value = matrix[mid/col_num][mid%col_num];
		
		if( mid_value == target){
			return true;
		
		}else if(mid_value < target){
			begin = mid+1;
		}else{
			end = mid-1;
		}
	}

	return false;
}
}


// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = matrix.length ;
//         int column = matrix[0].length ;
        
//         int n = 0 ;
//         while(n<row){
//             if(target <= matrix[n][column-1]){
//                 break ;
//             }
//             else{
//                 n+=1 ;
//             }
//         }
//         for(int i=0 ; i<column ; i++){
//             if(n<row && matrix[n][i]==target){
//                 return true ;
//             }
//         }
        
//         return false ;
//     }
// }
