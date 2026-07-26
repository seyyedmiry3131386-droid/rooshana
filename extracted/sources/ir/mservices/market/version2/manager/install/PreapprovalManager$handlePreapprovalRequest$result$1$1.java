package ir.mservices.market.version2.manager.install;

import com.google.gson.reflect.TypeToken;
import defpackage.dp3;
import defpackage.dy3;
import defpackage.e71;
import defpackage.ff5;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.ti6;
import defpackage.tx8;
import defpackage.z57;
import ir.mservices.market.app.detail.data.PreapprovalDto;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.webapi.requestdto.PreapprovalRequestDto;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.install.PreapprovalManager$handlePreapprovalRequest$result$1$1", f = "PreapprovalManager.kt", l = {202}, m = "invokeSuspend", v = 1)
final class PreapprovalManager$handlePreapprovalRequest$result$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ DownloadDataModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreapprovalManager$handlePreapprovalRequest$result$1$1(f fVar, DownloadDataModel downloadDataModel, String str, f fVar2, g51 g51Var) {
        super(2, g51Var);
        this.b = fVar;
        this.c = downloadDataModel;
        this.d = str;
        this.e = fVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PreapprovalManager$handlePreapprovalRequest$result$1$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PreapprovalManager$handlePreapprovalRequest$result$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        f fVar = this.b;
        dp3 dp3Var = (dp3) fVar.d.get();
        DownloadDataModel downloadDataModel = this.c;
        PreapprovalRequestDto preapprovalRequestDto = new PreapprovalRequestDto(downloadDataModel.b, dp3Var.p(downloadDataModel.a), downloadDataModel.c, this.d, dp3.L(fVar.a));
        ti6 ti6Var = fVar.h;
        String str = downloadDataModel.a;
        String str2 = downloadDataModel.c;
        this.a = 1;
        ti6Var.getClass();
        z57 z57VarCreateRequestUrl = ti6Var.createRequestUrl("v1/applications", "{packageName}/pre-approval", kotlin.collections.b.O(new Pair("packageName", str)), ti6Var.getCommonQueryParam(kotlin.collections.b.O(new Pair("refId", str2))));
        Type type = new TypeToken<PreapprovalDto>() { // from class: ir.mservices.market.version2.services.PreapprovalService$getPreapproval$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Object objG = dy3.G(ti6Var, type, z57VarCreateRequestUrl, preapprovalRequestDto, this.e, null, new ff5(1.0f, 300, 0), this, 240);
        return objG == coroutineSingletons ? coroutineSingletons : objG;
    }
}
