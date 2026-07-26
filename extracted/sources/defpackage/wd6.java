package defpackage;

import androidx.media3.ui.compose.state.a;

/* JADX INFO: loaded from: classes3.dex */
public final class wd6 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final a h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public wd6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar, boolean z8, boolean z9, boolean z10) {
        js3.p(aVar, "playPauseButtonState");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = aVar;
        this.i = z8;
        this.j = z9;
        this.k = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd6)) {
            return false;
        }
        wd6 wd6Var = (wd6) obj;
        return this.a == wd6Var.a && this.b == wd6Var.b && this.c == wd6Var.c && this.d == wd6Var.d && this.e == wd6Var.e && this.f == wd6Var.f && this.g == wd6Var.g && js3.i(this.h, wd6Var.h) && this.i == wd6Var.i && this.j == wd6Var.j && this.k == wd6Var.k;
    }

    public final int hashCode() {
        return ((((((this.h.hashCode() + ((((((((((((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerControllerState(isVisible=");
        sb.append(this.a);
        sb.append(", isReady=");
        sb.append(this.b);
        sb.append(", isLoading=");
        t61.A(sb, this.c, ", isErrorOccurred=", this.d, ", canShowHintState=");
        t61.A(sb, this.e, ", isLocked=", this.f, ", isAtEndingRecommendation=");
        sb.append(this.g);
        sb.append(", playPauseButtonState=");
        sb.append(this.h);
        sb.append(", showSkipCredits=");
        t61.A(sb, this.i, ", showPlayFromBeginning=", this.j, ", isPreviewPosterVisible=");
        return t61.l(sb, this.k, ")");
    }
}
