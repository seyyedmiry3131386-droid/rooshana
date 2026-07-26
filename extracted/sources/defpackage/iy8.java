package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class iy8 extends ly8 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public iy8(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.ly8
    public final Object a(Class cls) {
        String strN = gv.n(cls);
        if (strN == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strN));
    }
}
