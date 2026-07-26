package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ae6 extends p61 {
    public static final ae6 e = new ae6(vs6.player_title_report_video_error, np6.video_error, np6.key_video_error, np6.id_video_error);

    @Override // defpackage.p61
    public final void a() {
        bl4.H("on", "player_report_video", "movie_click");
    }

    @Override // defpackage.p61
    public final void b(boolean z) {
        bl4.H("on", xa7.c("player_report_video", z ? "ok" : "cancel"), "movie_click");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ae6);
    }

    public final int hashCode() {
        return -1872831511;
    }

    public final String toString() {
        return "VideoError";
    }
}
