package taobao.bwie.com.shixun1509ddemo.presenter;

import android.content.Context;
import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import taobao.bwie.com.shixun1509ddemo.bean.User;
import taobao.bwie.com.shixun1509ddemo.model.IHomeback;
import taobao.bwie.com.shixun1509ddemo.view.IHomeView;
/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/11/8 20:53
 */
public class MyPresenter {
    IHomeView hv;
    IHomeback hb;
    private Context context;

    public MyPresenter(Context context, IHomeView hv) {
        this.context = context;
        this.hv = hv;
        hb = new IHomeback();
    }
    public void getData(){
        hb.data(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                User user=new Gson().fromJson(response.body().string(),User.class);
                hv.showView(user);
            }
        });
    }
}
