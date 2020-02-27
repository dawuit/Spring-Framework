import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * ClassName: MyPostProcessBeanFacotry
 * Function:  TODO
 * Date:      2019/12/19 21:48
 * author     14746
 * version    V1.0
 */
public class MyPostProcessBeanFacotry implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory");
    }
}
