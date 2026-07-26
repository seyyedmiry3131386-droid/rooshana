package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class ka5 extends b57 {
    public static final dt4 f;
    public static final dt4 g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public final ByteString b;
    public final List c;
    public final dt4 d;
    public long e;

    static {
        Regex regex = dt4.e;
        f = ok4.A("multipart/mixed");
        ok4.A("multipart/alternative");
        ok4.A("multipart/digest");
        ok4.A("multipart/parallel");
        g = ok4.A("multipart/form-data");
        h = new byte[]{58, 32};
        i = new byte[]{13, 10};
        j = new byte[]{45, 45};
    }

    public ka5(ByteString byteString, dt4 dt4Var, List list) {
        js3.p(byteString, "boundaryByteString");
        js3.p(dt4Var, "type");
        js3.p(list, "parts");
        this.b = byteString;
        this.c = list;
        Regex regex = dt4.e;
        this.d = ok4.A(dt4Var + "; boundary=" + byteString.s());
        this.e = -1L;
    }

    @Override // defpackage.b57
    public final long a() {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long jE = e(null, true);
        this.e = jE;
        return jE;
    }

    @Override // defpackage.b57
    public final dt4 b() {
        return this.d;
    }

    @Override // defpackage.b57
    public final boolean c() {
        List list = this.c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ja5) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b57
    public final void d(oh0 oh0Var) {
        e(oh0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(oh0 oh0Var, boolean z) {
        gh0 gh0Var;
        oh0 gh0Var2;
        if (z) {
            gh0Var2 = new gh0();
            gh0Var = gh0Var2;
        } else {
            gh0Var = 0;
            gh0Var2 = oh0Var;
        }
        List list = this.c;
        int size = list.size();
        long j2 = 0;
        int i2 = 0;
        while (true) {
            ByteString byteString = this.b;
            byte[] bArr = j;
            byte[] bArr2 = i;
            if (i2 >= size) {
                js3.m(gh0Var2);
                gh0Var2.write(bArr);
                gh0Var2.T0(byteString);
                gh0Var2.write(bArr);
                gh0Var2.write(bArr2);
                if (!z) {
                    return j2;
                }
                js3.m(gh0Var);
                long j3 = j2 + gh0Var.b;
                gh0Var.b();
                return j3;
            }
            ja5 ja5Var = (ja5) list.get(i2);
            by2 by2Var = ja5Var.a;
            b57 b57Var = ja5Var.b;
            js3.m(gh0Var2);
            gh0Var2.write(bArr);
            gh0Var2.T0(byteString);
            gh0Var2.write(bArr2);
            int size2 = by2Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                gh0Var2.n0(by2Var.c(i3)).write(h).n0(by2Var.f(i3)).write(bArr2);
            }
            dt4 dt4VarB = b57Var.b();
            if (dt4VarB != null) {
                gh0Var2.n0("Content-Type: ").n0(dt4VarB.a).write(bArr2);
            }
            long jA = b57Var.a();
            if (jA == -1 && z) {
                js3.m(gh0Var);
                gh0Var.b();
                return -1L;
            }
            gh0Var2.write(bArr2);
            if (z) {
                j2 += jA;
            } else {
                b57Var.d(gh0Var2);
            }
            gh0Var2.write(bArr2);
            i2++;
        }
    }
}
