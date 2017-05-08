package bawei.com.homework;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by huanhuan on 2017/4/26.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    List<Bean.ResultBean.ActSBean> list;
    private ImageView imageView;
    private TextView tv_title;
    private TextView tv_act;

    public MyAdapter(Context context, List<Bean.ResultBean.ActSBean> list) {
        this.context=context;
        this.list=list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        VH vh=null;
        if (convertView==null){
            vh=new VH();
            convertView=View.inflate(context,R.layout.lv_item,null);
            vh.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            vh.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
//            vh.tv_act = (TextView) convertView.findViewById(R.id.tv_act);
            convertView.setTag(vh);
        }else {
            vh= (VH) convertView.getTag();
        }

        String cover = list.get(position).getImage();
        ImageLoader.getInstance().displayImage(cover, vh.imageView , ImageLoadUtils_circle.MyDisplayImageOptions());
        vh.tv_title.setText(list.get(position).getName());


        return convertView;
    }
    class VH{
        ImageView imageView;
        TextView tv_title;
//        TextView tv_act;

    }
}
