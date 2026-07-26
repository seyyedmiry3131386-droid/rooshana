package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class eo9 extends zl9 implements in9 {
    public final /* synthetic */ Runnable n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo9(vn9 vn9Var, Runnable runnable) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.n = runnable;
    }

    @Override // defpackage.in9
    public final void c() {
        this.n.run();
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        c();
        return true;
    }
}
