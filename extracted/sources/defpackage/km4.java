package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.media3.session.legacy.a;
import j$.util.DesugarCollections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class km4 extends y {
    public final Context c;
    public final Intent d;
    public final BroadcastReceiver.PendingResult e;
    public ql4 f;

    public km4(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        super(6, false);
        this.c = context;
        this.d = intent;
        this.e = pendingResult;
    }

    @Override // defpackage.y
    public final void t() {
        Messenger messenger;
        ql4 ql4Var = this.f;
        ql4Var.getClass();
        ml4 ml4Var = (ml4) ql4Var.b;
        if (ml4Var.h == null) {
            ml4Var.h = new MediaSessionCompat$Token(ml4Var.b.getSessionToken(), null, null);
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = ml4Var.h;
        DesugarCollections.synchronizedSet(new HashSet());
        int i = Build.VERSION.SDK_INT;
        Context context = this.c;
        a kn4Var = i >= 29 ? new kn4(context, mediaSessionCompat$Token) : new a(context, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) this.d.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        kn4Var.a.dispatchMediaButtonEvent(keyEvent);
        ql4 ql4Var2 = this.f;
        ql4Var2.getClass();
        ml4 ml4Var2 = (ml4) ql4Var2.b;
        nc2 nc2Var = ml4Var2.f;
        if (nc2Var != null && (messenger = ml4Var2.g) != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = 1;
                messageObtain.replyTo = messenger;
                ((Messenger) nc2Var.b).send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
        ml4Var2.b.disconnect();
        this.e.finish();
    }

    @Override // defpackage.y
    public final void u() {
        Messenger messenger;
        ql4 ql4Var = this.f;
        ql4Var.getClass();
        ml4 ml4Var = (ml4) ql4Var.b;
        nc2 nc2Var = ml4Var.f;
        if (nc2Var != null && (messenger = ml4Var.g) != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = 1;
                messageObtain.replyTo = messenger;
                ((Messenger) nc2Var.b).send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
        ml4Var.b.disconnect();
        this.e.finish();
    }

    @Override // defpackage.y
    public final void v() {
        Messenger messenger;
        ql4 ql4Var = this.f;
        ql4Var.getClass();
        ml4 ml4Var = (ml4) ql4Var.b;
        nc2 nc2Var = ml4Var.f;
        if (nc2Var != null && (messenger = ml4Var.g) != null) {
            try {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.arg1 = 1;
                messageObtain.replyTo = messenger;
                ((Messenger) nc2Var.b).send(messageObtain);
            } catch (RemoteException unused) {
            }
        }
        ml4Var.b.disconnect();
        this.e.finish();
    }
}
