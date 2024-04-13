package PPJ;

public class PPJAnalizaExerciseDuo {


    public static void main(String[] args) {


        Detective detectives[] = new Detective[]{
                new InternDetective("boot"),
                new Detective("fingerprint"),
                new TalentedDetective("fingerprint"),
                new InterButIsRelatedToSherlockHolmes("email")
        };

        for(Detective d:detectives){
            d.detect("fingerprint");
        }
    }}



class Detective{
    String evidence;

    public Detective(String evidence) {
        this.evidence = evidence;
    }

    void detect(String suspiciousItem){
        System.out.println(suspiciousItem.equals(this.evidence)?"BUSTED":"NO LEADS");
    }

}

class TalentedDetective extends Detective{
    public TalentedDetective(String evidence) {
        super(evidence+"*");
    }

    @Override
    void detect(String suspiciousItem) {
        super.detect(suspiciousItem+"!");
    }
}

class InternDetective extends Detective{
    public InternDetective(String evidence) {
        super(evidence+"?");
    }

    @Override
    void detect(String suspiciousItem) {
        System.out.println("I have no idea :(");
    }
}

class InterButIsRelatedToSherlockHolmes extends TalentedDetective{
    public InterButIsRelatedToSherlockHolmes(String evidence) {
        super(evidence+"$");
    }

    @Override
    void detect(String suspiciousItem) {
        super.detect(suspiciousItem);
    }
}
