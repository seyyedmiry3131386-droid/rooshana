package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class se4 implements px3 {
    public static final se4 a = new se4();
    public static final bk6 b = new bk6("kotlin.Long", xj6.h);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Long.valueOf(cc1Var.x());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.A(((Number) obj).longValue());
    }
}
