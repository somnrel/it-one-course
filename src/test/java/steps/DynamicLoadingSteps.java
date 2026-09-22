package steps;

import pages.DynamicLoadingPage;

public class DynamicLoadingSteps {

    private final DynamicLoadingPage dynamicLoadingPage;

    public DynamicLoadingSteps(DynamicLoadingPage dynamicLoadingPage) {
        this.dynamicLoadingPage = dynamicLoadingPage;
    }

    public void openPage() {
        dynamicLoadingPage.openPage();
    }

    public void startLoading() {
        dynamicLoadingPage.clickStart();
    }

    public DynamicLoadingPage page() {
        return dynamicLoadingPage;
    }
}
