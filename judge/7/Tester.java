public class Tester {
    public static void main(String[] args) {
        System.out.println("=== TASK 1 ===");
        SimpleArrayList list = new SimpleArrayList();
        System.out.println(list.get(0));
        
        System.out.println("=== TASK 2 ===");
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(12);
        System.out.println(list.get(2));
        
        System.out.println("=== TASK 3 ===");
        System.out.println(list.get(5));
        
        System.out.println("=== TASK 4 ===");
        System.out.println(list.set(2, 100));
        
        System.out.println("=== TASK 5 ===");
        System.out.println(list.get(2));
        
        System.out.println("=== TASK 6 ===");
        System.out.println(list.set(5, 100));
        
        System.out.println("=== TASK 7 ===");
        System.out.println(list.remove(2));
        
        System.out.println("=== TASK 8 ===");
        System.out.println(list.get(2));
        
        System.out.println("=== TASK 9 ===");
        System.out.println(list.remove(2));
        
        System.out.println("=== TASK 10 ===");
        System.out.println(list.get(2));
        
        System.out.println("=== TASK 11 ===");
        System.out.println(list.get(3));
        
        System.out.println("=== TASK 12 ===");
        list.clear();
        System.out.println(list.get(0));
        
        System.out.println("=== TASK 13 ===");
        SimpleArrayList list2 = new SimpleArrayList(5);
        System.out.println(list2.get(3));
        
        System.out.println("=== TASK 14 ===");
        System.out.println(list2.get(9));
        
        System.out.println("=== TASK 15 ===");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.set(i, i));
        }
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list.retainAll(list2));
        
        System.out.println("=== TASK 16 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("=== TASK 17 ===");
        System.out.println(list2.remove(0));
        System.out.println(list2.remove(2));
        System.out.println(list.retainAll(list2));
        
        System.out.println("=== TASK 18 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("=== TASK 19 ===");
        System.out.println(list.set(1, null));
        System.out.println(list.remove(1));
        
        System.out.println("=== TASK 20 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("=== TASK 21 ===");
        System.out.println(list.set(1, 123));
        
        System.out.println("=== TASK 22 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("=== TASK 23 ===");
        System.out.println(list.remove(1));
        
        System.out.println("=== TASK 24 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("=== TASK 25 ===");
        list.add(null);
        System.out.println(list.remove(2));
        
        System.out.println("=== TASK 26 ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
