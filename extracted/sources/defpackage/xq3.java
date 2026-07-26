package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xq3 implements px3 {
    public static final xq3 a = new xq3();
    public static final bk6 b = new bk6("kotlin.Int", xj6.g);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Integer.valueOf(cc1Var.p());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.y(((Number) obj).intValue());
    }
}
