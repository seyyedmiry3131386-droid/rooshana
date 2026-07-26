package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.File;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class lz {
    public static final gv d = new gv(1);
    public static volatile hw7 e;
    public final Context a;
    public final hs5 b;
    public e62 c;

    public lz(Context context, hs5 hs5Var) {
        this.a = context;
        this.b = hs5Var;
    }

    public final ExoPlayer a() {
        e62 e62Var = this.c;
        if (e62Var != null) {
            return e62Var;
        }
        pa2 pa2Var = new pa2(this.b);
        pa2Var.b = j29.K(this.a, "MyketPlayer");
        pa2Var.C(b.M(new Pair("SourceChannel", LinkDTO.LINK_TYPE_MYKET_INTENT)));
        jp8 jp8Var = new jp8(1);
        gv gvVar = d;
        Context context = this.a;
        hw7 hw7Var = e;
        if (hw7Var == null) {
            synchronized (gvVar) {
                hw7Var = e;
                if (hw7Var == null) {
                    hw7Var = new hw7(new File(context.getCacheDir(), "media_cache"), new m44(52428800L), new h48(context));
                    e = hw7Var;
                }
            }
        }
        jp8Var.c = hw7Var;
        jp8Var.f = pa2Var;
        jp8Var.e = new en(9);
        jp8Var.b = 2;
        ly lyVar = new ly(3, 0, 1, 1, 0, false);
        yf1.a(2500, 0, "bufferForPlaybackMs", "0");
        yf1.a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        yf1.a(1800000, 2500, "minBufferMs", "bufferForPlaybackMs");
        yf1.a(1800000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        yf1.a(3600000, 1800000, "maxBufferMs", "minBufferMs");
        yf1.a(30000, 0, "backBufferDurationMs", "0");
        yf1 yf1Var = new yf1(new qc1(65536), 1800000, 3600000, 2500, 5000, false, 30000, true);
        n52 n52Var = new n52(this.a);
        n52Var.d(new ci1(this.a, new hy2(24)));
        qg1 qg1Var = new qg1(this.a);
        qg1Var.c = true;
        n52Var.c(qg1Var);
        n52Var.b(new ig1(jp8Var));
        vy2.s(!n52Var.w);
        n52Var.f = new fg1(5, yf1Var);
        e62 e62VarA = n52Var.a();
        e62VarA.u0(new a42());
        e62VarA.T0(lyVar, true);
        e62VarA.c();
        this.c = e62VarA;
        return e62VarA;
    }
}
