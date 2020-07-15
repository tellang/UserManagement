package action;

import java.io.Console;
import java.util.Scanner;
import svc.MemberUpdateSurvice;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

public class MemberUpdateAction implements Action{
    @Override
    public void execute(Scanner scan) throws Exception {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        SearchData searchData = consoleUtil.getSearchData(scan);
        MemberSearchSurvice memberSearchSurvice = new MemberSearchSurvice();

        if(searchData.getSearchCondition().equals("아이디")){
            Member member = memberSearchSurvice.searchMemberById(searchData.getSearchValue());
            consoleUtil.printSearchMember(member);
        }
        else if(searchData.getSearchCondition().equals("이름")){
            Member[] memberArray = memberSearchSurvice.searchMemberByName(searchData.getSearchValue());
            consoleUtil.printSearchMemberArray(memberArray);
        }
    }
}
