public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        

        int m = nums1.length, n = nums2.length;
        int left = 0, right = m;

        while (left <= right) {
            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;
            //далее получаем граничные элементы
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1]; //Определите максимальное
            // значение раздела A_left как maxLeftA = nums1[partitionA - 1].
            // Если partitionA - 1 < 0, установите его как maxLeftA = float(-inf).
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : nums1[partitionA];//Определите минимальное
            // значение раздела A_right как minRightA = nums1[partitionA].
            // Если partitionA >= m, установите его как minRightA = float(inf).
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];//Определите максимальное
            // значение раздела B_left как maxLeftB = nums2[partitionB - 1].
            // Если partitionB - 1 < 0, установите его как maxLeftB = float(-inf).
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : nums2[partitionB];//Определите максимальное
            // значение раздела B_right как minRightB = nums2[partitionB].
            // Если partitionB >= n, задайте его как minRightB = float(inf)
            //следующий шаг это сранвение граничных элементов
            //меньшая половина состоит из двух секций A_left и B_left
            //и большая половина тоже состоит из двух секций A_right и B_right
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                //если данное условие верно, значит у нас есть массивы разделенные в правильном месте
                /*Нам просто нужно найти максимальное значение из меньшей половины
                как max(A[maxLeftA], B[maxLeftB])
                и минимальное значение из большей половины как min(A[minRightA], B[minRightB]).
                Значение медианы зависит от этих четырех граничных значений и общей длины входных массивов,
                и мы можем вычислить его в зависимости от ситуации.*/
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;//Если (m + n) % 2 = 0,
                    // то медианное значение представляет собой
                    // среднее значение максимального значения меньшей половины и минимального значения большей половины,
                    // заданное answer = (max(maxLeftA, maxLeftB) + min(minRightA, minRightB)) / 2.
                } else {
                    return Math.max(maxLeftA, maxLeftB);//В противном случае медианное значение
                    // - это максимальное значение меньшей половины, заданное answer = max(maxLeftA, maxLeftB).
                }
            } else if (maxLeftA > minRightB) {
                right = partitionA - 1;
                //Если maxLeftA > minRightB, то это означает,
                // что maxLeftA есть слишком велико,
                // чтобы быть в меньшей половине и мы должны искать меньшее значение разбиения A.
                //В противном случае это означает, что minRightA есть слишком мал,
                // чтобы быть в большей половине и мы должны искать большее значение раздела A.
            } else {
                left = partitionA + 1;
            }
        }
        return 0.0;
    }
}

