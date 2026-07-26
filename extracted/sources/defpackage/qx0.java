package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qx0 implements g51 {
    public static final qx0 a = new qx0();

    @Override // defpackage.g51
    public final w61 getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
