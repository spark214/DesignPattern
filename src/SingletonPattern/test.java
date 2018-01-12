package SingletonPattern;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入两位入学学年：");
        String SchoolYear = scanner.next();
        System.out.println();

        System.out.print("输入两位学院代号：");
        String Collagecode = scanner.next();
        System.out.println();

        System.out.print("输入两位专业代号:");
        String Professionalcode= scanner.next();
        System.out.println();

        System.out.print("输入两位班级代号:");
        String Classcode = scanner.next();
        System.out.println();

        System.out.print("输入两位序号:");
        String Ordinalnumber = scanner.next();
        System.out.println();

        StudentCode sc = StudentCode.getInstance(SchoolYear,Collagecode,Professionalcode,Classcode,Ordinalnumber);
        String Code = sc.generateCode();
        System.out.println("最终学号为:"+Code);
    }
}
