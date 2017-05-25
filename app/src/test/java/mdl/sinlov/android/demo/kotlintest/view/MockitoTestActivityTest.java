package mdl.sinlov.android.demo.kotlintest.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.LinkedList;

/**
 * <pre>
 *     sinlov
 *
 *     /\__/\
 *    /`    '\
 *  ≈≈≈ 0  0 ≈≈≈ Hello world!
 *    \  --  /
 *   /        \
 *  /          \
 * |            |
 *  \  ||  ||  /
 *   \_oo__oo_/≡≡≡≡≡≡≡≡o
 *
 * </pre>
 * Created by sinlov on 17/5/24.
 */
public class MockitoTestActivityTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    LinkedList<String> stringLinkedList;

    @InjectMocks
    MockitoTestActivity activity;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        activity.setStringLinkedList(stringLinkedList);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void initData() throws Exception {

        // do test
        activity.initData();

        // verify error
        Mockito.verify(stringLinkedList, Mockito.times(1)).add(Mockito.anyString());
    }

}