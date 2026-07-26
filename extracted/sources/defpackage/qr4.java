package defpackage;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import com.google.common.collect.ImmutableSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class qr4 extends MediaBrowserServiceCompat {
    public final mr4 j;
    public final xq4 k;
    public final vp7 l;

    public qr4(xq4 xq4Var) {
        this.j = mr4.a(xq4Var.f);
        this.k = xq4Var;
        this.l = new vp7(xq4Var);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final qm5 a(Bundle bundle) {
        rb4 rb4Var = this.a;
        rb4Var.getClass();
        jr4 jr4VarT = rb4Var.t();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        boolean zB = this.j.b(jr4VarT);
        ImmutableSet immutableSet = r44.a;
        Math.max(0, bundle2.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        hq4 hq4Var = new hq4(jr4VarT, 0, 0, zB, null, bundle2);
        AtomicReference atomicReference = new AtomicReference();
        b11 b11Var = new b11();
        j29.a0(this.k.l, new m11(this, atomicReference, hq4Var, b11Var, 5));
        try {
            b11Var.a();
            fq4 fq4Var = (fq4) atomicReference.get();
            fq4Var.getClass();
            this.l.n(jr4VarT, hq4Var, fq4Var.a, fq4Var.b);
            return y97.j;
        } catch (InterruptedException e) {
            wn5.H("MSSLegacyStub", "Couldn't get a result from onConnect", e);
            return null;
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void b(dm4 dm4Var) {
        if (dm4Var.b) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + dm4Var.a);
        }
        dm4Var.b = true;
        dm4Var.a();
    }

    public final void c(MediaSessionCompat$Token mediaSessionCompat$Token) {
        attachBaseContext(this.k.f);
        onCreate();
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.h != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.h = mediaSessionCompat$Token;
        rb4 rb4Var = this.a;
        rb4Var.getClass();
        ((MediaBrowserServiceCompat) rb4Var.d).g.c(new g6(rb4Var, mediaSessionCompat$Token, 21));
    }
}
