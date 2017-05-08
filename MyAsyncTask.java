package bawei.com.homework;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by huanhuan on 2017/4/26.
 */

public class MyAsyncTask extends AsyncTask <Object,Void,String>{
    Handler handler;
    private InputStream is;
    private String s;

    private ResesPonseListener resesPonseListener;
    public MyAsyncTask(ResesPonseListener resesPonseListener){
        this.resesPonseListener =resesPonseListener;
    }
    @Override
    protected String doInBackground(Object... params) {
        String path= (String) params[0];
        try {
            URL url=new URL(path);
           HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(50000);
            conn.setReadTimeout(50000);
            conn.setDoInput(true);
            if (conn.getResponseCode()==200){
                is = conn.getInputStream();
                s = StreamInputStream.readInputStream(is);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (is!=null){
                    is.close();
                    is=null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return s;
    }

    @Override
    protected void onPostExecute(String s) {

        super.onPostExecute(s);
        if (resesPonseListener!=null){
            if (TextUtils.isEmpty(s)){
                resesPonseListener.onFail();
            }else {
                resesPonseListener.success(s);
            }
        }else {
            resesPonseListener.onFail();
        }

    }
}
