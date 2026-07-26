package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class m95 extends Binder implements eg3 {
    public final /* synthetic */ MultiInstanceInvalidationService n;

    public m95(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.n = multiInstanceInvalidationService;
        attachInterface(this, eg3.f);
    }

    public final int L(dg3 dg3Var, String str) {
        js3.p(dg3Var, "callback");
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.n;
        synchronized (multiInstanceInvalidationService.c) {
            try {
                int i2 = multiInstanceInvalidationService.a + 1;
                multiInstanceInvalidationService.a = i2;
                if (multiInstanceInvalidationService.c.register(dg3Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.b.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.a--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final void m0(dg3 dg3Var, int i) {
        js3.p(dg3Var, "callback");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.n;
        synchronized (multiInstanceInvalidationService.c) {
            multiInstanceInvalidationService.c.unregister(dg3Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = eg3.f;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        dg3 dg3Var = null;
        dg3 dg3Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(dg3.e);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dg3)) {
                    cg3 cg3Var = new cg3();
                    cg3Var.n = strongBinder;
                    dg3Var = cg3Var;
                } else {
                    dg3Var = (dg3) iInterfaceQueryLocalInterface;
                }
            }
            int iL = L(dg3Var, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iL);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(dg3.e);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof dg3)) {
                    cg3 cg3Var2 = new cg3();
                    cg3Var2.n = strongBinder2;
                    dg3Var2 = cg3Var2;
                } else {
                    dg3Var2 = (dg3) iInterfaceQueryLocalInterface2;
                }
            }
            m0(dg3Var2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        js3.p(strArrCreateStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.n;
        synchronized (multiInstanceInvalidationService.c) {
            String str2 = (String) multiInstanceInvalidationService.b.get(Integer.valueOf(i3));
            if (str2 == null) {
                t0.m("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService.c.beginBroadcast();
                for (int i4 = 0; i4 < iBeginBroadcast; i4++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.c.getBroadcastCookie(i4);
                        js3.n(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService.b.get(num);
                        if (i3 != iIntValue && str2.equals(str3)) {
                            try {
                                ((dg3) multiInstanceInvalidationService.c.getBroadcastItem(i4)).o(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                t0.n("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.c.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
