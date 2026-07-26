package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Request$Priority;
import com.android.volley.VolleyError;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class x47 implements Comparable {
    public final bb9 a;
    public final int b;
    public final String c;
    public final int d;
    public final Object e;
    public Integer f;
    public l37 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public rg1 k;
    public bk0 l;
    public Object m;
    public o77 n;

    public x47(int i, String str) {
        Uri uri;
        String host;
        this.a = bb9.c ? new bb9() : null;
        this.e = new Object();
        this.h = true;
        int iHashCode = 0;
        this.i = false;
        this.j = false;
        this.l = null;
        this.b = i;
        this.c = str;
        this.k = new rg1(1.0f, 2500, 1);
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.d = iHashCode;
    }

    public final void a(String str) {
        if (bb9.c) {
            this.a.a(Thread.currentThread().getId(), str);
        }
    }

    public void b() {
        synchronized (this.e) {
            this.i = true;
        }
    }

    public void c(VolleyError volleyError) {
        synchronized (this.e) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x47 x47Var = (x47) obj;
        Request$Priority request$PriorityJ = j();
        Request$Priority request$PriorityJ2 = x47Var.j();
        return request$PriorityJ == request$PriorityJ2 ? this.f.intValue() - x47Var.f.intValue() : request$PriorityJ2.ordinal() - request$PriorityJ.ordinal();
    }

    public abstract void d(Object obj);

    public final void e(String str) {
        l37 l37Var = this.g;
        if (l37Var != null) {
            synchronized (((HashSet) l37Var.c)) {
                ((HashSet) l37Var.c).remove(this);
            }
            synchronized (l37Var.a) {
                Iterator it = l37Var.a.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            l37Var.i();
        }
        if (bb9.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new u47(this, str, id));
                return;
            }
            this.a.a(id, str);
            bb9 bb9Var = this.a;
            toString();
            bb9Var.b();
        }
    }

    public byte[] f() {
        return null;
    }

    public String g() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public String h() {
        String str = this.c;
        int i = this.b;
        if (i == 0 || i == -1) {
            return str;
        }
        return Integer.toString(i) + '-' + str;
    }

    public abstract Map i();

    public abstract Request$Priority j();

    public final boolean k() {
        boolean z;
        synchronized (this.e) {
            z = this.j;
        }
        return z;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.e) {
            z = this.i;
        }
        return z;
    }

    public final void m() {
        o77 o77Var;
        synchronized (this.e) {
            o77Var = this.n;
        }
        if (o77Var != null) {
            o77Var.z(this);
        }
    }

    public final void n(ry ryVar) {
        o77 o77Var;
        synchronized (this.e) {
            o77Var = this.n;
        }
        if (o77Var != null) {
            o77Var.A(this, ryVar);
        }
    }

    public abstract ry p(fn5 fn5Var);

    public final void q() {
        l37 l37Var = this.g;
        if (l37Var != null) {
            l37Var.i();
        }
    }

    public final void r(o77 o77Var) {
        synchronized (this.e) {
            this.n = o77Var;
        }
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(l() ? "[X] " : "[ ] ");
        o40.I(this.c, " ", str, " ", sb);
        sb.append(j());
        sb.append(" ");
        sb.append(this.f);
        return sb.toString();
    }

    public VolleyError o(VolleyError volleyError) {
        return volleyError;
    }
}
