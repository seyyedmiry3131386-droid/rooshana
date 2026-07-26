package ir.mservices.market.version2.fragments.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.AppDataInstallProgressDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new AppDataInstallProgressDialogFragment.OnAppInstalledDialogResultEvent(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppDataInstallProgressDialogFragment.OnAppInstalledDialogResultEvent[i];
    }
}
