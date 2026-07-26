package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LottieAnimationView.SavedState savedState = new LottieAnimationView.SavedState(parcel);
        savedState.a = parcel.readString();
        savedState.c = parcel.readFloat();
        savedState.d = parcel.readInt() == 1;
        savedState.e = parcel.readString();
        savedState.f = parcel.readInt();
        savedState.g = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LottieAnimationView.SavedState[i];
    }
}
