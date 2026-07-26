package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a05 implements ai5 {
    public final HomeMovieBannerListDto a;
    public final boolean b;
    public final String c;
    public final String d;

    public a05(HomeMovieBannerListDto homeMovieBannerListDto, boolean z, String str, String str2) {
        this.a = homeMovieBannerListDto;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static final a05 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", a05.class, "bannerList")) {
            throw new IllegalArgumentException("Required argument \"bannerList\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(HomeMovieBannerListDto.class) && !Serializable.class.isAssignableFrom(HomeMovieBannerListDto.class)) {
            throw new UnsupportedOperationException(HomeMovieBannerListDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        HomeMovieBannerListDto homeMovieBannerListDto = (HomeMovieBannerListDto) bundle.get("bannerList");
        if (!bundle.containsKey("search")) {
            throw new IllegalArgumentException("Required argument \"search\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("search");
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (bundle.containsKey("refId")) {
            return new a05(homeMovieBannerListDto, z, string, bundle.getString("refId"));
        }
        throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a05)) {
            return false;
        }
        a05 a05Var = (a05) obj;
        return js3.i(this.a, a05Var.a) && this.b == a05Var.b && js3.i(this.c, a05Var.c) && js3.i(this.d, a05Var.d);
    }

    public final int hashCode() {
        HomeMovieBannerListDto homeMovieBannerListDto = this.a;
        int iHashCode = (((homeMovieBannerListDto == null ? 0 : homeMovieBannerListDto.hashCode()) * 31) + (this.b ? 1231 : 1237)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieBannerListRecyclerListFragmentArgs(bannerList=");
        sb.append(this.a);
        sb.append(", search=");
        sb.append(this.b);
        sb.append(", id=");
        return dw1.p(this.c, ", refId=", this.d, ")", sb);
    }
}
