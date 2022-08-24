package org.example.designpatterns.creationaldesignpatterns.abstractfactorypattern.version1;

/**
 * @author : litong
 * @since : 8/24/22, Wed
 **/
public abstract class ICourseFactory {
    /**
     * 初始化
     */
    public void init() {
        System.out.println("初始化基础数据");
    }

    /**
     * 创建课程笔记
     *
     * @return 课程笔记
     */
    protected abstract INote createNote();

    /**
     * 创建课程视频
     *
     * @return 课程视频
     */
    protected abstract IVideo createVideo();
}
