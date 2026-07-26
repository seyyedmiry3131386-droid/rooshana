package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class jy8 extends ly8 {
    public final /* synthetic */ Method b;

    public jy8(Method method) {
        this.b = method;
    }

    @Override // defpackage.ly8
    public final Object a(Class cls) {
        String strN = gv.n(cls);
        if (strN == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strN));
    }
}
