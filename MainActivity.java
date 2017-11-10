package taobao.bwie.com.shixun1509ddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import taobao.bwie.com.shixun1509ddemo.adpter.Myadpter;
import taobao.bwie.com.shixun1509ddemo.bean.User;
import taobao.bwie.com.shixun1509ddemo.presenter.MyPresenter;
import taobao.bwie.com.shixun1509ddemo.view.IHomeView;

public class MainActivity extends AppCompatActivity implements IHomeView{
    RecyclerView rv;
    MyPresenter pp;
    Myadpter myadpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv= (RecyclerView) findViewById(R.id.rv);
        initData();
        pp=new MyPresenter(this,this);
        pp.getData();
    }
    private void initData() {

        //线性管理器
        LinearLayoutManager managre=new LinearLayoutManager(this);
        rv.setLayoutManager(managre);
//
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));


    }

    @Override
    public void showView(final  User user) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadpter=new Myadpter(MainActivity.this,user);
                rv.setAdapter(myadpter);
            }
        });


    }
}
