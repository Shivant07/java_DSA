class calc{
    public static void main(String[] args) {
        int fnum= Integer.parseInt(args[0]);
        int snum= Integer.parseInt(args[2]);
        String opr= args[1];
        int res = 0;
        if(opr.equals("+")){
            res = fnum + snum;
        }
        else if(opr.equals("-")){
            res= fnum - snum;
        }
        else if(opr.equals("x")){
            res= fnum * snum;
        }
        else if(opr.equals("/")){
            res= fnum / snum;
        }
        System.out.println("Result :"+res);
        
    }
}