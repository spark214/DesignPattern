package SingletonPattern;

public class StudentCode{
    private String SchoolYear ; // 入学学年
    private String Collagecode ; //  学院代号
    private String Professionalcode ; // 专业代号
    private String Classcode ; // 班级代号
    private String Ordinalnumber  ;  // 序号
    public  String Code ; // 全部学号
    private static StudentCode sc = null ;

    private StudentCode(String SchoolYear,String Collagecode,String Professionalcode,String Classcode,String Ordinalnumber){
        this.SchoolYear = SchoolYear ;
        this.Collagecode = Collagecode ;
        this.Professionalcode = Professionalcode ;
        this.Classcode = Classcode ;
        this.Ordinalnumber = Ordinalnumber ;
    }

    public static StudentCode getInstance(String SchoolYear,String Collagecode,String Professionalcode,String Classcode,String Ordinalnumber){
        synchronized (StudentCode.class) {
            if(sc== null) {
                sc = new StudentCode(SchoolYear,Collagecode,Professionalcode,Classcode,Ordinalnumber);
            }
        }
        return sc ;
    }

    public String generateCode(){
        Code = SchoolYear + Collagecode + Professionalcode + Classcode + Ordinalnumber ;
        return Code ;
    }
}