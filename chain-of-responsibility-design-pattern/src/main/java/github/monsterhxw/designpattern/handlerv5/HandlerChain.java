package github.monsterhxw.designpattern.handlerv5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handler() {
        for (IHandler handler : handlers) {
            handler.handle();
        }
    }
}
