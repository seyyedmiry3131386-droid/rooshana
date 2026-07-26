package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.myket.movie.common.domain.models.RestrictionInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class w77 implements ai5 {
    public final DialogDataModel a;
    public final RestrictionInfo b;

    public w77(DialogDataModel dialogDataModel, RestrictionInfo restrictionInfo) {
        js3.p(restrictionInfo, "restrictionInfo");
        this.a = dialogDataModel;
        this.b = restrictionInfo;
    }

    public static final w77 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", w77.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("restrictionInfo")) {
            throw new IllegalArgumentException("Required argument \"restrictionInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(RestrictionInfo.class) && !Serializable.class.isAssignableFrom(RestrictionInfo.class)) {
            throw new UnsupportedOperationException(RestrictionInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        RestrictionInfo restrictionInfo = (RestrictionInfo) bundle.get("restrictionInfo");
        if (restrictionInfo != null) {
            return new w77(dialogDataModel, restrictionInfo);
        }
        throw new IllegalArgumentException("Argument \"restrictionInfo\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w77)) {
            return false;
        }
        w77 w77Var = (w77) obj;
        return js3.i(this.a, w77Var.a) && js3.i(this.b, w77Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RestrictionDialogFragmentArgs(data=" + this.a + ", restrictionInfo=" + this.b + ")";
    }
}
