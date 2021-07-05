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
        act.openPage(url);
        act.findRepository(repository);
        act.openIssuesTab();
        act.checkIssueNumber(issue_number);
    }
}
