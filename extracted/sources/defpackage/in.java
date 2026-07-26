package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.media3.session.legacy.a;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class in extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ in(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.a) {
            case 0:
                ((y) this.b).s();
                break;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    zy zyVar = (zy) this.b;
                    zyVar.a(wy.c(context, intent, zyVar.i, zyVar.h));
                }
                break;
            case 2:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((a) ((nc2) ((hr4) this.b).k.b).b).a.dispatchMediaButtonEvent(keyEvent);
                }
                break;
            case 3:
                ((Executor) ((fn5) this.b).c).execute(new lo4(this, context, 18));
                break;
            default:
                vx7.g.execute(new ux7((vx7) this.b, 2));
                break;
        }
    }
}
