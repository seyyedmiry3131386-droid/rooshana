package defpackage;

import com.bumptech.glide.Priority;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xb1 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public ft2 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public x41 h;
    public sv5 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public sx3 n;
    public Priority o;
    public zo1 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                zw4 zw4Var = (zw4) arrayListB.get(i);
                sx3 sx3Var = zw4Var.a;
                List list = zw4Var.b;
                if (!arrayList.contains(sx3Var)) {
                    arrayList.add(zw4Var.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((sx3) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listG = this.c.b().g(this.d);
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                zw4 zw4VarA = ((ax4) listG.get(i)).a(this.d, this.e, this.f, this.i);
                if (zw4VarA != null) {
                    arrayList.add(zw4VarA);
                }
            }
        }
        return arrayList;
    }

    public final ea4 c(Class cls) {
        ea4 ea4Var;
        Class cls2;
        y27 y27VarB = this.c.b();
        Class cls3 = this.g;
        Class cls4 = this.k;
        fa4 fa4Var = y27VarB.i;
        j95 j95Var = (j95) fa4Var.b.getAndSet(null);
        if (j95Var == null) {
            j95Var = new j95();
        }
        j95Var.a = cls;
        j95Var.b = cls3;
        j95Var.c = cls4;
        synchronized (fa4Var.a) {
            ea4Var = (ea4) fa4Var.a.get(j95Var);
        }
        fa4Var.b.set(j95Var);
        y27VarB.i.getClass();
        if (fa4.c.equals(ea4Var)) {
            return null;
        }
        if (ea4Var != null) {
            return ea4Var;
        }
        ea4 ea4Var2 = null;
        ArrayList arrayListE = y27VarB.e(cls, cls3, cls4);
        if (arrayListE.isEmpty()) {
            cls2 = cls;
        } else {
            cls2 = cls;
            ea4Var2 = new ea4(cls2, cls3, cls4, arrayListE, y27VarB.j);
        }
        ea4 ea4Var3 = ea4Var2;
        y27VarB.i.a(cls2, cls3, cls4, ea4Var3);
        return ea4Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.r12 d(java.lang.Object r6) {
        /*
            r5 = this;
            ft2 r0 = r5.c
            y27 r0 = r0.b()
            dj r0 = r0.b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            t12 r3 = (defpackage.t12) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            r12 r1 = r3.b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L42
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = "Failed to find source encoder for data class: "
            java.lang.String r6 = defpackage.bl4.v(r1, r6)
            r0.<init>(r6)
            throw r0
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb1.d(java.lang.Object):r12");
    }

    public final nq8 e(Class cls) {
        nq8 nq8Var = (nq8) this.j.get(cls);
        if (nq8Var == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nq8Var = (nq8) entry.getValue();
                    break;
                }
            }
        }
        if (nq8Var != null) {
            return nq8Var;
        }
        if (this.j.isEmpty() && this.q) {
            throw new IllegalArgumentException(bl4.t(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return xx8.b;
    }
}
