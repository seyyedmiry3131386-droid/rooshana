package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Pair;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.session.a;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import io.sentry.android.core.t0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ee1 extends Handler {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(ge1 ge1Var, Looper looper) {
        super(looper);
        this.c = ge1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.os.Message r8, androidx.media3.exoplayer.drm.MediaDrmCallbackException r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            fe1 r0 = (defpackage.fe1) r0
            boolean r1 = r0.b
            r2 = 0
            if (r1 != 0) goto Lb
            goto L87
        Lb:
            int r1 = r0.d
            r3 = 1
            int r1 = r1 + r3
            r0.d = r1
            java.lang.Object r4 = r7.c
            ge1 r4 = (defpackage.ge1) r4
            fv r4 = r4.i
            r4.getClass()
            r4 = 3
            if (r1 <= r4) goto L1f
            goto L87
        L1f:
            da4 r1 = new da4
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L36
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L40
        L36:
            androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException r1 = new androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L40:
            java.lang.Object r1 = r7.c
            ge1 r1 = (defpackage.ge1) r1
            fv r1 = r1.i
            int r0 = r0.d
            r1.getClass()
            boolean r1 = r9 instanceof androidx.media3.common.ParserException
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r1 != 0) goto L82
            boolean r1 = r9 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r1 != 0) goto L82
            int r1 = androidx.media3.datasource.DataSourceException.b
        L62:
            if (r9 == 0) goto L77
            boolean r1 = r9 instanceof androidx.media3.datasource.DataSourceException
            if (r1 == 0) goto L72
            r1 = r9
            androidx.media3.datasource.DataSourceException r1 = (androidx.media3.datasource.DataSourceException) r1
            int r1 = r1.a
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L72
            goto L82
        L72:
            java.lang.Throwable r9 = r9.getCause()
            goto L62
        L77:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L83
        L82:
            r0 = r4
        L83:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L88
        L87:
            return r2
        L88:
            monitor-enter(r7)
            boolean r9 = r7.b     // Catch: java.lang.Throwable -> L96
            if (r9 != 0) goto L98
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L96
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return r3
        L96:
            r8 = move-exception
            goto L9a
        L98:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            return r2
        L9a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ee1.a(android.os.Message, androidx.media3.exoplayer.drm.MediaDrmCallbackException):boolean");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objG;
        int iF;
        boolean zM;
        switch (this.a) {
            case 0:
                fe1 fe1Var = (fe1) message.obj;
                try {
                    int i = message.what;
                    if (i == 1) {
                        objG = ((ge1) this.c).k.g((l52) fe1Var.c);
                    } else {
                        if (i != 2) {
                            throw new RuntimeException();
                        }
                        ge1 ge1Var = (ge1) this.c;
                        objG = ge1Var.k.f(ge1Var.l, (k52) fe1Var.c);
                    }
                } catch (MediaDrmCallbackException e) {
                    boolean zA = a(message, e);
                    objG = e;
                    if (zA) {
                        return;
                    }
                } catch (Exception e2) {
                    wn5.l0("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                    objG = e2;
                }
                fv fvVar = ((ge1) this.c).i;
                long j = fe1Var.a;
                fvVar.getClass();
                synchronized (this) {
                    try {
                        if (!this.b) {
                            ((ge1) this.c).n.obtainMessage(message.what, Pair.create(fe1Var.c, objG)).sendToTarget();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            default:
                no4 no4Var = (no4) this.c;
                a aVar = no4Var.e;
                if (this.b) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            qq4.l(data);
                            no4Var.h((String) message.obj, data);
                            return;
                        case 2:
                            no4Var.e((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            no4Var.d((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            no4Var.a((mn4) message.obj);
                            return;
                        case 5:
                            no4Var.f((List) message.obj);
                            return;
                        case 6:
                            no4Var.g((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            qq4.l(bundle);
                            no4Var.c(bundle);
                            return;
                        case 8:
                            aVar.b.a();
                            return;
                        case 9:
                            int iIntValue = ((Integer) message.obj).intValue();
                            oo4 oo4Var = aVar.n;
                            aVar.n = new oo4(oo4Var.a, oo4Var.b, oo4Var.c, oo4Var.d, oo4Var.e, iIntValue, oo4Var.g, oo4Var.h);
                            no4Var.k();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            no4Var.b(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            int iIntValue2 = ((Integer) message.obj).intValue();
                            oo4 oo4Var2 = aVar.n;
                            aVar.n = new oo4(oo4Var2.a, oo4Var2.b, oo4Var2.c, oo4Var2.d, oo4Var2.e, oo4Var2.f, iIntValue2, oo4Var2.h);
                            no4Var.k();
                            return;
                        case 13:
                            if (!aVar.l) {
                                aVar.u0();
                                return;
                            }
                            oo4 oo4Var3 = aVar.n;
                            PlaybackStateCompat playbackStateCompatO0 = a.o0(aVar.i.s());
                            yf3 yf3VarA = ((androidx.media3.session.legacy.a) aVar.i.b).e.a();
                            int iJ = -1;
                            if (yf3VarA != null) {
                                try {
                                    iF = yf3VarA.f();
                                } catch (RemoteException | SecurityException e3) {
                                    t0.e("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
                                    iF = -1;
                                }
                            } else {
                                iF = -1;
                            }
                            yf3 yf3VarA2 = ((androidx.media3.session.legacy.a) aVar.i.b).e.a();
                            if (yf3VarA2 != null) {
                                try {
                                    iJ = yf3VarA2.J();
                                } catch (RemoteException | SecurityException e4) {
                                    t0.e("MediaControllerCompat", "Dead object in getShuffleMode.", e4);
                                }
                                break;
                            }
                            aVar.n = new oo4(oo4Var3.a, playbackStateCompatO0, oo4Var3.c, oo4Var3.d, oo4Var3.e, iF, iJ, oo4Var3.h);
                            yf3 yf3VarA3 = ((androidx.media3.session.legacy.a) aVar.i.b).e.a();
                            if (yf3VarA3 != null) {
                                try {
                                    zM = yf3VarA3.M();
                                } catch (RemoteException | SecurityException e5) {
                                    t0.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e5);
                                    zM = false;
                                }
                                break;
                            } else {
                                zM = false;
                            }
                            no4Var.b(zM);
                            no4Var.d.removeMessages(1);
                            aVar.r0(false, aVar.n);
                            return;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(no4 no4Var, Looper looper) {
        super(looper);
        this.c = no4Var;
        this.b = false;
    }
}
