package defpackage;

import android.content.pm.PackageStats;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class cu extends Binder implements lg3 {
    public final /* synthetic */ om0 n;

    public cu(om0 om0Var) {
        this.n = om0Var;
        attachInterface(this, "android.content.pm.IPackageStatsObserver");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.content.pm.IPackageStatsObserver");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.content.pm.IPackageStatsObserver");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        PackageStats packageStats = (PackageStats) (parcel.readInt() != 0 ? PackageStats.CREATOR.createFromParcel(parcel) : null);
        parcel.readInt();
        js3.p(packageStats, "pStats");
        this.n.resumeWith(new ws(packageStats.codeSize, packageStats.cacheSize, packageStats.dataSize));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
