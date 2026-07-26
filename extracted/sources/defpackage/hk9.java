package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class hk9 implements tt5, dt5, zs5 {
    public final Object a = new Object();
    public final int b;
    public final ox9 c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public hk9(int i, ox9 ox9Var) {
        this.b = i;
        this.c = ox9Var;
    }

    public final void a() {
        int i = this.d + this.e + this.f;
        int i2 = this.b;
        if (i == i2) {
            Exception exc = this.g;
            ox9 ox9Var = this.c;
            if (exc == null) {
                if (this.h) {
                    ox9Var.o();
                    return;
                } else {
                    ox9Var.m(null);
                    return;
                }
            }
            int i3 = this.e;
            int length = String.valueOf(i3).length();
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + length + 8 + 24);
            sb.append(i3);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            ox9Var.n(new ExecutionException(sb.toString(), this.g));
        }
    }

    @Override // defpackage.zs5
    public final void g() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            a();
        }
    }

    @Override // defpackage.dt5
    public final void onFailure(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            a();
        }
    }

    @Override // defpackage.tt5
    public final void onSuccess(Object obj) {
        synchronized (this.a) {
            this.d++;
            a();
        }
    }
}
