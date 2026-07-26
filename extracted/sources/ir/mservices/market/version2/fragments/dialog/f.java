package ir.mservices.market.version2.fragments.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ai5;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ai5 {
    public final DialogDataModel a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final ThemeData g;
    public final boolean h;
    public final ReportDialogFragment.Option[] i;

    public f(DialogDataModel dialogDataModel, String str, String str2, int i, int i2, int i3, ThemeData themeData, boolean z, ReportDialogFragment.Option[] optionArr) {
        this.a = dialogDataModel;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = themeData;
        this.h = z;
        this.i = optionArr;
    }

    public static final f fromBundle(Bundle bundle) {
        ReportDialogFragment.Option[] optionArr;
        if (!t61.B(bundle, "bundle", f.class, "data")) {
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
        if (!bundle.containsKey("message")) {
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("message");
        if (!bundle.containsKey("selectedItem")) {
            throw new IllegalArgumentException("Required argument \"selectedItem\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("selectedItem");
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
        if (themeData == null) {
            throw new IllegalArgumentException("Argument \"theme\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("hasOther")) {
            throw new IllegalArgumentException("Required argument \"hasOther\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("hasOther");
        if (!bundle.containsKey("items")) {
            throw new IllegalArgumentException("Required argument \"items\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("items");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                js3.n(parcelable, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.ReportDialogFragment.Option");
                arrayList.add((ReportDialogFragment.Option) parcelable);
            }
            optionArr = (ReportDialogFragment.Option[]) arrayList.toArray(new ReportDialogFragment.Option[0]);
        } else {
            optionArr = null;
        }
        ReportDialogFragment.Option[] optionArr2 = optionArr;
        if (optionArr2 != null) {
            return new f(dialogDataModel, string, string2, i, i2, i3, themeData, z, optionArr2);
        }
        throw new IllegalArgumentException("Argument \"items\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return js3.i(this.a, fVar.a) && js3.i(this.b, fVar.b) && js3.i(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f && js3.i(this.g, fVar.g) && this.h == fVar.h && js3.i(this.i, fVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return ((((this.g.hashCode() + ((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31)) * 31) + (this.h ? 1231 : 1237)) * 31) + Arrays.hashCode(this.i);
    }

    public final String toString() {
        String string = Arrays.toString(this.i);
        StringBuilder sbD = bl4.D("ReportDialogFragmentArgs(data=", this.a, ", title=", this.b, ", message=");
        sbD.append(this.c);
        sbD.append(", selectedItem=");
        sbD.append(this.d);
        sbD.append(", color=");
        o40.J(sbD, this.e, ", textColor=", this.f, ", theme=");
        sbD.append(this.g);
        sbD.append(", hasOther=");
        sbD.append(this.h);
        sbD.append(", items=");
        return dw1.s(sbD, string, ")");
    }
}
