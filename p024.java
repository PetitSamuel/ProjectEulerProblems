
public class p024 {

	public static void main(String[] args) {
		char [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int maxIndex = numbers[9];
	}

}
/*
 Find the largest index k in the list or array such that a[k] < a[k+1]. 
 If such an index cannot be found, the array cannot be permuted lexicographically. 
 This step simply asks to find the largest value for k where the value at k within the array is less than the next value in the array. Obviously, 
 by iterating backwards through the array, one can easily find such an index value k.
 
 
Find the largest index i in the array such that a[k]<a[i]. Obviously, such a value must exist if a[k]<a[k+1]. Since we performed the previous step, we can also state that i>k or i>=k+1. This step asks for the index of the largest value in the array after a[k].
Swap a[k] and a[i] (this is easily doable using pointers in c++)
Reverse all the values in array from k+1 to the end.
Repeats steps 1-5 until the nth permutations is reached
 */
//nPr = n! / (n - r)! 
//7P3 = 7! / (7 - 3)! = 7! / 4! = (7)(6)(5) = 210
//10p10