import config.SpringConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import service.DogService;


/**
 * ClassName: Main
 * Function:  TODO
 * Date:      2019/12/15 19:17
 * author     14746
 * version    V1.0
 */
public class Main {

	public static void beanFactory(){
//		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));
//		DogService dog = bf.getBean(DogService.class);
//		dog.say("hello");
//		return;
	}

	public static void application(){
		AnnotationConfigApplicationContext bf = new AnnotationConfigApplicationContext(SpringConfig.class);
		DogService dog = bf.getBean(DogService.class);
		System.out.println("`````````");
		dog.say("123");
		System.out.println("`````````");
		bf.close();
		return ;
	}

    public static void main(String[] args) {
        application();
    }
}
