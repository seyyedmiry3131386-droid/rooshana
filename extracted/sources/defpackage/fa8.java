package defpackage;

import de.greenrobot.event.ThreadMode;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class fa8 {
    public final Method a;
    public final ThreadMode b;
    public final Class c;
    public String d;

    public fa8(Method method, ThreadMode threadMode, Class cls) {
        this.a = method;
        this.b = threadMode;
        this.c = cls;
    }

    public final synchronized void a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.d = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fa8)) {
            return false;
        }
        a();
        fa8 fa8Var = (fa8) obj;
        fa8Var.a();
        return this.d.equals(fa8Var.d);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
