package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class lv8 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final vp7 b;
    public volatile int c = 0;

    public lv8(vp7 vp7Var, int i) {
        this.b = vp7Var;
        this.a = i;
    }

    public final int a(int i) {
        nv4 nv4VarB = b();
        int iA = nv4VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) nv4VarB.d;
        int i2 = iA + nv4VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final nv4 b() {
        ThreadLocal threadLocal = d;
        nv4 nv4Var = (nv4) threadLocal.get();
        if (nv4Var == null) {
            nv4Var = new nv4();
            threadLocal.set(nv4Var);
        }
        ov4 ov4Var = (ov4) this.b.b;
        int iA = ov4Var.a(6);
        if (iA != 0) {
            int i = iA + ov4Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) ov4Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) ov4Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) ov4Var.d;
            nv4Var.d = byteBuffer;
            if (byteBuffer != null) {
                nv4Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                nv4Var.b = i4;
                nv4Var.c = ((ByteBuffer) nv4Var.d).getShort(i4);
                return nv4Var;
            }
            nv4Var.a = 0;
            nv4Var.b = 0;
            nv4Var.c = 0;
        }
        return nv4Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        nv4 nv4VarB = b();
        int iA = nv4VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) nv4VarB.d).getInt(iA + nv4VarB.a) : 0));
        sb.append(", codepoints:");
        nv4 nv4VarB2 = b();
        int iA2 = nv4VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + nv4VarB2.a;
            i = ((ByteBuffer) nv4VarB2.d).getInt(((ByteBuffer) nv4VarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
