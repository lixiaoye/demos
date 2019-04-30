package com.example.eventdispatchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private MyListView listView;
    private Object data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = findViewById(R.id.lv);
        MyAdapter myAdapter = new MyAdapter(getData());
        listView.setAdapter(myAdapter);
    }

    public ArrayList getData() {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 60; i++) {
            list.add("百年孤独 " + i);
        }
        return list;
    }

    private class MyAdapter extends BaseAdapter {
        private ArrayList list = new ArrayList();

        public MyAdapter(ArrayList data) {
            list.addAll(data);
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
            ViewHolder viewHolder;
            //判断是否有缓存
            if (convertView == null) {
                //通过LayoutInflater实例化布局
                viewHolder = new ViewHolder();
                convertView = getLayoutInflater().inflate(R.layout.layout_item, parent, false);
                viewHolder.tvTitle = convertView.findViewById(R.id.tv_title);
//                viewHolder.ivIcon=convertView.findViewById(R.id.iv_icon);
//                viewHolder.tvContent=convertView.findViewById(R.id.tv_content);
                convertView.setTag(viewHolder);

            } else {
                //通过tag找到缓存的布局
                viewHolder = (ViewHolder) convertView.getTag();
            }
            viewHolder.tvTitle.setText(String.valueOf(list.get(position)));
            viewHolder.tvTitle.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    Toast.makeText(SecondActivity.this,"item的onTouch被调用了",Toast.LENGTH_SHORT).show();

                    return true;
                }
            });

            return convertView;
        }
    }

    private static class ViewHolder {
        private MyTextView tvTitle, tvContent;
        private ImageView ivIcon;

    }
    /**
     * ----
     04-21 00:51:08.271 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_DOWN
     04-21 00:51:08.272 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_DOWN
     04-21 00:51:08.272 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_DOWN
     04-21 00:51:08.272 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_DOWN

     04-21 00:51:08.299 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.299 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 00:51:08.299 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.299 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_MOVE

     04-21 00:51:08.349 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.350 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 00:51:08.350 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.350 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_MOVE

     04-21 00:51:08.366 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.366 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 00:51:08.366 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.366 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_MOVE

     04-21 00:51:08.371 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.371 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE

     04-21 00:51:08.372 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_CANCEL
     04-21 00:51:08.372 19817-19817/com.example.eventdispatchdemo E/MyTextView: MyTextView onTouchEvent() ACTION_CANCEL

     04-21 00:51:08.384 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 00:51:08.384 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     ...
     04-21 00:51:08.562 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_UP
     04-21 00:51:08.562 19817-19817/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_UP
     */

    /**
     * 04-21 01:19:26.109 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_DOWN
     04-21 01:19:26.110 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_DOWN
     04-21 01:19:26.111 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_DOWN
     04-21 01:19:26.111 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_DOWN
     04-21 01:19:26.111 28910-28910/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_DOWN
     04-21 01:19:26.171 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.171 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.171 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.171 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.171 28910-28910/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.194 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.194 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.194 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.194 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.195 28910-28910/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.221 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.222 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.222 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.222 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.222 28910-28910/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.238 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.238 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onInterceptTouchEvent() ACTION_MOVE
     04-21 01:19:26.240 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout dispatchTouchEvent() ACTION_CANCEL
     04-21 01:19:26.240 28910-28910/com.example.eventdispatchdemo E/MyLinearLayout: MyLinearLayout onInterceptTouchEvent() ACTION_CANCEL
     04-21 01:19:26.240 28910-28910/com.example.eventdispatchdemo E/MyTextView: MyTextView dispatchTouchEvent() ACTION_CANCEL
     04-21 01:19:26.254 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.254 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.271 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.271 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.288 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.288 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.305 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.305 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.321 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.321 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.338 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.338 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.355 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.355 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.372 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.372 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.438 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.438 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.449 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_MOVE
     04-21 01:19:26.449 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_MOVE
     04-21 01:19:26.450 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView dispatchTouchEvent() ACTION_UP
     04-21 01:19:26.450 28910-28910/com.example.eventdispatchdemo E/MyListView: MyListView onTouchEvent() ACTION_UP

     */
}
