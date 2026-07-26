package ir.myket.movie.common.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.o;
import defpackage.pj3;
import defpackage.qt4;
import defpackage.t61;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieUri implements Parcelable {
    public static final Parcelable.Creator<MovieUri> CREATOR = new qt4(3);
    public final pj3 a;
    public final boolean b;
    public final Long c;
    public final PlayerConfig d;
    public final boolean e;
    public final RestrictionInfo f;
    public final String g;
    public final pj3 h;
    public final RecommendationTime i;
    public final Credits j;
    public final SampleWatch k;
    public final pj3 l;
    public final String m;
    public final Orientation n;
    public final boolean o;

    public MovieUri(pj3 pj3Var, boolean z, Long l, PlayerConfig playerConfig, boolean z2, RestrictionInfo restrictionInfo, String str, pj3 pj3Var2, RecommendationTime recommendationTime, Credits credits, SampleWatch sampleWatch, pj3 pj3Var3, String str2, Orientation orientation, boolean z3) {
        js3.p(pj3Var, "urls");
        js3.p(playerConfig, "playerConfig");
        js3.p(recommendationTime, "recommendationTime");
        js3.p(orientation, "orientation");
        this.a = pj3Var;
        this.b = z;
        this.c = l;
        this.d = playerConfig;
        this.e = z2;
        this.f = restrictionInfo;
        this.g = str;
        this.h = pj3Var2;
        this.i = recommendationTime;
        this.j = credits;
        this.k = sampleWatch;
        this.l = pj3Var3;
        this.m = str2;
        this.n = orientation;
        this.o = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieUri)) {
            return false;
        }
        MovieUri movieUri = (MovieUri) obj;
        return js3.i(this.a, movieUri.a) && this.b == movieUri.b && js3.i(this.c, movieUri.c) && js3.i(this.d, movieUri.d) && this.e == movieUri.e && js3.i(this.f, movieUri.f) && js3.i(this.g, movieUri.g) && js3.i(this.h, movieUri.h) && js3.i(this.i, movieUri.i) && js3.i(this.j, movieUri.j) && js3.i(this.k, movieUri.k) && js3.i(this.l, movieUri.l) && js3.i(this.m, movieUri.m) && this.n == movieUri.n && this.o == movieUri.o;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31;
        Long l = this.c;
        int iHashCode2 = (((this.d.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31;
        RestrictionInfo restrictionInfo = this.f;
        int iHashCode3 = (iHashCode2 + (restrictionInfo == null ? 0 : restrictionInfo.hashCode())) * 31;
        String str = this.g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        pj3 pj3Var = this.h;
        int iHashCode5 = (((iHashCode4 + (pj3Var == null ? 0 : pj3Var.hashCode())) * 31) + this.i.a) * 31;
        Credits credits = this.j;
        int iHashCode6 = (iHashCode5 + (credits == null ? 0 : credits.hashCode())) * 31;
        SampleWatch sampleWatch = this.k;
        int iHashCode7 = (iHashCode6 + (sampleWatch == null ? 0 : sampleWatch.hashCode())) * 31;
        pj3 pj3Var2 = this.l;
        int iHashCode8 = (iHashCode7 + (pj3Var2 == null ? 0 : pj3Var2.hashCode())) * 31;
        String str2 = this.m;
        return ((this.n.hashCode() + ((iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31) + (this.o ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieUri(urls=");
        sb.append(this.a);
        sb.append(", hasSubtitle=");
        sb.append(this.b);
        sb.append(", openingCreditsTime=");
        sb.append(this.c);
        sb.append(", playerConfig=");
        sb.append(this.d);
        sb.append(", downgradeQuality=");
        sb.append(this.e);
        sb.append(", restrictionInfo=");
        sb.append(this.f);
        sb.append(", hintText=");
        sb.append(this.g);
        sb.append(", adInfoList=");
        sb.append(this.h);
        sb.append(", recommendationTime=");
        sb.append(this.i);
        sb.append(", credits=");
        sb.append(this.j);
        sb.append(", sampleWatch=");
        sb.append(this.k);
        sb.append(", preferredMimeTypes=");
        sb.append(this.l);
        sb.append(", previewPosterUrl=");
        sb.append(this.m);
        sb.append(", orientation=");
        sb.append(this.n);
        sb.append(", audioMode=");
        return t61.l(sb, this.o, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
        RestrictionInfo restrictionInfo = this.f;
        if (restrictionInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            restrictionInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        pj3 pj3Var = this.h;
        if (pj3Var == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(((o) pj3Var).a());
            Iterator it = pj3Var.iterator();
            while (it.hasNext()) {
                ((AdInfo) it.next()).writeToParcel(parcel, i);
            }
        }
        this.i.writeToParcel(parcel, i);
        Credits credits = this.j;
        if (credits == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            credits.writeToParcel(parcel, i);
        }
        SampleWatch sampleWatch = this.k;
        if (sampleWatch == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sampleWatch.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n.name());
        parcel.writeInt(this.o ? 1 : 0);
    }
}
