package github.monsterhxw.designpattern.handlerv4;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerChain {

    private Handler head = null;

    private Handler tail = null;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
        } else {
            tail.setSuccessor(handler);
            tail = handler;
        }
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
