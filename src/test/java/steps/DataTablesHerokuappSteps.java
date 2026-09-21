package steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.DataTablesHerokuappPage;

public class DataTablesHerokuappSteps {

    private final DataTablesHerokuappPage dataTablesPage;

    public DataTablesHerokuappSteps(DataTablesHerokuappPage dataTablesPage) {
        this.dataTablesPage = dataTablesPage;
    }

    public void openDataTables() {
        dataTablesPage.openDataTables();
    }

    public SelenideElement findSmithEmail() {
        return dataTablesPage.getSmithEmail();
    }

    public SelenideElement findEditButtonFor100Due() {
        return dataTablesPage.getEditButtonFor100Due();
    }

    public ElementsCollection findHttpWebsiteLinks() {
        return dataTablesPage.getHttpWebsiteLinks();
    }
}