package learning.test.functions;

import java.util.function.Supplier;

public class SupplierFunctions {
    Supplier<String[]> stringSupplier =() ->new String[]{"hello","apple"};

    public static void main(String[] args) {
        new SupplierFunctions().stringSupplier.get();
    }
}
