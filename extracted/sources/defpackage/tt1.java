package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException;

/* JADX INFO: loaded from: classes3.dex */
public final class tt1 {
    public final bm5 a;
    public final pa1 b;
    public final vs1 c;
    public final ts1 d;
    public final hq8 e;
    public final es1 f;
    public final dj g;
    public qi6 h;
    public oi6 i;
    public long j;
    public int k;
    public String l;
    public NeneDownloadFailException m;
    public final int n;
    public int o;
    public final xr5 p;

    static {
        eh5.a("Downloader");
    }

    public tt1(pa1 pa1Var, bm5 bm5Var, es1 es1Var, vs1 vs1Var, ts1 ts1Var) {
        dj djVar = new dj();
        djVar.a = new ArrayList();
        this.g = djVar;
        this.h = null;
        this.i = null;
        this.j = 0L;
        this.k = 10;
        this.l = null;
        this.m = null;
        this.o = 0;
        xr5 xr5Var = new xr5();
        xr5Var.c = this;
        xr5Var.a = 1;
        xr5Var.b = 0;
        this.p = xr5Var;
        this.b = pa1Var;
        this.a = bm5Var;
        this.f = es1Var;
        this.c = vs1Var;
        this.d = ts1Var;
        this.e = new hq8();
        this.n = bm5Var.a * 2;
    }

    public final void a(zl7 zl7Var, boolean z) {
        long j = zl7Var.g;
        ArrayList arrayList = this.g.a;
        arrayList.size();
        bm7 bm7Var = new bm7();
        bm7Var.c = 10;
        bm7Var.d = 0;
        bm7Var.a = zl7Var;
        arrayList.add(bm7Var);
        if (z) {
            bm7Var.c = 300;
        } else {
            e(bm7Var);
        }
    }

    public final void b() {
        int i;
        j();
        this.p.a++;
        qi6 qi6Var = this.h;
        if (qi6Var != null) {
            qi6Var.e.set(true);
            qi6Var.c.cancel(true);
            i = 1;
        } else {
            i = 0;
        }
        for (bm7 bm7Var : this.g.a) {
            xl7 xl7Var = bm7Var.b;
            if (xl7Var != null) {
                int i2 = bm7Var.c;
                Pattern pattern = xl7.v;
                if (i2 == 100 || i2 == 200) {
                    i++;
                    xl7Var.e.set(true);
                    xl7Var.c.cancel(true);
                }
            }
        }
        oi6 oi6Var = this.i;
        if (oi6Var != null) {
            i++;
            oi6Var.e.set(true);
            oi6Var.c.cancel(true);
        }
        if (i == 0) {
            h();
        }
    }

    public final void c() {
        i(104);
        dj djVar = this.g;
        djVar.getClass();
        ArrayList arrayList = djVar.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bm7) it.next()).a);
        }
        es1 es1Var = new es1(this.f);
        String str = this.l;
        oi6 oi6Var = new oi6();
        oi6Var.h = this;
        oi6Var.k = es1Var;
        oi6Var.l = str;
        oi6Var.i = arrayList2;
        oi6Var.j = this.d;
        oi6Var.c(this.a.c, new Void[0]);
        this.i = oi6Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt1.d(nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException):void");
    }

    public final void e(bm7 bm7Var) {
        xl7 xl7Var = new xl7(this, new zl7(bm7Var.a));
        bm7Var.b = xl7Var;
        bm7Var.c = 100;
        xl7Var.c(this.a.c, new Void[0]);
    }

    public final void f(xl7 xl7Var, NeneDownloadFailException neneDownloadFailException) throws Throwable {
        int i = 0;
        this.o = 0;
        NeneDownloadFailException neneDownloadFailException2 = this.m;
        if (neneDownloadFailException2 == null) {
            this.m = neneDownloadFailException;
        } else {
            int[] iArr = NeneDownloadFailException.a;
            int iA = neneDownloadFailException.a();
            int iA2 = neneDownloadFailException2.a();
            int i2 = -1;
            int i3 = -1;
            while (true) {
                if (i2 != -1 && i3 != -1) {
                    break;
                }
                int[] iArr2 = NeneDownloadFailException.a;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                if (i4 == iA) {
                    i2 = i;
                }
                if (i4 == iA2) {
                    i3 = i;
                }
                i++;
            }
            if (i2 - i3 <= 0) {
                this.m = neneDownloadFailException;
            }
        }
        k(xl7Var.h, ErrorDTO.CODE_ACCESS_DENIED);
    }

    public final void g(xl7 xl7Var, long j) {
        this.o++;
        dj djVar = this.g;
        djVar.getClass();
        zl7 zl7Var = djVar.f(xl7Var.h).a;
        long j2 = j - zl7Var.g;
        zl7Var.b(j);
        this.j += j2;
        this.e.a(j2);
        if (!djVar.d(ErrorDTO.CODE_ACCESS_DENIED) || this.o < this.n) {
            return;
        }
        for (bm7 bm7Var : djVar.a) {
            if (bm7Var.c == 400 && bm7Var.d < 3) {
                int i = bm7Var.a.a;
                e(bm7Var);
            }
        }
        djVar.e();
    }

    public final void h() {
        this.k = 500;
        this.g.e();
        es1 es1Var = this.f;
        if (es1Var.c != null) {
            pb2.d().e(es1Var.c);
        }
    }

    public final void i(int i) {
        es1 es1Var = this.f;
        if (es1Var.g != i) {
            es1Var.b(i);
            xr5 xr5Var = this.p;
            if (i == 103) {
                xr5Var.t();
                zl5.a.postDelayed(new bm0(xr5Var.a, 4, xr5Var), 750L);
            } else {
                xr5Var.a++;
                j();
            }
            this.b.b(es1Var, 251);
        }
    }

    public final void j() {
        long j = this.j;
        if (j <= 0) {
            return;
        }
        this.f.i += j;
        this.j = 0L;
    }

    public final void k(int i, int i2) throws Throwable {
        dj djVar = this.g;
        bm7 bm7VarF = djVar.f(i);
        if (bm7VarF.c != i2) {
            if (i2 == 400) {
                bm7VarF.d++;
            }
            bm7VarF.c = i2;
            Pattern pattern = xl7.v;
            if (i2 != 100 && i2 != 200) {
                bm7VarF.b = null;
            }
            if (djVar.d(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR)) {
                if (this.k == 100) {
                    i(103);
                    return;
                }
                return;
            }
            if (djVar.d(100)) {
                if (this.k == 100) {
                    i(102);
                    return;
                }
                return;
            }
            Iterator it = djVar.a.iterator();
            while (it.hasNext()) {
                if (((bm7) it.next()).c != 300) {
                    if (djVar.d(500)) {
                        h();
                        return;
                    } else {
                        djVar.e();
                        d(this.m);
                        return;
                    }
                }
            }
            c();
        }
    }
}
