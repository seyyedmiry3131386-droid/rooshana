package ir.mservices.market.app.suggest.detail.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.ff5;
import defpackage.g51;
import defpackage.hh2;
import defpackage.js3;
import defpackage.na6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.suggest.detail.data.PlayApplicationDetailDto;
import ir.mservices.market.app.suggest.detail.data.PlayDetailHtmlRequestDto;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.detail.model.PlayDetailRepositoryImpl$getApplicationDetailFromPlayStore$1$1", f = "PlayDetailRepositoryImpl.kt", l = {39}, m = "invokeSuspend", v = 1)
final class PlayDetailRepositoryImpl$getApplicationDetailFromPlayStore$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ hh2 b;
    public final /* synthetic */ PlayDetailHtmlRequestDto c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayDetailRepositoryImpl$getApplicationDetailFromPlayStore$1$1(hh2 hh2Var, PlayDetailHtmlRequestDto playDetailHtmlRequestDto, String str, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = hh2Var;
        this.c = playDetailHtmlRequestDto;
        this.d = str;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PlayDetailRepositoryImpl$getApplicationDetailFromPlayStore$1$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PlayDetailRepositoryImpl$getApplicationDetailFromPlayStore$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        na6 na6Var = (na6) this.b.b;
        this.a = 1;
        na6Var.getClass();
        z57 z57VarCreateRequestUrl = na6Var.createRequestUrl("v1/applications", "play/{packageName}", kotlin.collections.b.O(new Pair("packageName", this.d)), na6Var.getCommonQueryParam());
        Type type = new TypeToken<PlayApplicationDetailDto>() { // from class: ir.mservices.market.app.suggest.detail.service.PlayDetailService$getApplicationDetail$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Map<String, String> headers = na6Var.getHeaders(new HashMap());
        js3.o(headers, "getHeaders(...)");
        Object objG = dy3.G(na6Var, type, z57VarCreateRequestUrl, this.c, this.e, headers, new ff5(1.0f, 30000, 0), this, 160);
        return objG == coroutineSingletons ? coroutineSingletons : objG;
    }
}
