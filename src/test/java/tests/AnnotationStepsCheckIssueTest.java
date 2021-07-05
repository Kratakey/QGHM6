package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CheckIssuePagesWithSteps;


public class AnnotationStepsCheckIssueTest extends config.TestBase {

    String  url = "https://github.com",
            repository = "amd/scalapack",
            issue_number = "4";

    CheckIssuePagesWithSteps act = new CheckIssuePagesWithSteps();

    @Test
    @Feature("Issues")
    @Owner("KRT")
    @Story("Verifying Issue")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "Github", value = "https://github.com")
    @DisplayName("Test to verify the Issue ID number")
    void issueTestWithAnnotations() {
        act.openPage(url);
        act.findRepository(repository);
        act.openIssuesTab();
        act.checkIssueNumber(issue_number);
    }
}
