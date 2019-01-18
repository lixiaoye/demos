package design_pattern.structural_pattern.facade.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class Test {
    public static void main(String[] args) {
        MobilePhone nexus6 = new MobilePhone();
        //拍照
        nexus6.takePicture();
        //视频聊天
        nexus6.videoChat();
    }
    /**
     * 打开相机
     拍照
     -->视频聊天接通中
     打开相机
     打电话
     */
}
