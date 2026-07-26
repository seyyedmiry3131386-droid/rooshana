package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class zg9 extends tb2 {
    public static final s26 f;
    public final s26 c;
    public final tb2 d;
    public final LinkedHashMap e;

    static {
        String str = s26.b;
        f = rl3.x("/");
    }

    public zg9(s26 s26Var, tb2 tb2Var, LinkedHashMap linkedHashMap) {
        js3.p(tb2Var, "fileSystem");
        this.c = s26Var;
        this.d = tb2Var;
        this.e = linkedHashMap;
    }

    @Override // defpackage.tb2
    public final List I(s26 s26Var) throws IOException {
        List listL0 = l0(s26Var, true);
        js3.m(listL0);
        return listL0;
    }

    @Override // defpackage.tb2
    public final List J(s26 s26Var) {
        js3.p(s26Var, "dir");
        return l0(s26Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // defpackage.tb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.xj1 P(defpackage.s26 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg9.P(s26):xj1");
    }

    @Override // defpackage.tb2
    public final vw3 R(s26 s26Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.tb2
    public final by7 U(s26 s26Var, boolean z) throws IOException {
        js3.p(s26Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.tb2
    public final by7 b(s26 s26Var) throws IOException {
        js3.p(s26Var, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.tb2
    public final void d(s26 s26Var, s26 s26Var2) throws IOException {
        js3.p(s26Var, "source");
        js3.p(s26Var2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.tb2
    public final void k(s26 s26Var) throws IOException {
        js3.p(s26Var, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.tb2
    public final t18 k0(s26 s26Var) throws Throwable {
        Throwable th;
        tv6 tv6VarJ;
        js3.p(s26Var, "file");
        s26 s26Var2 = f;
        s26Var2.getClass();
        yg9 yg9Var = (yg9) this.e.get(c.b(s26Var2, s26Var, true));
        if (yg9Var == null) {
            throw new FileNotFoundException("no such file: " + s26Var);
        }
        long j = yg9Var.f;
        vw3 vw3VarR = this.d.R(this.c);
        try {
            tv6VarJ = rf0.j(vw3VarR.b(yg9Var.h));
            try {
                vw3VarR.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (vw3VarR != null) {
                try {
                    vw3VarR.close();
                } catch (Throwable th4) {
                    wu8.f(th3, th4);
                }
            }
            th = th3;
            tv6VarJ = null;
        }
        if (th != null) {
            throw th;
        }
        js3.p(tv6VarJ, "<this>");
        uy6.k(tv6VarJ, null);
        if (yg9Var.g == 0) {
            return new ld2(tv6VarJ, j, true);
        }
        return new ld2(new kn3(rf0.j(new ld2(tv6VarJ, yg9Var.e, true)), new Inflater(true)), j, false);
    }

    public final List l0(s26 s26Var, boolean z) throws IOException {
        s26 s26Var2 = f;
        s26Var2.getClass();
        js3.p(s26Var, "child");
        yg9 yg9Var = (yg9) this.e.get(c.b(s26Var2, s26Var, true));
        if (yg9Var != null) {
            return a.P0(yg9Var.q);
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + s26Var);
    }

    @Override // defpackage.tb2
    public final void u(s26 s26Var) throws IOException {
        js3.p(s26Var, "path");
        throw new IOException("zip file systems are read-only");
    }
}
