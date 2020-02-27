package service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import service.DogService;

/**
 * ClassName: DogServiceImpl
 * Function:  TODO
 * Date:      2020/2/21 13:56
 * author     14746
 * version    V1.0
 */
@Service
public class DogServiceImpl implements DogService {

    public void say(String str){
        System.out.println(str);
    }
}
