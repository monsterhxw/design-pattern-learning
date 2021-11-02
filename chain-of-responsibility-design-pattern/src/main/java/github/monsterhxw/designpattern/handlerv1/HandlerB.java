package github.monsterhxw.designpattern.handlerv1;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerB extends Handler {

    @Override
    public void handle() {
        boolean handled = false;
        // ...
        if (!handled && successor != null) {
            System.out.println("Handler B handle.............");
            successor.handle();
        }
    }
}
