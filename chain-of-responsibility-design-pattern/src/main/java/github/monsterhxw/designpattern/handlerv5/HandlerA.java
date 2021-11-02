package github.monsterhxw.designpattern.handlerv5;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerA implements IHandler {

    @Override
    public void handle() {
        System.out.println(this.getClass().getSimpleName() + " call handle()....");
    }
}
