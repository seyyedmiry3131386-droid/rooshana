package defpackage;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.media3.session.legacy.RatingCompat;
import androidx.versionedparcelable.ParcelImpl;
import io.sentry.android.core.t0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lq4 extends MediaSession.Callback {
    public final /* synthetic */ mq4 a;

    public lq4(mq4 mq4Var) {
        this.a = mq4Var;
    }

    public static void b(nq4 nq4Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = nq4Var.a;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                t0.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        nq4Var.d(new jr4(str, -1, -1));
    }

    public final nq4 a() {
        nq4 nq4Var;
        synchronized (this.a.a) {
            nq4Var = (nq4) this.a.d.get();
        }
        if (nq4Var == null || this.a != nq4Var.b()) {
            return null;
        }
        return nq4Var;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        s49 s49Var;
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    MediaSessionCompat$Token mediaSessionCompat$Token = nq4VarA.c;
                    yf3 yf3VarA = mediaSessionCompat$Token.a();
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", yf3VarA == null ? null : yf3VarA.asBinder());
                    synchronized (mediaSessionCompat$Token.a) {
                        s49Var = mediaSessionCompat$Token.d;
                    }
                    if (s49Var != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(s49Var));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.a.b((MediaDescriptionCompat) yh0.p(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), MediaDescriptionCompat.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.a.c((MediaDescriptionCompat) yh0.p(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), MediaDescriptionCompat.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.a.q((MediaDescriptionCompat) yh0.p(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), MediaDescriptionCompat.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = nq4VarA.h;
                if (list != null && bundle != null) {
                    int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i < 0 || i >= list.size()) ? null : (MediaSessionCompat$QueueItem) list.get(i);
                    if (mediaSessionCompat$QueueItem != null) {
                        this.a.q(mediaSessionCompat$QueueItem.a);
                    }
                }
            } else {
                this.a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            t0.d("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            mq4 mq4Var = this.a;
            if (zEquals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    qq4.l(bundle2);
                    mq4Var.l(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                mq4Var.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    qq4.l(bundle3);
                    mq4Var.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    qq4.l(bundle4);
                    mq4Var.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    qq4.l(bundle5);
                    mq4Var.p(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    mq4Var.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    mq4Var.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    RatingCompat ratingCompat = (RatingCompat) yh0.p(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), RatingCompat.CREATOR);
                    qq4.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    mq4Var.v(ratingCompat);
                }
            } else if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                mq4Var.e(str, bundle);
            } else if (bundle != null) {
                mq4Var.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            }
        } catch (BadParcelableException unused) {
            t0.d("MediaSessionCompat", "Could not unparcel the data.");
        }
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.f();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return false;
        }
        b(nq4VarA);
        boolean zG = this.a.g(intent);
        nq4VarA.d(null);
        return zG || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.h();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.i();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        this.a.j(str, bundle);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        this.a.k(str, bundle);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        this.a.l(uri, bundle);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.m();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        this.a.n(str, bundle);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        this.a.o(str, bundle);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        qq4.l(bundle);
        b(nq4VarA);
        this.a.p(uri, bundle);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.r();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.s(j);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.t(f);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.u(RatingCompat.a(rating));
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.y();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.z();
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.A(j);
        nq4VarA.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        nq4 nq4VarA = a();
        if (nq4VarA == null) {
            return;
        }
        b(nq4VarA);
        this.a.B();
        nq4VarA.d(null);
    }
}
