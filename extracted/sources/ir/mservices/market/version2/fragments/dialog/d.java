package ir.mservices.market.version2.fragments.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        ReportDialogFragment.Option option = new ReportDialogFragment.Option();
        option.a = "";
        String string = parcel.readString();
        option.a = string != null ? string : "";
        option.b = parcel.readString();
        option.c = parcel.readInt();
        return option;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ReportDialogFragment.Option[i];
    }
}
