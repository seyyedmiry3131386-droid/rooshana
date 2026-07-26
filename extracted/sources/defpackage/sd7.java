package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class sd7 {
    public static final List a = br9.C(Application.class, jd7.class);
    public static final List b = br9.B(jd7.class);

    public static final Constructor a(Class cls, List list) {
        js3.p(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        js3.o(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            js3.o(parameterTypes, "getParameterTypes(...)");
            List listX0 = ew.X0(parameterTypes);
            if (list.equals(listX0)) {
                return constructor;
            }
            if (list.size() == listX0.size() && listX0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final k79 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (k79) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(bl4.v("Failed to access ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(bl4.t(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(bl4.v("An exception happened in constructor of ", cls), e3.getCause());
        }
    }
}
