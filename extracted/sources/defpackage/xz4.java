package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class xz4 implements ai5 {
    public final String a;
    public final SocialListPolicies b;
    public final ProfileMovieListDto c;
    public final DialogDataModel d;

    public xz4(String str, SocialListPolicies socialListPolicies, ProfileMovieListDto profileMovieListDto, DialogDataModel dialogDataModel) {
        js3.p(str, "title");
        js3.p(socialListPolicies, "policies");
        this.a = str;
        this.b = socialListPolicies;
        this.c = profileMovieListDto;
        this.d = dialogDataModel;
    }

    public static final xz4 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", xz4.class, "title")) {
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
        if (!bundle.containsKey("movieList")) {
            throw new IllegalArgumentException("Required argument \"movieList\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ProfileMovieListDto.class) && !Serializable.class.isAssignableFrom(ProfileMovieListDto.class)) {
            throw new UnsupportedOperationException(ProfileMovieListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ProfileMovieListDto profileMovieListDto = (ProfileMovieListDto) bundle.get("movieList");
        if (!bundle.containsKey("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) bundle.get("data");
        if (dialogDataModel != null) {
            return new xz4(string, socialListPolicies, profileMovieListDto, dialogDataModel);
        }
        throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz4)) {
            return false;
        }
        xz4 xz4Var = (xz4) obj;
        return js3.i(this.a, xz4Var.a) && js3.i(this.b, xz4Var.b) && js3.i(this.c, xz4Var.c) && js3.i(this.d, xz4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ProfileMovieListDto profileMovieListDto = this.c;
        return this.d.hashCode() + ((iHashCode + (profileMovieListDto == null ? 0 : profileMovieListDto.hashCode())) * 31);
    }

    public final String toString() {
        return "MovieAddProfileListFragmentArgs(title=" + this.a + ", policies=" + this.b + ", movieList=" + this.c + ", data=" + this.d + ")";
    }
}
