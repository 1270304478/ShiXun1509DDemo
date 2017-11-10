package taobao.bwie.com.shixun1509ddemo.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import taobao.bwie.com.shixun1509ddemo.R;
import taobao.bwie.com.shixun1509ddemo.bean.User;

/**
 * 此类的作用：
 *
 * @author: forever
 * @date: 2017/11/8 20:58
 */
public class Myadpter extends RecyclerView.Adapter<Myadpter.MyViewHolder>{
    Context context;
    User user;
    public Myadpter(Context context, User user) {
        this.context = context;
        this.user = user;
    }
    @Override
    public Myadpter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.item,null);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Myadpter.MyViewHolder holder, int position) {
        holder.tv.setText(user.getData().getGoodsBrief().get(position).getGoods_name());


    }

    @Override
    public int getItemCount() {
        return user.getData().getGoodsBrief().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
          TextView tv;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
