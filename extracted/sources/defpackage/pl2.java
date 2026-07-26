package defpackage;

import androidx.fragment.app.Fragment$InstantiationException;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class pl2 {
    public static final fw7 b = new fw7(0);
    public final /* synthetic */ g a;

    public pl2(g gVar) {
        this.a = gVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        fw7 fw7Var = b;
        fw7 fw7Var2 = (fw7) fw7Var.get(classLoader);
        if (fw7Var2 == null) {
            fw7Var2 = new fw7(0);
            fw7Var.put(classLoader, fw7Var2);
        }
        Class cls = (Class) fw7Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        fw7Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(o40.y("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(o40.y("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final d a(String str) {
        try {
            return (d) c(this.a.x.t.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(o40.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(o40.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(o40.y("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(o40.y("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
