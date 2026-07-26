package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.versionedparcelable.ParcelImpl;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gq7 implements dq7 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final MediaSessionCompat$Token a;
    public final int b;
    public final int c;
    public final ComponentName d;
    public final String e;
    public final Bundle f;

    static {
        String str = j29.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public gq7(MediaSessionCompat$Token mediaSessionCompat$Token, int i2, int i3, ComponentName componentName, String str, Bundle bundle) {
        this.a = mediaSessionCompat$Token;
        this.b = i2;
        this.c = i3;
        this.d = componentName;
        this.e = str;
        this.f = bundle;
    }

    @Override // defpackage.dq7
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dq7
    public final String b() {
        ComponentName componentName = this.d;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // defpackage.dq7
    public final ComponentName c() {
        return this.d;
    }

    @Override // defpackage.dq7
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dq7
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gq7)) {
            return false;
        }
        gq7 gq7Var = (gq7) obj;
        int i2 = gq7Var.c;
        int i3 = this.c;
        if (i3 != i2) {
            return false;
        }
        if (i3 == 100) {
            return Objects.equals(this.a, gq7Var.a);
        }
        if (i3 != 101) {
            return false;
        }
        return Objects.equals(this.d, gq7Var.d);
    }

    @Override // defpackage.dq7
    public final String f() {
        return this.e;
    }

    @Override // defpackage.dq7
    public final Bundle g() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        String str = g;
        MediaSessionCompat$Token mediaSessionCompat$Token = this.a;
        if (mediaSessionCompat$Token == null) {
            bundle = null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("android.support.v4.media.session.TOKEN", yh0.p(mediaSessionCompat$Token, android.support.v4.media.session.MediaSessionCompat$Token.CREATOR));
            synchronized (mediaSessionCompat$Token.a) {
                try {
                    yf3 yf3Var = mediaSessionCompat$Token.c;
                    if (yf3Var != null) {
                        bundle3.putBinder("android.support.v4.media.session.EXTRA_BINDER", yf3Var.asBinder());
                    }
                    s49 s49Var = mediaSessionCompat$Token.d;
                    if (s49Var != null) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable("a", new ParcelImpl(s49Var));
                        bundle3.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bundle = bundle3;
        }
        bundle2.putBundle(str, bundle);
        bundle2.putInt(h, this.b);
        bundle2.putInt(i, this.c);
        bundle2.putParcelable(j, this.d);
        bundle2.putString(k, this.e);
        bundle2.putBundle(l, this.f);
        return bundle2;
    }

    @Override // defpackage.dq7
    public final Object getBinder() {
        return this.a;
    }

    @Override // defpackage.dq7
    public final Bundle getExtras() {
        return new Bundle(this.f);
    }

    @Override // defpackage.dq7
    public final int getType() {
        return this.c != 101 ? 0 : 2;
    }

    @Override // defpackage.dq7
    public final MediaSession.Token h() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.a;
        if (mediaSessionCompat$Token == null) {
            return null;
        }
        return mediaSessionCompat$Token.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.d, this.a);
    }

    public final String toString() {
        return dw1.k(this.b, "}", new StringBuilder("SessionToken {legacy, uid="));
    }
}
