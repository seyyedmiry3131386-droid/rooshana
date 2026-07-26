package defpackage;

import android.animation.ValueAnimator;
import android.os.IBinder;
import android.os.Messenger;
import android.view.View;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import io.sentry.android.core.t0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mn0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                on0 on0Var = (on0) ((qm5) this.e).b;
                vt4 vt4Var = (vt4) this.c;
                nn0 nn0Var = (nn0) this.b;
                if (nn0Var != null) {
                    on0Var.z = true;
                    nn0Var.b.c(false);
                    on0Var.z = false;
                }
                if (vt4Var.isEnabled() && vt4Var.hasSubMenu()) {
                    ((ot4) this.d).q(vt4Var, null, 4);
                    return;
                }
                return;
            case 1:
                String str = (String) this.c;
                IBinder binder = ((Messenger) ((ql4) this.b).b).getBinder();
                ca7 ca7Var = (ca7) this.e;
                tl4 tl4Var = (tl4) ((MediaBrowserServiceCompat) ca7Var.b).e.get(binder);
                if (tl4Var == null) {
                    t0.m("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    return;
                }
                HashMap map = tl4Var.f;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) ca7Var.b;
                IBinder iBinder = (IBinder) this.d;
                boolean z = false;
                try {
                    if (iBinder != null) {
                        List list = (List) map.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((h16) it.next()).a) {
                                    it.remove();
                                    z = true;
                                }
                            }
                            if (list.isEmpty()) {
                                map.remove(str);
                            }
                        }
                    } else if (map.remove(str) != null) {
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                    t0.m("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                    return;
                } finally {
                    mediaBrowserServiceCompat.f = null;
                }
            case 2:
                String str2 = (String) this.c;
                ul4 ul4Var = (ul4) ((androidx.media.MediaBrowserServiceCompat) ((ck4) this.e).b).e.get(((Messenger) ((nm5) this.b).b).getBinder());
                if (ul4Var == null) {
                    t0.m("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str2);
                    return;
                }
                HashMap map2 = ul4Var.e;
                IBinder iBinder2 = (IBinder) this.d;
                boolean z2 = false;
                if (iBinder2 != null) {
                    List list2 = (List) map2.get(str2);
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (iBinder2 == ((h16) it2.next()).a) {
                                it2.remove();
                                z2 = true;
                            }
                        }
                        if (list2.size() == 0) {
                            map2.remove(str2);
                        }
                    }
                } else if (map2.remove(str2) != null) {
                    z2 = true;
                }
                if (z2) {
                    return;
                }
                t0.m("MBServiceCompat", "removeSubscription called for " + str2 + " which is not subscribed");
                return;
            default:
                pe9.i((View) this.b, (ue9) this.c, (rn6) this.d);
                ((ValueAnimator) this.e).start();
                return;
        }
    }

    public mn0(View view, ue9 ue9Var, rn6 rn6Var, ValueAnimator valueAnimator) {
        this.a = 3;
        this.b = view;
        this.c = ue9Var;
        this.d = rn6Var;
        this.e = valueAnimator;
    }
}
