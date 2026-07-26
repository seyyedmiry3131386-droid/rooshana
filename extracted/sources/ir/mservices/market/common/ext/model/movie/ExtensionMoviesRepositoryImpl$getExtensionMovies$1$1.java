package ir.mservices.market.common.ext.model.movie;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.g51;
import defpackage.js3;
import defpackage.n72;
import defpackage.nm5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.movie.data.webapi.HomeMovieListDto;
import java.lang.reflect.Type;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.ext.model.movie.ExtensionMoviesRepositoryImpl$getExtensionMovies$1$1", f = "ExtensionMoviesRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 1)
final class ExtensionMoviesRepositoryImpl$getExtensionMovies$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ nm5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ir.mservices.market.viewModel.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionMoviesRepositoryImpl$getExtensionMovies$1$1(nm5 nm5Var, String str, ir.mservices.market.viewModel.a aVar, g51 g51Var) {
        super(1, g51Var);
        this.b = nm5Var;
        this.c = str;
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ExtensionMoviesRepositoryImpl$getExtensionMovies$1$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ExtensionMoviesRepositoryImpl$getExtensionMovies$1$1) create((g51) obj)).invokeSuspend(tx8.a);
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
        n72 n72Var = (n72) this.b.b;
        this.a = 1;
        Type type = new TypeToken<HomeMovieListDto>() { // from class: ir.mservices.market.common.service.ExtensionService$getExtensionMovies$2
        }.getType();
        js3.o(type, "getType(...)");
        Object objV = dy3.v(n72Var, type, new z57(this.c), this.d, this, 504);
        return objV == coroutineSingletons ? coroutineSingletons : objV;
    }
}
