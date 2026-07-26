package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import org.pcap4j.packet.namednumber.EtherType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u80 extends qg5 implements pz3 {
    public final og5 w;
    public final og5 x;
    public x07 y;
    public final Object z;

    public u80(View view, og5 og5Var, og5 og5Var2) {
        super(view);
        this.w = og5Var;
        this.x = og5Var2;
        this.z = a.b(LazyThreadSafetyMode.a, new i30(this, 4));
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [c24, java.lang.Object] */
    public final e62 x(Context context, List list) {
        fp4 fp4Var;
        js3.p(list, "urls");
        qc1 qc1Var = new qc1(8);
        yf1.a(500, 0, "bufferForPlaybackMs", "0");
        yf1.a(EtherType.IEEE802_3_MAX_LENGTH, 0, "bufferForPlaybackAfterRebufferMs", "0");
        yf1.a(2500, 500, "minBufferMs", "bufferForPlaybackMs");
        yf1.a(2500, EtherType.IEEE802_3_MAX_LENGTH, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        yf1.a(5000, 2500, "maxBufferMs", "minBufferMs");
        yf1 yf1Var = new yf1(qc1Var, 2500, 5000, 500, EtherType.IEEE802_3_MAX_LENGTH, true, 0, false);
        pa2 pa2Var = new pa2((hs5) this.z.getValue());
        pa2Var.b = j29.K(context, "");
        jp8 jp8Var = new jp8(1);
        x07 x07Var = this.y;
        if (x07Var == null) {
            js3.V("reelsCacheManager");
            throw null;
        }
        hw7 hw7Var = x07Var.b;
        if (hw7Var == null) {
            hw7Var = new hw7(x07Var.c, new m44(20971520L), new h48(x07Var.a));
            x07Var.b = hw7Var;
        }
        jp8Var.c = hw7Var;
        jp8Var.b = 2;
        jp8Var.f = pa2Var;
        qg1 qg1Var = new qg1(context);
        boolean z = true;
        qg1Var.c = true;
        ig1 ig1Var = new ig1(new do3(context, 21));
        ci1 ci1Var = new ci1(context);
        Context applicationContext = context.getApplicationContext();
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        e62 e62VarA = new n52(context, new fg1(3, qg1Var), new fg1(1, ig1Var), new fg1(4, ci1Var), new fg1(5, yf1Var), new fg1(2, new td1(applicationContext, map)), new v4(18, new hd1(td8.a))).a();
        HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(jp8Var);
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list2 = Collections.EMPTY_LIST;
        ImmutableList immutableListQ = ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        String str = (String) list.get(0);
        Uri uri = str == null ? null : Uri.parse(str);
        if (((Uri) bp4Var.e) != null && ((UUID) bp4Var.d) == null) {
            z = false;
        }
        vy2.s(z);
        if (uri != null) {
            fp4Var = new fp4(uri, "application/x-mpegURL", ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : null, null, list2, null, immutableListQ, -9223372036854775807L);
        } else {
            fp4Var = null;
        }
        k03 k03VarE = hlsMediaSource$Factory.d(new jp4("", new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4.K, gp4Var));
        e62VarA.c1();
        List listSingletonList = Collections.singletonList(k03VarE);
        e62VarA.c1();
        e62VarA.c1();
        e62VarA.U0(listSingletonList, -1, -9223372036854775807L, true);
        return e62VarA;
    }

    public abstract void y();

    public abstract void z();
}
