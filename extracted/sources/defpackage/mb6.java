package defpackage;

import androidx.media3.ui.compose.state.a;

/* JADX INFO: loaded from: classes3.dex */
public final class mb6 implements qc6 {
    public final a a;

    public mb6(a aVar) {
        js3.p(aVar, "playPauseButtonState");
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb6) && js3.i(this.a, ((mb6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SetPlayPauseButtonState(playPauseButtonState=" + this.a + ")";
    }
}
