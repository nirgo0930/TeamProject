package com.example.stopwaitingadmin.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class ReportedUserListItem {

    public ReportedUserListItem(Long UserNum, String UserName, int reportedCount) {
        ReportedUserNum = UserNum;
        ReportedUserName = UserName;
        ReportedCount = reportedCount;
    }

    private Long ReportedUserNum;     //신고된 사용자 학번
    private String ReportedUserName;    //신고된 사용자 이름
    private int ReportedCount;            //신고된 횟수

    public Long getReportedUserNum() {
        return ReportedUserNum;
    }

    public void setReportedUserNum(Long ReportedUserNum) { this.ReportedUserNum = ReportedUserNum; }

    public String getReportedUserName() {
        return ReportedUserName;
    }

    public void setReportedUserName(String ReportedUserName) { this.ReportedUserName = ReportedUserName; }

    public int getReportedCount() {
        return ReportedCount;
    }

    public void setReportedCount(int ReportedCount) {
        this.ReportedCount = ReportedCount;
    }
}
