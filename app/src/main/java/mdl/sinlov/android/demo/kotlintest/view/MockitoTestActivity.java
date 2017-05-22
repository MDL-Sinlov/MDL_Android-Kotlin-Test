package mdl.sinlov.android.demo.kotlintest.view;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mdl.sinlov.android.demo.kotlintest.R;
import mdl.sinlov.android.demo.kotlintest.presenter.LoginPresenter;
import mdl.sinlov.android.ux.MDLTestActivity;

public class MockitoTestActivity extends MDLTestActivity {

    @BindView(R.id.btn_mockito_base_method)
    Button btnMockitoBaseMethod;
    @BindView(R.id.btn_mockito_method_void)
    Button btnMockitoMethodVoid;
    @BindView(R.id.tv_mockito_result)
    TextView tvMockitoResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mockito_test);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {

    }

    @OnClick({R.id.btn_mockito_base_method, R.id.btn_mockito_method_void})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_mockito_base_method:
                String loginRes = LoginPresenter.getInstance().login("myName", "pwd");
                tvMockitoResult.setText(loginRes);
                break;
            case R.id.btn_mockito_method_void:
                break;
        }
    }
}
