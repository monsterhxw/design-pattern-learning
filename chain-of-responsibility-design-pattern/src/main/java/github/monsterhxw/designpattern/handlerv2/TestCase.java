package github.monsterhxw.designpattern.handlerv2;


/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class TestCase {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
