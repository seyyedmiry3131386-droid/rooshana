package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ym1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        js3.p(parcel, "parcel");
        DialogDataModel dialogDataModel = new DialogDataModel();
        dialogDataModel.a = "";
        dialogDataModel.b = "";
        dialogDataModel.c = new Bundle();
        int i = c88.a;
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        dialogDataModel.a = string;
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        dialogDataModel.b = string2;
        Bundle bundle = parcel.readBundle(DialogDataModel.class.getClassLoader());
        if (bundle == null) {
            bundle = new Bundle();
        }
        dialogDataModel.c = bundle;
        String string3 = parcel.readString();
        String str = string3 != null ? string3 : "";
        if (!TextUtils.isEmpty(str) && !"noName".equalsIgnoreCase(str)) {
            dialogDataModel.d = DialogResult.valueOf(str);
        }
        return dialogDataModel;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DialogDataModel[i];
    }
}
