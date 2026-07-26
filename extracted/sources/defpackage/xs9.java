package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class xs9 extends i70 {
    public final lt9 N;

    public xs9(yh9 yh9Var) {
        super(hc7.a, yh9Var);
        this.N = new lt9(1, this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ f87 p0(Status status) {
        return new zj9(status, null);
    }

    @Override // defpackage.i70
    public final void t0(sl slVar) {
        dq9 dq9Var = (dq9) ((lk9) slVar).getService();
        dq9Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        int i = mm9.a;
        lt9 lt9Var = this.N;
        if (lt9Var == null) {
            parcelObtain.writeStrongBinder(null);
        } else {
            parcelObtain.writeStrongBinder(lt9Var);
        }
        dq9Var.L(5, parcelObtain);
    }
}
