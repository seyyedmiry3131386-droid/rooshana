package ir.mservices.market.version2.fragments.base;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new BaseDialogFragment.OnDialogResultEvent(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BaseDialogFragment.OnDialogResultEvent[i];
    }
}
