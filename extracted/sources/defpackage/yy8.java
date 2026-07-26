package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public final class yy8 extends Binder implements ug3 {
    public final /* synthetic */ UnusedAppRestrictionsBackportService n;

    public yy8(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.n = unusedAppRestrictionsBackportService;
        attachInterface(this, ug3.m);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        tg3 tg3Var;
        String str = ug3.m;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            tg3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(tg3.l);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof tg3)) {
                sg3 sg3Var = new sg3();
                sg3Var.n = strongBinder;
                tg3Var = sg3Var;
            } else {
                tg3Var = (tg3) iInterfaceQueryLocalInterface;
            }
        }
        if (tg3Var == null) {
            return true;
        }
        this.n.a();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
