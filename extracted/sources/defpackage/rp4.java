package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rp4 implements ce {
    public int A;
    public boolean B;
    public final Context a;
    public final pg1 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public pg p;
    public pg q;
    public pg r;
    public b s;
    public b t;
    public b u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = y40.s();
    public final am8 f = new am8();
    public final yl8 g = new yl8();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public rp4(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        pg1 pg1Var = new pg1();
        this.c = pg1Var;
        pg1Var.d = this;
    }

    public static rp4 b0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new rp4(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override // defpackage.ce
    public final /* synthetic */ void A(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void B(be beVar, b bVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void C(be beVar) {
    }

    @Override // defpackage.ce
    public final void D(int i, long j, be beVar) {
        ks4 ks4Var = beVar.d;
        if (ks4Var != null) {
            String strD = this.c.d(beVar.b, ks4Var);
            HashMap map = this.i;
            Long l = (Long) map.get(strD);
            HashMap map2 = this.h;
            Long l2 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // defpackage.ce
    public final void E(be beVar, PlaybackException playbackException) {
        this.o = playbackException;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void F(be beVar, float f) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void G(be beVar, int i, long j, long j2) {
    }

    @Override // defpackage.ce
    public final void H(be beVar, ec1 ec1Var) {
        this.y += ec1Var.g;
        this.z += ec1Var.e;
    }

    @Override // defpackage.ce
    public final void I(be beVar, da4 da4Var, op4 op4Var, IOException iOException) {
        this.w = op4Var.a;
    }

    @Override // defpackage.ce
    public final void J(int i, be beVar, fb6 fb6Var, fb6 fb6Var2) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    @Override // defpackage.ce
    public final void K(be beVar, op4 op4Var) {
        ks4 ks4Var = beVar.d;
        if (ks4Var == null) {
            return;
        }
        b bVar = op4Var.c;
        bVar.getClass();
        int i = op4Var.d;
        bm8 bm8Var = beVar.b;
        ks4Var.getClass();
        pg pgVar = new pg(i, 9, bVar, this.c.d(bm8Var, ks4Var));
        int i2 = op4Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = pgVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = pgVar;
                return;
            }
        }
        this.p = pgVar;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void L(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void M(be beVar, String str) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void N(be beVar, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void O(be beVar, b bVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void P(be beVar, rp8 rp8Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void Q(be beVar, Exception exc) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void R(be beVar, int i, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:390:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(defpackage.gb6 r21, defpackage.qq4 r22) {
        /*
            Method dump skipped, instruction units count: 1518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rp4.S(gb6, qq4):void");
    }

    @Override // defpackage.ce
    public final /* synthetic */ void T(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void U(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void a(be beVar, boolean z) {
    }

    public final boolean a0(pg pgVar) {
        String str;
        if (pgVar == null) {
            return false;
        }
        String str2 = (String) pgVar.d;
        pg1 pg1Var = this.c;
        synchronized (pg1Var) {
            str = pg1Var.f;
        }
        return str2.equals(str);
    }

    @Override // defpackage.ce
    public final /* synthetic */ void b(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void c(be beVar, boolean z) {
    }

    public final void c0() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new lo4(this, this.k.build(), 5));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void d(be beVar, String str) {
    }

    public final LogSessionId d0() {
        return this.d.getSessionId();
    }

    @Override // defpackage.ce
    public final /* synthetic */ void e(be beVar, boolean z) {
    }

    public final void e0(bm8 bm8Var, ks4 ks4Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (ks4Var == null || (iB = bm8Var.b(ks4Var.a)) == -1) {
            return;
        }
        yl8 yl8Var = this.g;
        int i = 0;
        bm8Var.f(iB, yl8Var, false);
        int i2 = yl8Var.c;
        am8 am8Var = this.f;
        bm8Var.n(i2, am8Var);
        fp4 fp4Var = am8Var.c.b;
        if (fp4Var != null) {
            int iO = j29.O(fp4Var.a, fp4Var.b);
            i = iO != 0 ? iO != 1 ? iO != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (am8Var.m != -9223372036854775807L && !am8Var.k && !am8Var.i && !am8Var.a()) {
            builder.setMediaDurationMillis(j29.k0(am8Var.m));
        }
        builder.setPlaybackType(am8Var.a() ? 2 : 1);
        this.B = true;
    }

    @Override // defpackage.ce
    public final /* synthetic */ void f(be beVar, ua6 ua6Var) {
    }

    public final void f0(be beVar, String str) {
        ks4 ks4Var = beVar.d;
        if (ks4Var == null || !ks4Var.b()) {
            c0();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            e0(beVar.b, ks4Var);
        }
    }

    @Override // defpackage.ce
    public final /* synthetic */ void g(be beVar, String str) {
    }

    public final void g0(be beVar, String str) {
        ks4 ks4Var = beVar.d;
        if ((ks4Var == null || !ks4Var.b()) && str.equals(this.j)) {
            c0();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    @Override // defpackage.ce
    public final /* synthetic */ void h(be beVar, jv4 jv4Var) {
    }

    public final void h0(int i, long j, b bVar, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        int i4 = 2;
        if (bVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = bVar.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = bVar.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = bVar.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = bVar.j;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = bVar.u;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = bVar.v;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = bVar.F;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = bVar.G;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = bVar.d;
            if (str4 != null) {
                String str5 = j29.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = bVar.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new lo4(this, timeSinceCreatedMillis.build(), i4));
    }

    @Override // defpackage.ce
    public final /* synthetic */ void i(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void j(be beVar, Object obj) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void k(be beVar, long j) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void l(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void m(be beVar, op4 op4Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void n(be beVar, int i, int i2) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void o(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void p(be beVar, ly lyVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void q(be beVar, o00 o00Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void r(be beVar) {
    }

    @Override // defpackage.ce
    public final void s(be beVar, w59 w59Var) {
        pg pgVar = this.p;
        if (pgVar != null) {
            b bVar = (b) pgVar.c;
            if (bVar.v == -1) {
                rj2 rj2VarA = bVar.a();
                rj2VarA.t = w59Var.a;
                rj2VarA.u = w59Var.b;
                int i = 9;
                this.p = new pg(pgVar.b, i, new b(rj2VarA), (String) pgVar.d);
            }
        }
    }

    @Override // defpackage.ce
    public final /* synthetic */ void t(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void u(be beVar, int i) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void v(be beVar, String str) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void w(be beVar, o00 o00Var) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void x(be beVar, int i, int i2, boolean z) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void y(be beVar) {
    }

    @Override // defpackage.ce
    public final /* synthetic */ void z(be beVar, int i) {
    }
}
