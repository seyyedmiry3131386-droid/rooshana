package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final class ka8 implements la8 {
    public final PlayerMovieData a;

    public ka8(PlayerMovieData playerMovieData) {
        js3.p(playerMovieData, "movieData");
        this.a = playerMovieData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka8) && js3.i(this.a, ((ka8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Show(movieData=" + this.a + ")";
    }
}
