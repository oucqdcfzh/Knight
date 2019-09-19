package edu.cn.impl;

import edu.cn.Quest;
import org.springframework.stereotype.Component;

/**
 * @program Knight
 * @description:
 * @author:
 * @create:2019-09-19 08:52:18
 **/
@Component
public class RescuePrincessQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Rescue a princess");
    }
}
