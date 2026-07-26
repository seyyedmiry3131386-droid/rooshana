package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class hy8 extends ly8 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public hy8(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.ly8
    public final Object a(Class cls) {
        String strN = gv.n(cls);
        if (strN == null) {
            return this.b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strN));
    }
}
