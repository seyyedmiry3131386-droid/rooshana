package ir.mservices.market.app.suggest.search.model;

import com.google.gson.reflect.TypeToken;
import defpackage.bp2;
import defpackage.c35;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.pb8;
import defpackage.pw6;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.suggest.search.data.PlayApplicationsDto;
import ir.mservices.market.app.suggest.search.data.PlayRequestDto;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.suggest.search.model.SuggestListRepositoryImpl$getGooglePlayApps$1$1", f = "SuggestListRepositoryImpl.kt", l = {33, 35}, m = "invokeSuspend", v = 1)
final class SuggestListRepositoryImpl$getGooglePlayApps$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public final /* synthetic */ bp2 c;
    public final /* synthetic */ pw6 d;
    public final /* synthetic */ c35 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestListRepositoryImpl$getGooglePlayApps$1$1(bp2 bp2Var, pw6 pw6Var, c35 c35Var, String str, Object obj, g51 g51Var) {
        super(4, g51Var);
        this.c = bp2Var;
        this.d = pw6Var;
        this.e = c35Var;
        this.f = str;
        this.g = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        String str = this.f;
        Object obj5 = this.g;
        SuggestListRepositoryImpl$getGooglePlayApps$1$1 suggestListRepositoryImpl$getGooglePlayApps$1$1 = new SuggestListRepositoryImpl$getGooglePlayApps$1$1(this.c, this.d, this.e, str, obj5, (g51) obj4);
        suggestListRepositoryImpl$getGooglePlayApps$1$1.b = iIntValue;
        return suggestListRepositoryImpl$getGooglePlayApps$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = this.a;
        if (i2 == 0) {
            b.b(obj);
            this.c.invoke();
            this.b = i;
            this.a = 1;
            obj = this.d.l(this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        pb8 pb8Var = (pb8) this.e.b;
        PlayRequestDto playRequestDto = new PlayRequestDto(str, this.f, i);
        this.b = i;
        this.a = 2;
        z57 z57VarCreateRequestUrl = pb8Var.createRequestUrl("v2/search", "google/play", null, pb8Var.getCommonQueryParam());
        Type type = new TypeToken<PlayApplicationsDto>() { // from class: ir.mservices.market.app.suggest.search.service.SuggestListService$postPlayApplications$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Map<String, String> headers = pb8Var.getHeaders(new HashMap());
        js3.o(headers, "getHeaders(...)");
        Object objG = dy3.G(pb8Var, type, z57VarCreateRequestUrl, playRequestDto, this.g, headers, null, this, 416);
        return objG == coroutineSingletons ? coroutineSingletons : objG;
    }
}
