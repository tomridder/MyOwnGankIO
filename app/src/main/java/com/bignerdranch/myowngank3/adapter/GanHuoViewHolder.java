package com.bignerdranch.myowngank3.adapter;

import android.text.format.DateFormat;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.myowngank3.R;
import com.bignerdranch.myowngank3.bean.GanHuo;
import com.bignerdranch.myowngank3.utils.DateUtil;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

public class GanHuoViewHolder extends BaseViewHolder<GanHuo.Result>
{
  private TextView tvTitle;
  private TextView tvType;
  private ImageView ivType;
  private TextView tvWho;
  private TextView tvTime;

  public GanHuoViewHolder(ViewGroup parent)
  {
      super(parent, R.layout.ganhuo_item);
      tvTitle=$(R.id.tv_title);
      tvType=$(R.id.tv_type);
      ivType=$(R.id.iv_type);
      tvWho=$(R.id.tv_who);
      tvTime=$(R.id.tv_time);
  }

    @Override
    public void setData(GanHuo.Result data) {
        super.setData(data);
        tvTitle.setText(data.getDesc());
        tvType.setText(data.getType());
        if (data.getType().equals("Android")){
            ivType.setImageResource(R.drawable.ic_android_white_18dp);
        }else if (data.getType().equals("iOS")){
           ivType.setImageResource(R.drawable.ic_phone_iphone_white);
        }else {
            ivType.setImageResource(R.drawable.ic_ondemand_video_white);
        }
        tvWho.setText(data.getWho());
        //tvTime.setText(DateUtil.getFormatTime(data.getPublishedAt()));
        tvTime.setText(data.getPublishedAt().substring(0,10));
    }
}
