package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a42 implements ce {
    public static final NumberFormat d;
    public final am8 a = new am8();
    public final yl8 b = new yl8();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        d = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String V(o00 o00Var) {
        return o00Var.a + "," + o00Var.c + "," + o00Var.b + "," + o00Var.d + "," + o00Var.e + "," + o00Var.f;
    }

    public static String Y(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return d.format(j / 1000.0f);
    }

    @Override // defpackage.ce
    public final void A(be beVar, int i) {
        a0(beVar, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.ce
    public final void B(be beVar, b bVar) {
        a0(beVar, "videoInputFormat", b.c(bVar));
    }

    @Override // defpackage.ce
    public final void C(be beVar) {
        Z(beVar, "audioDisabled");
    }

    @Override // defpackage.ce
    public final /* synthetic */ void D(int i, long j, be beVar) {
    }

    @Override // defpackage.ce
    public final void E(be beVar, PlaybackException playbackException) {
        wn5.F("EventLogger", W(beVar, "playerFailed", null, playbackException));
    }

    @Override // defpackage.ce
    public final void F(be beVar, float f) {
        a0(beVar, "volume", Float.toString(f));
    }

    @Override // defpackage.ce
    public final void G(be beVar, int i, long j, long j2) {
        wn5.F("EventLogger", W(beVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // defpackage.ce
    public final void H(be beVar, ec1 ec1Var) {
        Z(beVar, "videoDisabled");
    }

    @Override // defpackage.ce
    public final void I(be beVar, da4 da4Var, op4 op4Var, IOException iOException) {
        wn5.F("EventLogger", W(beVar, "internalError", "loadError", iOException));
    }

    @Override // defpackage.ce
    public final void J(int i, be beVar, fb6 fb6Var, fb6 fb6Var2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [");
        sb.append(fb6Var);
        sb.append("], PositionInfo:new [");
        sb.append(fb6Var2);
        sb.append("]");
        a0(beVar, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.ce
    public final void K(be beVar, op4 op4Var) {
        a0(beVar, "downstreamFormat", b.c(op4Var.c));
    }

    @Override // defpackage.ce
    public final void L(be beVar) {
        Z(beVar, "drmSessionReleased");
    }

    @Override // defpackage.ce
    public final void M(be beVar, String str) {
        a0(beVar, "videoDecoderInitialized", str);
    }

    @Override // defpackage.ce
    public final void N(be beVar, boolean z) {
        a0(beVar, "loading", Boolean.toString(z));
    }

    @Override // defpackage.ce
    public final void O(be beVar, b bVar) {
        a0(beVar, "audioInputFormat", b.c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce
    public final void P(be beVar, rp8 rp8Var) {
        jv4 jv4Var;
        wn5.w("tracks [" + X(beVar));
        ImmutableList immutableList = rp8Var.a;
        for (int i = 0; i < immutableList.size(); i++) {
            qp8 qp8Var = (qp8) immutableList.get(i);
            wn5.w("  group [ id=" + qp8Var.b.b);
            for (int i2 = 0; i2 < qp8Var.a; i2++) {
                String str = qp8Var.e[i2] ? "[X]" : "[ ]";
                String strB = j29.B(qp8Var.d[i2]);
                StringBuilder sbB = o40.B(i2, "    ", str, " Track:", ", ");
                sbB.append(b.c(qp8Var.a(i2)));
                sbB.append(", supported=");
                sbB.append(strB);
                wn5.w(sbB.toString());
            }
            wn5.w("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < immutableList.size(); i3++) {
            qp8 qp8Var2 = (qp8) immutableList.get(i3);
            for (int i4 = 0; !z && i4 < qp8Var2.a; i4++) {
                if (qp8Var2.e[i4] && (jv4Var = qp8Var2.a(i4).l) != null && jv4Var.a.length > 0) {
                    wn5.w("  Metadata [");
                    b0(jv4Var, "    ");
                    wn5.w("  ]");
                    z = true;
                }
            }
        }
        wn5.w("]");
    }

    @Override // defpackage.ce
    public final void Q(be beVar, Exception exc) {
        wn5.F("EventLogger", W(beVar, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.ce
    public final void R(be beVar, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        a0(beVar, "playWhenReady", sb.toString());
    }

    @Override // defpackage.ce
    public final /* synthetic */ void S(gb6 gb6Var, qq4 qq4Var) {
    }

    @Override // defpackage.ce
    public final void T(be beVar, int i) {
        a0(beVar, "playbackSuppressionReason", i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // defpackage.ce
    public final void U(be beVar) {
        Z(beVar, "drmKeysRestored");
    }

    public final String W(be beVar, String str, String str2, Throwable th) {
        StringBuilder sbE = bl4.E(str, " [");
        sbE.append(X(beVar));
        String string = sbE.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbE2 = bl4.E(string, ", errorCode=");
            sbE2.append(((PlaybackException) th).b());
            string = sbE2.toString();
        }
        if (str2 != null) {
            string = t61.j(string, ", ", str2);
        }
        String strP = wn5.P(th);
        if (!TextUtils.isEmpty(strP)) {
            StringBuilder sbE3 = bl4.E(string, "\n  ");
            sbE3.append(strP.replace("\n", "\n  "));
            sbE3.append('\n');
            string = sbE3.toString();
        }
        return t61.i(string, "]");
    }

    public final String X(be beVar) {
        String string = "window=" + beVar.c;
        ks4 ks4Var = beVar.d;
        if (ks4Var != null) {
            StringBuilder sbE = bl4.E(string, ", period=");
            sbE.append(beVar.b.b(ks4Var.a));
            string = sbE.toString();
            if (ks4Var.b()) {
                StringBuilder sbE2 = bl4.E(string, ", adGroup=");
                sbE2.append(ks4Var.b);
                StringBuilder sbE3 = bl4.E(sbE2.toString(), ", ad=");
                sbE3.append(ks4Var.c);
                string = sbE3.toString();
            }
        }
        return "eventTime=" + Y(beVar.a - this.c) + ", mediaPos=" + Y(beVar.e) + ", " + string;
    }

    public final void Z(be beVar, String str) {
        wn5.w(W(beVar, str, null, null));
    }

    @Override // defpackage.ce
    public final void a(be beVar, boolean z) {
        a0(beVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    public final void a0(be beVar, String str, String str2) {
        wn5.w(W(beVar, str, str2, null));
    }

    @Override // defpackage.ce
    public final void b(be beVar) {
        Z(beVar, "drmKeysLoaded");
    }

    public final void b0(jv4 jv4Var, String str) {
        for (int i = 0; i < jv4Var.a.length; i++) {
            StringBuilder sbC = bl4.C(str);
            sbC.append(jv4Var.a[i]);
            wn5.w(sbC.toString());
        }
    }

    @Override // defpackage.ce
    public final void c(be beVar, boolean z) {
        a0(beVar, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.ce
    public final void d(be beVar, String str) {
        a0(beVar, "audioDecoderReleased", str);
    }

    @Override // defpackage.ce
    public final void e(be beVar, boolean z) {
        a0(beVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.ce
    public final void f(be beVar, ua6 ua6Var) {
        a0(beVar, "playbackParameters", ua6Var.toString());
    }

    @Override // defpackage.ce
    public final void g(be beVar, String str) {
        a0(beVar, "audioDecoderInitialized", str);
    }

    @Override // defpackage.ce
    public final void h(be beVar, jv4 jv4Var) {
        wn5.w("metadata [" + X(beVar));
        b0(jv4Var, "  ");
        wn5.w("]");
    }

    @Override // defpackage.ce
    public final void i(be beVar, int i) {
        a0(beVar, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    @Override // defpackage.ce
    public final void j(be beVar, Object obj) {
        a0(beVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.ce
    public final void k(be beVar, long j) {
        a0(beVar, "audioPositionAdvancing", "since " + Y((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.c));
    }

    @Override // defpackage.ce
    public final void l(be beVar, int i) {
        a0(beVar, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.ce
    public final void m(be beVar, op4 op4Var) {
        a0(beVar, "upstreamDiscarded", b.c(op4Var.c));
    }

    @Override // defpackage.ce
    public final void n(be beVar, int i, int i2) {
        a0(beVar, "surfaceSize", dw1.j(i, i2, "w=", ", h="));
    }

    @Override // defpackage.ce
    public final void o(be beVar, int i) {
        a0(beVar, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.ce
    public final void p(be beVar, ly lyVar) {
        a0(beVar, "audioAttributes", lyVar.a + "," + lyVar.b + "," + lyVar.c + "," + lyVar.d);
    }

    @Override // defpackage.ce
    public final void q(be beVar, o00 o00Var) {
        a0(beVar, "audioTrackInit", V(o00Var));
    }

    @Override // defpackage.ce
    public final void r(be beVar) {
        Z(beVar, "videoEnabled");
    }

    @Override // defpackage.ce
    public final void s(be beVar, w59 w59Var) {
        StringBuilder sb = new StringBuilder("w=" + w59Var.a + ", h=" + w59Var.b);
        float f = w59Var.c;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        a0(beVar, "videoSize", sb.toString());
    }

    @Override // defpackage.ce
    public final void t(be beVar, int i) {
        bm8 bm8Var = beVar.b;
        int iH = bm8Var.h();
        int iO = bm8Var.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(X(beVar));
        sb.append(", periodCount=");
        sb.append(iH);
        sb.append(", windowCount=");
        sb.append(iO);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        wn5.w(sb.toString());
        for (int i2 = 0; i2 < Math.min(iH, 3); i2++) {
            yl8 yl8Var = this.b;
            bm8Var.f(i2, yl8Var, false);
            wn5.w("  period [" + Y(j29.k0(yl8Var.d)) + "]");
        }
        if (iH > 3) {
            wn5.w("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iO, 3); i3++) {
            am8 am8Var = this.a;
            bm8Var.n(i3, am8Var);
            wn5.w("  window [" + Y(j29.k0(am8Var.m)) + ", seekable=" + am8Var.h + ", dynamic=" + am8Var.i + "]");
        }
        if (iO > 3) {
            wn5.w("  ...");
        }
        wn5.w("]");
    }

    @Override // defpackage.ce
    public final void u(be beVar, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(X(beVar));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        wn5.w(sb.toString());
    }

    @Override // defpackage.ce
    public final void v(be beVar, String str) {
        a0(beVar, "videoDecoderReleased", str);
    }

    @Override // defpackage.ce
    public final void w(be beVar, o00 o00Var) {
        a0(beVar, "audioTrackReleased", V(o00Var));
    }

    @Override // defpackage.ce
    public final void x(be beVar, int i, int i2, boolean z) {
        StringBuilder sbR = rm7.r(i, "rendererIndex=", ", ");
        sbR.append(j29.J(i2));
        sbR.append(", ");
        sbR.append(z);
        a0(beVar, "rendererReady", sbR.toString());
    }

    @Override // defpackage.ce
    public final void y(be beVar) {
        Z(beVar, "audioEnabled");
    }

    @Override // defpackage.ce
    public final void z(be beVar, int i) {
        a0(beVar, "drmSessionAcquired", "state=" + i);
    }
}
