package com.compan;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println(sqrt.apply(144d));
    }

    public static UnaryOperator<Double> sqrt = a -> Math.sqrt(a);
}
















//        UnaryOperator<Double> unaryOperator=a-> Math.sqrt(a);
//        System.out.println(unaryOperator.sqrt(144));
//    }
//
//    @FunctionalInterface
//   interface UnaryOperator <Double>{
//        UnaryOperator<Double> sqrt(double a);
//    }

//}
