package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class o67 extends tb2 {
    public static final s26 f;
    public final ClassLoader c;
    public final tb2 d;
    public final c24 e;

    static {
        String str = s26.b;
        f = rl3.x("/");
    }

    public o67(ClassLoader classLoader) {
        ww3 ww3Var = tb2.a;
        js3.p(ww3Var, "systemFileSystem");
        this.c = classLoader;
        this.d = ww3Var;
        this.e = a.a(new o06(12, this));
    }

    public static String l0(s26 s26Var) {
        s26 s26Var2 = f;
        s26Var2.getClass();
        js3.p(s26Var, "child");
        return c.b(s26Var2, s26Var, true).d(s26Var2).a.s();
    }

    @Override // defpackage.tb2
    public final List I(s26 s26Var) throws FileNotFoundException {
        String strL0 = l0(s26Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.e.getValue()) {
            tb2 tb2Var = (tb2) pair.a;
            s26 s26Var2 = (s26) pair.b;
            try {
                List listI = tb2Var.I(s26Var2.e(strL0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (ol3.e((s26) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ol3.s((s26) it.next(), s26Var2));
                }
                kotlin.collections.a.b0(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return kotlin.collections.a.P0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + s26Var);
    }

    @Override // defpackage.tb2
    public final List J(s26 s26Var) {
        js3.p(s26Var, "dir");
        String strL0 = l0(s26Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.e.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            tb2 tb2Var = (tb2) pair.a;
            s26 s26Var2 = (s26) pair.b;
            List listJ = tb2Var.J(s26Var2.e(strL0));
            if (listJ != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listJ) {
                    if (ol3.e((s26) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(ol3.s((s26) it2.next(), s26Var2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                kotlin.collections.a.b0(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (z) {
            return kotlin.collections.a.P0(linkedHashSet);
        }
        return null;
    }

    @Override // defpackage.tb2
    public final xj1 P(s26 s26Var) {
        js3.p(s26Var, "path");
        if (!ol3.e(s26Var)) {
            return null;
        }
        String strL0 = l0(s26Var);
        for (Pair pair : (List) this.e.getValue()) {
            xj1 xj1VarP = ((tb2) pair.a).P(((s26) pair.b).e(strL0));
            if (xj1VarP != null) {
                return xj1VarP;
            }
        }
        return null;
    }

    @Override // defpackage.tb2
    public final vw3 R(s26 s26Var) throws FileNotFoundException {
        if (!ol3.e(s26Var)) {
            throw new FileNotFoundException("file not found: " + s26Var);
        }
        String strL0 = l0(s26Var);
        for (Pair pair : (List) this.e.getValue()) {
            try {
                return ((tb2) pair.a).R(((s26) pair.b).e(strL0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + s26Var);
    }

    @Override // defpackage.tb2
    public final by7 U(s26 s26Var, boolean z) throws IOException {
        js3.p(s26Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.tb2
    public final by7 b(s26 s26Var) throws IOException {
        js3.p(s26Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.tb2
    public final void d(s26 s26Var, s26 s26Var2) throws IOException {
        js3.p(s26Var, "source");
        js3.p(s26Var2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.tb2
    public final void k(s26 s26Var) throws IOException {
        js3.p(s26Var, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.tb2
    public final t18 k0(s26 s26Var) throws IOException {
        js3.p(s26Var, "file");
        if (!ol3.e(s26Var)) {
            throw new FileNotFoundException("file not found: " + s26Var);
        }
        s26 s26Var2 = f;
        s26Var2.getClass();
        URL resource = this.c.getResource(c.b(s26Var2, s26Var, false).d(s26Var2).a.s());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + s26Var);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        js3.o(inputStream, "getInputStream(...)");
        return rf0.L(inputStream);
    }

    @Override // defpackage.tb2
    public final void u(s26 s26Var) throws IOException {
        js3.p(s26Var, "path");
        throw new IOException(this + " is read-only");
    }
}
