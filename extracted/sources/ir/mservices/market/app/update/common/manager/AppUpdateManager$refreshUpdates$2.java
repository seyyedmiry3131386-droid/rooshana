package ir.mservices.market.app.update.common.manager;

import defpackage.e71;
import defpackage.ff5;
import defpackage.g51;
import defpackage.iz8;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.rn6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vt;
import defpackage.vz8;
import defpackage.wq2;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto;
import ir.mservices.market.version2.webapi.responsedto.UpdateDTO;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.manager.AppUpdateManager$refreshUpdates$2", f = "AppUpdateManager.kt", l = {107}, m = "invokeSuspend", v = 1)
final class AppUpdateManager$refreshUpdates$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ UpdateRequestDto b;
    public final /* synthetic */ a c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ ff5 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ vz8 h;
    public final /* synthetic */ iz8 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpdateManager$refreshUpdates$2(UpdateRequestDto updateRequestDto, a aVar, Object obj, String str, ff5 ff5Var, String str2, vz8 vz8Var, iz8 iz8Var, g51 g51Var) {
        super(2, g51Var);
        this.b = updateRequestDto;
        this.c = aVar;
        this.d = obj;
        this.e = str;
        this.f = ff5Var;
        this.g = str2;
        this.h = vz8Var;
        this.i = iz8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppUpdateManager$refreshUpdates$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppUpdateManager$refreshUpdates$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppUpdateManager$refreshUpdates$2 appUpdateManager$refreshUpdates$2;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        a aVar = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            long jD = wq2.D();
            UpdateRequestDto updateRequestDto = this.b;
            updateRequestDto.setFreeMemory(jD);
            updateRequestDto.setTotalMemory(wq2.E());
            if (aVar.g) {
                return tx8.a;
            }
            aVar.g = true;
            rn6 rn6Var = aVar.e;
            this.a = 1;
            appUpdateManager$refreshUpdates$2 = this;
            obj = rn6Var.n(updateRequestDto, this.d, this.e, this.f, appUpdateManager$refreshUpdates$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            appUpdateManager$refreshUpdates$2 = this;
        }
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            UpdateDTO updateDTO = (UpdateDTO) ((l99) n99Var).a;
            PushMessage updateNotification = updateDTO.getUpdateNotification();
            vz8 vz8Var = appUpdateManager$refreshUpdates$2.h;
            String str = appUpdateManager$refreshUpdates$2.g;
            aVar.d(false, updateNotification, str, updateDTO, new vt(vz8Var, aVar, str, 0));
        } else {
            l lVar = aVar.h;
            do {
                value = lVar.getValue();
            } while (!lVar.n(value, null));
            iz8 iz8Var = appUpdateManager$refreshUpdates$2.i;
            if (iz8Var != null) {
                iz8Var.b();
            }
            if ("background".equalsIgnoreCase(appUpdateManager$refreshUpdates$2.e)) {
                aVar.d.b(1);
            }
            aVar.g = false;
        }
        return tx8.a;
    }
}
