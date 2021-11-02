package github.monsterhxw.designpattern.handlerv1;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerChain {

    private Handler head = null;

    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
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
