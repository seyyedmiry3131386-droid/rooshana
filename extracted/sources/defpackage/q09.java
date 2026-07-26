package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import ir.mservices.market.version2.fragments.dialog.UrlDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class q09 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        return new UrlDataModel((SpannableString) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UrlDataModel[i];
    }
}
