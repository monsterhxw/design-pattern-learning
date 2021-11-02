package github.monsterhxw.designpattern.practice;

/**
 * @author huangxuewei
 * @date 2021/11/02
 */
public class SexyWordFilter implements SensitiveWordFilter {

    @Override
    public boolean doFilter(Content content) {
        System.out.println(this.getClass().getSimpleName() + " call doFilter()...");
        boolean legal = true;
        // ...
        return legal;
    }
}
