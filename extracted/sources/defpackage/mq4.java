package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.media3.session.legacy.RatingCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class mq4 {
    public boolean c;
    public hd e;
    public final Object a = new Object();
    public final lq4 b = new lq4(this);
    public WeakReference d = new WeakReference(null);

    public final void C(nq4 nq4Var, Handler handler) {
        synchronized (this.a) {
            try {
                this.d = new WeakReference(nq4Var);
                hd hdVar = this.e;
                if (hdVar != null) {
                    hdVar.removeCallbacksAndMessages(null);
                }
                this.e = new hd(this, handler.getLooper(), 7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(nq4 nq4Var, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = nq4Var.g;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.e;
            boolean z = playbackStateCompat != null && playbackStateCompat.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                h();
            } else {
                if (z || !z2) {
                    return;
                }
                i();
            }
        }
    }

    public boolean g(Intent intent) {
        nq4 nq4Var;
        hd hdVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.a) {
                nq4Var = (nq4) this.d.get();
                hdVar = this.e;
            }
            if (nq4Var != null && hdVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                jr4 jr4VarC = nq4Var.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(nq4Var, hdVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(nq4Var, hdVar);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    hdVar.sendMessageDelayed(hdVar.obtainMessage(1, jr4VarC), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                hdVar.removeMessages(1);
                this.c = false;
                PlaybackStateCompat playbackStateCompat = nq4Var.g;
                if (((playbackStateCompat == null ? 0L : playbackStateCompat.e) & 32) != 0) {
                    y();
                }
                return true;
            }
        }
        return false;
    }

    public void B() {
    }

    public void f() {
    }

    public void h() {
    }

    public void i() {
    }

    public void m() {
    }

    public void r() {
    }

    public void y() {
    }

    public void z() {
    }

    public void A(long j) {
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void q(MediaDescriptionCompat mediaDescriptionCompat) {
    }

    public void s(long j) {
    }

    public void t(float f) {
    }

    public void u(RatingCompat ratingCompat) {
    }

    public void v(RatingCompat ratingCompat) {
    }

    public void w(int i) {
    }

    public void x(int i) {
    }

    public void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
    }

    public void e(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(Uri uri, Bundle bundle) {
    }

    public void n(String str, Bundle bundle) {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(Uri uri, Bundle bundle) {
    }

    public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
