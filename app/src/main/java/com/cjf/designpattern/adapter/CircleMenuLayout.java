package com.cjf.designpattern.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjf.designpattern.R;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class CircleMenuLayout extends ViewGroup {
    //圆形直径
    private int mRadius;
    //该容器内child item的默认尺寸
    private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1 / 4f;
    //内边距，无视padding
    private static final float RADIO_PADDING_LAYOUT = 1 / 12f;

    private float mPadding;
    //布局开始角度
    private double mStartAngle = 0;
    //菜单项文本
    private String[] mItemTexts;
    //菜单图标
    private int[] mItemImgs;
    //菜单个数
    private int mMenuItemCount;
    //菜单布局资源id
    private int mMenuItemLayout = R.layout.circle_menu_item;
    //MenuItem的点击事件接口
    private OnItemClickListener mOnItemClickListener;

    private Context context;


    public CircleMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        //无视padding
        this.context = context;
        setPadding(0, 0, 0, 0);
    }


    public void setMenuItemIconsAndTexts(int[] images, String[] texts) {
        if (images == null && texts == null) {
            throw new IllegalArgumentException("菜单项文本和图片至少设置其一");
        }
        mItemImgs = images;
        mItemTexts = texts;

        //初始化菜单项个数
        mMenuItemCount = images == null ? texts.length : images.length;
        if (images != null && texts != null) {
            mMenuItemCount = Math.min(images.length, texts.length);
        }
        //构建菜单项
        buildMenuItems();

    }

    private void buildMenuItems() {
        for (int i = 0; i < mMenuItemCount; i++) {
            View itemView = inflateMenuView(i);
            initMenuItem(itemView, i);
            addView(itemView);

        }
    }

    private void initMenuItem(View itemView, final int i) {
        ImageView iv = (ImageView) itemView.findViewById(R.id.item_iv);
        TextView tv = (TextView) itemView.findViewById(R.id.item_tv);

        iv.setVisibility(VISIBLE);
        iv.setImageResource(mItemImgs[i]);

        tv.setVisibility(VISIBLE);
        tv.setText(mItemTexts[i]);
    }

    public void setMenuItemLayout(int menuItemLayout) {
        mMenuItemLayout = menuItemLayout;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    private View inflateMenuView(final int i) {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View itemView = mInflater.inflate(mMenuItemLayout, this, false);
        itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onClick(view, i);
                }
            }
        });
        return itemView;
    }

    /*//设置适配器
    public void setAdapter(ListAdapter mAdapter) {
        this.mAdapter = mAdapter;
    }

    */

    /**
     * 构建菜单
     *//*
    private void buildMenuItems() {
        for (int i = 0; i < mAdapter.getCount(); i++) {
            final View itemView = mAdapter.getView(i, null, this);
            final int position = i;
            itemView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    // mOnItemClickListener.onItemClick();
                }
            });


            addView(itemView);
        }

    }*/
  /*  @Override
    protected void onAttachedToWindow() {
        if (mAdapter != null) {
            buildMenuItems();
        }
        super.onAttachedToWindow();
    }*/
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //测量自身尺寸
        measureMyself(widthMeasureSpec, heightMeasureSpec);
        //测量菜单项尺寸
        measureChildViews();
    }

    private void measureChildViews() {
        mRadius = Math.max(getMeasuredWidth(), getMeasuredHeight());

        final int count = getChildCount();

        int childSize = (int) (mRadius * RADIO_DEFAULT_CHILD_DIMENSION);

        int childMode = MeasureSpec.EXACTLY;

        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            if (child.getVisibility() == GONE) {
                continue;
            }
            int makeMeasureSpec = -1;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(childSize, childMode);
            child.measure(makeMeasureSpec, makeMeasureSpec);
        }
        mPadding = RADIO_PADDING_LAYOUT * mRadius;

    }

    private void measureMyself(int widthMeasureSpec, int heightMeasureSpec) {
        int resWidth = 0;
        int resHeight = 0;
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);

        int height = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        if (widthMode != MeasureSpec.EXACTLY || heightMode != MeasureSpec.EXACTLY) {
            resWidth = getSuggestedMinimumWidth();


            resHeight = getSuggestedMinimumHeight();
            resWidth=resWidth==0?getDefaultWidth():resWidth;

            resHeight=resHeight==0?getDefaultWidth():resHeight;

        } else {
            resHeight = resWidth = Math.min(width, height);
        }
        Log.i("resWidth", "resWidth=" + resWidth + ",resHeight=" + resHeight);
        setMeasuredDimension(resWidth, resHeight);

    }

    private int getDefaultWidth() {
        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        DisplayMetrics mMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(mMetrics);
        return mMetrics.widthPixels;


    }

    @Override
    protected void onLayout(boolean b, int l, int i1, int i2, int i3) {

        final int childCount = getChildCount();
        Log.i("onLayout", "--->" + childCount);
        int left, top;

        int itemWidth = (int) (mRadius * RADIO_DEFAULT_CHILD_DIMENSION);

        float angleDelay = 360 / childCount;
        //遍历菜单项，设置位置
        for (int i = 0; i < childCount; i++) {
            final View child = getChildAt(i);
            if (child.getVisibility() == GONE) {
                continue;
            }
            //开始角度
            mStartAngle %= 360;
            //中心点到菜单的距离
            float distanceFormCenter = mRadius / 2f - itemWidth / 2 - mPadding;
            left = mRadius / 2 + (int) Math.round(distanceFormCenter * Math.cos(Math.toRadians(mStartAngle)) - 1 / 2f * itemWidth);

            top = mRadius / 2 + (int) Math.round(distanceFormCenter * Math.sin(Math.toRadians(mStartAngle)) - 1 / 2f * itemWidth);
            child.layout(left, top, left + itemWidth, top + itemWidth);

            mStartAngle += angleDelay;
        }
    }
}
