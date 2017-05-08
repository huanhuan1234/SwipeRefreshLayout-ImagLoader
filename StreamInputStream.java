package bawei.com.homework;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by huanhuan on 2017/4/26.
 */

public class StreamInputStream {
    public static String readInputStream(InputStream is){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer=new byte[1024];
        int len=0;
        try {
            while ((len=is.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            bos.close();
            is.close();
            return bos.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
