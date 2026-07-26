package androidx.media3.session;

import android.content.Intent;
import android.os.IBinder;
import defpackage.hq4;
import defpackage.jq4;
import defpackage.np4;
import defpackage.pr4;
import defpackage.vy2;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaLibraryService extends MediaSessionService {
    @Override // androidx.media3.session.MediaSessionService
    public final /* bridge */ /* synthetic */ jq4 e(hq4 hq4Var) {
        i();
        return null;
    }

    public abstract np4 i();

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return super.onBind(intent);
        }
        pr4 pr4Var = this.c;
        vy2.t(pr4Var);
        return pr4Var;
    }
}
