package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsService;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b91 extends Binder implements hf3 {
    public final /* synthetic */ CustomTabsService n;

    public b91(CustomTabsService customTabsService) {
        this.n = customTabsService;
        attachInterface(this, hf3.c);
    }

    public static PendingIntent L(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
        bundle.remove("android.support.customtabs.extra.SESSION_ID");
        return pendingIntent;
    }

    public final boolean m0(gf3 gf3Var, PendingIntent pendingIntent) {
        try {
            a91 a91Var = new a91(this, new c91(gf3Var, pendingIntent), 0);
            synchronized (this.n.a) {
                ((ef3) gf3Var).n.linkToDeath(a91Var, 0);
                this.n.a.put(((ef3) gf3Var).n, a91Var);
            }
            return this.n.c();
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterfaceQueryLocalInterface;
        String str = hf3.c;
        int i3 = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        df3 df3Var = null;
        switch (i) {
            case 2:
                parcel.readLong();
                boolean zI = this.n.i();
                parcel2.writeNoException();
                parcel2.writeInt(zI ? 1 : 0);
                return true;
            case 3:
                boolean zM0 = m0(ff3.L(parcel.readStrongBinder()), null);
                parcel2.writeNoException();
                parcel2.writeInt(zM0 ? 1 : 0);
                return true;
            case 4:
                gf3 gf3VarL = ff3.L(parcel.readStrongBinder());
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) ja1.e(parcel, creator);
                parcel.createTypedArrayList(creator);
                CustomTabsService customTabsService = this.n;
                PendingIntent pendingIntentL = L(bundle);
                if (gf3VarL == null && pendingIntentL == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean zB = customTabsService.b();
                parcel2.writeNoException();
                parcel2.writeInt(zB ? 1 : 0);
                return true;
            case 5:
                parcel.readString();
                Bundle bundleA = this.n.a();
                parcel2.writeNoException();
                if (bundleA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundleA.writeToParcel(parcel2, 1);
                return true;
            case 6:
                gf3 gf3VarL2 = ff3.L(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                CustomTabsService customTabsService2 = this.n;
                PendingIntent pendingIntentL2 = L(bundle2);
                if (gf3VarL2 == null && pendingIntentL2 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean zG = customTabsService2.g();
                parcel2.writeNoException();
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 7:
                gf3 gf3VarL3 = ff3.L(parcel.readStrongBinder());
                CustomTabsService customTabsService3 = this.n;
                if (gf3VarL3 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                new Bundle();
                boolean zF = customTabsService3.f();
                parcel2.writeNoException();
                parcel2.writeInt(zF ? 1 : 0);
                return true;
            case 8:
                gf3 gf3VarL4 = ff3.L(parcel.readStrongBinder());
                parcel.readString();
                Bundle bundle3 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                CustomTabsService customTabsService4 = this.n;
                PendingIntent pendingIntentL3 = L(bundle3);
                if (gf3VarL4 == null && pendingIntentL3 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                int iD = customTabsService4.d();
                parcel2.writeNoException();
                parcel2.writeInt(iD);
                return true;
            case 9:
                gf3 gf3VarL5 = ff3.L(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle4 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                CustomTabsService customTabsService5 = this.n;
                PendingIntent pendingIntentL4 = L(bundle4);
                if (gf3VarL5 == null && pendingIntentL4 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean zH = customTabsService5.h();
                parcel2.writeNoException();
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 10:
                boolean zM02 = m0(ff3.L(parcel.readStrongBinder()), L((Bundle) ja1.e(parcel, Bundle.CREATOR)));
                parcel2.writeNoException();
                parcel2.writeInt(zM02 ? 1 : 0);
                return true;
            case 11:
                gf3 gf3VarL6 = ff3.L(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                CustomTabsService customTabsService6 = this.n;
                PendingIntent pendingIntentL5 = L(bundle5);
                if (gf3VarL6 == null && pendingIntentL5 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                if (bundle5 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                    }
                }
                boolean zF2 = customTabsService6.f();
                parcel2.writeNoException();
                parcel2.writeInt(zF2 ? 1 : 0);
                return true;
            case 12:
                gf3 gf3VarL7 = ff3.L(parcel.readStrongBinder());
                parcel.readInt();
                Bundle bundle6 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                CustomTabsService customTabsService7 = this.n;
                PendingIntent pendingIntentL6 = L(bundle6);
                if (gf3VarL7 == null && pendingIntentL6 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                boolean zE = customTabsService7.e();
                parcel2.writeNoException();
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 13:
                gf3 gf3VarL8 = ff3.L(parcel.readStrongBinder());
                PendingIntent pendingIntentL7 = L((Bundle) ja1.e(parcel, Bundle.CREATOR));
                if (gf3VarL8 == null && pendingIntentL7 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 14:
                gf3 gf3VarL9 = ff3.L(parcel.readStrongBinder());
                IBinder strongBinder = parcel.readStrongBinder();
                Bundle bundle7 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                if (strongBinder != null && (iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(if3.d)) != null && (iInterfaceQueryLocalInterface instanceof if3)) {
                }
                PendingIntent pendingIntentL8 = L(bundle7);
                if (gf3VarL9 == null && pendingIntentL8 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 15:
                gf3 gf3VarL10 = ff3.L(parcel.readStrongBinder());
                Uri uri = (Uri) ja1.e(parcel, Uri.CREATOR);
                Bundle bundle8 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                PendingIntent pendingIntentL9 = L(bundle8);
                if (gf3VarL10 == null && pendingIntentL9 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                Object[] objArr = {uri};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                DesugarCollections.unmodifiableList(arrayList);
                vy2.z(bundle8);
                parcel2.writeNoException();
                return true;
            case 16:
                gf3 gf3VarL11 = ff3.L(parcel.readStrongBinder());
                parcel.createTypedArrayList(Uri.CREATOR);
                Bundle bundle9 = (Bundle) ja1.e(parcel, Bundle.CREATOR);
                PendingIntent pendingIntentL10 = L(bundle9);
                if (gf3VarL11 == null && pendingIntentL10 == null) {
                    throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
                }
                vy2.z(bundle9);
                parcel2.writeNoException();
                return true;
            case 17:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 18:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(df3.a);
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof df3)) {
                        cf3 cf3Var = new cf3();
                        cf3Var.n = strongBinder2;
                        df3Var = cf3Var;
                    } else {
                        df3Var = (df3) iInterfaceQueryLocalInterface2;
                    }
                }
                try {
                    a91 a91Var = new a91(this, new e10(df3Var, L((Bundle) ja1.e(parcel, Bundle.CREATOR))), i3);
                    synchronized (this.n.a) {
                        ((cf3) df3Var).n.linkToDeath(a91Var, 0);
                        this.n.a.put(((cf3) df3Var).n, a91Var);
                        break;
                    }
                } catch (RemoteException unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
