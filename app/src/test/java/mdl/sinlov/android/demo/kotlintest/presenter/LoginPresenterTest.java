package mdl.sinlov.android.demo.kotlintest.presenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import mdl.sinlov.android.demo.kotlintest.manager.UserManager;

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
 * Created by sinlov on 17/5/22.
 */
public class LoginPresenterTest {
    @Mock
    UserManager mUserManager;
    @InjectMocks
    LoginPresenter loginPresenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        // do not init by this
//        loginPresenter = new LoginPresenter();
        // You can use Mockito.mock replace @InjectMocks because None params Constructor Class
        // Because Constructor Injection > Property Setter Injection > Field Injection
//        loginPresenter = Mockito.mock(LoginPresenter.class);

    }

    @Test
    public void testLogin() throws Exception {
        // for need mock object
        loginPresenter.setUserManager(mUserManager);

        // do test
        loginPresenter.login("username", "password");

        // when
        Mockito.when(mUserManager.performLogin("username", "password")).thenReturn("username = [username], password = [password]");
        Mockito.when(mUserManager.performLogin("username", "password")).thenReturn("username = [username], password = [password]");

        // verify
        Mockito.verify(mUserManager).performLogin("username", "password");
        Mockito.verify(mUserManager, Mockito.times(1)).performLogin(Mockito.anyString(), Mockito.anyString());
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme