package bawei.com.homework;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements ResesPonseListener,SwipeRefreshLayout.OnRefreshListener{

    private List<Bean.ResultBean.ActSBean> list=new ArrayList<Bean.ResultBean.ActSBean>();

    private ListView lv;
    private SwipeRefreshLayout swResfreshLayout;
    private MyAdapter adapter;
    private String p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swResfreshLayout = (SwipeRefreshLayout) findViewById(R.id.swResfreshLayout);
        lv = (ListView) findViewById(R.id.lv);
        swResfreshLayout.setOnRefreshListener(this);

        adapter = new MyAdapter(this,list);

        lv.setAdapter(adapter);

        getData();
    }



    @Override
    public void onRefresh() {
        getData();
    }

    private void getData() {

        try {
            p = URLEncoder.encode("心花路放", "utf-8");

        } catch (Exception e) {
            e.printStackTrace();
        }
        String path="http://op.juhe.cn/onebox/movie/video?key=3f29f92ede26711948ddafb9f5c9dca7&q="+p;

        new MyAsyncTask(this).execute(path);

    }

    @Override
    public void success(String string) {
        swResfreshLayout.setRefreshing(false);
        Bean bean = JSON.parseObject(string, Bean.class);
        Bean.ResultBean result = bean.getResult();
        List<Bean.ResultBean.ActSBean> act_s = result.getAct_s();

        list.addAll(act_s);

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onFail() {
        swResfreshLayout.setRefreshing(false);
    }



}
