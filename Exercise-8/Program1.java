import java.util.*;

class List 
{
    ArrayList<String> alist;
    List() 
    {
        this.alist=new ArrayList<String>();
    }
    void appendList(String data) {
        alist.add(data);
    }
    void insert(String data, int pos) {
        alist.add(pos, data);
    }
    void searchIndex(String element) {
        System.out.println("Index : " + alist.indexOf(element));
    }

    void display() {
        System.out.println(alist);
    }

    void startsWithLetter(String c) {
        for (String s : alist) {
            if (s.startsWith(c)) {
                System.out.println(s);
            }
        }
    }

    void containSubstring(String substring) {
        for (String s : alist) {
            if (s.contains(substring))
                System.out.println(s);
        }
    }
    void sortList() {
        Collections.sort(alist);
    }

    void removeElement(String s) {
        alist.remove(s);
    }

    void replaceString(String string1, String string2) {
        for (String s : alist) {
            if (s.equals(string1)) {
                s=string2;
            }
        }
    }

    void removeDuplicate() {
        for (int i=0; i<alist.size();i++) {
            for (int j = i + 1; j < alist.size(); j++) {
                if (alist.get(i).equals(alist.get(j))) {
                    alist.remove(j);
                }
            }
        }
    }

}

class StringArrayListDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List object = new List();
        object.appendList("Ford");
        object.appendList("Chevrolet");
        object.appendList("MarutiSuzuki");
        object.appendList("Toyota");
        int choice = 0;
        System.out.println("1.Append - add at end\n2.Insert - add at particular index\n3.Search - Find the index of a particular element\n4.Display the list\n5.List all strings start with given letter\n6.List all strings contains the substring\n7.Sort the elements in ArrayList\n8.Remove a particular element\n9.Replace one string with another string in ArrayList\n10.Remove duplicate elements\n");

        while (choice != -1) {
            System.out.println("\nEnter the choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter string to add at end :");
                    object.appendList(scanner.next());
                    object.display();
                    break;
                case 2:
                    System.out.print("Enter string to insert :");
                    String s = scanner.next();
                    System.out.print("Enter the position :");
                    int pos = scanner.nextInt();
                    object.insert(s,pos);
                    object.display();
                    break;
                case 3:
                    System.out.print("Enter string to search :");
                    s = scanner.next();
                    object.searchIndex(s);
                    object.display();
                    break;

                case 4:
                    object.display();
                    break;

                case 5:
                    System.out.print("Enter starting letter of the strings :");
                    s = scanner.next();
                    object.startsWithLetter(s);
                    object.display();
                    break;

                case 6:
                    System.out.print("Enter substring :");
                    s = scanner.next();
                    object.containSubstring(s);
                    break;

                case 7:
                    object.sortList();
                    object.display();
                    break;

                case 8:
                    System.out.print("Enter string to remove :");
                    s = scanner.next();
                    object.removeElement(s);
                    object.display();
                    break;

                case 9:
                    System.out.print("Enter string that needs to be replaced :");
                    s = scanner.next();
                    System.out.print("Enter new string:");
                    String newstring = scanner.next();
                    object.replaceString(s, newstring);
                    object.display();
                    break;

                case 10:
                    object.removeDuplicate();
                    object.display();

            }
        }

    }

}