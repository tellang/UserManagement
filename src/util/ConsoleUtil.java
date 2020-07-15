package util;

import java.util.Scanner;
import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
    public Member getNewMember(Scanner scan){
        Member newMember = new Member();
        System.out.println("=====Join Us=====");
        System.out.println("ID: ");
        int id = scan.nextInt();
        System.out.println("Name: ");
        String name = scan.next();
        System.out.println("Email: ");
        String email = scan.next();
        System.out.println("Address: ");
        String adr = scan.next();
        System.out.println("Hobby: ");
        String hobby = scan.next();
        System.out.println("Tel: ");
        String tel = scan.next();
        System.out.println("Age: ");
        int age = scan.nextInt();

        newMember.setAddr(adr);
        newMember.setAge(age);
        newMember.setEmail(email);
        newMember.setId(id);
        newMember.setName(name);
        newMember.setHobby(hobby);
        newMember.setTel(tel);

        return newMember;
    }

    public void printRegistSuccessMessage(int id){
        System.out.println(id+" Regist Success!");
    }

    public void printRegistFailMessage(int id){
        System.out.println(id+" Regist Fail");
    }
    public void printMemberList(Member[] memberArray){
        if(memberArray.length ==0){
            System.out.println("Bad Data");
        }
        else {
            for (int i = 0; i < memberArray.length; i++){
                System.out.println(memberArray[i]);
            }
        }
    }
    public int getId(String msgKind, Scanner scan){
        System.out.print(msgKind+" ID: ");
        return scan.nextInt();
    }
    public Member getNewMember(Member oldMember, Scanner scan) {
        Member member = new Member();
        System.out.println("=====Modify UserData=====");
        System.out.println("User ID: " + oldMember.getId());
        System.out.println("Old Name: " + oldMember.getName());
        System.out.println("New Name: ");
        String name = scan.next();
        System.out.println("Old Email: " + oldMember.getEmail());
        System.out.println("New Email: ");
        String email = scan.next();
        System.out.println("Old Address: " + oldMember.getAddr());
        System.out.println("New Address: ");
        String addr = scan.next();
        System.out.println("Old Hobby: " + oldMember.getHobby());
        System.out.println("New Hobby: ");
        String hobby = scan.next();
        System.out.println("Old Tel: " + oldMember.getTel());
        System.out.println("New Tel: ");
        String tel = scan.next();
        System.out.println("Old Age: " + oldMember.getAge());
        System.out.println("New Age: ");
        int age = scan.nextInt();

        member.setId(oldMember.getId());
        member.setName(name);
        member.setEmail(email);
        member.setAge(age);
        member.setAddr(addr);
        member.setHobby(hobby);
        member.setTel(tel);
        return member;
    }

    public void printUpdateSuccessMessage(int id){
        System.out.println(id+"User Data Modified!");
    }

    public void printUpdateFailMessage(int id){
        System.out.println(id+ "User Data Modification Failed");
    }

    public void printDeleteSuccessMessage(int id){
        System.out.println(id+"User Data Deleted!");
    }

    public void printDeleteFailMessage(int id){
        System.out.println(id+ "User Data Deletion Failed");
    }

    public SearchData getSearchData(Scanner scan){
        System.out.println("Select Data for Searching");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("Search Condition: ");
        String searchCondition = scan.next();
        String searchValue = null;

        if(searchCondition.equals("ID")){
            System.out.print("Searching ID: ");
            searchValue = scan.next();
        }
        else if(searchCondition.equals("Name")){
            System.out.print("Searching Name: ");
            searchValue = scan.next();
        }

        SearchData searchData = new SearchData();
        searchData.setSearchCondition(searchCondition);
        searchData.setSearchValue(searchValue);

        return searchData;
    }

    public void printSearchMember(Member member){
        if(member == null){
            System.out.println("No Results");
        }
        else {
            System.out.println(member.getId()+"'s Search Results");
            System.out.println(member);
        }
    }

    public void printSearchMemberArray(Member[] memberArray){
        if(memberArray == null){
            System.out.println("No Results");
        }
        else{
            System.out.println("Searching For Name");
            for (Member member : memberArray) {
                System.out.println(member);
            }
        }
    }

    public void printRegistSuccsessMessage(int id) {
    }
}
