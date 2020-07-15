package action;

import java.io.Console;
import java.util.Scanner;
import svc.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action {
    @Override
    public void execute(Scanner scan) throws Exception {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        MemberListService memberListService = new MemberListSurvice();
        Member[] memberArray = memberListService.getMemberArray();
        consoleUtil.printMemberList(memberArray);
    }
}
