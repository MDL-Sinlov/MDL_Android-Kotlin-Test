package mdl.sinlov.android.demo.kotlintest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mdl.sinlov.android.demo.kotlintest.view.Dagger2Activity;
import mdl.sinlov.android.demo.kotlintest.view.MockitoTestActivity;
import mdl.sinlov.android.demo.kotlintest.view.RobolectricTestActivity;
import mdl.sinlov.android.ux.MDLTestActivity;

public class MainActivity extends MDLTestActivity {

    @BindView(R.id.activity_main)
    ScrollView activityMain;
    @BindView(R.id.btn_main_mockito)
    Button btnMainMockito;
    @BindView(R.id.btn_main_dagger_2)
    Button btnMainDagger2;
    @BindView(R.id.btn_main_robolectric)
    Button btnMainRobolectric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {

    }

    @OnClick({R.id.btn_main_mockito, R.id.btn_main_dagger_2, R.id.btn_main_robolectric})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_main_mockito:
                skip2Activity(MockitoTestActivity.class);
                break;
            case R.id.btn_main_dagger_2:
                skip2Activity(Dagger2Activity.class);
                break;
            case R.id.btn_main_robolectric:
                skip2Activity(RobolectricTestActivity.class);
                break;
        }
    }
}
