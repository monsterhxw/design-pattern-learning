package github.monsterhxw.designpattern.handlerv4;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerA extends Handler {

    @Override
    protected void doHandle() {
        System.out.println(this.getClass().getSimpleName() + " call doHandle()....");
    }
}
