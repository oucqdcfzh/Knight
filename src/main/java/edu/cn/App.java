package edu.cn;

import edu.cn.impl.BraveKnight;
import edu.cn.impl.KnightConfig;
import edu.cn.impl.RescuePrincessQuest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context;
     //   context = new ClassPathXmlApplicationContext("applicationContext.xml");
       context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

    }
}
