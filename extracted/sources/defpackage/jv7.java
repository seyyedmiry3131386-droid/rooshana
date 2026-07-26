package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jv7 implements px3 {
    public static final jv7 a = new jv7();
    public static final bk6 b = new bk6("kotlin.Short", xj6.i);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Short.valueOf(cc1Var.C());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.i(((Number) obj).shortValue());
    }
}
