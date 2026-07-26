package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.a;
import android.view.KeyEvent;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.media3.session.legacy.d;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ll4 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ll4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        zf3 zf3Var;
        int i = this.a;
        Object obj = this.b;
        char c = 0;
        switch (i) {
            case 0:
                y yVar = (y) obj;
                ml4 ml4Var = (ml4) yVar.b;
                if (ml4Var != null) {
                    kl4 kl4Var = ml4Var.d;
                    MediaBrowser mediaBrowser = ml4Var.b;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            extras.getInt("extra_service_version", 0);
                            IBinder binder = extras.getBinder("extra_messenger");
                            if (binder != null) {
                                nc2 nc2Var = new nc2(binder, ml4Var.c);
                                ml4Var.f = nc2Var;
                                Messenger messenger = new Messenger(kl4Var);
                                ml4Var.g = messenger;
                                kl4Var.getClass();
                                kl4Var.c = new WeakReference(messenger);
                                try {
                                    Context context = ml4Var.a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", (Bundle) nc2Var.c);
                                    Message messageObtain = Message.obtain();
                                    messageObtain.what = 6;
                                    messageObtain.arg1 = 1;
                                    messageObtain.setData(bundle);
                                    messageObtain.replyTo = messenger;
                                    ((Messenger) nc2Var.b).send(messageObtain);
                                    break;
                                } catch (RemoteException unused) {
                                }
                            }
                            yf3 yf3VarL = d.L(extras.getBinder("extra_session_binder"));
                            if (yf3VarL != null) {
                                ml4Var.h = new MediaSessionCompat$Token(mediaBrowser.getSessionToken(), yf3VarL, null);
                            }
                        }
                    } catch (IllegalStateException e) {
                        t0.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
                    }
                }
                yVar.t();
                return;
            default:
                on onVar = (on) obj;
                nl4 nl4Var = (nl4) onVar.b;
                if (nl4Var != null) {
                    kl4 kl4Var2 = nl4Var.d;
                    MediaBrowser mediaBrowser2 = nl4Var.b;
                    try {
                        Bundle extras2 = mediaBrowser2.getExtras();
                        if (extras2 != null) {
                            extras2.getInt("extra_service_version", 0);
                            IBinder binder2 = extras2.getBinder("extra_messenger");
                            if (binder2 != null) {
                                Bundle bundle2 = nl4Var.c;
                                hh2 hh2Var = new hh2(c, 14);
                                hh2Var.b = new Messenger(binder2);
                                hh2Var.c = bundle2;
                                nl4Var.f = hh2Var;
                                Messenger messenger2 = new Messenger(kl4Var2);
                                nl4Var.g = messenger2;
                                kl4Var2.getClass();
                                kl4Var2.c = new WeakReference(messenger2);
                                try {
                                    hh2 hh2Var2 = nl4Var.f;
                                    Context context2 = nl4Var.a;
                                    Messenger messenger3 = nl4Var.g;
                                    hh2Var2.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("data_package_name", context2.getPackageName());
                                    bundle3.putInt("data_calling_pid", Process.myPid());
                                    bundle3.putBundle("data_root_hints", (Bundle) hh2Var2.c);
                                    hh2Var2.E(6, bundle3, messenger3);
                                    break;
                                } catch (RemoteException unused2) {
                                }
                            }
                            IBinder binder3 = extras2.getBinder("extra_session_binder");
                            int i2 = wf3.n;
                            if (binder3 == null) {
                                zf3Var = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = binder3.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zf3)) {
                                    vf3 vf3Var = new vf3();
                                    vf3Var.n = binder3;
                                    zf3Var = vf3Var;
                                } else {
                                    zf3Var = (zf3) iInterfaceQueryLocalInterface;
                                }
                            }
                            if (zf3Var != null) {
                                MediaSession.Token sessionToken = mediaBrowser2.getSessionToken();
                                nl4Var.h = sessionToken != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken, zf3Var) : null;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        t0.e("MediaBrowserCompat", "Unexpected IllegalStateException", e2);
                    }
                }
                Context context3 = (Context) onVar.c;
                nl4 nl4Var2 = ((rl4) onVar.f).a;
                if (nl4Var2.h == null) {
                    MediaSession.Token sessionToken2 = nl4Var2.b.getSessionToken();
                    nl4Var2.h = sessionToken2 != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken2, null) : null;
                }
                android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = nl4Var2.h;
                if (mediaSessionCompat$Token == null) {
                    throw new IllegalArgumentException("sessionToken must not be null");
                }
                DesugarCollections.synchronizedSet(new HashSet());
                a ln4Var = Build.VERSION.SDK_INT >= 29 ? new ln4(context3, mediaSessionCompat$Token) : new a(context3, mediaSessionCompat$Token);
                KeyEvent keyEvent = (KeyEvent) ((Intent) onVar.d).getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                ln4Var.a.dispatchMediaButtonEvent(keyEvent);
                onVar.k();
                return;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        switch (this.a) {
            case 0:
                ((y) this.b).u();
                break;
            default:
                on onVar = (on) this.b;
                nl4 nl4Var = (nl4) onVar.b;
                if (nl4Var != null) {
                    nl4Var.getClass();
                }
                onVar.k();
                break;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                ml4 ml4Var = (ml4) yVar.b;
                if (ml4Var != null) {
                    ml4Var.f = null;
                    ml4Var.g = null;
                    ml4Var.h = null;
                    kl4 kl4Var = ml4Var.d;
                    kl4Var.getClass();
                    kl4Var.c = new WeakReference(null);
                }
                yVar.v();
                break;
            default:
                on onVar = (on) this.b;
                nl4 nl4Var = (nl4) onVar.b;
                if (nl4Var != null) {
                    nl4Var.f = null;
                    nl4Var.g = null;
                    nl4Var.h = null;
                    kl4 kl4Var2 = nl4Var.d;
                    kl4Var2.getClass();
                    kl4Var2.c = new WeakReference(null);
                }
                onVar.k();
                break;
        }
    }
}
