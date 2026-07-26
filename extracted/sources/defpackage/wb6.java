package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final class wb6 implements qc6 {
    public final PlayerMovieData a;

    public wb6(PlayerMovieData playerMovieData) {
        js3.p(playerMovieData, "movieData");
        this.a = playerMovieData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wb6) && js3.i(this.a, ((wb6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSubscriptionDialog(movieData=" + this.a + ")";
    }
}
