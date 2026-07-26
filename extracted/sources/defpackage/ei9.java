package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes.dex */
public abstract class ei9 extends Binder implements IInterface {
    public final /* synthetic */ int n;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.n;
        return this;
    }

    public abstract boolean m0(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean n0(int i, Parcel parcel);

    public boolean o0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.n) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                switch (i) {
                    case 3:
                        di9.c(parcel);
                        break;
                    case 4:
                        di9.c(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        di9.c(parcel);
                        break;
                    case 7:
                        di9.c(parcel);
                        break;
                    case 8:
                        zak zakVar = (zak) di9.a(parcel, zak.CREATOR);
                        di9.c(parcel);
                        hi9 hi9Var = (hi9) this;
                        hi9Var.p.post(new zh9(1, hi9Var, zakVar, false));
                        break;
                    case 9:
                        di9.c(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return m0(i, parcel, parcel2);
            case 2:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return o0(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return n0(i, parcel);
        }
    }

    public ei9(String str, int i) {
        this.n = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
