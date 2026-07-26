package ir.myket.player.provider.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSessionService;
import com.google.common.collect.ImmutableList;
import defpackage.ab1;
import defpackage.ar6;
import defpackage.c24;
import defpackage.dg1;
import defpackage.do3;
import defpackage.e62;
import defpackage.gu9;
import defpackage.hq4;
import defpackage.j29;
import defpackage.jp4;
import defpackage.jq4;
import defpackage.js3;
import defpackage.lo4;
import defpackage.lz;
import defpackage.n15;
import defpackage.o06;
import defpackage.o80;
import defpackage.ol3;
import defpackage.qp4;
import defpackage.us6;
import defpackage.va6;
import defpackage.vy2;
import defpackage.y45;
import defpackage.zc;
import ir.myket.player.domain.models.PlayerMovieData;
import ir.myket.player.provider.AudioPlayerActivity;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class PlaybackService extends MediaSessionService {
    public static final int k = us6.audio_player_notification_channel_name;
    public jq4 i;
    public final Object h = kotlin.a.b(LazyThreadSafetyMode.a, new n15(23, this));
    public final c24 j = kotlin.a.a(new o06(3, this));

    @Override // androidx.media3.session.MediaSessionService
    public final jq4 e(hq4 hq4Var) {
        return this.i;
    }

    @Override // androidx.media3.session.MediaSessionService
    public final void f(jq4 jq4Var, boolean z) {
        js3.p(jq4Var, "session");
        super.f(jq4Var, true);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c24, java.lang.Object] */
    public final void i() {
        jq4 jq4Var = this.i;
        if (jq4Var != null) {
            e62 e62Var = (e62) jq4Var.a();
            e62Var.O((va6) this.j.getValue());
            e62Var.a();
            try {
                synchronized (jq4.b) {
                    jq4.c.remove(jq4Var.a.i);
                }
                jq4Var.a.s();
            } catch (Exception unused) {
            }
        }
        this.i = null;
        lz lzVar = (lz) this.h.getValue();
        e62 e62Var2 = lzVar.c;
        if (e62Var2 != null) {
            e62Var2.a();
        }
        lzVar.c = null;
        stopSelf();
    }

    public final PendingIntent j(PlayerMovieData playerMovieData) {
        Intent launchIntentForPackage;
        if (playerMovieData != null) {
            launchIntentForPackage = new Intent(this, (Class<?>) AudioPlayerActivity.class);
            js3.o(launchIntentForPackage.putExtra("KEY_PLAYER_MOVIE_DATA", playerMovieData), "putExtra(...)");
            launchIntentForPackage.setFlags(872415232);
        } else {
            launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        }
        PendingIntent activity2 = PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592);
        js3.o(activity2, "getActivity(...)");
        return activity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onCreate() {
        qp4 qp4Var;
        super.onCreate();
        ExoPlayer exoPlayerA = ((lz) this.h.getValue()).a();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        ImmutableList immutableListQ = ImmutableList.q();
        ImmutableList immutableListQ2 = ImmutableList.q();
        ImmutableList immutableListQ3 = ImmutableList.q();
        jp4 jp4VarE = ((o80) exoPlayerA).E();
        PendingIntent pendingIntentJ = j(gu9.t((jp4VarE == null || (qp4Var = jp4VarE.d) == null) ? null : qp4Var.I));
        if (Build.VERSION.SDK_INT >= 31) {
            vy2.j(zc.m(pendingIntentJ));
        }
        this.i = new jq4(this, exoPlayerA, pendingIntentJ, immutableListQ, immutableListQ2, immutableListQ3, new ol3(16), bundle, bundle2, new do3(new ab1(this)));
        ((e62) exoPlayerA).n((va6) this.j.getValue());
        dg1 dg1Var = new dg1(this, new y45(19), "media_channel_id", k);
        dg1Var.g = ar6.audio_notif_app_icon;
        j29.a0(this.b, new lo4(this, dg1Var, 12));
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final void onDestroy() {
        i();
        super.onDestroy();
    }

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        PlayerMovieData playerMovieDataT;
        if (js3.i(intent != null ? intent.getAction() : null, "ACTION_STOP_SERVICE")) {
            i();
        }
        if (intent != null && (extras = intent.getExtras()) != null && (playerMovieDataT = gu9.t(extras)) != null) {
            PendingIntent pendingIntentJ = j(playerMovieDataT);
            jq4 jq4Var = this.i;
            if (jq4Var != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    vy2.j(zc.m(pendingIntentJ));
                }
                jq4Var.a.v(pendingIntentJ);
            }
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
