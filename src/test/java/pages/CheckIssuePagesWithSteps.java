package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckIssuePagesWithSteps {

    @Step("Open the main page")
    public void open_page(String url) {
        open(url);
    }


    @Step("Find {repository} repository")
    public void find_repository(String repository) {
        $(byName("q")).sendKeys(repository);
        $(byName("q")).submit();
        $(By.linkText(repository)).click();
    }

    @Step("Open the Issue tab")
    public void open_issues_tab() {
        $("#js-repo-pjax-container").$(byText("Issues")).click();
    }

    @Step("Verify Issue number ({issue_number})")
    public void check_issue_number(String issue_number) {
        $("#repo-content-pjax-container").$(withText("#" + issue_number)).should(Condition.exist);
    }
}
