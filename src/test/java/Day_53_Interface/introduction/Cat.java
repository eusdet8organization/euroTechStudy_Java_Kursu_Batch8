package Day_53_Interface.introduction;

import Day_53_Interface.introduction.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cat implements Animal {//implements keyword ile interface class , normal class tarafindan inherit edildi
                                     //Interface classi, normal CAT class i tarafindan uygulandi
                                   //interface kurallar cercevesini ifade eder.
                                   //implement eden class bu kurallari uygular
    @Override
    public String food() {
        return "Sut icer";
    }

    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
    }
}
