package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class mj9 extends i70 {
    public final /* synthetic */ int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj9(GoogleApiClient googleApiClient, int i) {
        super(u00.a, googleApiClient);
        this.N = i;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ f87 p0(Status status) {
        int i = this.N;
        return status;
    }

    @Override // defpackage.i70
    public final void t0(sl slVar) {
        switch (this.N) {
            case 0:
                kj9 kj9Var = (kj9) slVar;
                rj9 rj9Var = (rj9) kj9Var.getService();
                lj9 lj9Var = new lj9(this, 0);
                GoogleSignInOptions googleSignInOptions = kj9Var.b;
                rj9Var.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(rj9Var.p);
                int i = gj9.a;
                parcelObtain.writeStrongBinder(lj9Var);
                if (googleSignInOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    googleSignInOptions.writeToParcel(parcelObtain, 0);
                }
                rj9Var.L(102, parcelObtain);
                break;
            default:
                kj9 kj9Var2 = (kj9) slVar;
                rj9 rj9Var2 = (rj9) kj9Var2.getService();
                lj9 lj9Var2 = new lj9(this, 1);
                GoogleSignInOptions googleSignInOptions2 = kj9Var2.b;
                rj9Var2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(rj9Var2.p);
                int i2 = gj9.a;
                parcelObtain2.writeStrongBinder(lj9Var2);
                if (googleSignInOptions2 == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(parcelObtain2, 0);
                }
                rj9Var2.L(103, parcelObtain2);
                break;
        }
    }
}
