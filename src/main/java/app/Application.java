package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            Timer bean2 = applicationContext.getBean(Timer.class);
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class, bean2);

            bean.whatAnimalSay();
            //bean2.getTime();
        }
    }

}
