package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class em implements ai5 {
    public final String a;
    public final SocialListPolicies b;
    public final ProfileApplicationListDto c;
    public final DialogDataModel d;

    public em(String str, SocialListPolicies socialListPolicies, ProfileApplicationListDto profileApplicationListDto, DialogDataModel dialogDataModel) {
        js3.p(str, "title");
        js3.p(socialListPolicies, "policies");
        this.a = str;
        this.b = socialListPolicies;
        this.c = profileApplicationListDto;
        this.d = dialogDataModel;
    }

    public static final em fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", em.class, "title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("policies")) {
            throw new IllegalArgumentException("Required argument \"policies\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SocialListPolicies.class) && !Serializable.class.isAssignableFrom(SocialListPolicies.class)) {
            throw new UnsupportedOperationException(SocialListPolicies.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        SocialListPolicies socialListPolicies = (SocialListPolicies) bundle.get("policies");
        if (socialListPolicies == null) {
            throw new IllegalArgumentException("Argument \"policies\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("appList")) {
            throw new IllegalArgumentException("Required argument \"appList\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ProfileApplicationListDto.class) && !Serializable.class.isAssignableFrom(ProfileApplicationListDto.class)) {
            throw new UnsupportedOperationException(ProfileApplicationListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ProfileApplicationListDto profileApplicationListDto = (ProfileApplicationListDto) bundle.get("appList");
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new em(string, socialListPolicies, profileApplicationListDto, dialogDataModel);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em)) {
            return false;
        }
        em emVar = (em) obj;
        return js3.i(this.a, emVar.a) && js3.i(this.b, emVar.b) && js3.i(this.c, emVar.c) && js3.i(this.d, emVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ProfileApplicationListDto profileApplicationListDto = this.c;
        return this.d.hashCode() + ((iHashCode + (profileApplicationListDto == null ? 0 : profileApplicationListDto.hashCode())) * 31);
    }

    public final String toString() {
        return "AppAddProfileListFragmentArgs(title=" + this.a + ", policies=" + this.b + ", appList=" + this.c + ", data=" + this.d + ")";
    }
}
