package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class jn4 extends Binder implements IInterface {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public jn4(cf8 cf8Var) {
        this.o = cf8Var;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.n;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.n) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                }
                if (i == 1598968902) {
                    parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.readString();
                        if (((WeakReference) this.o).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 2:
                        throw new AssertionError();
                    case 3:
                        if (((WeakReference) this.o).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 4:
                        throw new AssertionError();
                    case 5:
                        parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                        throw new AssertionError();
                    case 6:
                        throw new AssertionError();
                    case 7:
                        throw new AssertionError();
                    case 8:
                        throw new AssertionError();
                    case 9:
                        parcel.readInt();
                        if (((WeakReference) this.o).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 10:
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.readInt();
                        if (((WeakReference) this.o).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 12:
                        parcel.readInt();
                        if (((WeakReference) this.o).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    case 13:
                        if (((WeakReference) this.o).get() == null) {
                            return true;
                        }
                        throw new ClassCastException();
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i3 = tm9.a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(rm7.n(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                cf8 cf8Var = (cf8) this.o;
                if (statusCreateFromParcel.u()) {
                    cf8Var.b(null);
                    return true;
                }
                cf8Var.a(statusCreateFromParcel.c != null ? new ResolvableApiException(statusCreateFromParcel) : new ApiException(statusCreateFromParcel));
                return true;
        }
    }

    public jn4() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.o = new WeakReference(null);
    }
}
