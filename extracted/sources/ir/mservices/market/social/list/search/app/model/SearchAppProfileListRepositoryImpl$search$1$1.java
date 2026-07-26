package ir.mservices.market.social.list.search.app.model;

import com.google.gson.reflect.TypeToken;
import defpackage.bj7;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.mh7;
import defpackage.n99;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.social.list.search.SearchProfileListViewModel;
import ir.mservices.market.social.list.search.app.data.ProfileApplicationsDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.list.search.app.model.SearchAppProfileListRepositoryImpl$search$1$1", f = "SearchAppProfileListRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 1)
final class SearchAppProfileListRepositoryImpl$search$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ mh7 e;
    public final /* synthetic */ SearchProfileListViewModel f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAppProfileListRepositoryImpl$search$1$1(String str, mh7 mh7Var, SearchProfileListViewModel searchProfileListViewModel, g51 g51Var) {
        super(4, g51Var);
        this.d = str;
        this.e = mh7Var;
        this.f = searchProfileListViewModel;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).getClass();
        mh7 mh7Var = this.e;
        SearchProfileListViewModel searchProfileListViewModel = this.f;
        SearchAppProfileListRepositoryImpl$search$1$1 searchAppProfileListRepositoryImpl$search$1$1 = new SearchAppProfileListRepositoryImpl$search$1$1(this.d, mh7Var, searchProfileListViewModel, (g51) obj4);
        searchAppProfileListRepositoryImpl$search$1$1.b = iIntValue;
        searchAppProfileListRepositoryImpl$search$1$1.c = iIntValue2;
        return searchAppProfileListRepositoryImpl$search$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 == 0) {
            b.b(obj);
            String str = this.d;
            if (f88.n0(str)) {
                return new l99(ProfileApplicationsDto.Companion.getEmpty());
            }
            bj7 bj7Var = this.e.a;
            this.b = i;
            this.c = i2;
            this.a = 1;
            bj7Var.getClass();
            z57 z57VarCreateRequestUrl = bj7Var.createRequestUrl("social", "v1/applications", null, bj7Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("q", str), new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)))));
            Type type = new TypeToken<ProfileApplicationsDto>() { // from class: ir.mservices.market.social.list.search.app.service.SearchProfileAppService$getApplications$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            obj = dy3.v(bj7Var, type, z57VarCreateRequestUrl, this.f, this, 504);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return (n99) obj;
    }
}
