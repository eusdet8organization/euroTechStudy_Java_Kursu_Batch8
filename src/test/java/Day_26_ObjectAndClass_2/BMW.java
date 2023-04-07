package Day_26_ObjectAndClass_2;

public class BMW {
    String marka="BMW"; //her yerde bu markanin ifade ettigi class ismi de bu markayi tanimladigi  icin
                       //deger atadik
    String model;
    double price;

    boolean aracElektrikliMi;

    public void showPrice(){
        //if else ile tanimlayabilirdik. Eger model X1 ise veya X2, X3...
      /*  if (model=="x1"){
        }else if(model==""){
        }else
        {

        }
       */
        //Burada DEFAULT deger oldugunda switch case okumuyor ve hata veriyor, FAKAT If-Else ile
        // calistigimizda boolean expression yani sarti yazdigimiz yerde DEFAULT degeri ile kiyas yapiyor
         //Switch case de default degeri hic okumuyor direkt hata veriyor.
        switch (model){
            case "330i": price=55000; break;
            case "740i": price=75000; break;
            case "x1": price=43000; break;
            case "x2": price=48000; break;
            case "x3": price=51000; break;
            case "x5": price=53000; break;
            default:
                System.out.println(model+" is not available");
                price=0.00;
        }
        System.out.println("This model`s price is "+price);


    }


}
