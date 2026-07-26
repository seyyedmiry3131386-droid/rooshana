package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class s57 implements ComponentCallbacks2, e64 {
    public static final w57 k = (w57) ((w57) new w57().f(Bitmap.class)).q();
    public final a a;
    public final Context b;
    public final t54 c;
    public final ir9 d;
    public final v57 e;
    public final ye8 f;
    public final q6 g;
    public final j21 h;
    public final CopyOnWriteArrayList i;
    public w57 j;

    static {
    }

    public s57(a aVar, t54 t54Var, v57 v57Var, Context context) {
        ir9 ir9Var = new ir9(3);
        gv gvVar = aVar.f;
        this.f = new ye8();
        q6 q6Var = new q6(29, this);
        this.g = q6Var;
        this.a = aVar;
        this.c = t54Var;
        this.e = v57Var;
        this.d = ir9Var;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        r57 r57Var = new r57(this, ir9Var);
        gvVar.getClass();
        j21 xd1Var = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new xd1(applicationContext, r57Var) : new pp5();
        this.h = xd1Var;
        synchronized (aVar.g) {
            if (aVar.g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.g.add(this);
        }
        char[] cArr = i29.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t54Var.c(this);
        } else {
            i29.f().post(q6Var);
        }
        t54Var.c(xd1Var);
        this.i = new CopyOnWriteArrayList(aVar.c.e);
        w(aVar.c.a());
    }

    @Override // defpackage.e64
    public final synchronized void b() {
        this.f.b();
        t();
    }

    @Override // defpackage.e64
    public final synchronized void e() {
        this.f.e();
        p();
        ir9 ir9Var = this.d;
        Iterator it = i29.e((Set) ir9Var.c).iterator();
        while (it.hasNext()) {
            ir9Var.b((v47) it.next());
        }
        ((HashSet) ir9Var.d).clear();
        this.c.b(this);
        this.c.b(this.h);
        i29.f().removeCallbacks(this.g);
        this.a.d(this);
    }

    @Override // defpackage.e64
    public final synchronized void k() {
        u();
        this.f.k();
    }

    public f57 l(Class cls) {
        return new f57(this.a, this, cls, this.b);
    }

    public f57 m() {
        return l(Bitmap.class).a(k);
    }

    public f57 n() {
        return l(Drawable.class);
    }

    public final void o(ve8 ve8Var) {
        if (ve8Var == null) {
            return;
        }
        boolean zX = x(ve8Var);
        v47 v47VarA = ve8Var.a();
        if (zX) {
            return;
        }
        a aVar = this.a;
        synchronized (aVar.g) {
            try {
                Iterator it = aVar.g.iterator();
                while (it.hasNext()) {
                    if (((s57) it.next()).x(ve8Var)) {
                        return;
                    }
                }
                if (v47VarA != null) {
                    ve8Var.c(null);
                    v47VarA.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void p() {
        try {
            Iterator it = i29.e(this.f.a).iterator();
            while (it.hasNext()) {
                o((ve8) it.next());
            }
            this.f.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public f57 q(ne5 ne5Var) {
        return n().S(ne5Var);
    }

    public f57 r(Drawable drawable) {
        return n().R(drawable);
    }

    public f57 s(String str) {
        return n().T(str);
    }

    public final synchronized void t() {
        ir9 ir9Var = this.d;
        ir9Var.b = true;
        for (v47 v47Var : i29.e((Set) ir9Var.c)) {
            if (v47Var.isRunning()) {
                v47Var.b();
                ((HashSet) ir9Var.d).add(v47Var);
            }
        }
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    public final synchronized void u() {
        ir9 ir9Var = this.d;
        ir9Var.b = false;
        for (v47 v47Var : i29.e((Set) ir9Var.c)) {
            if (!v47Var.c() && !v47Var.isRunning()) {
                v47Var.k();
            }
        }
        ((HashSet) ir9Var.d).clear();
    }

    public synchronized s57 v(w57 w57Var) {
        w(w57Var);
        return this;
    }

    public synchronized void w(w57 w57Var) {
        this.j = (w57) ((w57) w57Var.clone()).b();
    }

    public final synchronized boolean x(ve8 ve8Var) {
        v47 v47VarA = ve8Var.a();
        if (v47VarA == null) {
            return true;
        }
        if (!this.d.b(v47VarA)) {
            return false;
        }
        this.f.a.remove(ve8Var);
        ve8Var.c(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
