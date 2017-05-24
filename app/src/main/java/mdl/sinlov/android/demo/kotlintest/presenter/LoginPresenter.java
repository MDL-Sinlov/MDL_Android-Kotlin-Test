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

    private UserManager userManager;


    public String login(String username, String password) {
        if (userManager == null) {
            userManager = new UserManager();
        }
        if (username == null || username.length() <= 4) return "";
        if (password == null || password.length() <= 6) return "";
        return userManager.performLogin(username, password);
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }
}
