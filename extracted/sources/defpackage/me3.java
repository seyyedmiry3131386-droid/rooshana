package defpackage;

import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class me3 {
    static {
        ByteString byteString = ByteString.d;
        fv.w("\"\\");
        fv.w("\t ,=");
    }

    public static final boolean a(g77 g77Var) {
        if (js3.i(g77Var.a.b, "HEAD")) {
            return false;
        }
        int i = g77Var.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || ih9.e(g77Var) != -1) {
            return true;
        }
        String strA = g77Var.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.th0 r35, defpackage.se3 r36, defpackage.by2 r37) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me3.b(th0, se3, by2):void");
    }
}
