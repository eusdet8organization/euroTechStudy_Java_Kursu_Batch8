package Day_47_inheritance_01.Extends_Example;

public class FinalExam extends GradeActivity{
    private int questionNumber;
    private double pointQuestion;
    private int numberMiss;
   FinalExam(int questionNumber,int numberMiss){
        double numericScore;

        this.questionNumber=questionNumber;
        this.numberMiss=numberMiss;

        pointQuestion=100.0/questionNumber;
        numericScore=pointQuestion*(questionNumber-numberMiss);

        setScore(numericScore);//Burada bu set methodunun oldugu classi extends ettim ve
                               //ona deger atayip score degerini belirledik
    }

}
