package github.monsterhxw.designpattern.handlerv1;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}
