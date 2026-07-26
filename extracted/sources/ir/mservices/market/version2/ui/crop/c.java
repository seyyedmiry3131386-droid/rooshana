package ir.mservices.market.version2.ui.crop;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ir.mservices.market.version2.ui.crop.CropImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        CropImageView.SavedState savedState = new CropImageView.SavedState(parcel);
        savedState.a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        savedState.b = (CropImageView.CropMode) parcel.readSerializable();
        savedState.c = parcel.readInt();
        savedState.d = parcel.readInt();
        savedState.e = parcel.readInt();
        savedState.f = (CropImageView.ShowMode) parcel.readSerializable();
        savedState.g = (CropImageView.ShowMode) parcel.readSerializable();
        savedState.h = parcel.readInt() != 0;
        savedState.i = parcel.readInt() != 0;
        savedState.j = parcel.readInt();
        savedState.k = parcel.readInt();
        savedState.l = parcel.readFloat();
        savedState.m = parcel.readFloat();
        savedState.n = parcel.readFloat();
        savedState.o = parcel.readFloat();
        savedState.p = parcel.readFloat();
        savedState.q = parcel.readInt() != 0;
        savedState.r = parcel.readInt();
        savedState.s = parcel.readInt();
        savedState.t = parcel.readFloat();
        savedState.u = parcel.readFloat();
        savedState.v = parcel.readInt() != 0;
        savedState.w = parcel.readInt();
        savedState.x = parcel.readInt();
        savedState.y = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        savedState.z = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        savedState.A = (Bitmap.CompressFormat) parcel.readSerializable();
        savedState.B = parcel.readInt();
        savedState.C = parcel.readInt() != 0;
        savedState.D = parcel.readInt();
        savedState.E = parcel.readInt();
        savedState.F = parcel.readInt();
        savedState.G = parcel.readInt();
        savedState.H = parcel.readInt() != 0;
        savedState.I = parcel.readInt();
        savedState.J = parcel.readInt();
        savedState.K = parcel.readInt();
        savedState.L = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CropImageView.SavedState[i];
    }
}
