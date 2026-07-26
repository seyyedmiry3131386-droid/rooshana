package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nx8 extends y61 {
    public static final nx8 c = new nx8();

    @Override // defpackage.y61
    public final y61 F0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        wg9 wg9Var = (wg9) w61Var.r0(wg9.c);
        if (wg9Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        wg9Var.b = true;
    }

    @Override // defpackage.y61
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
