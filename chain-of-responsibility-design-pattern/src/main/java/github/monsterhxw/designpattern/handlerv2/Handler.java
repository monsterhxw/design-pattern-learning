package github.monsterhxw.designpattern.handlerv2;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        System.out.println("current handler is: " + this.getClass().getSimpleName());
        if (successor != null && !handled) {
            System.out.println(this.getClass().getSimpleName() + " handle........");
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
