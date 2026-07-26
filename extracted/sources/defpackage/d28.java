package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d28 {
    public static final long a = w07.e(14);
    public static final long b = w07.e(0);
    public static final long c = zu0.g;
    public static final bi8 d;

    static {
        long j = zu0.b;
        d = j != 16 ? new rv0(j) : ai8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.c28 a(defpackage.c28 r24, long r25, defpackage.ch0 r27, float r28, long r29, defpackage.fj2 r31, defpackage.si2 r32, defpackage.cj2 r33, defpackage.ph2 r34, java.lang.String r35, long r36, defpackage.ba0 r38, defpackage.ci8 r39, defpackage.wc4 r40, long r41, defpackage.qg8 r43, defpackage.ur7 r44, defpackage.aa6 r45, defpackage.iv1 r46) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d28.a(c28, long, ch0, float, long, fj2, si2, cj2, ph2, java.lang.String, long, ba0, ci8, wc4, long, qg8, ur7, aa6, iv1):c28");
    }

    public static final Object b(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        kj8[] kj8VarArr = jj8.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    tn3.a("Cannot perform operation for Unspecified type.");
                }
                if (!kj8.a(jj8.b(j), jj8.b(j2))) {
                    tn3.a("Cannot perform operation for " + ((Object) kj8.b(jj8.b(j))) + " and " + ((Object) kj8.b(jj8.b(j2))));
                }
                return w07.h(wq2.L(jj8.c(j), jj8.c(j2), f), j3);
            }
        }
        return ((jj8) b(f, new jj8(j), new jj8(j2))).a;
    }
}
