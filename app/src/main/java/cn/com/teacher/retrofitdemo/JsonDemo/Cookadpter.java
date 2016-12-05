package cn.com.teacher.retrofitdemo.JsonDemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Collection;
import java.util.List;

import cn.com.teacher.retrofitdemo.JsonDemo.entity.Cook;
import cn.com.teacher.retrofitdemo.R;

/**
 * 作者：侯程月
 * 时间： 2016/12/5  13:38
 * 邮箱：437286343@qq.com
 */

public class Cookadpter extends BaseAdapter {
    private Context mContext;
    private List<Cook> mCooks;


    public Cookadpter(Context pContext, List<Cook> pCooks) {
        mContext = pContext;
        mCooks = pCooks;
    }

    @Override
    public int getCount() {
        return mCooks.isEmpty() ? 0 : mCooks.size();
    }

    @Override
    public Object getItem(int pI) {
        return mCooks.get(pI);
    }

    @Override
    public long getItemId(int pI) {
        return mCooks.get(pI).getId();
    }

    @Override
    public View getView(int pI, View pView, ViewGroup pViewGroup) {
        if (pView == null) {
            pView = LayoutInflater.from(mContext).inflate(R.layout.layout_item, null);
            pView.setTag(new ViewHolder(pView));
        }
       ViewHolder mViewHolder = (ViewHolder) pView.getTag();
        Cook lCook = mCooks.get(pI);
        mViewHolder.mTvTilte.setText(lCook.getName());
        mViewHolder.mTvDetel.setText(lCook.getDescription());
        Picasso.with(mContext).load("http://tnfs.tngou.net/img" + lCook.getImg()).into(mViewHolder.mIvLayoutItem);
        return pView;
    }

    public void addAll(Collection<? extends Cook> pCollection) {
        mCooks.addAll(pCollection);
        notifyDataSetChanged();
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView mIvLayoutItem;
        public TextView mTvTilte;
        public TextView mTvDetel;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.mIvLayoutItem = (ImageView) rootView.findViewById(R.id.iv_layout_item);
            this.mTvTilte = (TextView) rootView.findViewById(R.id.tv_tilte);
            this.mTvDetel = (TextView) rootView.findViewById(R.id.tv_detel);
        }

    }
}
