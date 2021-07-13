import android.content.Context;

public class SizeUtils {

    //根据手机分辨率从dp转成为px
    public static int dip2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    //根据手机分辨率从px转成为dp
    public static int px2dip(Context context,float pxValue){
        //获取当前手机的像素密度
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5f); //四舍五入取整
    }

}
