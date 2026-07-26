package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nq4 {
    public final MediaSession a;
    public final d b;
    public final MediaSessionCompat$Token c;
    public final Bundle e;
    public PlaybackStateCompat g;
    public List h;
    public MediaMetadataCompat i;
    public int j;
    public int k;
    public mq4 l;
    public jr4 m;
    public final Object d = new Object();
    public final RemoteCallbackList f = new RemoteCallbackList();

    public nq4(Context context, String str, Bundle bundle) {
        MediaSession mediaSessionA = a(context, str, bundle);
        this.a = mediaSessionA;
        d dVar = new d(this);
        this.b = dVar;
        this.c = new MediaSessionCompat$Token(mediaSessionA.getSessionToken(), dVar, null);
        this.e = bundle;
        mediaSessionA.setFlags(3);
    }

    public MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    public final mq4 b() {
        mq4 mq4Var;
        synchronized (this.d) {
            mq4Var = this.l;
        }
        return mq4Var;
    }

    public jr4 c() {
        jr4 jr4Var;
        synchronized (this.d) {
            jr4Var = this.m;
        }
        return jr4Var;
    }

    public void d(jr4 jr4Var) {
        synchronized (this.d) {
            this.m = jr4Var;
        }
    }
}
