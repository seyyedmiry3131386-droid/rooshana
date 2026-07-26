package ir.mservices.market.app.suggest.detail.ui;

import android.content.Context;
import com.android.volley.Request$Priority;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.reflect.TypeToken;
import defpackage.e71;
import defpackage.f88;
import defpackage.ff5;
import defpackage.g51;
import defpackage.h99;
import defpackage.hh2;
import defpackage.js3;
import defpackage.l99;
import defpackage.la6;
import defpackage.n99;
import defpackage.na6;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qm5;
import defpackage.qp2;
import defpackage.r79;
import defpackage.rs6;
import defpackage.s7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yv2;
import defpackage.z57;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel$doRequest$1", f = "PlayDetailViewModel.kt", l = {63}, m = "invokeSuspend", v = 1)
final class PlayDetailViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PlayDetailViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayDetailViewModel$doRequest$1(PlayDetailViewModel playDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = playDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayDetailViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayDetailViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        la6 la6Var;
        hh2 hh2Var;
        Object objU;
        PlayDetailViewModel playDetailViewModel = this.b;
        la6 la6Var2 = playDetailViewModel.w;
        hh2 hh2Var2 = playDetailViewModel.u;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            String str = la6Var2.a;
            this.a = 1;
            na6 na6Var = (na6) hh2Var2.b;
            na6Var.getClass();
            LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("id", str));
            LinkedHashMap linkedHashMapO2 = kotlin.collections.b.O(new Pair("Connection", "keep-alive"), new Pair("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"), new Pair("Accept-Encoding", "gzip, deflate"), new Pair("Accept-Language", "en-US,en;q=0.5"), new Pair("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 7.0; Nexus 6 Build/NBD91X)"));
            z57 z57Var = new z57("https://play.google.com/store/apps/details", null, null, null, linkedHashMapO, true, false);
            Type type = new TypeToken<String>() { // from class: ir.mservices.market.app.suggest.detail.service.PlayDetailService$crawlApplicationDetailFromPlayStore$2
            }.getType();
            js3.o(type, "getType(...)");
            ff5 ff5Var = new ff5(0.0f, 8000, 0);
            om0 om0Var = new om0(1, ok4.I(this));
            om0Var.v();
            r79 r79Var = new r79(1, om0Var);
            qm5 qm5Var = new qm5(2, om0Var);
            la6Var = la6Var2;
            hh2Var = hh2Var2;
            yv2 yv2Var = new yv2(0, z57Var, null, Request$Priority.a, false, playDetailViewModel, na6Var.createVolleyErrorListener(qm5Var), na6Var.createVolleySuccessListener(r79Var, qm5Var), false);
            yv2Var.p = linkedHashMapO2;
            yv2Var.w = type;
            yv2Var.k = ff5Var;
            yv2Var.u = false;
            na6Var.performRequest(yv2Var, qm5Var);
            objU = om0Var.u();
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            objU = obj;
            la6Var = la6Var2;
            hh2Var = hh2Var2;
        }
        n99 n99Var = (n99) objU;
        if (n99Var instanceof l99) {
            l99 l99Var = (l99) n99Var;
            CharSequence charSequence = (CharSequence) l99Var.a;
            if (charSequence == null || f88.n0(charSequence)) {
                playDetailViewModel.v.a.b("barnameh_play_request_error", "package_name", la6Var.a, AppMeasurementSdk.ConditionalUserProperty.NAME, playDetailViewModel.x);
                String string = ((Context) hh2Var.c).getResources().getString(rs6.error_dto_default_message);
                js3.o(string, "getString(...)");
                playDetailViewModel.r(new ErrorDTO(-1, "Google response is empty", string));
            } else {
                playDetailViewModel.p(new PlayDetailViewModel$doRequest$1$1$1(playDetailViewModel, l99Var, null));
            }
        } else {
            if (!(n99Var instanceof h99)) {
                s7.m(null);
                throw null;
            }
            playDetailViewModel.r(((h99) n99Var).a);
        }
        return tx8.a;
    }
}
