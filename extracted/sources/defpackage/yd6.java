package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yd6 extends p61 {
    public static final yd6 e = new yd6(vs6.player_title_report_audio_error, np6.audio_error, np6.key_audio_error, np6.id_audio_error);

    @Override // defpackage.p61
    public final void a() {
        bl4.H("on", "player_report_audio", "movie_click");
    }

    @Override // defpackage.p61
    public final void b(boolean z) {
        bl4.H("on", xa7.c("player_report_audio", z ? "ok" : "cancel"), "movie_click");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yd6);
    }

    public final int hashCode() {
        return 1294382446;
    }

    public final String toString() {
        return "AudioError";
    }
}
