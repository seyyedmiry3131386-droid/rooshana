package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class es1 implements bs1 {
    public final int a;
    public String b;
    public String c;
    public final String d;
    public Object e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;

    static {
        eh5.a("DownloadItem");
    }

    public es1(int i, String str, String str2, String str3, Object obj) {
        this.f = 190;
        this.g = 191;
        this.h = -1L;
        this.i = 0L;
        this.j = -1L;
        this.k = 0L;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = obj;
    }

    public final boolean a(int i, String str) {
        int i2 = this.f;
        if (i2 == 190) {
            return true;
        }
        if (i2 == 150) {
            if (i == 110) {
                return true;
            }
        } else if (i2 == 100) {
            if (i == 120 || i == 150 || i == 140 || i == 130 || i == 110) {
                return true;
            }
        } else if (i2 == 130) {
            if (i == 110) {
                return true;
            }
        } else if (i2 == 140) {
            if (i == 150) {
                return true;
            }
        } else if (i2 == 120) {
            if (i == 150 || i == 110) {
                return true;
            }
        } else if (i2 == 110 && (i == 120 || i == 150 || i == 100)) {
            return true;
        }
        dh5.c(i2);
        dh5.c(i);
        toString();
        return false;
    }

    public final void b(int i) {
        int i2 = this.g;
        if (i2 != 191 && (i2 != 101 ? i2 != 102 ? i2 != 103 ? i2 != 131 || (i != 131 && i != 1311 && i != 132 && i != 133 && i != 1331 && i != 1332 && i != 1333 && i != 1334 && i != 1335 && i != 134 && i != 1341 && i != 1342 && i != 135 && i != 1351 && i != 136 && i != 137) : i != 102 && i != 104 : i != 103 && i != 104 : i != 102 && i != 104)) {
            dh5.a(i2);
            dh5.a(i);
            toString();
        }
        if (i != 102 && i != 103) {
            this.k = 0L;
        }
        this.g = i;
    }

    public final void c(int i) {
        a(i, "DownloadItem.setStatus");
        this.f = i;
        this.k = 0L;
        if (i == 100) {
            this.g = 101;
            return;
        }
        if (i == 110) {
            this.g = 111;
            return;
        }
        if (i == 120) {
            this.g = 121;
            return;
        }
        if (i == 130) {
            this.g = 131;
            return;
        }
        if (i == 140) {
            this.g = 141;
        } else if (i == 150) {
            this.g = 151;
        } else {
            if (i != 190) {
                return;
            }
            this.g = 191;
        }
    }

    public final String toString() {
        StringBuilder sbA = o40.A(128, "[");
        sbA.append(this.a);
        sbA.append(" key=");
        sbA.append(this.d);
        sbA.append(" tag=");
        sbA.append(this.e);
        String strC = dh5.c(this.f);
        sbA.append(" ");
        sbA.append(strC);
        String strA = dh5.a(this.g);
        if (!strA.equals(strC)) {
            t61.y(sbA, "(", strA, ")");
        }
        sbA.append(" ");
        sbA.append(this.i);
        sbA.append("/");
        sbA.append(this.h);
        sbA.append("(");
        long j = this.h;
        sbA.append(j > 0 ? (this.i * 100) / j : 0L);
        sbA.append("%) url=");
        String str = this.b;
        if (str == null) {
            sbA.append("<not set>");
        } else {
            sbA.append(str);
        }
        sbA.append(" file=");
        String str2 = this.c;
        if (str2 == null) {
            sbA.append("<not set>");
        } else {
            sbA.append(this.c.substring(str2.lastIndexOf("/") + 1));
        }
        sbA.append(" time=");
        sbA.append(new Date(this.j).toString());
        sbA.append("]");
        return sbA.toString();
    }

    public es1(int i, String str, String str2, String str3, Object obj, int i2, int i3, long j, long j2, long j3) {
        this.k = 0L;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = obj;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = j2;
        this.j = j3;
    }

    public es1(es1 es1Var) {
        this.f = 190;
        this.g = 191;
        this.h = -1L;
        this.i = 0L;
        this.j = -1L;
        this.k = 0L;
        this.a = es1Var.a;
        this.b = es1Var.b;
        this.c = es1Var.c;
        this.d = es1Var.d;
        this.e = es1Var.e;
        this.f = es1Var.f;
        this.g = es1Var.g;
        this.h = es1Var.h;
        this.i = es1Var.i;
        this.j = es1Var.j;
    }
}
