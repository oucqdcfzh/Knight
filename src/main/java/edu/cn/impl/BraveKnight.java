package edu.cn.impl;

import edu.cn.Knight;
import edu.cn.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program Knight
 * @description:
 * @author:
 * @create:2019-09-19 08:53:06
 **/
@Component
public class BraveKnight implements Knight {
    @Autowired
    private Quest quest;

    @Override
    public void embarkOnQuest() {
        this.quest.embark();
    }
}
