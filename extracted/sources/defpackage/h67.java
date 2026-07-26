package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.a;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h67 implements na1, ka1 {
    public final a a;
    public final xb1 b;
    public int c;
    public int d = -1;
    public sx3 e;
    public List f;
    public int g;
    public volatile zw4 h;
    public File i;
    public i67 j;

    public h67(xb1 xb1Var, a aVar) {
        this.b = xb1Var;
        this.a = aVar;
    }

    @Override // defpackage.ka1
    public final void a(Exception exc) {
        this.a.c(this.j, exc, this.h.c, DataSource.d);
    }

    @Override // defpackage.na1
    public final boolean b() {
        List list;
        ArrayList arrayListA = this.b.a();
        boolean z = false;
        if (!arrayListA.isEmpty()) {
            xb1 xb1Var = this.b;
            y27 y27VarB = xb1Var.c.b();
            Class<?> cls = xb1Var.d.getClass();
            Class cls2 = xb1Var.g;
            Class cls3 = xb1Var.k;
            nc2 nc2Var = y27VarB.h;
            j95 j95Var = (j95) ((AtomicReference) nc2Var.b).getAndSet(null);
            if (j95Var == null) {
                j95Var = new j95(cls, cls2, cls3);
            } else {
                j95Var.a = cls;
                j95Var.b = cls2;
                j95Var.c = cls3;
            }
            synchronized (((wv) nc2Var.c)) {
                list = (List) ((wv) nc2Var.c).get(j95Var);
            }
            ((AtomicReference) nc2Var.b).set(j95Var);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = y27VarB.a.y(cls).iterator();
                while (it.hasNext()) {
                    for (Class cls4 : y27VarB.c.c((Class) it.next(), cls2)) {
                        if (!y27VarB.f.h(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                y27VarB.h.A(cls, cls2, cls3, DesugarCollections.unmodifiableList(arrayList));
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f;
                    if (list3 != null && this.g < list3.size()) {
                        this.h = null;
                        while (!z && this.g < this.f.size()) {
                            List list4 = this.f;
                            int i = this.g;
                            this.g = i + 1;
                            ax4 ax4Var = (ax4) list4.get(i);
                            File file = this.i;
                            xb1 xb1Var2 = this.b;
                            this.h = ax4Var.a(file, xb1Var2.e, xb1Var2.f, xb1Var2.i);
                            if (this.h != null && this.b.c(this.h.c.getDataClass()) != null) {
                                this.h.c.e(this.b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= arrayListA.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    sx3 sx3Var = (sx3) arrayListA.get(this.c);
                    Class cls5 = (Class) list2.get(this.d);
                    nq8 nq8VarE = this.b.e(cls5);
                    xb1 xb1Var3 = this.b;
                    this.j = new i67(xb1Var3.c.a, sx3Var, xb1Var3.n, xb1Var3.e, xb1Var3.f, nq8VarE, cls5, xb1Var3.i);
                    File fileH = xb1Var3.h.a().h(this.j);
                    this.i = fileH;
                    if (fileH != null) {
                        this.e = sx3Var;
                        this.f = this.b.c.b().g(fileH);
                        this.g = 0;
                    }
                }
            } else if (!File.class.equals(this.b.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.b.d.getClass() + " to " + this.b.k);
            }
        }
        return false;
    }

    @Override // defpackage.na1
    public final void cancel() {
        zw4 zw4Var = this.h;
        if (zw4Var != null) {
            zw4Var.c.cancel();
        }
    }

    @Override // defpackage.ka1
    public final void f(Object obj) {
        this.a.a(this.e, obj, this.h.c, DataSource.d, this.j);
    }
}
