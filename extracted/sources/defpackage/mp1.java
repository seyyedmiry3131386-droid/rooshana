package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class mp1 implements Closeable, Flushable {
    public static final Regex t = new Regex("[a-z0-9_-]{1,120}");
    public static final String u = "CLEAN";
    public static final String v = "DIRTY";
    public static final String w = "REMOVE";
    public static final String x = "READ";
    public final s26 a;
    public final kp1 b;
    public final long c;
    public final s26 d;
    public final s26 e;
    public final s26 f;
    public long g;
    public sv6 h;
    public final LinkedHashMap i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public long q;
    public final ff8 r;
    public final jp1 s;

    public mp1(tb2 tb2Var, s26 s26Var, long j, gf8 gf8Var) {
        js3.p(tb2Var, "fileSystem");
        js3.p(gf8Var, "taskRunner");
        this.a = s26Var;
        this.b = new kp1(tb2Var);
        this.c = j;
        this.i = new LinkedHashMap(0, 0.75f, true);
        this.r = gf8Var.d();
        this.s = new jp1(this, dw1.s(new StringBuilder(), ih9.b, " Cache"), 0);
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.d = s26Var.e("journal");
        this.e = s26Var.e("journal.tmp");
        this.f = s26Var.e("journal.bkp");
    }

    public static void U(String str) {
        if (!t.f(str)) {
            throw new IllegalArgumentException(rm7.m('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public final void D() {
        s26 s26Var = this.e;
        kp1 kp1Var = this.b;
        gh9.d(kp1Var, s26Var);
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            js3.o(next, "next(...)");
            fp1 fp1Var = (fp1) next;
            int i = 0;
            if (fp1Var.g == null) {
                while (i < 2) {
                    this.g += fp1Var.b[i];
                    i++;
                }
            } else {
                fp1Var.g = null;
                while (i < 2) {
                    gh9.d(kp1Var, (s26) fp1Var.c.get(i));
                    gh9.d(kp1Var, (s26) fp1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void I() throws Throwable {
        kp1 kp1Var = this.b;
        s26 s26Var = this.d;
        tv6 tv6VarJ = rf0.j(kp1Var.k0(s26Var));
        try {
            String strY = tv6VarJ.Y(Long.MAX_VALUE);
            String strY2 = tv6VarJ.Y(Long.MAX_VALUE);
            String strY3 = tv6VarJ.Y(Long.MAX_VALUE);
            String strY4 = tv6VarJ.Y(Long.MAX_VALUE);
            String strY5 = tv6VarJ.Y(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strY) || !"1".equals(strY2) || !js3.i(String.valueOf(201105), strY3) || !js3.i(String.valueOf(2), strY4) || strY5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strY + ", " + strY2 + ", " + strY4 + ", " + strY5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    J(tv6VarJ.Y(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.i.size();
                    if (tv6VarJ.b()) {
                        sv6 sv6Var = this.h;
                        if (sv6Var != null) {
                            gh9.b(sv6Var);
                        }
                        kp1Var.getClass();
                        js3.p(s26Var, "file");
                        this.h = rf0.i(new z82(kp1Var.b(s26Var), new n(27, this)));
                    } else {
                        K();
                    }
                    try {
                        tv6VarJ.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                tv6VarJ.close();
            } catch (Throwable th3) {
                wu8.f(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void J(String str) throws IOException {
        String strSubstring;
        int iK0 = f88.k0(' ', 0, 6, str);
        if (iK0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iK0 + 1;
        int iK02 = f88.k0(' ', i, 4, str);
        LinkedHashMap linkedHashMap = this.i;
        if (iK02 == -1) {
            strSubstring = str.substring(i);
            js3.o(strSubstring, "substring(...)");
            String str2 = w;
            if (iK0 == str2.length() && m88.Z(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iK02);
            js3.o(strSubstring, "substring(...)");
        }
        fp1 fp1Var = (fp1) linkedHashMap.get(strSubstring);
        if (fp1Var == null) {
            fp1Var = new fp1(this, strSubstring);
            linkedHashMap.put(strSubstring, fp1Var);
        }
        if (iK02 != -1) {
            String str3 = u;
            if (iK0 == str3.length() && m88.Z(str, str3, false)) {
                String strSubstring2 = str.substring(iK02 + 1);
                js3.o(strSubstring2, "substring(...)");
                List listZ0 = f88.z0(strSubstring2, new char[]{' '});
                fp1Var.e = true;
                fp1Var.g = null;
                int size = listZ0.size();
                fp1Var.j.getClass();
                if (size != 2) {
                    throw new IOException("unexpected journal line: " + listZ0);
                }
                try {
                    int size2 = listZ0.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        fp1Var.b[i2] = Long.parseLong((String) listZ0.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + listZ0);
                }
            }
        }
        if (iK02 == -1) {
            String str4 = v;
            if (iK0 == str4.length() && m88.Z(str, str4, false)) {
                fp1Var.g = new ry(this, fp1Var);
                return;
            }
        }
        if (iK02 == -1) {
            String str5 = x;
            if (iK0 == str5.length() && m88.Z(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void K() {
        Throwable th;
        try {
            sv6 sv6Var = this.h;
            if (sv6Var != null) {
                sv6Var.close();
            }
            sv6 sv6VarI = rf0.i(this.b.U(this.e, false));
            try {
                sv6VarI.n0("libcore.io.DiskLruCache");
                sv6VarI.writeByte(10);
                sv6VarI.n0("1");
                sv6VarI.writeByte(10);
                sv6VarI.i1(201105);
                sv6VarI.writeByte(10);
                sv6VarI.i1(2);
                sv6VarI.writeByte(10);
                sv6VarI.writeByte(10);
                for (Object obj : this.i.values()) {
                    js3.o(obj, "next(...)");
                    fp1 fp1Var = (fp1) obj;
                    if (fp1Var.g != null) {
                        sv6VarI.n0(v);
                        sv6VarI.writeByte(32);
                        sv6VarI.n0(fp1Var.a);
                        sv6VarI.writeByte(10);
                    } else {
                        sv6VarI.n0(u);
                        sv6VarI.writeByte(32);
                        sv6VarI.n0(fp1Var.a);
                        for (long j : fp1Var.b) {
                            sv6VarI.writeByte(32);
                            sv6VarI.i1(j);
                        }
                        sv6VarI.writeByte(10);
                    }
                }
                try {
                    sv6VarI.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    sv6VarI.close();
                } catch (Throwable th4) {
                    wu8.f(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            if (this.b.D(this.d)) {
                this.b.d(this.d, this.f);
                this.b.d(this.e, this.d);
                gh9.d(this.b, this.f);
            } else {
                this.b.d(this.e, this.d);
            }
            sv6 sv6Var2 = this.h;
            if (sv6Var2 != null) {
                gh9.b(sv6Var2);
            }
            kp1 kp1Var = this.b;
            s26 s26Var = this.d;
            kp1Var.getClass();
            js3.p(s26Var, "file");
            this.h = rf0.i(new z82(kp1Var.b(s26Var), new n(27, this)));
            this.k = false;
            this.p = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void P(fp1 fp1Var) {
        sv6 sv6Var;
        String str = fp1Var.a;
        if (!this.l) {
            if (fp1Var.h > 0 && (sv6Var = this.h) != null) {
                sv6Var.n0(v);
                sv6Var.writeByte(32);
                sv6Var.n0(str);
                sv6Var.writeByte(10);
                sv6Var.flush();
            }
            if (fp1Var.h > 0 || fp1Var.g != null) {
                fp1Var.f = true;
                return;
            }
        }
        ry ryVar = fp1Var.g;
        if (ryVar != null) {
            ryVar.e();
        }
        for (int i = 0; i < 2; i++) {
            gh9.d(this.b, (s26) fp1Var.c.get(i));
            long j = this.g;
            long[] jArr = fp1Var.b;
            this.g = j - jArr[i];
            jArr[i] = 0;
        }
        this.j++;
        sv6 sv6Var2 = this.h;
        if (sv6Var2 != null) {
            sv6Var2.n0(w);
            sv6Var2.writeByte(32);
            sv6Var2.n0(str);
            sv6Var2.writeByte(10);
        }
        this.i.remove(str);
        if (y()) {
            this.r.d(this.s, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        P(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            r4 = this;
        L0:
            long r0 = r4.g
            long r2 = r4.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2c
            java.util.LinkedHashMap r0 = r4.i
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            defpackage.js3.o(r1, r2)
            fp1 r1 = (defpackage.fp1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.P(r1)
            goto L0
        L2b:
            return
        L2c:
            r0 = 0
            r4.o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.R():void");
    }

    public final synchronized void b() {
        if (this.n) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.m && !this.n) {
                Collection collectionValues = this.i.values();
                js3.o(collectionValues, "<get-values>(...)");
                for (fp1 fp1Var : (fp1[]) collectionValues.toArray(new fp1[0])) {
                    js3.m(fp1Var);
                    ry ryVar = fp1Var.g;
                    if (ryVar != null) {
                        ryVar.e();
                    }
                }
                R();
                sv6 sv6Var = this.h;
                if (sv6Var != null) {
                    gh9.b(sv6Var);
                }
                this.h = null;
                this.n = true;
                return;
            }
            this.n = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(ry ryVar, boolean z) {
        fp1 fp1Var = (fp1) ryVar.c;
        if (!js3.i(fp1Var.g, ryVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !fp1Var.e) {
            for (int i = 0; i < 2; i++) {
                boolean[] zArr = (boolean[]) ryVar.d;
                js3.m(zArr);
                if (!zArr[i]) {
                    ryVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.b.D((s26) fp1Var.d.get(i))) {
                    ryVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            s26 s26Var = (s26) fp1Var.d.get(i2);
            if (!z || fp1Var.f) {
                gh9.d(this.b, s26Var);
            } else if (this.b.D(s26Var)) {
                s26 s26Var2 = (s26) fp1Var.c.get(i2);
                this.b.d(s26Var, s26Var2);
                long j = fp1Var.b[i2];
                Long l = (Long) this.b.K(s26Var2).e;
                long jLongValue = l != null ? l.longValue() : 0L;
                fp1Var.b[i2] = jLongValue;
                this.g = (this.g - j) + jLongValue;
            }
        }
        fp1Var.g = null;
        if (fp1Var.f) {
            P(fp1Var);
            return;
        }
        this.j++;
        sv6 sv6Var = this.h;
        js3.m(sv6Var);
        if (fp1Var.e || z) {
            fp1Var.e = true;
            sv6Var.n0(u);
            sv6Var.writeByte(32);
            sv6Var.n0(fp1Var.a);
            for (long j2 : fp1Var.b) {
                sv6Var.writeByte(32);
                sv6Var.i1(j2);
            }
            sv6Var.writeByte(10);
            if (z) {
                long j3 = this.q;
                this.q = 1 + j3;
                fp1Var.i = j3;
            }
        } else {
            this.i.remove(fp1Var.a);
            sv6Var.n0(w);
            sv6Var.writeByte(32);
            sv6Var.n0(fp1Var.a);
            sv6Var.writeByte(10);
        }
        sv6Var.flush();
        if (this.g > this.c || y()) {
            this.r.d(this.s, 0L);
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.m) {
            b();
            R();
            sv6 sv6Var = this.h;
            js3.m(sv6Var);
            sv6Var.flush();
        }
    }

    public final synchronized ry g(long j, String str) {
        js3.p(str, "key");
        u();
        b();
        U(str);
        fp1 fp1Var = (fp1) this.i.get(str);
        if (j != -1 && (fp1Var == null || fp1Var.i != j)) {
            return null;
        }
        if ((fp1Var != null ? fp1Var.g : null) != null) {
            return null;
        }
        if (fp1Var != null && fp1Var.h != 0) {
            return null;
        }
        if (!this.o && !this.p) {
            sv6 sv6Var = this.h;
            js3.m(sv6Var);
            sv6Var.n0(v);
            sv6Var.writeByte(32);
            sv6Var.n0(str);
            sv6Var.writeByte(10);
            sv6Var.flush();
            if (this.k) {
                return null;
            }
            if (fp1Var == null) {
                fp1Var = new fp1(this, str);
                this.i.put(str, fp1Var);
            }
            ry ryVar = new ry(this, fp1Var);
            fp1Var.g = ryVar;
            return ryVar;
        }
        this.r.d(this.s, 0L);
        return null;
    }

    public final synchronized hp1 k(String str) {
        js3.p(str, "key");
        u();
        b();
        U(str);
        fp1 fp1Var = (fp1) this.i.get(str);
        if (fp1Var == null) {
            return null;
        }
        hp1 hp1VarA = fp1Var.a();
        if (hp1VarA == null) {
            return null;
        }
        this.j++;
        sv6 sv6Var = this.h;
        js3.m(sv6Var);
        sv6Var.n0(x);
        sv6Var.writeByte(32);
        sv6Var.n0(str);
        sv6Var.writeByte(10);
        if (y()) {
            this.r.d(this.s, 0L);
        }
        return hp1VarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00bf, B:43:0x0087, B:45:0x00b8, B:47:0x00bc, B:48:0x00be, B:36:0x006c, B:52:0x00c6, B:27:0x005b, B:24:0x0056, B:44:0x00ae, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00bf, B:43:0x0087, B:45:0x00b8, B:47:0x00bc, B:48:0x00be, B:36:0x006c, B:52:0x00c6, B:27:0x005b, B:24:0x0056, B:44:0x00ae, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void u() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp1.u():void");
    }

    public final boolean y() {
        int i = this.j;
        return i >= 2000 && i >= this.i.size();
    }
}
