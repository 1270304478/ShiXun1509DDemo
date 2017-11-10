package taobao.bwie.com.shixun1509ddemo.model;

import okhttp3.Callback;
import taobao.bwie.com.shixun1509ddemo.okhttp.OkHttpUtils;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/11/8 20:51
 */
public class IHomeback implements IHomeModel{
    @Override
    public void data(Callback callback) {
        OkHttpUtils.getInstance().doGet("http://m.yunifang.com/yunifang/mobile/category/list?random=96333&encode=bf3386e14fe5bb0bcef234baebca2414",callback);
    }
}
