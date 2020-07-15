package action;

import java.util.Scanner;

import svc.MemberRegisterService;
import util.ConsoleUtil;
import vo.Member;

public class MemberRegistAction implements Action{
    @Override
    public void execute(Scanner scan) throws Exception {
        ConsoleUtil consoleUtil = new ConsoleUtil();
        Member newMember = consoleUtil.getNewMember(scan);

        MemberRegisterService memberRegistSurvice = new MemberRegisterService();
        boolean registSuccess = memberRegistSurvice.registMember(newMember);
        if(registSuccess){
            consoleUtil.printRegistSuccsessMessage(newMember.getId());
        }
        else {
            consoleUtil.printRegistFailMessage(newMember.getId());
        }
    }
}
