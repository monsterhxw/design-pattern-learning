package github.monsterhxw.designpattern.handlerv3;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerA implements IHandler {

    @Override
    public boolean handle() {
        boolean handled = false;
        // ...
        System.out.println(this.getClass().getSimpleName() + " call handle.");
        return handled;
    }
}
