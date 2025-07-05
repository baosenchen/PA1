import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner keyin = new Scanner(System.in);
        String grades = keyin.nextLine();
        String quiz=keyin.nextLine();
        int PA=0;
        int index2=quiz.length()-1;
        int enter=0,total=0, alg=0,integer=0, check=0;
        int index=grades.length()-1;
        String letter="invalid input";
        //Pa number detect
        for(int i=0,j=0;i<index;i++){
            if(grades.charAt(i)==' ')
            j++;
            check=j;
            }
        //System.out.println(check);
        //if negative number,fail try
        for(int i=0;i<index;i++){
            if(grades.charAt(i)=='-'){
            System.out.println("invalid input");
            return;
            }
        }
        for(int i=0;i<index2;i++){
            if(quiz.charAt(i)=='-'){
            System.out.println("invalid input");
            return;
            }
        }
        //if only input n return fail try
        if(check==0){
            System.out.println("invalid input");
            return;
        }
        //bit of enter
        //System.out.println(index);
         for(int i=0;grades.charAt(i)!=' '&&i<index;++i){
            integer=i;
        }
        //get enter
        //System.out.println(integer);
        for(int i=0;i<=integer;i++){
            enter=enter+(grades.charAt(integer-i)-'0')*((int)Math.pow(10,i));
        }
        //if enter != check(PA number), return fail
        //System.out.println(enter);
        if(enter!=check){
            System.out.println("invalid input");
            return;
        }
       for(int i=0,j=index;i<check;i++,j--){
        for(int k=0;grades.charAt(j)!=' ';k++,j--){
            PA=((grades.charAt(j)-'0')*((int)Math.pow(10,k)));
        //check if too big PA input
            
           // System.out.println(PA);
            alg=alg+PA;
            
            //System.out.println(alg);
        
        }
        total=total+alg;
        if(alg>100){
            System.out.println("invalid input");
            return;
            }
            alg=0;
        
       }
       //System.out.println(total);
       //check if 2 score put in final and see if it's negative num
       int check2=0;
       for(int i=0;i<index2;i++){
        if(quiz.charAt(i)=='-'){
            System.out.println("invalid input");
            return;
        }
        if(quiz.charAt(i)==' ')
            check2++;
        }
        if(check2!=1){
            System.out.println("invalid input");
            return;
        }
        int q1=0,q2=0,qz=0;
        for(int k=0,j=index2,i=0;j>=0;j--,k++){
            if(quiz.charAt(j)==' '){
                j--;
                k=0;
                i++;
            }
            if(i==0){
                qz=(quiz.charAt(j)-'0')*((int)Math.pow(10,k));
                q2=q2+qz;
            if(q2>100){
                System.out.println("invalid input");
                return;
            }
            }
            if(i==1){
                qz=(quiz.charAt(j)-'0')*((int)Math.pow(10,k));
                q1=q1+qz;
                if(q1>100){
                    System.out.println("invalid input");
                    return;
                }
            }
        }
        //System.out.println(total);System.out.println(q1);System.out.println(q2);
        double output=0;
        String grade="0";
        //calculate final grade and the letter grade
        output=((double)(total/check))*0.5+(double)q1*0.125+(double)q2*0.375;
        
             if(output<=100 && output>=90)
                grade="A";
        if(output<90 && output>=80)
                grade="B";
        if(output<80 && output>=70)
                grade="C";
        if(output<70 && output>=60)
                grade="D";
        if(output<60)
                grade="F";

        System.out.println(output);System.out.println(grade);
        //System.out.println(total);
        
    }
}
