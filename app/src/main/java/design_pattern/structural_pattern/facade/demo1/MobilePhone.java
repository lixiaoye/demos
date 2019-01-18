package design_pattern.structural_pattern.facade.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new SamsungCamera();

    public void dail() {
        mPhone.dail();
    }

    public void videoChat() {
        System.out.println("-->视频聊天接通中");
        mCamera.open();
        mPhone.dail();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }
}
