package github.monsterhxw.designpattern.handlerv4;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public final void handle() {
        System.out.println(this.getClass().getSimpleName() + " call handle()....");
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }

    protected abstract void doHandle();
}
