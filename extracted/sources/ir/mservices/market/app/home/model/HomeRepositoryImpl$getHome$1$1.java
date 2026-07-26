package ir.mservices.market.app.home.model;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import defpackage.d04;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vp7;
import defpackage.wq2;
import defpackage.yq2;
import defpackage.z57;
import defpackage.zb3;
import ir.mservices.market.app.home.data.HomeDto;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.model.HomeRepositoryImpl$getHome$1$1", f = "HomeRepositoryImpl.kt", l = {48}, m = "invokeSuspend", v = 1)
final class HomeRepositoryImpl$getHome$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ vp7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$getHome$1$1(vp7 vp7Var, int i, int i2, String str, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.b = vp7Var;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new HomeRepositoryImpl$getHome$1$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((HomeRepositoryImpl$getHome$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        vp7 vp7Var = this.b;
        zb3 zb3Var = (zb3) vp7Var.c;
        String strB = ((d04) vp7Var.d).b();
        long jE = wq2.E();
        long jD = wq2.D();
        String strC0 = yq2.c0((Context) vp7Var.b);
        String strValueOf = String.valueOf(!ir.mservices.market.core.notification.a.d(((ir.mservices.market.core.notification.a) vp7Var.e).i, "download"));
        this.a = 1;
        zb3Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("lang", strB), new Pair("width", String.valueOf(this.c)), new Pair("height", String.valueOf(this.d)), new Pair("totalMemory", String.valueOf(jE)), new Pair("freeMemory", String.valueOf(jD)), new Pair("deviceType", strC0), new Pair("showNotification", strValueOf));
        String str = this.e;
        if (f88.n0(str)) {
            str = null;
        }
        if (str != null) {
            linkedHashMapO.put("layoutKey", str);
        }
        z57 z57VarCreateRequestUrl = zb3Var.createRequestUrl("v1/layouts", "home", null, zb3Var.getCommonQueryParam(linkedHashMapO));
        Type type = new TypeToken<HomeDto>() { // from class: ir.mservices.market.app.home.services.HomeService$getHome$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(zb3Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
