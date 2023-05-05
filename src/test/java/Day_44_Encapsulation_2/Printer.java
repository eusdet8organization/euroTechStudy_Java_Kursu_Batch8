package Day_44_Encapsulation_2;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    public Printer() {
    }

    public Printer(boolean duplex, int tonerLevel){
        if (tonerLevel>0 && tonerLevel<100){
            this.tonerLevel=tonerLevel;
        }else {
            this.tonerLevel=0;
        }

        this.duplex=duplex;
        this.pagePrinted=0;
    }

   public int tonerAdd(int tonerAmount, int tonerLevel){
       if (tonerAmount>-1 && tonerAmount<=100){
           //This kullanilarak condition yazilabilir.
           if (this.tonerLevel+tonerAmount>0 && this.tonerLevel+tonerAmount<100)
              return  this.tonerLevel=tonerLevel;
       }else {
         return  this.tonerLevel = -1;
       }
      return -1;
   }

   public int printPages(int pages){
        int pageToPrinted=pages;

        if (this.duplex){
            pageToPrinted=(pages/2)+(pages%2);
        }
        this.pagePrinted+=pageToPrinted;

        return pageToPrinted;

   }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
