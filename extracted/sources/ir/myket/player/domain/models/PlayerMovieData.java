package ir.myket.player.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.js3;
import defpackage.qt4;
import defpackage.rm7;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.movie.common.domain.models.MovieUri;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerMovieData implements Parcelable {
    public static final Parcelable.Creator<PlayerMovieData> CREATOR = new qt4(27);
    public final MovieUri a;
    public final String b;
    public final String c;
    public final PlayerMovie d;
    public final boolean e;
    public final boolean f;

    public PlayerMovieData(MovieUri movieUri, String str, String str2, PlayerMovie playerMovie, boolean z, boolean z2) {
        js3.p(movieUri, "movieUri");
        js3.p(str, "playId");
        js3.p(playerMovie, "playerMovie");
        this.a = movieUri;
        this.b = str;
        this.c = str2;
        this.d = playerMovie;
        this.e = z;
        this.f = z2;
    }

    public final boolean a() {
        return this.d.e == MovieType.c;
    }

    public final boolean b() {
        return this.d.e == MovieType.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerMovieData)) {
            return false;
        }
        PlayerMovieData playerMovieData = (PlayerMovieData) obj;
        return js3.i(this.a, playerMovieData.a) && js3.i(this.b, playerMovieData.b) && js3.i(this.c, playerMovieData.c) && js3.i(this.d, playerMovieData.d) && this.e == playerMovieData.e && this.f == playerMovieData.f;
    }

    public final int hashCode() {
        int iK = rm7.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return ((((this.d.hashCode() + ((iK + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        return "PlayerMovieData(movieUri=" + this.a + ", playId=" + this.b + ", refId=" + this.c + ", playerMovie=" + this.d + ", loadProgressState=" + this.e + ", jumpToFirstEpisode=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        js3.p(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
