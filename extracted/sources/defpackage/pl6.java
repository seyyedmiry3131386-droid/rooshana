package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class pl6 implements ai5 {
    public final DialogDataModel a;
    public final ProfileListTitleData b;
    public final String c;

    public pl6(DialogDataModel dialogDataModel, ProfileListTitleData profileListTitleData, String str) {
        js3.p(profileListTitleData, "profileListTitleData");
        this.a = dialogDataModel;
        this.b = profileListTitleData;
        this.c = str;
    }

    public static final pl6 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", pl6.class, "data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("profileListTitleData")) {
            throw new IllegalArgumentException("Required argument \"profileListTitleData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ProfileListTitleData.class) && !Serializable.class.isAssignableFrom(ProfileListTitleData.class)) {
            throw new UnsupportedOperationException(ProfileListTitleData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ProfileListTitleData profileListTitleData = (ProfileListTitleData) bundle.get("profileListTitleData");
        if (profileListTitleData == null) {
            throw new IllegalArgumentException("Argument \"profileListTitleData\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("accountKey")) {
            return new pl6(dialogDataModel, profileListTitleData, bundle.getString("accountKey"));
        }
        throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl6)) {
            return false;
        }
        pl6 pl6Var = (pl6) obj;
        return js3.i(this.a, pl6Var.a) && js3.i(this.b, pl6Var.b) && js3.i(this.c, pl6Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileMovieListMoreFragmentArgs(data=");
        sb.append(this.a);
        sb.append(", profileListTitleData=");
        sb.append(this.b);
        sb.append(", accountKey=");
        return dw1.s(sb, this.c, ")");
    }
}
