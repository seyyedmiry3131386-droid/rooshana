package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class wl4 extends MediaBrowserService {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public wl4(rb4 rb4Var, Context context) {
        this.a = 0;
        this.c = rb4Var;
        this.a = 0;
        this.b = rb4Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        qm5 qm5Var;
        switch (this.a) {
            case 0:
                qq4.l(bundle);
                rb4 rb4Var = (rb4) this.b;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) rb4Var.d;
                Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
                int i2 = -1;
                if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
                    bundle2 = null;
                } else {
                    bundle3.remove("extra_client_version");
                    rb4Var.c = new Messenger(mediaBrowserServiceCompat.g);
                    bundle2 = new Bundle();
                    bundle2.putInt("extra_service_version", 2);
                    bundle2.putBinder("extra_messenger", ((Messenger) rb4Var.c).getBinder());
                    MediaSessionCompat$Token mediaSessionCompat$Token = mediaBrowserServiceCompat.h;
                    if (mediaSessionCompat$Token != null) {
                        yf3 yf3VarA = mediaSessionCompat$Token.a();
                        bundle2.putBinder("extra_session_binder", yf3VarA == null ? null : yf3VarA.asBinder());
                    } else {
                        ((ArrayList) rb4Var.e).add(bundle2);
                    }
                    i2 = bundle3.getInt("extra_calling_pid", -1);
                    bundle3.remove("extra_calling_pid");
                }
                tl4 tl4Var = new tl4(mediaBrowserServiceCompat, str, i2, i, null);
                mediaBrowserServiceCompat.f = tl4Var;
                qm5 qm5VarA = mediaBrowserServiceCompat.a(bundle3);
                mediaBrowserServiceCompat.f = null;
                if (qm5VarA == null) {
                    qm5Var = null;
                } else {
                    if (((Messenger) rb4Var.c) != null) {
                        mediaBrowserServiceCompat.d.add(tl4Var);
                    }
                    Bundle bundle4 = (Bundle) qm5VarA.b;
                    if (bundle2 == null) {
                        bundle2 = bundle4;
                    } else if (bundle4 != null) {
                        bundle2.putAll(bundle4);
                    }
                    qm5Var = new qm5(26, bundle2);
                }
                if (qm5Var == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot("androidx.media3.session.MediaLibraryService", (Bundle) qm5Var.b);
            default:
                rq4.v(bundle);
                rb4 rb4Var2 = (rb4) this.b;
                androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat2 = (androidx.media.MediaBrowserServiceCompat) rb4Var2.d;
                Bundle bundle5 = bundle == null ? null : new Bundle(bundle);
                int i3 = -1;
                if (bundle5 != null && bundle5.getInt("extra_client_version", 0) != 0) {
                    bundle5.remove("extra_client_version");
                    rb4Var2.c = new Messenger(mediaBrowserServiceCompat2.f);
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt("extra_service_version", 2);
                    bundle6.putBinder("extra_messenger", ((Messenger) rb4Var2.c).getBinder());
                    ((ArrayList) rb4Var2.e).add(bundle6);
                    i3 = bundle5.getInt("extra_calling_pid", -1);
                    bundle5.remove("extra_calling_pid");
                }
                ul4 ul4Var = new ul4(mediaBrowserServiceCompat2, str, i3, i, null);
                if (mediaBrowserServiceCompat2.a() == null) {
                    return null;
                }
                if (((Messenger) rb4Var2.c) == null) {
                    throw null;
                }
                mediaBrowserServiceCompat2.d.add(ul4Var);
                throw null;
        }
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        switch (this.a) {
            case 0:
                rb4 rb4Var = (rb4) this.b;
                vl4 vl4Var = new vl4(str, new r79(26, result));
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) rb4Var.d;
                mediaBrowserServiceCompat.f = mediaBrowserServiceCompat.c;
                mediaBrowserServiceCompat.b(vl4Var);
                mediaBrowserServiceCompat.f = null;
                break;
            default:
                ((androidx.media.MediaBrowserServiceCompat) ((rb4) this.b).d).b();
                break;
        }
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        switch (this.a) {
            case 0:
                rb4 rb4Var = (rb4) this.c;
                r79 r79Var = new r79(26, result);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) rb4Var.f;
                mediaBrowserServiceCompat.f = mediaBrowserServiceCompat.c;
                r79Var.w(null);
                mediaBrowserServiceCompat.f = null;
                break;
            default:
                rb4 rb4Var2 = (rb4) this.c;
                pj9 pj9Var = new pj9(result);
                ul4 ul4Var = ((androidx.media.MediaBrowserServiceCompat) rb4Var2.f).c;
                ((MediaBrowserService.Result) pj9Var.a).sendResult(null);
                break;
        }
    }

    public wl4(rb4 rb4Var, Context context, char c) {
        this.a = 1;
        this.c = rb4Var;
        this.a = 1;
        this.b = rb4Var;
        attachBaseContext(context);
    }
}
