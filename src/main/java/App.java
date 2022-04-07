import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat firstCat = applicationContext.getBean("cat", Cat.class);
        Cat secondCat = applicationContext.getBean(Cat.class);

        System.out.println(bean.getMessage());

        System.out.println(bean==bean2);
        System.out.println(firstCat==secondCat);
    }
}