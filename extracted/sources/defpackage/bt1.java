package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.movie.uri.downloadInfo.data.DownloadInfoResponse;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bt1 implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final DownloadInfoResponse g;

    public bt1(DialogDataModel dialogDataModel, String str, String str2, String str3, String str4, String str5, DownloadInfoResponse downloadInfoResponse) {
        js3.p(str3, "movieName");
        js3.p(str5, "movieId");
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = downloadInfoResponse;
    }

    public static final bt1 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", bt1.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("playId")) {
            throw new IllegalArgumentException("Required argument \"playId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("playId");
        if (!bundle.containsKey("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("refId");
        if (!bundle.containsKey("movieName")) {
            throw new IllegalArgumentException("Required argument \"movieName\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("movieName");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"movieName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("secondaryTitle")) {
            throw new IllegalArgumentException("Required argument \"secondaryTitle\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("secondaryTitle");
        if (!bundle.containsKey("movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("movieId");
        if (string5 == null) {
            throw new IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("downloadInfo")) {
            throw new IllegalArgumentException("Required argument \"downloadInfo\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(DownloadInfoResponse.class) || Serializable.class.isAssignableFrom(DownloadInfoResponse.class)) {
            return new bt1(dialogDataModel, string, string2, string3, string4, string5, (DownloadInfoResponse) bundle.get("downloadInfo"));
        }
        throw new UnsupportedOperationException(DownloadInfoResponse.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bt1)) {
            return false;
        }
        bt1 bt1Var = (bt1) obj;
        return js3.i(this.a, bt1Var.a) && js3.i(this.b, bt1Var.b) && js3.i(this.c, bt1Var.c) && js3.i(this.d, bt1Var.d) && js3.i(this.e, bt1Var.e) && js3.i(this.f, bt1Var.f) && js3.i(this.g, bt1Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iK = rm7.k(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.e;
        int iK2 = rm7.k(this.f, (iK + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        DownloadInfoResponse downloadInfoResponse = this.g;
        return iK2 + (downloadInfoResponse != null ? downloadInfoResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("DownloadQualityDialogFragmentArgs(data=", this.a, ", playId=", this.b, ", refId=");
        o40.I(this.c, ", movieName=", this.d, ", secondaryTitle=", sbD);
        o40.I(this.e, ", movieId=", this.f, ", downloadInfo=", sbD);
        sbD.append(this.g);
        sbD.append(")");
        return sbD.toString();
    }
}
