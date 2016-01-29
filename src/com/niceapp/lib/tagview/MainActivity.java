package com.niceapp.lib.tagview;

import java.util.ArrayList;
import java.util.List;
import com.niceapp.lib.tagview.widget.Tag;
import com.niceapp.lib.tagview.widget.TagListView;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	private TagListView mTagListView;
	private final List<Tag> mTags = new ArrayList<Tag>();
	private final String[] titles = { "��ȫ�ر�", "����", "��ĸѧ", "�ϰ���ر�", 
			"360�ֻ���ʿ", "QQ","���뷨", "΢��", "����Ӧ��", "AndevUI", "Ģ����" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_tag_activity);

		mTagListView = (TagListView) findViewById(R.id.tagview);
		setUpData();
		mTagListView.setTags(mTags);
	}

	private void setUpData() {
		for (int i = 0; i < 10; i++) {
			Tag tag = new Tag();
			tag.setId(i);
			tag.setChecked(true);
			tag.setTitle(titles[i]);
			mTags.add(tag);
		}
	}
}
