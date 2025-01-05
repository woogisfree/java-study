package reflection;

import java.lang.reflect.Field;

/**
 * REFLECTION을 활용한 필드 기본값 도입
 */
public class FieldUtil {

    public static void nullFieldToDefault(Object target) throws IllegalAccessException {
        Class<?> aClass = target.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.get(target) != null) {
                continue;
            }

            if (field.getType() == String.class) {
                field.set(target, "");
            } else if (field.getType() == Integer.class) {
                field.set(target, 0);
            }
        }
    }
}
