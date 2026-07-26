package ir.mservices.market.version2.fragments.dialog;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.ym1;

/* JADX INFO: loaded from: classes3.dex */
public final class DialogDataModel implements Parcelable {
    public static final ym1 CREATOR = new ym1();
    public String a;
    public String b;
    public Bundle c;
    public DialogResult d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogDataModel(String str, String str2) {
        this(str, str2, null, 12);
        js3.p(str, "requestCode");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeBundle(this.c);
        DialogResult dialogResult = this.d;
        if (dialogResult != null) {
            parcel.writeString(dialogResult != null ? dialogResult.name() : null);
        } else {
            parcel.writeString("noName");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogDataModel(String str, String str2, Bundle bundle) {
        this(str, str2, bundle, 8);
        js3.p(str, "requestCode");
    }

    public DialogDataModel(String str, String str2, Bundle bundle, int i) {
        bundle = (i & 4) != 0 ? new Bundle() : bundle;
        DialogResult dialogResult = DialogResult.b;
        js3.p(str, "requestCode");
        js3.p(str2, "dialogKey");
        js3.p(bundle, "data");
        this.a = "";
        this.b = "";
        new Bundle();
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = dialogResult;
    }
}
