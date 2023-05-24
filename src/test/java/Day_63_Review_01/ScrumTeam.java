package Day_63_Review_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScrumTeam {
    public ProductOwner PO;//Burada Product Owner classinin objesini tanimladik
    public BusinessAnalayst BA;
    public ScrumMaster SM;
    public Tester SDET;

    public ScrumTeam(ProductOwner PO, BusinessAnalayst BA, ScrumMaster SM, Tester SDET) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.SDET = SDET;
    }

    List<Tester> testers=new ArrayList<>();// Burada tester objesi alacak dinamik bir liste create ettik

    List<Developers> developers=new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[] tester1){//Burada bir tester listesini ifade ediyor--> tester1
        testers.addAll(Arrays.asList(tester1));
        //Ayni method ismi ile overloading olmaksi yanininda bir liste eklemesi yaptik
    }

    public void addDeveloper(Developers developer){
        developers.add(developer);
    }

    public void addDeveloper(Developers[] developer1){
        developers.addAll(Arrays.asList(developer1));

    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", SDET=" + SDET +
                ", testers=" + testers +
                ", developers=" + developers +
                '}';
    }
}
