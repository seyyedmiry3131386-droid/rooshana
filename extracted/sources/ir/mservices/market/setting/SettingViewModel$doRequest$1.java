package ir.mservices.market.setting;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.f8;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vd7;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.SettingViewModel$doRequest$1", f = "SettingViewModel.kt", l = {52}, m = "invokeSuspend", v = 1)
final class SettingViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SettingViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.setting.SettingViewModel$doRequest$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((SettingViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingViewModel$doRequest$1(SettingViewModel settingViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = settingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SettingViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        SettingViewModel settingViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            ir.mservices.market.setting.model.b bVar = settingViewModel.t;
            l lVar = settingViewModel.E;
            l lVar2 = settingViewModel.D;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, settingViewModel, SettingViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0);
            this.a = 1;
            bVar.getClass();
            obj = (xe2) new m(gu9.B(), new f8(lVar, lVar2, anonymousClass1, 19)).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new vd7(24)), y97.G(settingViewModel)), null, null, null, 14);
    }
}
