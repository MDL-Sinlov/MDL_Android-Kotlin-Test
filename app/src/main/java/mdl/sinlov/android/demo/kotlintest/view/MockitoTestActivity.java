package mdl.sinlov.android.demo.kotlintest.view;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import mdl.sinlov.android.demo.kotlintest.R;
import mdl.sinlov.android.ux.MDLTestActivity;

public class MockitoTestActivity extends MDLTestActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mockito_test);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {

    }

}
