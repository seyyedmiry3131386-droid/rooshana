package ir.mservices.market.app.bookmark.ui.model;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.ql4;
import defpackage.sp2;
import defpackage.tb1;
import defpackage.td0;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.bookmark.data.BookmarkApplicationListDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.bookmark.ui.model.AppBookmarkRepositoryImpl$getBookmarks$1$1", f = "AppBookmarkRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 1)
final class AppBookmarkRepositoryImpl$getBookmarks$1$1 extends SuspendLambda implements sp2 {
    public int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;
    public final /* synthetic */ ql4 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBookmarkRepositoryImpl$getBookmarks$1$1(g51 g51Var, ql4 ql4Var, Object obj, String str) {
        super(4, g51Var);
        this.d = ql4Var;
        this.e = str;
        this.f = obj;
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        ((Boolean) obj3).getClass();
        String str = this.e;
        AppBookmarkRepositoryImpl$getBookmarks$1$1 appBookmarkRepositoryImpl$getBookmarks$1$1 = new AppBookmarkRepositoryImpl$getBookmarks$1$1((g51) obj4, this.d, this.f, str);
        appBookmarkRepositoryImpl$getBookmarks$1$1.b = iIntValue;
        appBookmarkRepositoryImpl$getBookmarks$1$1.c = iIntValue2;
        return appBookmarkRepositoryImpl$getBookmarks$1$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        int i2 = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        td0 td0Var = (td0) this.d.b;
        this.b = i;
        this.c = i2;
        this.a = 1;
        td0Var.getClass();
        z57 z57VarCreateRequestUrl = td0Var.createRequestUrl("v1/bookmarks", "{accountId}/bookmarks", kotlin.collections.b.O(new Pair("accountId", this.e)), td0Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("lang", td0Var.getLanguage()), new Pair("limit", String.valueOf(i)), new Pair("offset", String.valueOf(i2)), new Pair("sort", "date"))));
        Type type = new TypeToken<BookmarkApplicationListDto>() { // from class: ir.mservices.market.app.bookmark.services.BookmarkService$getBookmarks$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objV = dy3.v(td0Var, type, z57VarCreateRequestUrl, this.f, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
