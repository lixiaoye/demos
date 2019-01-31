package lxy.android.com.mvpdemo.after;


/**
 * Created by LIXIAOYE on 2019/1/24.
 */

public class MVPPresenter {
    private MVPView view;
    private MVPModal modal;

    public MVPPresenter(MVPView view) {
        this.view = view;
        modal = new MVPModal(new Callback() {
            @Override
            public void onResult(String msg) {
                MVPPresenter.this.view.updateTextView(msg);
            }
        });
    }

    public void request() {
        modal.request();
    }

    public void detachView() {
        view = null;
        modal.removeTask();
    }
}
