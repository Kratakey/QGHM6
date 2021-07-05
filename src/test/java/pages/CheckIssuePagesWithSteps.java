package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckIssuePagesWithSteps {

    @Step("Open the main page")
    public void openPage(String url) {
        open(url);
    }


    @Step("Find {repository} repository")
    public void findRepository(String repository) {
        $(byName("q")).setValue(repository).submit();
        $(By.linkText(repository)).click();
    }

    @Step("Open the Issue tab")
    public void openIssuesTab() {
        $("#js-repo-pjax-container").$(byText("Issues")).click();
    }

    @Step("Verify Issue number ({issue_number})")
    public void checkIssueNumber(String issue_number) {
        $("#repo-content-pjax-container").$(withText("#" + issue_number)).should(Condition.visible);
    }
}
