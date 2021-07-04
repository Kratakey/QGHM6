package tests;

import org.junit.jupiter.api.Test;
import pages.CheckIssuePages;


public class SelenideCheckIssueTest extends config.TestBase {

    String  url = "https://github.com",
            repository = "amd/scalapack",
            issue_number = "4";

    CheckIssuePages act = new CheckIssuePages();

    @Test
    void issueTest() {
        act.open_page(url);
        act.find_repository(repository);
        act.open_issues_tab();
        act.check_issue_number(issue_number);
    }
}
