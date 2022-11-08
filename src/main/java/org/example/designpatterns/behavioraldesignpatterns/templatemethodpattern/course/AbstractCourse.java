package org.example.designpatterns.behavioraldesignpatterns.templatemethodpattern.course;

/**
 * @author : litong
 * @since : 11/8/22, Tue
 **/
public abstract class AbstractCourse {

    public final void createCourse() {
        // 1. 发布预习资料
        postPreResource();

        // 2. 制作PPT
        createPPT();

        // 3. 直播授课
        liveVideo();

        // 4. 上传课后资料
        postResource();

        // 5. 布置作业
        postHomework();

        if (needCheckHomework()) {
            checkHomework();
        }
    }

    /**
     * 检查作业
     */
    protected abstract void checkHomework();

    protected void postHomework() {
        System.out.println("布置作业");
    }

    protected void postResource() {
        System.out.println("上传课后资料");
    }

    protected void liveVideo() {
        System.out.println("直播授课");
    }

    protected void createPPT() {
        System.out.println("制作PPT");
    }

    private void postPreResource() {
        System.out.println("上传预习资料");
    }

    protected boolean needCheckHomework() {
        return false;
    }
}
