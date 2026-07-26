package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import androidx.media3.session.a;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class no4 implements IBinder.DeathRecipient {
    public final hn4 a = new hn4(this);
    public ee1 b;
    public in4 c;
    public final Handler d;
    public final /* synthetic */ a e;

    public no4(a aVar, Looper looper) {
        this.e = aVar;
        this.d = new Handler(looper, new p94(2, this));
    }

    public final void a(mn4 mn4Var) {
        a aVar = this.e;
        oo4 oo4Var = aVar.n;
        aVar.n = new oo4(mn4Var, oo4Var.b, oo4Var.c, oo4Var.d, oo4Var.e, oo4Var.f, oo4Var.g, oo4Var.h);
        k();
    }

    public final void b(boolean z) {
        gn4 gn4Var = this.e.b;
        gn4Var.getClass();
        vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
        en4 en4Var = gn4Var.d;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z);
        en4Var.w(new wp7(Bundle.EMPTY, "androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED"));
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        i(8, null, null);
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        a aVar = this.e;
        oo4 oo4Var = aVar.n;
        aVar.n = new oo4(oo4Var.a, oo4Var.b, oo4Var.c, oo4Var.d, oo4Var.e, oo4Var.f, oo4Var.g, bundle2);
        aVar.o = true;
        k();
    }

    public final void d(MediaMetadataCompat mediaMetadataCompat) {
        a aVar = this.e;
        oo4 oo4Var = aVar.n;
        aVar.n = new oo4(oo4Var.a, oo4Var.b, mediaMetadataCompat, oo4Var.d, oo4Var.e, oo4Var.f, oo4Var.g, oo4Var.h);
        k();
    }

    public final void e(PlaybackStateCompat playbackStateCompat) {
        a aVar = this.e;
        oo4 oo4Var = aVar.n;
        aVar.n = new oo4(oo4Var.a, a.o0(playbackStateCompat), oo4Var.c, oo4Var.d, oo4Var.e, oo4Var.f, oo4Var.g, oo4Var.h);
        k();
    }

    public final void f(List list) {
        a aVar = this.e;
        oo4 oo4Var = aVar.n;
        aVar.n = new oo4(oo4Var.a, oo4Var.b, oo4Var.c, a.n0(list), oo4Var.e, oo4Var.f, oo4Var.g, oo4Var.h);
        k();
    }

    public final void g(CharSequence charSequence) {
        a aVar = this.e;
        oo4 oo4Var = aVar.n;
        aVar.n = new oo4(oo4Var.a, oo4Var.b, oo4Var.c, oo4Var.d, charSequence, oo4Var.f, oo4Var.g, oo4Var.h);
        k();
    }

    public final void h(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        gn4 gn4Var = this.e.b;
        gn4Var.getClass();
        vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
        gn4Var.d.w(new wp7(Bundle.EMPTY, str));
    }

    public final void i(int i, Object obj, Bundle bundle) {
        ee1 ee1Var = this.b;
        if (ee1Var != null) {
            Message messageObtainMessage = ee1Var.obtainMessage(i, obj);
            if (bundle != null) {
                messageObtainMessage.setData(bundle);
            }
            messageObtainMessage.sendToTarget();
        }
    }

    public final void j(Handler handler) {
        if (handler != null) {
            ee1 ee1Var = new ee1(this, handler.getLooper());
            this.b = ee1Var;
            ee1Var.b = true;
        } else {
            ee1 ee1Var2 = this.b;
            if (ee1Var2 != null) {
                ee1Var2.b = false;
                ee1Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void k() {
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.e.h);
    }
}
