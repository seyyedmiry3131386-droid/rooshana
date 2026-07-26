package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.SparseBooleanArray;
import androidx.media3.session.legacy.MediaDescriptionCompat;
import androidx.media3.session.legacy.MediaMetadataCompat;
import androidx.media3.session.legacy.MediaSessionCompat$QueueItem;
import androidx.media3.session.legacy.RatingCompat;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.sentry.android.core.t0;
import ir.myket.player.provider.service.PlaybackService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hr4 extends mq4 {
    public static final int x;
    public final vp7 f;
    public final xq4 g;
    public final mr4 h;
    public final op1 i;
    public final hd j;
    public final qq4 k;
    public final in l;
    public final ComponentName m;
    public er4 n;
    public final boolean o = true;
    public volatile long p;
    public op1 q;
    public int r;
    public final Bundle s;
    public ImmutableList t;
    public ImmutableList u;
    public xp7 v;
    public cb6 w;

    static {
        x = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hr4(defpackage.xq4 r18, android.net.Uri r19, android.os.Handler r20, android.os.Bundle r21, com.google.common.collect.ImmutableList r22, com.google.common.collect.ImmutableList r23, defpackage.xp7 r24, defpackage.cb6 r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr4.<init>(xq4, android.net.Uri, android.os.Handler, android.os.Bundle, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, xp7, cb6, android.os.Bundle):void");
    }

    public static void D(qq4 qq4Var, ArrayList arrayList) {
        if (arrayList != null) {
            qq4Var.getClass();
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j = ((MediaSessionCompat$QueueItem) it.next()).b;
                if (hashSet.contains(Long.valueOf(j))) {
                    t0.e("MediaSessionCompat", bl4.r(j, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        nq4 nq4Var = (nq4) qq4Var.a;
        MediaSession mediaSession = nq4Var.a;
        nq4Var.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) it2.next();
            MediaSession.QueueItem queueItem = mediaSessionCompat$QueueItem.c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(mediaSessionCompat$QueueItem.a.b(), mediaSessionCompat$QueueItem.b);
                mediaSessionCompat$QueueItem.c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(qq4 qq4Var, MediaMetadataCompat mediaMetadataCompat) {
        nq4 nq4Var = (nq4) qq4Var.a;
        nq4Var.i = mediaMetadataCompat;
        MediaSession mediaSession = nq4Var.a;
        Bundle bundle = mediaMetadataCompat.a;
        if (mediaMetadataCompat.b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) MediaMetadataCompat.c.get(str);
                if (num == null) {
                    num = -1;
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.putLong(str, bundle.getLong(str));
                } else if (iIntValue == 1) {
                    builder.putText(str, bundle.getString(str));
                } else if (iIntValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (iIntValue != 3) {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    }
                } else {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                }
            }
            mediaMetadataCompat.b = builder.build();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public static jp4 F(String str, Uri uri, String str2, Bundle bundle) {
        yo4 yo4Var = new yo4();
        ImmutableMap.l();
        ImmutableList.q();
        List list = Collections.EMPTY_LIST;
        ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        pa2 pa2Var = new pa2(16, false);
        pa2Var.c = uri;
        pa2Var.b = str2;
        pa2Var.d = bundle;
        return new jp4(str3, new ap4(yo4Var), null, new ep4(dp4Var), qp4.K, new gp4(pa2Var));
    }

    public static ComponentName J(PlaybackService playbackService, String str) {
        PackageManager packageManager = playbackService.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(playbackService.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            return null;
        }
        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // defpackage.mq4
    public final void A(long j) {
        if (j < 0) {
            return;
        }
        H(10, new zq4(this, j, 0), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void B() {
        H(3, new yq4(this, 6), ((nq4) this.k.a).c(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.session.legacy.PlaybackStateCompat G(defpackage.qg6 r32) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr4.G(qg6):androidx.media3.session.legacy.PlaybackStateCompat");
    }

    public final void H(final int i, final gr4 gr4Var, final jr4 jr4Var, final boolean z) {
        xq4 xq4Var = this.g;
        if (xq4Var.j()) {
            return;
        }
        if (jr4Var != null) {
            j29.a0(xq4Var.l, new Runnable() { // from class: cr4
                @Override // java.lang.Runnable
                public final void run() {
                    gr4 gr4Var2 = gr4Var;
                    hr4 hr4Var = this.a;
                    xq4 xq4Var2 = hr4Var.g;
                    if (xq4Var2.j()) {
                        return;
                    }
                    boolean zIsActive = ((nq4) hr4Var.k.a).a.isActive();
                    int i2 = i;
                    jr4 jr4Var2 = jr4Var;
                    if (!zIsActive) {
                        StringBuilder sbR = rm7.r(i2, "Ignore incoming player command before initialization. command=", ", pid=");
                        sbR.append(jr4Var2.a.b);
                        wn5.k0("MediaSessionLegacyStub", sbR.toString());
                        return;
                    }
                    hq4 hq4VarL = hr4Var.L(jr4Var2);
                    if (!hr4Var.f.e0(hq4VarL, i2)) {
                        if (i2 != 1 || xq4Var2.t.l()) {
                            return;
                        }
                        wn5.k0("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                        return;
                    }
                    ol3 ol3Var = xq4Var2.e;
                    xq4Var2.t(hq4VarL);
                    ol3Var.getClass();
                    try {
                        gr4Var2.b(hq4VarL);
                    } catch (RemoteException e) {
                        wn5.l0("MediaSessionLegacyStub", "Exception in " + hq4VarL, e);
                    }
                    if (z) {
                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                        sparseBooleanArray.append(i2, true);
                        xq4Var2.q(hq4VarL, new cb6(new vd2(sparseBooleanArray)));
                    }
                }
            });
            return;
        }
        wn5.w("RemoteUserInfo is null, ignoring command=" + i);
    }

    public final void I(wp7 wp7Var, int i, gr4 gr4Var, jr4 jr4Var) {
        if (jr4Var != null) {
            j29.a0(this.g.l, new ko4(this, wp7Var, i, jr4Var, gr4Var));
            return;
        }
        StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
        Object objValueOf = wp7Var;
        if (wp7Var == null) {
            objValueOf = Integer.valueOf(i);
        }
        sb.append(objValueOf);
        wn5.w(sb.toString());
    }

    public final void K(jp4 jp4Var, boolean z) {
        H(31, new pr(this, jp4Var, z), ((nq4) this.k.a).c(), false);
    }

    public final hq4 L(jr4 jr4Var) {
        hq4 hq4VarP = this.f.P(jr4Var);
        if (hq4VarP == null) {
            hq4 hq4Var = new hq4(jr4Var, 0, 0, this.h.b(jr4Var), new fr4(jr4Var), Bundle.EMPTY);
            fq4 fq4VarM = this.g.m(hq4Var);
            this.f.n(jr4Var, hq4Var, fq4VarM.a, fq4VarM.b);
            xq4 xq4Var = this.g;
            if (!xq4Var.A || !xq4.k(hq4Var)) {
                xq4Var.e.getClass();
            }
            hq4VarP = hq4Var;
        }
        hd hdVar = this.j;
        long j = this.p;
        hdVar.removeMessages(1001, hq4VarP);
        hdVar.sendMessageDelayed(hdVar.obtainMessage(1001, hq4VarP), j);
        return hq4VarP;
    }

    public final void M() {
        ImmutableList immutableListE = cw0.e(cw0.c(this.u, this.v, this.w), true, true);
        this.t = immutableListE;
        boolean z = !cw0.a(2, immutableListE);
        Bundle bundle = this.s;
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", z);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !cw0.a(3, this.t));
    }

    public final void N(qg6 qg6Var) {
        j29.a0(this.g.l, new ar4(this, qg6Var, 1));
    }

    @Override // defpackage.mq4
    public final void b(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat != null) {
            H(20, new y52(this, mediaDescriptionCompat, -1), ((nq4) this.k.a).c(), false);
        }
    }

    @Override // defpackage.mq4
    public final void c(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat != null) {
            if (i == -1 || i >= 0) {
                H(20, new y52(this, mediaDescriptionCompat, i), ((nq4) this.k.a).c(), false);
            }
        }
    }

    @Override // defpackage.mq4
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            resultReceiver.send(0, this.g.j.b());
        } else {
            wp7 wp7Var = new wp7(Bundle.EMPTY, str);
            I(wp7Var, 0, new u4(this, wp7Var, bundle, resultReceiver, 4), ((nq4) this.k.a).c());
        }
    }

    @Override // defpackage.mq4
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        wp7 wp7Var = new wp7(Bundle.EMPTY, str);
        I(wp7Var, 0, new tg1(this, wp7Var, bundle, 6), ((nq4) this.k.a).c());
    }

    @Override // defpackage.mq4
    public final void f() {
        H(12, new yq4(this, 0), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final boolean g(Intent intent) {
        jr4 jr4VarC = ((nq4) this.k.a).c();
        jr4VarC.getClass();
        return this.g.o(new hq4(jr4VarC, 0, 0, false, null, Bundle.EMPTY), intent);
    }

    @Override // defpackage.mq4
    public final void h() {
        H(1, new yq4(this, 11), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void i() {
        H(1, new yq4(this, 10), ((nq4) this.k.a).c(), false);
    }

    @Override // defpackage.mq4
    public final void j(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true);
    }

    @Override // defpackage.mq4
    public final void k(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true);
    }

    @Override // defpackage.mq4
    public final void l(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true);
    }

    @Override // defpackage.mq4
    public final void m() {
        H(2, new yq4(this, 5), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void n(String str, Bundle bundle) {
        K(F(str, null, null, bundle), false);
    }

    @Override // defpackage.mq4
    public final void o(String str, Bundle bundle) {
        K(F(null, null, str, bundle), false);
    }

    @Override // defpackage.mq4
    public final void p(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), false);
    }

    @Override // defpackage.mq4
    public final void q(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        H(20, new j2(this, mediaDescriptionCompat, 29), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void r() {
        H(11, new yq4(this, 4), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void s(long j) {
        H(5, new zq4(this, j, 1), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void t(float f) {
        if (f <= 0.0f) {
            return;
        }
        H(13, new uc1(this, f), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void u(RatingCompat ratingCompat) {
        v(ratingCompat);
    }

    @Override // defpackage.mq4
    public final void v(RatingCompat ratingCompat) {
        fv6 fv6VarO = r44.o(ratingCompat);
        if (fv6VarO != null) {
            I(null, 40010, new yq4(this, fv6VarO), ((nq4) this.k.a).c());
            return;
        }
        wn5.k0("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + ratingCompat);
    }

    @Override // defpackage.mq4
    public final void w(int i) {
        H(15, new br4(this, i, 0), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void x(int i) {
        H(14, new br4(this, i, 1), ((nq4) this.k.a).c(), true);
    }

    @Override // defpackage.mq4
    public final void y() {
        boolean zF0 = this.g.t.f0(9);
        qq4 qq4Var = this.k;
        if (zF0) {
            H(9, new yq4(this, 8), ((nq4) qq4Var.a).c(), true);
        } else {
            H(8, new yq4(this, 9), ((nq4) qq4Var.a).c(), true);
        }
    }

    @Override // defpackage.mq4
    public final void z() {
        boolean zF0 = this.g.t.f0(7);
        qq4 qq4Var = this.k;
        if (zF0) {
            H(7, new yq4(this, 2), ((nq4) qq4Var.a).c(), true);
        } else {
            H(6, new yq4(this, 3), ((nq4) qq4Var.a).c(), true);
        }
    }
}
