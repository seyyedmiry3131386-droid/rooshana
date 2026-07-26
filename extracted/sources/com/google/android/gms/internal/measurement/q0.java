package com.google.android.gms.internal.measurement;

import defpackage.c35;
import defpackage.ft9;
import defpackage.it9;
import defpackage.js9;
import defpackage.pt9;
import defpackage.ut9;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends o0 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected pt9 zzc;

    public q0() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = pt9.f;
    }

    public static q0 l(Class cls) {
        Map map = zzd;
        q0 q0Var = (q0) map.get(cls);
        if (q0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                q0Var = (q0) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = (q0) ((q0) ut9.e(cls)).o(6);
        if (q0Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, q0Var2);
        return q0Var2;
    }

    public static void m(Class cls, q0 q0Var) {
        q0Var.f();
        zzd.put(cls, q0Var);
    }

    public static Object n(Method method, q0 q0Var, Object... objArr) {
        try {
            return method.invoke(q0Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final int b(it9 it9Var) {
        if (e()) {
            int iB = it9Var.b(this);
            if (iB >= 0) {
                return iB;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iB);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iB2 = it9Var.b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iB2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iB2);
        throw new IllegalStateException(sb2.toString());
    }

    public final void d(p0 p0Var) {
        it9 it9VarA = ft9.c.a(getClass());
        c35 c35Var = p0Var.f;
        if (c35Var == null) {
            c35Var = new c35(p0Var);
        }
        it9VarA.f(this, c35Var);
    }

    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ft9.c.a(getClass()).d(this, (q0) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        ft9.c.a(getClass()).e(this);
        f();
    }

    public final js9 h() {
        return (js9) o(5);
    }

    public final int hashCode() {
        if (e()) {
            return ft9.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iG = ft9.c.a(getClass()).g(this);
        this.zza = iG;
        return iG;
    }

    public final js9 i() {
        js9 js9Var = (js9) o(5);
        js9Var.f(this);
        return js9Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int iB = ft9.c.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iB).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iB);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iB2 = ft9.c.a(getClass()).b(this);
        if (iB2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iB2;
            return iB2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iB2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iB2);
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Object o(int i);

    public final String toString() {
        String string = super.toString();
        char[] cArr = r0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        r0.b(this, sb, 0);
        return sb.toString();
    }
}
