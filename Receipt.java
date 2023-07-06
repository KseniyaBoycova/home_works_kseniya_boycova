package ControlWork;

import java.time.LocalTime;

public class Receipt {
    private LocalTime issueTime;
    private int numberOfOrder;

    public Receipt(LocalTime issueTime, int numberOfOrder) {
        this.issueTime = issueTime;
        this.numberOfOrder = numberOfOrder;
    }

    public LocalTime getIssueTime() {
        return issueTime;
    }
}
