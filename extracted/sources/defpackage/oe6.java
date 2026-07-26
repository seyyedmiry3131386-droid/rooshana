package defpackage;

import ir.myket.player.domain.models.PlayerMovie;

/* JADX INFO: loaded from: classes3.dex */
public final class oe6 {
    public final PlayerMovie a;
    public final pj3 b;

    public oe6(PlayerMovie playerMovie, pj3 pj3Var) {
        js3.p(pj3Var, "seasons");
        this.a = playerMovie;
        this.b = pj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe6)) {
            return false;
        }
        oe6 oe6Var = (oe6) obj;
        return js3.i(this.a, oe6Var.a) && js3.i(this.b, oe6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerMovieSeasons(playerMovie=" + this.a + ", seasons=" + this.b + ")";
    }
}
