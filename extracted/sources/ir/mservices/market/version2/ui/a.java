package ir.mservices.market.version2.ui;

import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.version2.ui.MyketScrollView;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MyketScrollView.SavedState savedState = new MyketScrollView.SavedState(parcel);
        savedState.b = parcel.readInt();
        savedState.a = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MyketScrollView.SavedState[i];
    }
}
