package Day_61_Collections_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_LAMBDA {
    public static void main(String[] args) {
        List<String> ulkeler=new ArrayList<>(){{
            add("Germany");
            add("England");
            add("Finland");
            add("USA");
            add("Turkey");

        }};

        System.out.println("ulkeler.get(2).length() = " + ulkeler.get(2).length());
        //listenin get ile elementini index vererek aldim ve uzunluguna baktik

        Iterator asIteratorList=ulkeler.iterator();
        while (asIteratorList.hasNext()) {
            System.out.println("asIteratorList.next() = " + asIteratorList.next());

//            System.out.println("asIteratorList.next() = " + asIteratorList.next());
//            System.out.println("asIteratorList.next() = " + asIteratorList.next());
        }

    }


}
