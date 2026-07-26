package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.media3.session.legacy.MediaBrowserCompat$MediaItem;
import io.sentry.android.core.t0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class kl4 extends Handler {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public kl4(ml4 ml4Var) {
        this.b = new WeakReference(ml4Var);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                ml4 ml4Var = (ml4) ((WeakReference) this.b).get();
                if (messenger == null || ml4Var == null) {
                    return;
                }
                Bundle data = message.getData();
                qq4.l(data);
                try {
                    if (message.what != 3) {
                        t0.m("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    qq4.l(data.getBundle("data_options"));
                    qq4.l(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    yh0.q(data.getParcelableArrayList("data_media_item_list"), MediaBrowserCompat$MediaItem.CREATOR);
                    if (ml4Var.g == messenger && string != null && ml4Var.e.get(string) != null) {
                        throw new ClassCastException();
                    }
                    return;
                } catch (BadParcelableException unused) {
                    t0.d("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            case 1:
                WeakReference weakReference2 = (WeakReference) this.b;
                WeakReference weakReference3 = (WeakReference) this.c;
                if (weakReference3 == null || weakReference3.get() == null || weakReference2.get() == null) {
                    return;
                }
                Bundle data2 = message.getData();
                rq4.v(data2);
                nl4 nl4Var = (nl4) weakReference2.get();
                Messenger messenger2 = (Messenger) ((WeakReference) this.c).get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        rq4.v(data2.getBundle("data_root_hints"));
                        data2.getString("data_media_item_id");
                        nl4Var.getClass();
                        return;
                    }
                    if (i == 2) {
                        nl4Var.getClass();
                        return;
                    }
                    if (i != 3) {
                        t0.m("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    rq4.v(data2.getBundle("data_options"));
                    rq4.v(data2.getBundle("data_notify_children_changed_options"));
                    String string2 = data2.getString("data_media_item_id");
                    data2.getParcelableArrayList("data_media_item_list");
                    if (nl4Var.g != messenger2) {
                        return;
                    }
                    if (nl4Var.e.get(string2) != null) {
                        throw new ClassCastException();
                    }
                    int i2 = rl4.b;
                    return;
                } catch (BadParcelableException unused2) {
                    t0.d("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        nl4Var.getClass();
                        return;
                    }
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl4(xq4 xq4Var, Looper looper) {
        super(looper);
        this.c = xq4Var;
    }

    public kl4(nl4 nl4Var) {
        this.b = new WeakReference(nl4Var);
    }
}
