package ir.myket.player.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c24;
import defpackage.js3;
import defpackage.js5;
import defpackage.me6;
import defpackage.ne6;
import defpackage.o40;
import defpackage.qt4;
import defpackage.rm7;
import defpackage.so7;
import defpackage.wq2;
import ir.myket.movie.common.domain.models.MovieType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class PlayerMovie implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MovieType e;
    public final ShareModel f;
    public static final ne6 Companion = new ne6();
    public static final Parcelable.Creator<PlayerMovie> CREATOR = new qt4(26);
    public static final c24[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.b, new js5(4)), null};

    public /* synthetic */ PlayerMovie(int i, String str, String str2, String str3, String str4, MovieType movieType, ShareModel shareModel) {
        if (63 != (i & 63)) {
            wq2.S(i, 63, me6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = movieType;
        this.f = shareModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerMovie)) {
            return false;
        }
        PlayerMovie playerMovie = (PlayerMovie) obj;
        return js3.i(this.a, playerMovie.a) && js3.i(this.b, playerMovie.b) && js3.i(this.c, playerMovie.c) && js3.i(this.d, playerMovie.d) && this.e == playerMovie.e && js3.i(this.f, playerMovie.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.e.hashCode() + rm7.k(this.d, rm7.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31;
        ShareModel shareModel = this.f;
        return iHashCode2 + (shareModel != null ? shareModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("PlayerMovie(movieId=", this.a, ", playId=", this.b, ", title=");
        o40.I(this.c, ", posterUrl=", this.d, ", type=", sbT);
        sbT.append(this.e);
        sbT.append(", shareModel=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        ShareModel shareModel = this.f;
        if (shareModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shareModel.writeToParcel(parcel, i);
        }
    }

    public PlayerMovie(String str, String str2, String str3, String str4, MovieType movieType, ShareModel shareModel) {
        js3.p(str, "movieId");
        js3.p(str3, "title");
        js3.p(str4, "posterUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = movieType;
        this.f = shareModel;
    }
}
