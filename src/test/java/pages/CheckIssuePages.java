package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckIssuePages {
    public void openPage(String url) {
        open(url);
    }

    public void findRepository(String repository) {
        $(byName("q")).setValue(repository).submit();
        $(By.linkText(repository)).click();
    }

    public void openIssuesTab() {
        $("#js-repo-pjax-container").$(byText("Issues")).click();
    }

    public void checkIssueNumber(String issue_number) {
        $("#repo-content-pjax-container").$(withText("#" + issue_number)).should(Condition.exist);
    }
}
