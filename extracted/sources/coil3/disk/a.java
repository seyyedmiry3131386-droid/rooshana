package coil3.disk;

import defpackage.a27;
import defpackage.a92;
import defpackage.bt2;
import defpackage.e51;
import defpackage.f88;
import defpackage.gp1;
import defpackage.ip1;
import defpackage.js3;
import defpackage.kf1;
import defpackage.lp1;
import defpackage.m88;
import defpackage.n;
import defpackage.rf0;
import defpackage.rm7;
import defpackage.ry;
import defpackage.s26;
import defpackage.sv6;
import defpackage.tb2;
import defpackage.tv6;
import defpackage.ug1;
import defpackage.up1;
import defpackage.w61;
import defpackage.wu8;
import defpackage.xq2;
import defpackage.y61;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable {
    public static final Regex r = new Regex("[a-z0-9_-]{1,120}");
    public final s26 a;
    public final long b;
    public final s26 c;
    public final s26 d;
    public final s26 e;
    public final LinkedHashMap f;
    public final e51 g;
    public final Object h;
    public long i;
    public int j;
    public sv6 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final lp1 q;

    public a(long j, w61 w61Var, tb2 tb2Var, s26 s26Var) {
        this.a = s26Var;
        this.b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = s26Var.e("journal");
        this.d = s26Var.e("journal.tmp");
        this.e = s26Var.e("journal.bkp");
        this.f = new LinkedHashMap(0, 0.75f, true);
        w61 w61VarL0 = w61Var.l0(a27.a());
        y61 y61Var = (y61) w61Var.r0(y61.b);
        if (y61Var == null) {
            ug1 ug1Var = up1.a;
            y61Var = kf1.c;
        }
        this.g = js3.a(w61VarL0.l0(y61Var.F0(1)));
        this.h = new Object();
        this.q = new lp1(tb2Var);
    }

    public static void P(String str) {
        if (!r.f(str)) {
            throw new IllegalArgumentException(rm7.m('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0113 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:26:0x0058, B:28:0x006b, B:30:0x007b, B:32:0x0082, B:27:0x005e, B:36:0x00a2, B:38:0x00a9, B:41:0x00ae, B:43:0x00bf, B:46:0x00c4, B:51:0x00ff, B:53:0x010a, B:57:0x0113, B:47:0x00dc, B:49:0x00f1, B:50:0x00fc, B:35:0x0092, B:60:0x0118, B:61:0x011f), top: B:64:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(coil3.disk.a r10, defpackage.ry r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.a.b(coil3.disk.a, ry, boolean):void");
    }

    public final void D() throws Throwable {
        lp1 lp1Var = this.q;
        s26 s26Var = this.c;
        tv6 tv6VarJ = rf0.j(lp1Var.k0(s26Var));
        try {
            String strY = tv6VarJ.Y(Long.MAX_VALUE);
            String strY2 = tv6VarJ.Y(Long.MAX_VALUE);
            String strY3 = tv6VarJ.Y(Long.MAX_VALUE);
            String strY4 = tv6VarJ.Y(Long.MAX_VALUE);
            String strY5 = tv6VarJ.Y(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strY) || !"1".equals(strY2) || !js3.i(String.valueOf(3), strY3) || !js3.i(String.valueOf(2), strY4) || strY5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strY + ", " + strY2 + ", " + strY3 + ", " + strY4 + ", " + strY5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    I(tv6VarJ.Y(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.j = i - this.f.size();
                    if (tv6VarJ.b()) {
                        lp1Var.getClass();
                        js3.p(s26Var, "file");
                        this.k = rf0.i(new a92(lp1Var.b(s26Var), new n(28, this)));
                    } else {
                        R();
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

    public final void I(String str) throws IOException {
        String strSubstring;
        int iK0 = f88.k0(' ', 0, 6, str);
        if (iK0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iK0 + 1;
        int iK02 = f88.k0(' ', i, 4, str);
        LinkedHashMap linkedHashMap = this.f;
        if (iK02 == -1) {
            strSubstring = str.substring(i);
            js3.o(strSubstring, "substring(...)");
            if (iK0 == 6 && m88.Z(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iK02);
            js3.o(strSubstring, "substring(...)");
        }
        Object gp1Var = linkedHashMap.get(strSubstring);
        if (gp1Var == null) {
            gp1Var = new gp1(this, strSubstring);
            linkedHashMap.put(strSubstring, gp1Var);
        }
        gp1 gp1Var2 = (gp1) gp1Var;
        if (iK02 == -1 || iK0 != 5 || !m88.Z(str, "CLEAN", false)) {
            if (iK02 == -1 && iK0 == 5 && m88.Z(str, "DIRTY", false)) {
                gp1Var2.g = new ry(this, gp1Var2);
                return;
            } else {
                if (iK02 != -1 || iK0 != 4 || !m88.Z(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iK02 + 1);
        js3.o(strSubstring2, "substring(...)");
        List listZ0 = f88.z0(strSubstring2, new char[]{' '});
        gp1Var2.e = true;
        gp1Var2.g = null;
        if (listZ0.size() != 2) {
            throw new IOException("unexpected journal line: " + listZ0);
        }
        try {
            int size = listZ0.size();
            for (int i2 = 0; i2 < size; i2++) {
                gp1Var2.b[i2] = Long.parseLong((String) listZ0.get(i2));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listZ0);
        }
    }

    public final void J(gp1 gp1Var) {
        sv6 sv6Var;
        int i = gp1Var.h;
        String str = gp1Var.a;
        if (i > 0 && (sv6Var = this.k) != null) {
            sv6Var.n0("DIRTY");
            sv6Var.writeByte(32);
            sv6Var.n0(str);
            sv6Var.writeByte(10);
            sv6Var.flush();
        }
        if (gp1Var.h > 0 || gp1Var.g != null) {
            gp1Var.f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.q.y((s26) gp1Var.c.get(i2));
            long j = this.i;
            long[] jArr = gp1Var.b;
            this.i = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.j++;
        sv6 sv6Var2 = this.k;
        if (sv6Var2 != null) {
            sv6Var2.n0("REMOVE");
            sv6Var2.writeByte(32);
            sv6Var2.n0(str);
            sv6Var2.writeByte(10);
            sv6Var2.flush();
        }
        this.f.remove(str);
        if (this.j >= 2000) {
            u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        J(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K() {
        /*
            r4 = this;
        L0:
            long r0 = r4.i
            long r2 = r4.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            gp1 r1 = (defpackage.gp1) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.J(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.disk.a.K():void");
    }

    public final void R() {
        Throwable th;
        synchronized (this.h) {
            try {
                sv6 sv6Var = this.k;
                if (sv6Var != null) {
                    sv6Var.close();
                }
                sv6 sv6VarI = rf0.i(this.q.U(this.d, false));
                try {
                    sv6VarI.n0("libcore.io.DiskLruCache");
                    sv6VarI.writeByte(10);
                    sv6VarI.n0("1");
                    sv6VarI.writeByte(10);
                    sv6VarI.i1(3);
                    sv6VarI.writeByte(10);
                    sv6VarI.i1(2);
                    sv6VarI.writeByte(10);
                    sv6VarI.writeByte(10);
                    for (gp1 gp1Var : this.f.values()) {
                        if (gp1Var.g != null) {
                            sv6VarI.n0("DIRTY");
                            sv6VarI.writeByte(32);
                            sv6VarI.n0(gp1Var.a);
                            sv6VarI.writeByte(10);
                        } else {
                            sv6VarI.n0("CLEAN");
                            sv6VarI.writeByte(32);
                            sv6VarI.n0(gp1Var.a);
                            for (long j : gp1Var.b) {
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
                if (this.q.D(this.c)) {
                    this.q.d(this.c, this.e);
                    this.q.d(this.d, this.c);
                    this.q.y(this.e);
                } else {
                    this.q.d(this.d, this.c);
                }
                lp1 lp1Var = this.q;
                s26 s26Var = this.c;
                lp1Var.getClass();
                js3.p(s26Var, "file");
                this.k = rf0.i(new a92(lp1Var.b(s26Var), new n(28, this)));
                this.j = 0;
                this.l = false;
                this.p = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.m && !this.n) {
                    for (gp1 gp1Var : (gp1[]) this.f.values().toArray(new gp1[0])) {
                        ry ryVar = gp1Var.g;
                        if (ryVar != null) {
                            gp1 gp1Var2 = (gp1) ryVar.c;
                            if (js3.i(gp1Var2.g, ryVar)) {
                                gp1Var2.f = true;
                            }
                        }
                    }
                    K();
                    js3.j(this.g, null);
                    sv6 sv6Var = this.k;
                    js3.m(sv6Var);
                    sv6Var.close();
                    this.k = null;
                    this.n = true;
                    return;
                }
                this.n = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ry d(String str) {
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            P(str);
            k();
            gp1 gp1Var = (gp1) this.f.get(str);
            if ((gp1Var != null ? gp1Var.g : null) != null) {
                return null;
            }
            if (gp1Var != null && gp1Var.h != 0) {
                return null;
            }
            if (!this.o && !this.p) {
                sv6 sv6Var = this.k;
                js3.m(sv6Var);
                sv6Var.n0("DIRTY");
                sv6Var.writeByte(32);
                sv6Var.n0(str);
                sv6Var.writeByte(10);
                sv6Var.flush();
                if (this.l) {
                    return null;
                }
                if (gp1Var == null) {
                    gp1Var = new gp1(this, str);
                    this.f.put(str, gp1Var);
                }
                ry ryVar = new ry(this, gp1Var);
                gp1Var.g = ryVar;
                return ryVar;
            }
            u();
            return null;
        }
    }

    public final ip1 g(String str) {
        ip1 ip1VarA;
        synchronized (this.h) {
            if (this.n) {
                throw new IllegalStateException("cache is closed");
            }
            P(str);
            k();
            gp1 gp1Var = (gp1) this.f.get(str);
            if (gp1Var != null && (ip1VarA = gp1Var.a()) != null) {
                boolean z = true;
                this.j++;
                sv6 sv6Var = this.k;
                js3.m(sv6Var);
                sv6Var.n0("READ");
                sv6Var.writeByte(32);
                sv6Var.n0(str);
                sv6Var.writeByte(10);
                sv6Var.flush();
                if (this.j < 2000) {
                    z = false;
                }
                if (z) {
                    u();
                }
                return ip1VarA;
            }
            return null;
        }
    }

    public final void k() {
        synchronized (this.h) {
            try {
                if (this.m) {
                    return;
                }
                this.q.y(this.d);
                if (this.q.D(this.e)) {
                    if (this.q.D(this.c)) {
                        this.q.y(this.e);
                    } else {
                        this.q.d(this.e, this.c);
                    }
                }
                if (this.q.D(this.c)) {
                    try {
                        D();
                        y();
                        this.m = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            xq2.q(this.q, this.a);
                            this.n = false;
                            R();
                            this.m = true;
                        } catch (Throwable th) {
                            this.n = false;
                            throw th;
                        }
                    }
                }
                R();
                this.m = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u() {
        bt2.G(this.g, null, null, new DiskLruCache$launchCleanup$1(this, null), 3);
    }

    public final void y() {
        Iterator it = this.f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            gp1 gp1Var = (gp1) it.next();
            int i = 0;
            if (gp1Var.g == null) {
                while (i < 2) {
                    j += gp1Var.b[i];
                    i++;
                }
            } else {
                gp1Var.g = null;
                while (i < 2) {
                    s26 s26Var = (s26) gp1Var.c.get(i);
                    lp1 lp1Var = this.q;
                    lp1Var.y(s26Var);
                    lp1Var.y((s26) gp1Var.d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.i = j;
    }
}
