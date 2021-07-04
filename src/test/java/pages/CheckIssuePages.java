package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckIssuePages {
    public void open_page(String url) {
        open(url);
    }

    public void find_repository(String repository) {
        $(byName("q")).sendKeys(repository);
        $(byName("q")).submit();
        $(By.linkText(repository)).click();
    }

    public void open_issues_tab() {
        $("#js-repo-pjax-container").$(byText("Issues")).click();
    }

    public void check_issue_number(String issue_number) {
        $("#repo-content-pjax-container").$(withText("#" + issue_number)).should(Condition.exist);
    }
}
