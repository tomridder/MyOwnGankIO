package com.bignerdranch.myowngank3.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class ShareUtil
{
    public static void shareText(Context context,String text)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,text);
        context.startActivity(Intent.createChooser(intent,"分享干货"));
    }

    public static void shareImage(Context context, Uri uri)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("image/jpeg");
        intent.putExtra(Intent.EXTRA_STREAM,uri);
        context.startActivity(Intent.createChooser(intent,"分享妹纸"));
    }
}
