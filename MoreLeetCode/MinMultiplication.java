public class MinMultiplication {
    public static int solution(int[] A) {
        int multiplications = 0;

        for (var i = 0; i < A.length; i++) {
            final var index = i;
            var value = A[i];

            if (index % 4 == 0 && value <= 0) { // For indices 0, 4, 8, ..., the element should be positive
                multiplications++;
            } else if (index % 4 == 2 && value >= 0) { // For indices 2, 6, 10, ..., the element should be negative
                if (value == 0) { // If the element is 0, return -1 as it cannot be made negative
                    return -1;
                }
                multiplications++;
            } else if (index % 2 == 1 && value != 0) { // For indices 1, 3, 5, ..., the element should be zero
                multiplications++;
            }
        }

        return multiplications;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 0, 3, 4, 5, 0, 6};
        int[] A2 = {7, 4, -3, 0, -5, 1, 0};
        int[] A3 = {-5, 0, 3, 0};

        System.out.println(solution(A1)); // Output: 3
        System.out.println(solution(A2)); // Output: -1
        System.out.println(solution(A3)); // Output: 2
    }
}

/*
You are given an array A of N integers. You can multiply any of its
elements by an arbitrary number. The task is to make the first element
of A positive, the second element equal to 0, the third element
negative, the fourth equal to 0, the fifth positive and so on. In other
words, the signs of consecutive elements should be [+, 0, -, 0, +, 0, -,
What is the minimum number of multiplications needed to create such
a sequence?
Write a function:
3
class solution ( public int solution(int[] A); )
that, given an array A, returns the minimum number of multiplications
needed to create the described sequence, or -1 if it is not possible.
Examples:
1. For A= [1, 0, 3, 4, 5, 0, 6], one of the optimal solutions is to multiply 3
by -2,4 by 0 and 6 by -1. After these changes, A will transform to [1, 0.
-6, 0, 5, 0, -6]. The signs of the consecutive elements will be [+, 0, -, 0,
+, 0, -], as required in the task statement. The function should return 3.
2. For A = [7, 4, -3, 0, -5, 1, 0], it is not possible to convert the last zero into a negative number. The function should return -1.
3. For A = [-5, 0, 3, 0), the function should return 2.
Assume that:
N is an integer within the range [1..100];
each element of array A is an integer within the range
[-20..20].
In your solution, focus on correctness. The performance of youl
solution will not be the focus of the assessment
*/
        
        

