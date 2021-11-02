package github.monsterhxw.designpattern.handlerv3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }
}
