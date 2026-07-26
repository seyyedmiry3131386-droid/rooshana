package ir.mservices.market.pika.send;

import defpackage.bt2;
import defpackage.c5;
import defpackage.dp0;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.gf2;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k68;
import defpackage.p86;
import defpackage.pv6;
import defpackage.rv6;
import defpackage.tn7;
import defpackage.vy2;
import defpackage.wq2;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.common.model.PayloadState;
import ir.mservices.market.pika.common.model.SpixPikaRequestDto;
import ir.mservices.market.pika.receive.model.b;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;
import ir.mservices.market.viewModel.c;
import java.util.List;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SendAppViewModel extends c {
    public final c5 A;
    public final tn7 B;
    public List C;
    public final a D;
    public final dp0 E;
    public final l F;
    public final rv6 G;
    public final l H;
    public final rv6 I;
    public final l J;
    public final rv6 K;
    public final i L;
    public final gf2 M;
    public final dp3 t;
    public final NearbyRepository u;
    public final k68 v;
    public final ir.mservices.market.pika.send.model.a w;
    public final b x;
    public final ir.mservices.market.core.notification.a y;
    public final d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppViewModel(jd7 jd7Var, dp3 dp3Var, NearbyRepository nearbyRepository, k68 k68Var, ir.mservices.market.pika.send.model.a aVar, b bVar, ir.mservices.market.core.notification.a aVar2, d dVar, c5 c5Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(dp3Var, "installManager");
        js3.p(nearbyRepository, "nearbyRepository");
        js3.p(k68Var, "storageUtils");
        js3.p(bVar, "saveFileRepository");
        js3.p(aVar2, "notificationController");
        js3.p(dVar, "generalService");
        js3.p(c5Var, "accountManager");
        this.t = dp3Var;
        this.u = nearbyRepository;
        this.v = k68Var;
        this.w = aVar;
        this.x = bVar;
        this.y = aVar2;
        this.z = dVar;
        this.A = c5Var;
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("deviceName")) {
            throw new IllegalArgumentException("Required argument \"deviceName\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("deviceName");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value");
        }
        this.B = new tn7(str, str2);
        a aVarB = dt2.b(0, 7, null);
        this.D = aVarB;
        this.E = new dp0(aVarB, false);
        l lVarB = ja1.b(p86.a);
        this.F = lVarB;
        this.G = new rv6(lVarB);
        l lVarB2 = ja1.b(PayloadState.Success.INSTANCE);
        this.H = lVarB2;
        this.I = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this.J = lVarB3;
        this.K = new rv6(lVarB3);
        i iVarE = vy2.e(0, 7, null);
        this.L = iVarE;
        this.M = new gf2(new pv6(iVarE), new SendAppViewModel$cloneResult$1(this, null), 4);
        bt2.G(y97.G(this), null, null, new SendAppViewModel$getSupportedApi$1(this, null), 3);
        bt2.G(y97.G(this), null, null, new SendAppViewModel$cloneApp$1(this, str, null), 3);
        bt2.G(y97.G(this), null, null, new SendAppViewModel$initConnectionFlow$1(this, null), 3);
        bt2.G(y97.G(this), null, null, new SendAppViewModel$initSucceedFlow$1(this, null), 3);
    }

    public static final void r(SendAppViewModel sendAppViewModel, String str) {
        String str2 = sendAppViewModel.B.a;
        dp3 dp3Var = sendAppViewModel.t;
        Integer numP = dp3Var.p(str2);
        js3.o(numP, "getApplicationVersionCode(...)");
        int iIntValue = numP.intValue();
        String strM = dp3Var.m(str2);
        js3.o(strM, "getApplicationName(...)");
        SpixPikaRequestDto spixPikaRequestDto = new SpixPikaRequestDto(str2, iIntValue, strM, dp3Var.t(str2), str);
        c5 c5Var = sendAppViewModel.A;
        sendAppViewModel.z.m("pika", new SpixRequestDto(new SpixUserRequestDto(c5Var.a(), c5Var.b(), wq2.A(), wq2.x(), wq2.I(), wq2.C()), spixPikaRequestDto));
    }

    public final void s() {
        this.u.clearFileSentPayload();
        this.y.a.cancel(10);
    }
}
