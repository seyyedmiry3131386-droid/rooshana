package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class wo1 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    public wo1(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }

    public static wo1 a(oj0 oj0Var) throws IOException {
        if (nv.j(oj0Var) != 538247942) {
            throw new IOException();
        }
        String strL = nv.l(oj0Var);
        String strL2 = nv.l(oj0Var);
        long jK = nv.k(oj0Var);
        long jK2 = nv.k(oj0Var);
        long jK3 = nv.k(oj0Var);
        long jK4 = nv.k(oj0Var);
        int iJ = nv.j(oj0Var);
        if (iJ < 0) {
            throw new IOException(rm7.n(iJ, "readHeaderList size="));
        }
        List arrayList = iJ == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iJ; i++) {
            arrayList.add(new qx2(nv.l(oj0Var).intern(), nv.l(oj0Var).intern()));
        }
        return new wo1(strL, strL2, jK, jK2, jK3, jK4, arrayList);
    }

    public final bk0 b(byte[] bArr) {
        bk0 bk0Var = new bk0();
        bk0Var.a = bArr;
        bk0Var.b = this.c;
        bk0Var.c = this.d;
        bk0Var.d = this.e;
        bk0Var.e = this.f;
        bk0Var.f = this.g;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        List<qx2> list = this.h;
        for (qx2 qx2Var : list) {
            treeMap.put(qx2Var.a, qx2Var.b);
        }
        bk0Var.g = treeMap;
        bk0Var.h = DesugarCollections.unmodifiableList(list);
        return bk0Var;
    }

    public final boolean c(BufferedOutputStream bufferedOutputStream) {
        try {
            nv.o(bufferedOutputStream, 538247942);
            nv.q(bufferedOutputStream, this.b);
            String str = this.c;
            if (str == null) {
                str = "";
            }
            nv.q(bufferedOutputStream, str);
            nv.p(bufferedOutputStream, this.d);
            nv.p(bufferedOutputStream, this.e);
            nv.p(bufferedOutputStream, this.f);
            nv.p(bufferedOutputStream, this.g);
            List<qx2> list = this.h;
            if (list != null) {
                nv.o(bufferedOutputStream, list.size());
                for (qx2 qx2Var : list) {
                    nv.q(bufferedOutputStream, qx2Var.a);
                    nv.q(bufferedOutputStream, qx2Var.b);
                }
            } else {
                nv.o(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException e) {
            e.toString();
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public wo1(String str, bk0 bk0Var) {
        String str2 = bk0Var.b;
        long j = bk0Var.c;
        long j2 = bk0Var.d;
        long j3 = bk0Var.e;
        long j4 = bk0Var.f;
        ?? arrayList = bk0Var.h;
        if (arrayList == 0) {
            Map map = bk0Var.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new qx2((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }
}
