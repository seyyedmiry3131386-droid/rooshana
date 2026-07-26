package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final class r77 extends s77 {
    public final PlayerMovieData a;

    public r77(PlayerMovieData playerMovieData) {
        js3.p(playerMovieData, "playerMovieData");
        this.a = playerMovieData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r77) && js3.i(this.a, ((r77) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayMovie(playerMovieData=" + this.a + ")";
    }
}
