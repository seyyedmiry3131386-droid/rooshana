package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class dd implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final ThemeData j;
    public final int k;

    public dd(DialogDataModel dialogDataModel, String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, ThemeData themeData, int i4) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i2;
        this.i = i3;
        this.j = themeData;
        this.k = i4;
    }

    public static final dd fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", dd.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (!bundle.containsKey("imageResId")) {
            throw new IllegalArgumentException("Required argument \"imageResId\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("imageResId");
        if (!bundle.containsKey(PackageListMetaDataDTO.KEY_IMAGE_URL)) {
            throw new IllegalArgumentException("Required argument \"imageUrl\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(PackageListMetaDataDTO.KEY_IMAGE_URL);
        if (!bundle.containsKey("message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("message");
        if (!bundle.containsKey("commitTextButton")) {
            throw new IllegalArgumentException("Required argument \"commitTextButton\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("commitTextButton");
        if (!bundle.containsKey("cancelTextButton")) {
            throw new IllegalArgumentException("Required argument \"cancelTextButton\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("cancelTextButton");
        if (!bundle.containsKey("color")) {
            throw new IllegalArgumentException("Required argument \"color\" is missing and does not have an android:defaultValue");
        }
        int i2 = bundle.getInt("color");
        if (!bundle.containsKey("textColor")) {
            throw new IllegalArgumentException("Required argument \"textColor\" is missing and does not have an android:defaultValue");
        }
        int i3 = bundle.getInt("textColor");
        if (!bundle.containsKey("theme")) {
            throw new IllegalArgumentException("Required argument \"theme\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ThemeData.class) && !Serializable.class.isAssignableFrom(ThemeData.class)) {
            throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ThemeData themeData = (ThemeData) bundle.get("theme");
        if (themeData != null) {
            return new dd(dialogDataModel, string, i, string2, string3, string4, string5, i2, i3, themeData, bundle.containsKey("componentGravity") ? bundle.getInt("componentGravity") : 0);
        }
        throw new IllegalArgumentException("Argument \"theme\" is marked as non-null but was passed a null value.");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(DialogDataModel.class);
        Parcelable parcelable = this.a;
        if (zIsAssignableFrom) {
            js3.n(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("data", parcelable);
        } else {
            if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            js3.n(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("data", (Serializable) parcelable);
        }
        bundle.putString("title", this.b);
        bundle.putInt("imageResId", this.c);
        bundle.putString(PackageListMetaDataDTO.KEY_IMAGE_URL, this.d);
        bundle.putString("message", this.e);
        bundle.putString("commitTextButton", this.f);
        bundle.putString("cancelTextButton", this.g);
        bundle.putInt("color", this.h);
        bundle.putInt("textColor", this.i);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(ThemeData.class);
        Serializable serializable = this.j;
        if (zIsAssignableFrom2) {
            js3.n(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("theme", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(ThemeData.class)) {
                throw new UnsupportedOperationException(ThemeData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            js3.n(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("theme", serializable);
        }
        bundle.putInt("componentGravity", this.k);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return js3.i(this.a, ddVar.a) && js3.i(this.b, ddVar.b) && this.c == ddVar.c && js3.i(this.d, ddVar.d) && js3.i(this.e, ddVar.e) && js3.i(this.f, ddVar.f) && js3.i(this.g, ddVar.g) && this.h == ddVar.h && this.i == ddVar.i && js3.i(this.j, ddVar.j) && this.k == ddVar.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return ((this.j.hashCode() + ((((((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.h) * 31) + this.i) * 31)) * 31) + this.k;
    }

    public final String toString() {
        StringBuilder sbD = bl4.D("AlertButtonComponentDialogFragmentArgs(data=", this.a, ", title=", this.b, ", imageResId=");
        sbD.append(this.c);
        sbD.append(", imageUrl=");
        sbD.append(this.d);
        sbD.append(", message=");
        o40.I(this.e, ", commitTextButton=", this.f, ", cancelTextButton=", sbD);
        sbD.append(this.g);
        sbD.append(", color=");
        sbD.append(this.h);
        sbD.append(", textColor=");
        sbD.append(this.i);
        sbD.append(", theme=");
        sbD.append(this.j);
        sbD.append(", componentGravity=");
        return dw1.k(this.k, ")", sbD);
    }
}
