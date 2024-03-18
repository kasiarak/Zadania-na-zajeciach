public class PPJAnalizaExercise {
    public static void main(String[] args) {


        Messenger chats[] = new Messenger[]{
                new Messenger('M'),
                new PjatkMessenger(),
                new GovermentMessenger('E'),
                new PresidentsMessenger('k')
        };

        String []secrets = new String[]{
                "","C","I",""
        };

        for (int i=0;i< chats.length;i++){
            System.out.println(chats[i].sendMessage(secrets[i]));
        }


    }

}

class Messenger{
    char val;

    public Messenger(char val) {
        this.val = val;
    }

    public String sendMessage(String message){
        return this.val+message;
    }

}

class GovermentMessenger extends Messenger{
    public GovermentMessenger(char val) {
        super(val);
    }

    @Override
    public String sendMessage(String message) {
        return "<gov>"+super.sendMessage(message)+"</gov>";
    }
}

class PresidentsMessenger extends GovermentMessenger{
    public PresidentsMessenger(char val) {
        super(val);
        System.out.println("Prez");
    }
}

class PjatkMessenger extends Messenger{
    public PjatkMessenger(char val) {
        super(val);
    }

    public PjatkMessenger(){
        super('A');
    }

    @Override
    public String sendMessage(String message) {
        return "<PJATK>" + super.sendMessage(message);
    }
}
