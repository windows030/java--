public class yunsuanfu1 {
    public static void main(String[] args) {
        //+
        System.out.println(3+2);//5
        //-
        System.out.println(5-1);//4
        //*
        System.out.println(7*9);//63

        //如果在计算的时候有小数参与
        //结论
        //在代码中,如果有小数参与计算,结果有可能不精确的.
        //为什么呢?
        //暂时只要知道这个结论就行了.
        //具体的原因.我门道了javaSE的时候,会在详细的讲解.
        System.out.println(1.1+1.1);//2.2
        System.out.println(1.1+1.01);//2.110000000000003
        System.out.println(1.1-1.01);//0.09000000000000008
        System.out.println(1.1*1.01);//1.1110000000000002

    }
}