package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class em4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ em4(Object obj, Object obj2, String str, Bundle bundle, ResultReceiver resultReceiver, int i) {
        this.a = i;
        this.f = obj;
        this.e = obj2;
        this.b = str;
        this.d = bundle;
        this.c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                IBinder binder = ((Messenger) ((ql4) this.e).b).getBinder();
                ca7 ca7Var = (ca7) this.f;
                tl4 tl4Var = (tl4) ((MediaBrowserServiceCompat) ca7Var.b).e.get(binder);
                if (tl4Var == null) {
                    t0.m("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.b);
                    return;
                }
                HashMap map = tl4Var.f;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) ca7Var.b;
                IBinder iBinder = (IBinder) this.c;
                String str = this.b;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    Bundle bundle = this.d;
                    if (!zHasNext) {
                        arrayList.add(new h16(iBinder, bundle));
                        map.put(str, arrayList);
                        sl4 sl4Var = new sl4(mediaBrowserServiceCompat, str, tl4Var, str, bundle);
                        mediaBrowserServiceCompat.f = tl4Var;
                        if (bundle == null) {
                            mediaBrowserServiceCompat.b(sl4Var);
                        } else {
                            sl4Var.c = 1;
                            mediaBrowserServiceCompat.b(sl4Var);
                        }
                        mediaBrowserServiceCompat.f = null;
                        if (!sl4Var.b) {
                            throw new IllegalStateException(bl4.z(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), tl4Var.a, " id=", str));
                        }
                        mediaBrowserServiceCompat.f = null;
                        return;
                    }
                    h16 h16Var = (h16) it.next();
                    if (iBinder == h16Var.a) {
                        Bundle bundle2 = (Bundle) h16Var.b;
                        if (bundle == bundle2) {
                            return;
                        }
                        if (bundle == null) {
                            vy2.t(bundle2);
                            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle2 == null) {
                            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                IBinder binder2 = ((Messenger) ((nm5) this.e).b).getBinder();
                ck4 ck4Var = (ck4) this.f;
                ul4 ul4Var = (ul4) ((androidx.media.MediaBrowserServiceCompat) ck4Var.b).e.get(binder2);
                String str2 = this.b;
                if (ul4Var == null) {
                    t0.m("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str2);
                    return;
                }
                HashMap map2 = ul4Var.e;
                androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (androidx.media.MediaBrowserServiceCompat) ck4Var.b;
                IBinder iBinder2 = (IBinder) this.c;
                List arrayList2 = (List) map2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    Bundle bundle3 = this.d;
                    if (!zHasNext2) {
                        arrayList2.add(new h16(iBinder2, bundle3));
                        map2.put(str2, arrayList2);
                        if (bundle3 == null) {
                            mediaBrowserServiceCompat2.b();
                        } else {
                            mediaBrowserServiceCompat2.b();
                        }
                        throw new IllegalStateException(bl4.z(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), ul4Var.a, " id=", str2));
                    }
                    h16 h16Var2 = (h16) it2.next();
                    if (iBinder2 == h16Var2.a) {
                        Bundle bundle4 = (Bundle) h16Var2.b;
                        if (bundle3 == bundle4) {
                            return;
                        }
                        if (bundle3 == null) {
                            if (bundle4.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle4 == null) {
                            if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                return;
                            }
                        } else if (bundle3.getInt("android.media.browse.extra.PAGE", -1) == bundle4.getInt("android.media.browse.extra.PAGE", -1) && bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle4.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                            return;
                        }
                    }
                }
                break;
            case 2:
                IBinder binder3 = ((Messenger) ((ql4) this.e).b).getBinder();
                ca7 ca7Var2 = (ca7) this.f;
                tl4 tl4Var2 = (tl4) ((MediaBrowserServiceCompat) ca7Var2.b).e.get(binder3);
                Bundle bundle5 = this.d;
                if (tl4Var2 == null) {
                    t0.m("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.b + ", extras=" + bundle5);
                    return;
                }
                MediaBrowserServiceCompat mediaBrowserServiceCompat3 = (MediaBrowserServiceCompat) ca7Var2.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                mediaBrowserServiceCompat3.f = tl4Var2;
                if (bundle5 == null) {
                    Bundle bundle6 = Bundle.EMPTY;
                }
                resultReceiver.b(-1, null);
                mediaBrowserServiceCompat3.f = null;
                return;
            default:
                if (((ul4) ((androidx.media.MediaBrowserServiceCompat) ((ck4) this.f).b).e.get(((Messenger) ((nm5) this.e).b).getBinder())) != null) {
                    ((ResultReceiver) this.c).b(-1, null);
                    return;
                }
                t0.m("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.b + ", extras=" + this.d);
                return;
        }
    }

    public /* synthetic */ em4(Object obj, Object obj2, String str, IBinder iBinder, Bundle bundle, int i) {
        this.a = i;
        this.f = obj;
        this.e = obj2;
        this.b = str;
        this.c = iBinder;
        this.d = bundle;
    }
}
