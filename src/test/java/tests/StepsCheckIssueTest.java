package tests;

import org.junit.jupiter.api.Test;
import pages.CheckIssuePages;

import static io.qameta.allure.Allure.step;


public class StepsCheckIssueTest extends config.TestBase {

    String  url = "https://github.com",
            repository = "amd/scalapack",
            issue_number = "4";

    CheckIssuePages act = new CheckIssuePages();

    @Test
    void issueTestWithSteps() {
        step("Open the main page", (s) -> {
            act.open_page(url);
        });
        step("Find "+repository+" repository", (s) -> {
            act.find_repository(repository);
        });
        step("Open the Issue tab", (s) -> {
            act.open_issues_tab();
        });
        step("Verify Issue number ("+issue_number+")", (s) -> {
            act.check_issue_number(issue_number);
        });
    }

}
