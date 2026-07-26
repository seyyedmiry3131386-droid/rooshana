package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class kn9 extends zl9 implements rn9 {
    public kn9() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) am9.a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            am9.d(parcel);
            m(string, string2, bundle, j);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iA = a();
            parcel2.writeNoException();
            parcel2.writeInt(iA);
        }
        return true;
    }
}
