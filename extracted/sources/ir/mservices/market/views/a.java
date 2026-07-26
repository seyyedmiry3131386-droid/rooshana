package ir.mservices.market.views;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import ir.mservices.market.views.MultiSelectTitleView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        MultiSelectTitleView.SavedState savedState = new MultiSelectTitleView.SavedState(parcel);
        savedState.a = parcel.readInt();
        savedState.b = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MultiSelectTitleView.SavedState[i];
    }
}
