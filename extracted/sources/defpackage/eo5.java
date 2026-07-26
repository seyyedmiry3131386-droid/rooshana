package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eo5 {
    public int a;
    public boolean b;
    public Object c = new Object();
    public Object d = new wv(0);
    public Object e;
    public Object f;

    public boolean a(int i, int i2) {
        zb5 zb5Var = (zb5) this.d;
        int i3 = this.a;
        fx4 fx4Var = (fx4) zb5Var.a[i + i3];
        fx4 fx4Var2 = (fx4) ((zb5) this.e).a[i3 + i2];
        return js3.i(fx4Var, fx4Var2) || fx4Var.getClass() == fx4Var2.getClass();
    }

    public lo7 b(Object obj) {
        lo7 lo7Var;
        synchronized (this.c) {
            try {
                int iC = c();
                lo7Var = new lo7(iC, obj);
                if (this.b) {
                    lo7Var.n();
                } else {
                    ((wv) this.d).put(Integer.valueOf(iC), lo7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lo7Var;
    }

    public int c() {
        int i;
        synchronized (this.c) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public void d() {
        ArrayList arrayList;
        synchronized (this.c) {
            try {
                this.b = true;
                arrayList = new ArrayList(((wv) this.d).values());
                ((wv) this.d).clear();
                if (((bo4) this.e) != null) {
                    Handler handler = (Handler) this.f;
                    handler.getClass();
                    handler.post((bo4) this.e);
                    this.e = null;
                    this.f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lo7) it.next()).n();
        }
    }

    public void e(int i, Object obj) {
        synchronized (this.c) {
            try {
                lo7 lo7Var = (lo7) ((wv) this.d).remove(Integer.valueOf(i));
                if (lo7Var != null) {
                    if (lo7Var.i.getClass() == obj.getClass()) {
                        lo7Var.k(obj);
                    } else {
                        wn5.k0("SequencedFutureManager", "Type mismatch, expected " + lo7Var.i.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((bo4) this.e) != null && ((wv) this.d).isEmpty()) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
