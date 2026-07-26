package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zd6 extends p61 {
    public static final zd6 e = new zd6(vs6.player_title_report_subtitle_error, np6.subtitle_error, np6.key_subtitle_error, np6.id_subtitle_error);

    @Override // defpackage.p61
    public final void a() {
        bl4.H("on", "player_report_subtitle", "movie_click");
    }

    @Override // defpackage.p61
    public final void b(boolean z) {
        bl4.H("on", xa7.c("player_report_subtitle", z ? "ok" : "cancel"), "movie_click");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zd6);
    }

    public final int hashCode() {
        return -1996343884;
    }

    public final String toString() {
        return "SubtitleError";
    }
}
