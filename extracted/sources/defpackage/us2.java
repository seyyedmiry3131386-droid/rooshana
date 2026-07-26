package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class us2 {
    public final k48 a;
    public final Handler b;
    public final ArrayList c;
    public final s57 d;
    public final pc0 e;
    public boolean f;
    public boolean g;
    public f57 h;
    public rs2 i;
    public boolean j;
    public rs2 k;
    public Bitmap l;
    public rs2 m;
    public int n;
    public int o;
    public int p;

    public us2(a aVar, k48 k48Var, int i, int i2, Bitmap bitmap) {
        pc0 pc0Var = aVar.a;
        ft2 ft2Var = aVar.c;
        s57 s57VarE = a.e(ft2Var.getBaseContext());
        f57 f57VarM = a.e(ft2Var.getBaseContext()).m().a(((w57) ((w57) ((w57) new w57().g(zo1.b)).K()).D()).v(i, i2));
        this.c = new ArrayList();
        this.d = s57VarE;
        Handler handler = new Handler(Looper.getMainLooper(), new ts2(0, this));
        this.e = pc0Var;
        this.b = handler;
        this.h = f57VarM;
        this.a = k48Var;
        c(xx8.b, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        rs2 rs2Var = this.m;
        if (rs2Var != null) {
            this.m = null;
            b(rs2Var);
            return;
        }
        this.g = true;
        k48 k48Var = this.a;
        vs2 vs2Var = k48Var.l;
        int i2 = vs2Var.c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = k48Var.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((qs2) vs2Var.e.get(i)).i));
        int i3 = (k48Var.k + 1) % k48Var.l.c;
        k48Var.k = i3;
        this.k = new rs2(this.b, i3, jUptimeMillis);
        f57 f57VarS = this.h.a((w57) new w57().C(new yq5(Double.valueOf(Math.random())))).S(k48Var);
        f57VarS.Q(this.k, f57VarS);
    }

    public final void b(rs2 rs2Var) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, rs2Var).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = rs2Var;
            return;
        }
        if (rs2Var.g != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.c(bitmap);
                this.l = null;
            }
            rs2 rs2Var2 = this.i;
            this.i = rs2Var;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ns2 ns2Var = (ns2) ((ss2) arrayList.get(size));
                Object callback = ns2Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    ns2Var.stop();
                    ns2Var.invalidateSelf();
                } else {
                    ns2Var.invalidateSelf();
                    rs2 rs2Var3 = ((us2) ns2Var.a.b).i;
                    if ((rs2Var3 != null ? rs2Var3.e : -1) == r5.a.l.c - 1) {
                        ns2Var.f++;
                    }
                    int i = ns2Var.g;
                    if (i != -1 && ns2Var.f >= i) {
                        ns2Var.stop();
                    }
                }
            }
            if (rs2Var2 != null) {
                handler.obtainMessage(2, rs2Var2).sendToTarget();
            }
        }
        a();
    }

    public final void c(nq8 nq8Var, Bitmap bitmap) {
        ok4.p(nq8Var, "Argument must not be null");
        ok4.p(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new w57().H(nq8Var, true));
        this.n = i29.c(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}
