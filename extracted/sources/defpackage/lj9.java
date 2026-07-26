package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class lj9 extends ei9 implements qj9 {
    public final /* synthetic */ int o;
    public final /* synthetic */ mj9 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj9(mj9 mj9Var, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.o = i;
        this.p = mj9Var;
    }

    @Override // defpackage.qj9
    public void F(Status status) {
        switch (this.o) {
            case 0:
                this.p.s0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.qj9
    public void Q(Status status) {
        switch (this.o) {
            case 1:
                this.p.s0(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.ei9
    public final boolean m0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                gj9.b(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) gj9.a(parcel, Status.CREATOR);
                gj9.b(parcel);
                F(status);
                break;
            case 103:
                Status status2 = (Status) gj9.a(parcel, Status.CREATOR);
                gj9.b(parcel);
                Q(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
