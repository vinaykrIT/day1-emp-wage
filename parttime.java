class parttime{
        private int pwage;
        public int wage(int pwage)
        {
          return 8*pwage;
        }
        public static void main(String[] args){
        parttime p=new parttime();
        System.out.println("parttime wage is=" + " "+ p.wage(20));
  }}
