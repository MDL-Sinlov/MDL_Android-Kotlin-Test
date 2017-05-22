package mdl.sinlov.android.demo.kotlintest.presenter;


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
public class LoginPresenter {
    private static LoginPresenter instance;

    private LoginPresenter() {
    }

    public static LoginPresenter getInstance() {
        if (instance == null) {
            instance = new LoginPresenter();
        }
        return instance;
    }

    private UserManager mUserManager = new UserManager();

    public String login(String username, String password) {
        if (username == null || username.length() <= 4) return "";
        if (password == null || password.length() < 6) return "";
        return mUserManager.performLogin(username, password);
    }
}
