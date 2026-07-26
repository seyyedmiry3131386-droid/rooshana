package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tb2 implements Closeable {
    public static final ww3 a;
    public static final s26 b;

    static {
        ww3 ww3Var;
        try {
            Class.forName("java.nio.file.Files");
            ww3Var = new vn5();
        } catch (ClassNotFoundException unused) {
            ww3Var = new ww3();
        }
        a = ww3Var;
        String str = s26.b;
        String property = System.getProperty("java.io.tmpdir");
        js3.o(property, "getProperty(...)");
        b = rl3.x(property);
        ClassLoader classLoader = o67.class.getClassLoader();
        js3.o(classLoader, "getClassLoader(...)");
        new o67(classLoader);
    }

    public final boolean D(s26 s26Var) {
        js3.p(s26Var, "path");
        return P(s26Var) != null;
    }

    public abstract List I(s26 s26Var);

    public abstract List J(s26 s26Var);

    public final xj1 K(s26 s26Var) throws FileNotFoundException {
        js3.p(s26Var, "path");
        xj1 xj1VarP = P(s26Var);
        if (xj1VarP != null) {
            return xj1VarP;
        }
        throw new FileNotFoundException("no such file: " + s26Var);
    }

    public abstract xj1 P(s26 s26Var);

    public abstract vw3 R(s26 s26Var);

    public abstract by7 U(s26 s26Var, boolean z);

    public abstract by7 b(s26 s26Var);

    public abstract void d(s26 s26Var, s26 s26Var2);

    public final void g(s26 s26Var) {
        ov ovVar = new ov();
        while (s26Var != null && !D(s26Var)) {
            ovVar.addFirst(s26Var);
            s26Var = s26Var.c();
        }
        Iterator<E> it = ovVar.iterator();
        while (it.hasNext()) {
            k((s26) it.next());
        }
    }

    public abstract void k(s26 s26Var);

    public abstract t18 k0(s26 s26Var);

    public abstract void u(s26 s26Var);

    public final void y(s26 s26Var) {
        js3.p(s26Var, "path");
        u(s26Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
