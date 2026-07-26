package defpackage;

import android.content.Intent;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class vc6 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Intent intent = q0Var.b;
        String stringExtra = intent.getStringExtra("EXTRA_MOVIE_AD_PACKAGE_NAME");
        return new dr3(new NavIntentDirections.AppDetail(new hp(stringExtra == null ? "" : stringExtra, intent.getBooleanExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false), new Tracker("movieAd", "", "app"), false, null, "MagnetVodAds", intent.getStringExtra("EXTRA_MOVIE_AD_CALLBACK_URL"), intent.getStringExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL"), null, null, null, null, null)));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return "ir.myket.player.action.OPEN_APPLICATION".equalsIgnoreCase(q0Var.b.getAction());
    }
}
