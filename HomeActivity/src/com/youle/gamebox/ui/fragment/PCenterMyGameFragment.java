package com.youle.gamebox.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.InjectView;
import com.youle.gamebox.ui.R;

/**
 * Created by Administrator on 2014/5/27.
 */
public class PCenterMyGameFragment extends BaseFragment {
    @InjectView(R.id.pc_layout_bottom_text)
    TextView mPcLayoutBottomText;
    private String isLoad = "no";

    @Override
    protected int getViewId() {
        return R.layout.pcenter_layout_bottom_listview;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
    }

    protected void loadData() {
        if("no".equals(isLoad)){
            mPcLayoutBottomText.setText("--"+isLoad);
            Toast.makeText(getActivity(),"--"+isLoad,Toast.LENGTH_SHORT).show();
            isLoad = "yes";
        }else {
            mPcLayoutBottomText.setText("--"+isLoad);
            Toast.makeText(getActivity(),"--"+isLoad,Toast.LENGTH_SHORT).show();
        }


    }
}