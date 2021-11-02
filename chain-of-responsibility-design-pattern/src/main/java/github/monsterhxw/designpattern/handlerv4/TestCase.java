package github.monsterhxw.designpattern.handlerv4;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class TestCase {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }
}
