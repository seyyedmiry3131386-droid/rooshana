package ir.myket.player.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ao6;
import defpackage.bl4;
import defpackage.js3;
import defpackage.qt7;
import defpackage.rt7;
import defpackage.so7;
import defpackage.wq2;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ShareModel implements Parcelable {
    public final String a;
    public final String b;
    public static final rt7 Companion = new rt7();
    public static final Parcelable.Creator<ShareModel> CREATOR = new ao6(13);

    public /* synthetic */ ShareModel(int i, String str, String str2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, qt7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareModel)) {
            return false;
        }
        ShareModel shareModel = (ShareModel) obj;
        return js3.i(this.a, shareModel.a) && js3.i(this.b, shareModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return bl4.w("ShareModel(url=", this.a, ", title=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public ShareModel(String str, String str2) {
        js3.p(str, "url");
        js3.p(str2, "title");
        this.a = str;
        this.b = str2;
    }
}
