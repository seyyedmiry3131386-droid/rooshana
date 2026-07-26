package ir.mservices.market.movie.streamers.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.l78;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.z57;
import ir.mservices.market.movie.streamers.data.StreamerFullDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.model.StreamersRepositoryImpl$getStreamer$2$1", f = "StreamersRepositoryImpl.kt", l = {29}, m = "invokeSuspend", v = 1)
final class StreamersRepositoryImpl$getStreamer$2$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ut4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamersRepositoryImpl$getStreamer$2$1(g51 g51Var, ut4 ut4Var, Object obj, String str, String str2) {
        super(1, g51Var);
        this.b = ut4Var;
        this.c = str;
        this.d = str2;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        String str = this.d;
        return new StreamersRepositoryImpl$getStreamer$2$1(g51Var, this.b, this.e, this.c, str);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((StreamersRepositoryImpl$getStreamer$2$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        l78 l78Var = (l78) this.b.b;
        this.a = 1;
        l78Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("providerKey", this.c));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.d;
        if (str != null && !f88.n0(str)) {
            linkedHashMap.put("refId", str);
        }
        z57 z57VarCreateRequestUrl = l78Var.createRequestUrl("movie-api", "v1/streamers/{providerKey}", linkedHashMapO, l78Var.getCommonQueryParam(linkedHashMap));
        Type type = new TypeToken<StreamerFullDto>() { // from class: ir.mservices.market.movie.streamers.services.StreamersService$getStreamer$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(l78Var, type, z57VarCreateRequestUrl, this.e, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
