package department;

import commercial.Regional;
import commercial.SalesOrder;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Payroll implements Regional {
    public static void main(String[] args) throws IllegalAccessException {
        var salesOrder = new SalesOrder();
        var theClass = salesOrder.getClass();
        Field[] declaredFields = theClass.getDeclaredFields();
        Map<String, Object> fieldsMap = new HashMap<>();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object o = declaredField.get(salesOrder);
            fieldsMap.put(declaredField.getName(), o);
        }
        fieldsMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
