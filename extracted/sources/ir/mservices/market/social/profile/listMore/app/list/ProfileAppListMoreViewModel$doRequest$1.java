package ir.mservices.market.social.profile.listMore.app.list;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bl6;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gr5;
import defpackage.gu9;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vw2;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z45;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreViewModel$doRequest$1", f = "ProfileAppListMoreViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class ProfileAppListMoreViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ProfileAppListMoreViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAppListMoreViewModel$doRequest$1(ProfileAppListMoreViewModel profileAppListMoreViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = profileAppListMoreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ProfileAppListMoreViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileAppListMoreViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<ApplicationDTO> apps;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ProfileAppListMoreViewModel profileAppListMoreViewModel = this.a;
        gr5 gr5Var = profileAppListMoreViewModel.v;
        ProfileApplicationListDto profileApplicationListDto = profileAppListMoreViewModel.A.b.b;
        if (profileApplicationListDto == null || (apps = profileApplicationListDto.getApps()) == null) {
            apps = EmptyList.a;
        }
        js3.p(apps, "applicationList");
        gr5Var.getClass();
        ((bl6) gr5Var.g).getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new vw2(apps, 1)).a, new z45(21, profileAppListMoreViewModel)), y97.G(profileAppListMoreViewModel)), null, null, null, 14);
    }
}
