package ir.mservices.market.app.update;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.lw;
import defpackage.o30;
import defpackage.qp2;
import defpackage.s30;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.download.DownloadDataModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.UpdateViewModel$updateAll$1", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class UpdateViewModel$updateAll$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ UpdateViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$updateAll$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$updateAll$1$2", f = "UpdateViewModel.kt", l = {684}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ UpdateViewModel b;
        public final /* synthetic */ ArrayList c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UpdateViewModel updateViewModel, ArrayList arrayList, g51 g51Var) {
            super(2, g51Var);
            this.b = updateViewModel;
            this.c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = this.b.T;
                this.a = 1;
                if (iVar.emit(this.c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateViewModel$updateAll$1(List list, UpdateViewModel updateViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = list;
        this.b = updateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UpdateViewModel$updateAll$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        UpdateViewModel$updateAll$1 updateViewModel$updateAll$1 = (UpdateViewModel$updateAll$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        updateViewModel$updateAll$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            UpdateViewModel updateViewModel = this.b;
            if (!zHasNext) {
                bt2.G(y97.G(updateViewModel), null, null, new AnonymousClass2(updateViewModel, arrayList, null), 3);
                return tx8.a;
            }
            s30 s30Var = (s30) it.next();
            o30 o30Var = s30Var.a;
            ForceUpdateDto forceUpdateDto = o30Var.j;
            ForceUpdateDto forceUpdateDto2 = forceUpdateDto != null ? new ForceUpdateDto(forceUpdateDto.getFileLength(), forceUpdateDto.getDescription(), false, 4, null) : null;
            Integer numP = updateViewModel.B.p(o30Var.n);
            if (numP != null) {
                int iIntValue = numP.intValue();
                int i = o30Var.f;
                boolean z = false;
                boolean z2 = iIntValue < i;
                if (iIntValue == i && forceUpdateDto2 != null) {
                    z = true;
                }
                if (z2 || z) {
                    lw.d(null, null, s30Var);
                    DownloadDataModel downloadDataModel = new DownloadDataModel(s30Var.a, CommonDataKt.HOME_MOVIE_TYPE_LIST, "UpdateAll");
                    int iL = updateViewModel.C.l(o30Var.n);
                    if (iL != 120 && iL != 130) {
                        if (iL == 140) {
                            updateViewModel.E0.add(downloadDataModel);
                        } else if (iL == 150 || iL == 190) {
                        }
                    }
                    arrayList.add(downloadDataModel);
                }
            }
        }
    }
}
