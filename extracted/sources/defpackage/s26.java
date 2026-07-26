package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class s26 implements Comparable {
    public static final String b;
    public final ByteString a;

    static {
        String str = File.separator;
        js3.o(str, "separator");
        b = str;
    }

    public s26(ByteString byteString) {
        js3.p(byteString, "bytes");
        this.a = byteString;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = c.a(this);
        ByteString byteString = this.a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < byteString.e() && byteString.j(iA) == 92) {
            iA++;
        }
        int iE = byteString.e();
        int i = iA;
        while (iA < iE) {
            if (byteString.j(iA) == 47 || byteString.j(iA) == 92) {
                arrayList.add(byteString.p(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < byteString.e()) {
            arrayList.add(byteString.p(i, byteString.e()));
        }
        return arrayList;
    }

    public final String b() {
        ByteString byteString = c.a;
        ByteString byteStringQ = this.a;
        int iL = ByteString.l(byteStringQ, byteString);
        if (iL == -1) {
            iL = ByteString.l(byteStringQ, c.b);
        }
        if (iL != -1) {
            byteStringQ = ByteString.q(byteStringQ, iL + 1, 0, 2);
        } else if (g() != null && byteStringQ.e() == 2) {
            byteStringQ = ByteString.d;
        }
        return byteStringQ.s();
    }

    public final s26 c() {
        ByteString byteString = c.d;
        ByteString byteString2 = this.a;
        if (js3.i(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = c.a;
        if (js3.i(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = c.b;
        if (js3.i(byteString2, byteString4)) {
            return null;
        }
        ByteString byteString5 = c.e;
        byteString2.getClass();
        js3.p(byteString5, "suffix");
        int iE = byteString2.e();
        byte[] bArr = byteString5.a;
        if (byteString2.m(iE - bArr.length, byteString5, bArr.length) && (byteString2.e() == 2 || byteString2.m(byteString2.e() - 3, byteString3, 1) || byteString2.m(byteString2.e() - 3, byteString4, 1))) {
            return null;
        }
        int iL = ByteString.l(byteString2, byteString3);
        if (iL == -1) {
            iL = ByteString.l(byteString2, byteString4);
        }
        if (iL == 2 && g() != null) {
            if (byteString2.e() == 3) {
                return null;
            }
            return new s26(ByteString.q(byteString2, 0, 3, 1));
        }
        if (iL == 1) {
            js3.p(byteString4, "prefix");
            if (byteString2.m(0, byteString4, byteString4.e())) {
                return null;
            }
        }
        if (iL != -1 || g() == null) {
            return iL == -1 ? new s26(byteString) : iL == 0 ? new s26(ByteString.q(byteString2, 0, 1, 1)) : new s26(ByteString.q(byteString2, 0, iL, 1));
        }
        if (byteString2.e() == 2) {
            return null;
        }
        return new s26(ByteString.q(byteString2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s26 s26Var = (s26) obj;
        js3.p(s26Var, "other");
        return this.a.compareTo(s26Var.a);
    }

    public final s26 d(s26 s26Var) {
        js3.p(s26Var, "other");
        ByteString byteString = s26Var.a;
        int iA = c.a(this);
        ByteString byteString2 = this.a;
        s26 s26Var2 = iA == -1 ? null : new s26(byteString2.p(0, iA));
        int iA2 = c.a(s26Var);
        if (!js3.i(s26Var2, iA2 != -1 ? new s26(byteString.p(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + s26Var).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = s26Var.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && js3.i(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && byteString2.e() == byteString.e()) {
            return rl3.x(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + s26Var).toString());
        }
        if (js3.i(byteString, c.d)) {
            return this;
        }
        gh0 gh0Var = new gh0();
        ByteString byteStringC = c.c(s26Var);
        if (byteStringC == null && (byteStringC = c.c(this)) == null) {
            byteStringC = c.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            gh0Var.L0(c.e);
            gh0Var.L0(byteStringC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            gh0Var.L0((ByteString) arrayListA.get(i));
            gh0Var.L0(byteStringC);
            i++;
        }
        return c.d(gh0Var, false);
    }

    public final s26 e(String str) {
        js3.p(str, "child");
        gh0 gh0Var = new gh0();
        gh0Var.h1(str);
        return c.b(this, c.d(gh0Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s26) && js3.i(((s26) obj).a, this.a);
    }

    public final Path f() {
        Path path = Paths.get(this.a.s(), new String[0]);
        js3.o(path, "get(...)");
        return path;
    }

    public final Character g() {
        ByteString byteString = c.a;
        ByteString byteString2 = this.a;
        if (ByteString.h(byteString2, byteString) != -1 || byteString2.e() < 2 || byteString2.j(1) != 58) {
            return null;
        }
        char cJ = (char) byteString2.j(0);
        if (('a' > cJ || cJ >= '{') && ('A' > cJ || cJ >= '[')) {
            return null;
        }
        return Character.valueOf(cJ);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.s());
    }

    public final String toString() {
        return this.a.s();
    }
}
