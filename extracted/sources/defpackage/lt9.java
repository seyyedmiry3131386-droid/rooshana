package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zzd;

/* JADX INFO: loaded from: classes.dex */
public final class lt9 extends Binder implements tp9, IInterface {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public lt9(int i, Object obj) {
        this.n = i;
        this.o = obj;
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // defpackage.tp9
    public void W(Status status, boolean z) {
        switch (this.n) {
            case 0:
                ek9 ek9Var = new ek9();
                ek9Var.a = status;
                ek9Var.b = z;
                jc7 jc7Var = new jc7(6, false);
                jc7Var.b = ek9Var;
                cf8 cf8Var = (cf8) this.o;
                if (status.u()) {
                    cf8Var.b(jc7Var);
                    return;
                } else {
                    cf8Var.a(status.c != null ? new ResolvableApiException(status) : new ApiException(status));
                    return;
                }
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.tp9
    public void l(Status status, zzd zzdVar) {
        switch (this.n) {
            case 1:
                ((xs9) this.o).s0(new zj9(status, zzdVar));
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        if (i == 2) {
            parcel.readString();
            throw new UnsupportedOperationException();
        }
        if (i == 3) {
            throw new UnsupportedOperationException();
        }
        if (i == 4) {
            W((Status) mm9.a(parcel, Status.CREATOR), parcel.readInt() != 0);
            return true;
        }
        if (i == 6) {
            throw new UnsupportedOperationException();
        }
        if (i == 8) {
            l((Status) mm9.a(parcel, Status.CREATOR), (zzd) mm9.a(parcel, zzd.CREATOR));
            return true;
        }
        if (i == 10) {
            parcel.readInt();
            throw new UnsupportedOperationException();
        }
        if (i == 11) {
            throw new UnsupportedOperationException();
        }
        if (i == 15) {
            throw new UnsupportedOperationException();
        }
        if (i != 16) {
            return false;
        }
        parcel.readString();
        parcel.readInt();
        throw new UnsupportedOperationException();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
