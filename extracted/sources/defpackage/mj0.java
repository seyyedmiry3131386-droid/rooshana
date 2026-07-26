package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mj0 implements px3 {
    public static final mj0 a = new mj0();
    public static final bk6 b = new bk6("kotlin.Byte", xj6.c);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Byte.valueOf(cc1Var.B());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.k(((Number) obj).byteValue());
    }
}
