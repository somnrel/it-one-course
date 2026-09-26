package steps;

import pages.HerokuappLoginPage;

public class HerokuappLoginSteps {

    private final HerokuappLoginPage loginPage = new HerokuappLoginPage();

    public void openPage() {
        loginPage.openPage();
    }

    public void login(String username, String password) {
        loginPage.login(username, password);
    }

    public HerokuappLoginPage page() {
        return loginPage;
    }
}

