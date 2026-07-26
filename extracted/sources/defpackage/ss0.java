package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ss0 {
    public final int a;
    public final Method b;

    public ss0(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss0)) {
            return false;
        }
        ss0 ss0Var = (ss0) obj;
        return this.a == ss0Var.a && this.b.getName().equals(ss0Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
