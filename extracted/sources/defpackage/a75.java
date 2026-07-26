package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.appDetail.MovieToolbarData;
import ir.mservices.market.movie.data.webapi.SubscriptionInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a75 implements ai5 {
    public final String a;
    public final int b;
    public final int c;
    public final MovieToolbarData d;
    public final SubscriptionInfo e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public a75(String str, int i, int i2, MovieToolbarData movieToolbarData, SubscriptionInfo subscriptionInfo, String str2, boolean z, boolean z2) {
        js3.p(str2, "movieId");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = movieToolbarData;
        this.e = subscriptionInfo;
        this.f = str2;
        this.g = z;
        this.h = z2;
    }

    public static final a75 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", a75.class, "refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("refId");
        if (!bundle.containsKey("selectedSeason")) {
            throw new IllegalArgumentException("Required argument \"selectedSeason\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("selectedSeason");
        if (!bundle.containsKey("seasonsSize")) {
            throw new IllegalArgumentException("Required argument \"seasonsSize\" is missing and does not have an android:defaultValue");
        }
        int i2 = bundle.getInt("seasonsSize");
        if (!bundle.containsKey("toolbarData")) {
            throw new IllegalArgumentException("Required argument \"toolbarData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MovieToolbarData.class) && !Serializable.class.isAssignableFrom(MovieToolbarData.class)) {
            throw new UnsupportedOperationException(MovieToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MovieToolbarData movieToolbarData = (MovieToolbarData) bundle.get("toolbarData");
        if (movieToolbarData == null) {
            throw new IllegalArgumentException("Argument \"toolbarData\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("subscriptionInfo")) {
            throw new IllegalArgumentException("Required argument \"subscriptionInfo\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(SubscriptionInfo.class) && !Serializable.class.isAssignableFrom(SubscriptionInfo.class)) {
            throw new UnsupportedOperationException(SubscriptionInfo.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        SubscriptionInfo subscriptionInfo = (SubscriptionInfo) bundle.get("subscriptionInfo");
        if (!bundle.containsKey("movieId")) {
            throw new IllegalArgumentException("Required argument \"movieId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("movieId");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"movieId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("showDownload")) {
            throw new IllegalArgumentException("Required argument \"showDownload\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("showDownload");
        if (bundle.containsKey("isAudioMode")) {
            return new a75(string, i, i2, movieToolbarData, subscriptionInfo, string2, z, bundle.getBoolean("isAudioMode"));
        }
        throw new IllegalArgumentException("Required argument \"isAudioMode\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a75)) {
            return false;
        }
        a75 a75Var = (a75) obj;
        return js3.i(this.a, a75Var.a) && this.b == a75Var.b && this.c == a75Var.c && js3.i(this.d, a75Var.d) && js3.i(this.e, a75Var.e) && js3.i(this.f, a75Var.f) && this.g == a75Var.g && this.h == a75Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.d.hashCode() + ((((((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31) + this.c) * 31)) * 31;
        SubscriptionInfo subscriptionInfo = this.e;
        return ((rm7.k(this.f, (iHashCode + (subscriptionInfo != null ? subscriptionInfo.hashCode() : 0)) * 31, 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbB = o40.B(this.b, "MovieSeasonsRecyclerListFragmentArgs(refId=", this.a, ", selectedSeason=", ", seasonsSize=");
        sbB.append(this.c);
        sbB.append(", toolbarData=");
        sbB.append(this.d);
        sbB.append(", subscriptionInfo=");
        sbB.append(this.e);
        sbB.append(", movieId=");
        sbB.append(this.f);
        sbB.append(", showDownload=");
        sbB.append(this.g);
        sbB.append(", isAudioMode=");
        sbB.append(this.h);
        sbB.append(")");
        return sbB.toString();
    }
}
