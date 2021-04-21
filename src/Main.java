import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Persion> list = new ArrayList<Persion>();
    public static void main(String[] args) {
        Persion persion1 = new Persion(01,"Sáng","29");
        Persion persion2 = new Persion(02,"Sáng","21");
        Persion persion3 = new Persion(03,"Sáng","23");
        Persion persion4 = new Persion(04,"Sáng","24");
        Persion persion5 = new Persion(05,"Sáng","25");
        Persion persion6 = new Persion(06,"Sáng","27");
        Persion persion7 = new Persion(07,"Sáng","22");
        Persion persion8 = new Persion(8,"Sáng","26");
        list.add(persion1);
        list.add(persion2);
        list.add(persion3);
        list.add(persion4);
        list.add(persion5);
        list.add(persion6);
        list.add(persion7);
        list.add(persion8);
//        binarySearch(list);
        searchID();
        System.out.println("_______________Sắp xếp theo comparable_______________________");
        Collections.sort(list);
        for (Persion p:list
             ) {
            System.out.println(p.toString());
        }
        System.out.println("__________________sắp xếp sử dụng Comparator_________________");
        Collections.sort(list,new MyComparatorForAge());
        for (Persion p:list
             ) {
            System.out.println(p.toString());
        }
    }
//Tìm kiếm:
    public static void searchID(){
        int search = binarySearch(list,0,7,02);
        if (search == -1){
            System.out.println("dữ liệu bạn tìm không có trong danh sách!");
        }else {
            System.out.println(search);
        }
    }

//Xây dựng không sử dụng đệ quy
//    public static int binarySearch(ArrayList<Persion> list){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập id của bạn có: ");
//        int id = scanner.nextInt();
//        int low = 0;
//        int high = list.size()-1;
//        while (high >= low ){
//            int mid = (low+high) / 2;
//            if (id > list.get(mid).getId()){
//                low = mid + 1;
//
//            }else
//                if (id<list.get(mid).getId()){
//                    high = mid - 1;
//
//                }else {
//                    return mid;
//                }
//        }return -1;
//
//    }
//    sử dụng đệ quy
    public static int binarySearch(ArrayList<Persion>list,int low, int high,int key){
        if (high >= low){
            int mid = (high+low)/2;
            if (key >list.get(mid).getId() ){
                return binarySearch(list,mid+1,high,key);
            }else
                if (key <list.get(mid).getId()){
                   return binarySearch(list,low,mid-1,key);
                }else {
                    return mid;
                }
        }return -1;
    }
}
