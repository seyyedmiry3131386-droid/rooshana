package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jr1 implements px3 {
    public static final jr1 a = new jr1();
    public static final bk6 b = new bk6("kotlin.Double", xj6.e);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Double.valueOf(cc1Var.F());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.h(((Number) obj).doubleValue());
    }
}
