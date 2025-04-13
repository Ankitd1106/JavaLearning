package practicePrograms;

/*https://neetcode.io/problems/reverse-a-linked-list*/

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        Input: head = [0,1,2,3]`
//        Output: [3,2,1,0]

        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
//        System.out.println(list);

        LinkedList<Integer> newList = new LinkedList<>();

        for(int j=0;j<=list.size()-1;j++){
            for (int k = list.size()-1;k<=0;k--){
                newList.add(list.get(k));
            }

        }

        System.out.println(newList);

    }
}
