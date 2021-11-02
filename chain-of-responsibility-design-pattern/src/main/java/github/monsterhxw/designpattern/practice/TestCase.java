package github.monsterhxw.designpattern.practice;

/**
 * @author huangxuewei
 * @date 2021/11/03
 */
public class TestCase {

    public static void main(String[] args) {
        SensitiveWordFilterChain chain = new SensitiveWordFilterChain();
        chain.addFilter(new AdsWordFilter());
        chain.addFilter(new SexyWordFilter());
        chain.addFilter(new PoliticalWordFilter());

        boolean legal = chain.filter(new Content());
        if (legal) {
            // 发表
            System.out.println("发表");
        } else {
            // 不发表
            System.out.println("不发表");
        }
    }
}
