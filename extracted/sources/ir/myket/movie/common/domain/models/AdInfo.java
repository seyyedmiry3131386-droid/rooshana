package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e1;
import defpackage.e66;
import defpackage.fr5;
import defpackage.js3;
import defpackage.wj3;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AdInfo implements Parcelable {
    public static final Parcelable.Creator<AdInfo> CREATOR = new fr5(4);
    public final int a;
    public final e66 b;

    public AdInfo(int i, e66 e66Var) {
        js3.p(e66Var, "queryStrings");
        this.a = i;
        this.b = e66Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AdInfo) {
            return this.a == ((AdInfo) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AdInfo(time=" + this.a + ", queryStrings=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeInt(this.a);
        e1 e1Var = (e1) this.b;
        parcel.writeInt(e1Var.c());
        for (Map.Entry entry : (wj3) e1Var.a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
