package defpackage;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p27 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ qt8 e;
    public final /* synthetic */ qt8 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public p27(String str, Field field, Method method, qt8 qt8Var, qt8 qt8Var2, boolean z, boolean z2) {
        this.d = method;
        this.e = qt8Var;
        this.f = qt8Var2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(uw3 uw3Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(o40.y("Accessor ", m27.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        uw3Var.g(this.a);
        this.e.c(uw3Var, objInvoke);
    }
}
