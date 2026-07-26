package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class i59 {
    public final cn4 a;
    public final m59 b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public td8 l = td8.a;

    public i59(Context context, cn4 cn4Var, long j) {
        this.a = cn4Var;
        this.c = j;
        this.b = new m59(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r27, long r29, long r31, long r33, boolean r35, boolean r36, defpackage.fg0 r37) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i59.a(long, long, long, long, boolean, boolean, fg0):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.l.getClass();
        this.g = j29.V(SystemClock.elapsedRealtime());
        m59 m59Var = this.b;
        m59Var.d = true;
        m59Var.m = 0L;
        m59Var.p = -1L;
        m59Var.n = -1L;
        k59 k59Var = m59Var.b;
        if (k59Var != null) {
            DisplayManager displayManager = k59Var.a;
            l59 l59Var = m59Var.c;
            l59Var.getClass();
            l59Var.b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(k59Var, j29.p(null));
            m59.a(k59Var.b, displayManager.getDisplay(0));
        }
        m59Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.i = -9223372036854775807L;
        m59 m59Var = this.b;
        m59Var.d = false;
        k59 k59Var = m59Var.b;
        if (k59Var != null) {
            k59Var.a.unregisterDisplayListener(k59Var);
            l59 l59Var = m59Var.c;
            l59Var.getClass();
            l59Var.b.sendEmptyMessage(3);
        }
        m59Var.b();
    }

    public final void f(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.e = Math.min(this.e, 2);
        }
    }

    public final void g(float f) {
        m59 m59Var = this.b;
        m59Var.f = f;
        jd2 jd2Var = m59Var.a;
        jd2Var.a.c();
        jd2Var.b.c();
        jd2Var.c = false;
        jd2Var.d = -9223372036854775807L;
        jd2Var.e = 0;
        m59Var.c();
    }

    public final void h(Surface surface) {
        this.m = surface != null;
        this.n = false;
        m59 m59Var = this.b;
        if (m59Var.e != surface) {
            m59Var.b();
            m59Var.e = surface;
            m59Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void i(float f) {
        vy2.j(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        m59 m59Var = this.b;
        m59Var.i = f;
        m59Var.m = 0L;
        m59Var.p = -1L;
        m59Var.n = -1L;
        m59Var.d(false);
    }
}
