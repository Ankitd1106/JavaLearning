package javaConcepts;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 13, 15, 17, 22, 28, 29, 33, 34, 35, 42, 45, 47, 58, 65, 67, 80, 82,
                84, 89, 94, 99, 100, 106, 113, 115, 122, 126, 132, 140, 151, 154, 159, 160, 172, 175, 177, 184, 186, 189, 196, 199, 204, 211, 213, 222, 234, 236,
                245, 249, 257, 259, 263, 270, 271, 272, 273, 286, 289, 295, 302, 304, 307, 312, 313, 315, 321, 324, 328, 329, 337, 350, 353, 359, 365, 376, 380, 387,
                396, 410, 413, 417, 428, 430, 437, 440, 451, 456, 457, 463, 474, 475, 479, 487, 493, 496, 502, 514, 519, 522, 526, 536, 542, 550, 551, 556, 563, 564,
                570, 577, 578, 585, 589, 593, 598, 599, 602, 615, 617, 623, 629, 633, 634, 643, 646, 650, 657, 658, 663, 664, 672, 674, 677, 681, 689, 692, 697, 699,
                702, 703, 705, 711, 712, 714, 717, 718, 721, 724, 727, 732, 735, 736, 739, 743, 744, 745, 746, 750, 753, 763, 767, 768, 772, 779, 785, 791, 794, 800,
                804, 812, 818, 824, 836, 840, 843, 845, 853, 856, 861, 863, 868, 873, 877, 880, 884, 888, 891, 892,
                893, 894, 901, 902, 908, 912, 920, 926, 928, 930, 932, 933, 936, 937, 940, 944, 946, 948, 951, 954, 956, 960, 963, 970, 973, 980, 982, 983, 986, 988, 990, 9978, 9982, 9999
        };
        int target = 951;

//        System.out.println(arr.length); //224

//        int resultls = linerSearch(arr, target);
//        if (resultls != -1) {
//            System.out.println("with liner search element found at index : " + resultls);
//        } else {
//            System.out.println("with liner search element not found");
//        }

        System.out.println("\n");

        int resultbs = binarySearch(arr, target);
        if (resultbs != -1) {
            System.out.println("with binary search element found at index : " + resultbs);
        } else {
            System.out.println("with binary search element not found");
        }

        System.out.println("\n");

//        int resultbsrecursion = binarySearchUsingRecursion(arr,target,0,arr.length-1);
//        if (resultbsrecursion != -1) {
//            System.out.println("with binary search element found at index : " + resultbsrecursion);
//        } else {
//            System.out.println("with binary search element not found");
//        }

    }

    public static int binarySearchUsingRecursion(int[] arr, int target, int left, int right) {
//        int steps = 0;
        while(left<=right){
//            steps++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
//                System.out.println("Step in binary search using recurssion= " + steps);
                return mid;
            } else if (arr[mid] < target) {
                return binarySearchUsingRecursion(arr, target, mid+1, right);
            } else {
                return binarySearchUsingRecursion(arr, target, left, right-1);
            }

        }
        return -1;
    }

    public static int linerSearch(int[] arr, int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Step in liner search = " + steps);
                return i;
            }
        }
        System.out.println("Step in liner search = " + steps);
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Step in binary search = " + steps);
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Step in binary search = " + steps);
        return -1;
    }
}
