package UdemyYT.Variables.objectPrograming;

public class AnonymousClass {
    public static void main(String[] args){
        OnClick click = new Button();
        click.action();
        OnClick click2 = new OnClick(){
            @Override
            public void action(){
                System.out.println("Anonymous class");
            }
        };
        click2.action();
    }
}

interface OnClick{
    void action();
}


class Button implements OnClick{
    @Override
    public void action(){
        System.out.println("Button");
    }
}

class Button2 implements OnClick{

    @Override
    public void action(){
        System.out.println("Button2");
    }
}
