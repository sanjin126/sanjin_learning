package test;

/**
 * @author sanjin
 * @date 2022/2/4 上午1:40
 * @description
 */
public class Son extends Father{
    int fatherId = 2;

    public static void main(String[] args) {
        new Son().test();
    }

    public void test(){
        this.show();
    }

    @Override
    public void show() {
        System.out.println(fatherId);
    }
}
