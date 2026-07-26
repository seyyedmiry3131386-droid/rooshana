package defpackage;

import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        ByteString byteString = ByteString.d;
        a = fv.w("/");
        b = fv.w("\\");
        c = fv.w("/\\");
        d = fv.w(".");
        e = fv.w("..");
    }

    public static final int a(s26 s26Var) {
        ByteString byteString = s26Var.a;
        if (byteString.e() != 0) {
            if (byteString.j(0) != 47) {
                if (byteString.j(0) == 92) {
                    if (byteString.e() > 2 && byteString.j(1) == 92) {
                        ByteString byteString2 = b;
                        js3.p(byteString2, "other");
                        int iG = byteString.g(2, byteString2.i());
                        return iG == -1 ? byteString.e() : iG;
                    }
                } else if (byteString.e() > 2 && byteString.j(1) == 58 && byteString.j(2) == 92) {
                    char cJ = (char) byteString.j(0);
                    if ('a' <= cJ && cJ < '{') {
                        return 3;
                    }
                    if ('A' <= cJ && cJ < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final s26 b(s26 s26Var, s26 s26Var2, boolean z) {
        js3.p(s26Var2, "child");
        if (a(s26Var2) != -1 || s26Var2.g() != null) {
            return s26Var2;
        }
        ByteString byteStringC = c(s26Var);
        if (byteStringC == null && (byteStringC = c(s26Var2)) == null) {
            byteStringC = f(s26.b);
        }
        gh0 gh0Var = new gh0();
        gh0Var.L0(s26Var.a);
        if (gh0Var.b > 0) {
            gh0Var.L0(byteStringC);
        }
        gh0Var.L0(s26Var2.a);
        return d(gh0Var, z);
    }

    public static final ByteString c(s26 s26Var) {
        ByteString byteString = s26Var.a;
        ByteString byteString2 = a;
        if (ByteString.h(byteString, byteString2) != -1) {
            return byteString2;
        }
        ByteString byteString3 = s26Var.a;
        ByteString byteString4 = b;
        if (ByteString.h(byteString3, byteString4) != -1) {
            return byteString4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120 A[EDGE_INSN: B:98:0x0120->B:81:0x0120 BREAK  A[LOOP:1: B:53:0x00bb->B:112:0x00bb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.s26 d(defpackage.gh0 r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.d(gh0, boolean):s26");
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(rm7.n(b2, "not a directory separator: "));
    }

    public static final ByteString f(String str) {
        if (js3.i(str, "/")) {
            return a;
        }
        if (js3.i(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(dw1.n("not a directory separator: ", str));
    }
}
