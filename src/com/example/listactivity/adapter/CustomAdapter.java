package com.example.listactivity.adapter;

import java.util.ArrayList;

import com.example.listactivity.R;
import com.example.listactivity.dao.PeopleDao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

	ArrayList<PeopleDao> itemArr = new ArrayList<PeopleDao>();
	Context mContext;
	LayoutInflater inflater;
	
	public CustomAdapter(Context mcon, ArrayList<PeopleDao> arr) {//������
		mContext = mcon;
		itemArr = arr;
		inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				
		
		// TODO Auto-generated constructor stub
	}
	
		
	@Override
	public int getCount() {//��� ����ϱ����� ..�������� ��ü�� ��ΰ�
		// TODO Auto-generated method stub
		
		return itemArr.size();
	}

	@Override
	public Object getItem(int arg0) {//����Ʈ���� ���°������ �����ֱ����� ..
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {//�̰͵� ������ó�� position����..
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertview, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertview == null){
			convertview = inflater.inflate(R.layout.item_row,parent,false);
		}
		
		ImageView pic = (ImageView) convertview.findViewById(R.id.pic);
		TextView name = (TextView) convertview.findViewById(R.id.name);
		TextView addr = (TextView) convertview.findViewById(R.id.address);
		TextView office = (TextView) convertview.findViewById(R.id.office);
		TextView phone = (TextView) convertview.findViewById(R.id.phone_number);
		
		pic.setImageDrawable(itemArr.get(position).getPic());
		name.setText(itemArr.get(position).getName());
		addr.setText(itemArr.get(position).getAddr());
		office.setText(itemArr.get(position).getOffice());
		phone.setText(itemArr.get(position).getPhone_number());
		
		
		
		return convertview;
	}

}
