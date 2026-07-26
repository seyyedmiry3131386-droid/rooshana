package ir.mservices.market.app.home.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vp7;
import defpackage.z57;
import defpackage.zb3;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.home.data.HomeVideoListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.model.HomeRepositoryImpl$getVideoList$1$1", f = "HomeRepositoryImpl.kt", l = {72}, m = "invokeSuspend", v = 1)
final class HomeRepositoryImpl$getVideoList$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ vp7 e;
    public final /* synthetic */ HomeViewModel f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$getVideoList$1$1(vp7 vp7Var, HomeViewModel homeViewModel, g51 g51Var) {
        super(4, g51Var);
        this.e = vp7Var;
        this.f = homeViewModel;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        HomeRepositoryImpl$getVideoList$1$1 homeRepositoryImpl$getVideoList$1$1 = new HomeRepositoryImpl$getVideoList$1$1(this.e, this.f, (g51) obj4);
        homeRepositoryImpl$getVideoList$1$1.b = iIntValue;
        homeRepositoryImpl$getVideoList$1$1.c = iIntValue2;
        homeRepositoryImpl$getVideoList$1$1.d = zBooleanValue;
        return homeRepositoryImpl$getVideoList$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        vp7 vp7Var = this.e;
        if (i3 == 0) {
            kotlin.b.b(obj);
            zb3 zb3Var = (zb3) vp7Var.c;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.a = 1;
            zb3Var.getClass();
            z57 z57VarCreateRequestUrl = zb3Var.createRequestUrl("v1/layouts", "videos", null, zb3Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
            Type type = new TypeToken<HomeVideoListDto>() { // from class: ir.mservices.market.app.home.services.HomeService$getVideoList$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            obj = dy3.v(zb3Var, type, z57VarCreateRequestUrl, this.f, this, 504);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        n99 n99Var = (n99) obj;
        if (!(n99Var instanceof l99)) {
            return n99Var;
        }
        HomeVideoListDto homeVideoListDto = (HomeVideoListDto) ((l99) n99Var).a;
        vp7Var.getClass();
        return new l99(vp7.R(homeVideoListDto, z));
    }
}
