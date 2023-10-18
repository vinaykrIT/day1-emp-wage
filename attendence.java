import java.util.Random;

class attendence{
public static void main(String[] args){
Random random=new Random();
int x=random.nextInt(2);
if(x==0)
  System.out.println("Employee is absent");
else
  System.out.println("Employee is present");
}
}
