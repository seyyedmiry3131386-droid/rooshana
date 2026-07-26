package defpackage;

import ir.myket.player.domain.models.PlayerMovie;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class xf6 {
    public static final wf6 Companion = new wf6();
    public final String a;
    public final PlayerMovie b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public xf6(String str, PlayerMovie playerMovie, String str2, int i) {
        boolean z = (i & 8) != 0;
        js3.p(str, "moviePlayId");
        js3.p(playerMovie, "moviePlayerData");
        this.a = str;
        this.b = playerMovie;
        this.c = str2;
        this.d = z;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf6)) {
            return false;
        }
        xf6 xf6Var = (xf6) obj;
        return js3.i(this.a, xf6Var.a) && js3.i(this.b, xf6Var.b) && js3.i(this.c, xf6Var.c) && this.d == xf6Var.d && this.e == xf6Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerRequestData(moviePlayId=");
        sb.append(this.a);
        sb.append(", moviePlayerData=");
        sb.append(this.b);
        sb.append(", movieRefId=");
        sb.append(this.c);
        sb.append(", loadProgressState=");
        sb.append(this.d);
        sb.append(", jumpToFirstEpisode=");
        return t61.l(sb, this.e, ")");
    }

    public /* synthetic */ xf6(int i, String str, PlayerMovie playerMovie, String str2, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, vf6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = playerMovie;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
    }
}
