package ir.mservices.market.app.update;

import android.net.Uri;
import androidx.paging.e;
import defpackage.a67;
import defpackage.az8;
import defpackage.bc;
import defpackage.bk3;
import defpackage.bl4;
import defpackage.br9;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.c35;
import defpackage.dp3;
import defpackage.dw1;
import defpackage.e71;
import defpackage.e80;
import defpackage.ec9;
import defpackage.f88;
import defpackage.ff5;
import defpackage.fu0;
import defpackage.g51;
import defpackage.gr5;
import defpackage.gu9;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.jz8;
import defpackage.kt;
import defpackage.li1;
import defpackage.lu7;
import defpackage.lw;
import defpackage.m88;
import defpackage.mh;
import defpackage.nr8;
import defpackage.o30;
import defpackage.o4;
import defpackage.ot1;
import defpackage.p30;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.pv6;
import defpackage.q30;
import defpackage.qp2;
import defpackage.r30;
import defpackage.r82;
import defpackage.rn6;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.s30;
import defpackage.sb7;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ub1;
import defpackage.v48;
import defpackage.vb7;
import defpackage.vc8;
import defpackage.vr2;
import defpackage.vy2;
import defpackage.wt;
import defpackage.wu0;
import defpackage.wv8;
import defpackage.xe2;
import defpackage.xk6;
import defpackage.y97;
import defpackage.yl5;
import defpackage.yu0;
import defpackage.zz8;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.UpdateEmptyListData;
import ir.mservices.market.app.update.recycler.UpdateHeaderData;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.model.SubmitCommentRepository$getCommentFlow$$inlined$transform$1;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import ir.mservices.market.common.model.SubmitCommentRepository$isCommentSubmitted$$inlined$transform$1;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateViewModel extends ir.mservices.market.viewModel.a {
    public final wv8 A;
    public final l A0;
    public final dp3 B;
    public final rv6 B0;
    public final ps1 C;
    public final i C0;
    public final yl5 D;
    public final pv6 D0;
    public final vr2 E;
    public final ArrayList E0;
    public final vr2 F;
    public li1 F0;
    public final vr2 G;
    public final ArrayList G0;
    public final ir.mservices.market.version2.manager.install.a H;
    public final mh H0;
    public final az8 I;
    public final mh I0;
    public final lu7 J;
    public final ir.mservices.market.app.update.common.manager.a K;
    public final ec9 L;
    public final ir.mservices.market.app.update.common.data.a M;
    public final i N;
    public final pv6 O;
    public final i P;
    public final i Q;
    public final l R;
    public final rv6 S;
    public final i T;
    public final pv6 U;
    public final l V;
    public final rv6 W;
    public final i X;
    public final pv6 Y;
    public ub1 Z;
    public final jd7 v;
    public final rn6 w;
    public final c35 x;
    public String x0;
    public final wt y;
    public boolean y0;
    public final ir.mservices.market.app.update.common.modal.a z;
    public pv6 z0;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$1", f = "UpdateViewModel.kt", l = {156}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$1$2, reason: invalid class name */
        @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$1$2", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public final /* synthetic */ UpdateViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UpdateViewModel updateViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = updateViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass2(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass2.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                this.a.refreshUpdates();
                return tx8.a;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                UpdateViewModel updateViewModel = UpdateViewModel.this;
                o4 o4Var = new o4(updateViewModel.m, 29);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(updateViewModel, null);
                this.a = 1;
                if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$2", f = "UpdateViewModel.kt", l = {161}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$2$1", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ UpdateViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UpdateViewModel updateViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = updateViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                UpdateViewModel updateViewModel = this.b;
                ub1 ub1Var = updateViewModel.Z;
                if (ub1Var instanceof p30) {
                    p30 p30Var = (p30) ub1Var;
                    ArrayList arrayList = p30Var.j;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!((s30) obj2).a.n.equals(str)) {
                            arrayList2.add(obj2);
                        }
                    }
                    p30Var.j = arrayList2;
                    updateViewModel.e();
                } else {
                    l lVar = updateViewModel.V;
                    Boolean bool = Boolean.TRUE;
                    lVar.getClass();
                    lVar.p(null, bool);
                }
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new AnonymousClass2(g51Var);
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
                UpdateViewModel updateViewModel = UpdateViewModel.this;
                rv6 rv6Var = updateViewModel.K.k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(updateViewModel, null);
                this.a = 1;
                if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$3", f = "UpdateViewModel.kt", l = {853}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            UpdateViewModel updateViewModel = UpdateViewModel.this;
            pv6 pv6Var = updateViewModel.u;
            xk6 xk6Var = new xk6(25, updateViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 6), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel", f = "UpdateViewModel.kt", l = {263, 286, 307, 335}, m = "fillData", v = 1)
    public static final class C01721 extends ContinuationImpl {
        public Map a;
        public Object b;
        public Iterator c;
        public Map d;
        public s30 e;
        public xe2 f;
        public xe2 g;
        public i h;
        public String i;
        public o30 j;
        public pv6 k;
        public vb7 l;
        public String m;
        public int n;
        public int o;
        public int p;
        public /* synthetic */ Object q;
        public int s;

        public C01721(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.q = obj;
            this.s |= Integer.MIN_VALUE;
            return UpdateViewModel.this.fillData(this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$2, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$fillData$2", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C01732 extends SuspendLambda implements qp2 {
        public final /* synthetic */ ub1 b;

        /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$2$2, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00192 extends FunctionReferenceImpl implements qp2 {
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((UpdateViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01732(ub1 ub1Var, g51 g51Var) {
            super(2, g51Var);
            this.b = ub1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new C01732(this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01732) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            q30 q30Var = (q30) this.b;
            ApplicationStateListDto applicationStateListDto = q30Var.j;
            LinkedHashMap linkedHashMap = q30Var.k;
            UpdateViewModel updateViewModel = UpdateViewModel.this;
            List listFillUpdateResult = updateViewModel.fillUpdateResult(applicationStateListDto, linkedHashMap);
            ArrayList arrayList = new ArrayList(wu0.V(listFillUpdateResult, 10));
            Iterator it = listFillUpdateResult.iterator();
            while (it.hasNext()) {
                bl4.G((MyketRecyclerData) it.next(), arrayList);
            }
            return new bz6(arrayList, (GeneralFilter) null, new C00192(2, updateViewModel, UpdateViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$3, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$fillData$3", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C01743 extends SuspendLambda implements qp2 {
        public final /* synthetic */ List a;
        public final /* synthetic */ UpdateViewModel b;

        /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$3$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((UpdateViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01743(List list, UpdateViewModel updateViewModel, g51 g51Var) {
            super(2, g51Var);
            this.a = list;
            this.b = updateViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new C01743(this.a, this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01743) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            List list = this.a;
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bl4.G((MyketRecyclerData) it.next(), arrayList);
            }
            return new bz6(arrayList, (GeneralFilter) null, new AnonymousClass2(2, this.b, UpdateViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$7, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$fillData$7", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass7 extends SuspendLambda implements qp2 {
        public AnonymousClass7(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new AnonymousClass7(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            UpdateViewModel updateViewModel = UpdateViewModel.this;
            jz8 jz8Var = (jz8) updateViewModel.x.b;
            return updateViewModel.getEmptyListRecyclerData((ExtensionPointDto) jz8Var.b.c(jz8Var.a.f(lu7.o0, null), ExtensionPointDto.class));
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillUpdateModel$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel", f = "UpdateViewModel.kt", l = {415}, m = "fillUpdateModel", v = 1)
    public static final class C01751 extends ContinuationImpl {
        public List a;
        public List b;
        public List c;
        public Iterator d;
        public s30 e;
        public xe2 f;
        public xe2 g;
        public i h;
        public String i;
        public o30 j;
        public pv6 k;
        public vb7 l;
        public int m;
        public /* synthetic */ Object n;
        public int p;

        public C01751(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            return UpdateViewModel.z(UpdateViewModel.this, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$onEvent$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$onEvent$1", f = "UpdateViewModel.kt", l = {825}, m = "invokeSuspend", v = 1)
    public static final class C01761 extends SuspendLambda implements qp2 {
        public int a;

        public C01761(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new C01761(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01761) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                UpdateViewModel updateViewModel = UpdateViewModel.this;
                li1 li1Var = updateViewModel.F0;
                if (li1Var != null) {
                    li1Var.g(null);
                }
                i iVar = updateViewModel.N;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (iVar.emit(bool, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$onFinishedUpdateAction$2, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$onFinishedUpdateAction$2", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C01772 extends SuspendLambda implements qp2 {
        public C01772(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new C01772(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            C01772 c01772 = (C01772) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            c01772.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            li1 li1Var = UpdateViewModel.this.F0;
            if (li1Var != null) {
                li1Var.g(null);
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$refreshUpdates$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$refreshUpdates$1", f = "UpdateViewModel.kt", l = {231}, m = "invokeSuspend", v = 1)
    public static final class C01781 extends SuspendLambda implements qp2 {
        public int a;

        public C01781(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UpdateViewModel.this.new C01781(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01781) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                UpdateViewModel updateViewModel = UpdateViewModel.this;
                ir.mservices.market.app.update.common.modal.a aVar = updateViewModel.z;
                ff5 ff5VarB = ff5.b();
                zz8 zz8Var = new zz8(updateViewModel);
                zz8 zz8Var2 = new zz8(updateViewModel);
                this.a = 1;
                if (aVar.c(updateViewModel, "update_list", "update_list", ff5VarB, zz8Var, zz8Var2, this) == coroutineSingletons) {
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
    public UpdateViewModel(jd7 jd7Var, rn6 rn6Var, c35 c35Var, wt wtVar, ir.mservices.market.app.update.common.modal.a aVar, wv8 wv8Var, dp3 dp3Var, ps1 ps1Var, yl5 yl5Var, vr2 vr2Var, vr2 vr2Var2, vr2 vr2Var3, ir.mservices.market.version2.manager.install.a aVar2, az8 az8Var, lu7 lu7Var, ir.mservices.market.app.update.common.manager.a aVar3, ec9 ec9Var, ir.mservices.market.app.update.common.data.a aVar4, gr5 gr5Var) {
        super(false);
        js3.p(jd7Var, "stateHandle");
        js3.p(wtVar, "appUpdateRepository");
        js3.p(aVar, "updateRefreshRepository");
        js3.p(dp3Var, "installManager");
        js3.p(ps1Var, "downloadManager");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(aVar2, "installQueue");
        js3.p(az8Var, "updateAnalytics");
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(aVar3, "appUpdateManager");
        js3.p(ec9Var, "vpnUtils");
        this.v = jd7Var;
        this.w = rn6Var;
        this.x = c35Var;
        this.y = wtVar;
        this.z = aVar;
        this.A = wv8Var;
        this.B = dp3Var;
        this.C = ps1Var;
        this.D = yl5Var;
        this.E = vr2Var;
        this.F = vr2Var2;
        this.G = vr2Var3;
        this.H = aVar2;
        this.I = az8Var;
        this.J = lu7Var;
        this.K = aVar3;
        this.L = ec9Var;
        this.M = aVar4;
        i iVarE = vy2.e(0, 7, null);
        this.N = iVarE;
        this.O = new pv6(iVarE);
        this.P = vy2.e(0, 7, null);
        this.Q = vy2.e(0, 7, null);
        this.R = ja1.b(0);
        h hVar = new h(yl5Var.e, ((AppUpdateRepositoryImpl) ((wt) gr5Var.g)).b(), new UpdateViewModel$isUpdateInProgressFlow$1(3, null));
        fu0 fu0VarG = y97.G(this);
        Boolean bool = Boolean.FALSE;
        this.S = d.A(hVar, fu0VarG, ru7.b, bool);
        i iVarE2 = vy2.e(0, 7, null);
        this.T = iVarE2;
        this.U = new pv6(iVarE2);
        l lVarB = ja1.b(Boolean.TRUE);
        this.V = lVarB;
        this.W = new rv6(lVarB);
        i iVarE3 = vy2.e(0, 7, null);
        this.X = iVarE3;
        this.Y = new pv6(iVarE3);
        this.Z = r30.j;
        this.x0 = (String) jd7Var.b("packageName");
        l lVarB2 = ja1.b(bool);
        this.A0 = lVarB2;
        this.B0 = new rv6(lVarB2);
        i iVarE4 = vy2.e(0, 7, null);
        this.C0 = iVarE4;
        this.D0 = new pv6(iVarE4);
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
        this.E0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new mh(22);
        this.I0 = new mh(23);
    }

    private final void activatedStateError(String str) {
        Boolean bool = Boolean.FALSE;
        l lVar = this.V;
        lVar.getClass();
        lVar.p(null, bool);
        f(str);
    }

    private final void activatedStateSuccess(String str, boolean z) {
        ub1 ub1Var = this.Z;
        if (ub1Var instanceof q30) {
            LinkedHashMap linkedHashMap = ((q30) ub1Var).k;
            AppUpdateData appUpdateData = (AppUpdateData) linkedHashMap.get(str);
            if (appUpdateData != null) {
                linkedHashMap.put(str, new AppUpdateData(appUpdateData.a, appUpdateData.b, appUpdateData.c, appUpdateData.d, appUpdateData.e, appUpdateData.f, appUpdateData.g, appUpdateData.h, appUpdateData.i, z));
            }
            e();
            return;
        }
        Object obj = null;
        if (!(ub1Var instanceof p30)) {
            lw.g(null, "UpdateViewModel, UpdatesEnableModifiedEvent illegal state!", null);
            return;
        }
        Iterator it = ((p30) ub1Var).j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((s30) next).a.n.equals(str)) {
                obj = next;
                break;
            }
        }
        s30 s30Var = (s30) obj;
        if (s30Var != null) {
            s30Var.b = z;
        }
        e();
    }

    private final void addRecommendationData() {
        l lVar;
        Object value;
        String str = this.x0;
        String str2 = (str == null || f88.n0(str)) ? null : str;
        if (str2 != null) {
            jz8 jz8Var = (jz8) this.x.b;
            ExtensionPointDto extensionPointDto = (ExtensionPointDto) jz8Var.b.c(jz8Var.a.f(lu7.n0, null), ExtensionPointDto.class);
            if (extensionPointDto != null) {
                String url = extensionPointDto.getUrl();
                ExtensionPointDto extensionPointDto2 = (url == null || f88.n0(url)) ? null : extensionPointDto;
                if (extensionPointDto2 != null) {
                    String type = extensionPointDto2.getType();
                    if (type == null) {
                        type = "update_extension_key";
                    }
                    String str3 = type;
                    String url2 = extensionPointDto2.getUrl();
                    if (url2 == null) {
                        url2 = "";
                    }
                    String string = Uri.parse(url2).buildUpon().appendQueryParameter("pn", str2).build().toString();
                    js3.o(string, "toString(...)");
                    pv6 pv6VarB = e.b(dw1.e(this.A, string, this, true), y97.G(this));
                    bc bcVar = new bc(br9.C(new RecyclerItem(new ExtHeaderRowData(getHeaderAppsExtension(extensionPointDto2.getType(), extensionPointDto2.getUrl(), pv6VarB), str3, false, new UpdateViewModel$addRecommendationData$2$2$1(1, this, UpdateViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 60)), new RecyclerItem(new HomeAppsRowData(null, extensionPointDto2, getExtensionApps(extensionPointDto2, pv6VarB), null, str3, false, new UpdateViewModel$addRecommendationData$2$2$recommendationItem$1(1, this, UpdateViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 40))), new kt(str2, 13));
                    do {
                        lVar = this.q;
                        value = lVar.getValue();
                    } while (!lVar.n(value, kotlin.collections.b.Q((Map) value, new Pair(str3, bcVar))));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addRecommendationData$lambda$1$1$0(String str, RecyclerItem recyclerItem) {
        o30 o30Var;
        js3.p(recyclerItem, "recyclerItem");
        MyketRecyclerData myketRecyclerData = recyclerItem.c;
        String str2 = null;
        AppUpdateData appUpdateData = myketRecyclerData instanceof AppUpdateData ? (AppUpdateData) myketRecyclerData : null;
        if (appUpdateData != null && (o30Var = appUpdateData.c) != null) {
            str2 = o30Var.n;
        }
        return m88.T(str2, str, true);
    }

    private final boolean canShowTrafficHint() {
        return !this.L.a() && this.J.b(lu7.p0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int comparator$lambda$0(AppUpdateData appUpdateData, AppUpdateData appUpdateData2) {
        if (NearbyRepository.SERVICE_ID.equals(appUpdateData.c.n)) {
            return 2;
        }
        if (NearbyRepository.SERVICE_ID.equals(appUpdateData2.c.n)) {
            return -2;
        }
        long j = appUpdateData.c.b;
        long j2 = appUpdateData2.c.b;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x017a -> B:19:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fillData(defpackage.g51<? super defpackage.tx8> r33) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.UpdateViewModel.fillData(g51):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e0 -> B:23:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object fillUpdateModel(java.util.List<defpackage.s30> r22, defpackage.g51<? super java.util.List<? extends ir.mservices.market.common.ui.recycler.MyketRecyclerData>> r23) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.UpdateViewModel.fillUpdateModel(java.util.List, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MyketRecyclerData> fillUpdateResult(ApplicationStateListDto applicationStateListDto, Map<String, AppUpdateData> map) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (!map.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<ApplicationStateDto> items = applicationStateListDto.getItems();
            js3.o(items, "getItems(...)");
            for (ApplicationStateDto applicationStateDto : items) {
                AppUpdateData appUpdateData = map.get(applicationStateDto.getPackageName());
                if (appUpdateData != null) {
                    appUpdateData.l = applicationStateDto;
                    if (appUpdateData.j) {
                        arrayList2.add(appUpdateData);
                    } else {
                        arrayList3.add(appUpdateData);
                    }
                }
            }
            mh mhVar = this.I0;
            yu0.Y(arrayList2, mhVar);
            yu0.Y(arrayList3, mhVar);
            Collections.reverse(arrayList2);
            Collections.reverse(arrayList3);
            if (!arrayList2.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it = arrayList2.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        o30 o30Var = ((AppUpdateData) it.next()).c;
                        if (((AppUpdateRepositoryImpl) this.y).d(o30Var.f, o30Var.n) && (i = i + 1) < 0) {
                            br9.O();
                            throw null;
                        }
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                l lVar = this.R;
                lVar.getClass();
                lVar.p(null, numValueOf);
                arrayList.add(0, new UpdateHeaderData(lVar, this.S, canShowTrafficHint()));
            }
            arrayList.addAll(arrayList2);
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    private final xe2 getCommentFlow(String str) {
        return new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(this.G.g.f, null, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final bz6 getEmptyListRecyclerData(ExtensionPointDto extensionPointDto) {
        String url;
        return (extensionPointDto == null || (url = extensionPointDto.getUrl()) == null || f88.n0(url)) ? new bz6((List) EmptyList.a, (GeneralFilter) null, (qp2) (0 == true ? 1 : 0), 6) : new bz6(e.b(gu9.x(dw1.e(this.A, extensionPointDto.getUrl(), this, true), new a67(24, this)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getEmptyListRecyclerData$lambda$0(UpdateViewModel updateViewModel, HomeExtensionAppsDto homeExtensionAppsDto) {
        String title;
        js3.p(homeExtensionAppsDto, "homeExtensionAppDto");
        ArrayList arrayList = new ArrayList();
        if (!((Boolean) updateViewModel.A0.getValue()).booleanValue()) {
            HomeExtensionAppsDto homeExtensionAppsDto2 = (homeExtensionAppsDto.getApps().isEmpty() || (title = homeExtensionAppsDto.getTitle()) == null || f88.n0(title)) ? null : homeExtensionAppsDto;
            if (homeExtensionAppsDto2 != null) {
                arrayList.add(new RecyclerItem(new UpdateEmptyListData()));
                arrayList.add(new RecyclerItem(new HomeMoreTitleRowData(homeExtensionAppsDto2.getTitle(), null, homeExtensionAppsDto2.getAdInfoDto(), false, null, null, null, null, 248)));
                l lVar = updateViewModel.A0;
                Boolean bool = Boolean.TRUE;
                lVar.getClass();
                lVar.p(null, bool);
                bt2.G(y97.G(updateViewModel), null, null, new UpdateViewModel$getEmptyListRecyclerData$1$2$1(updateViewModel, null), 3);
            }
        }
        List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
        ArrayList arrayList2 = new ArrayList(wu0.V(apps, 10));
        for (ApplicationDTO applicationDTO : apps) {
            yl5 yl5Var = updateViewModel.D;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList2.add(new RecyclerItem(new AppData((vb7) yl5Var.a(packageName), updateViewModel.H.b, applicationDTO)));
        }
        kotlin.collections.a.b0(arrayList2, arrayList);
        return arrayList;
    }

    private final bz6 getExtensionApps(ExtensionPointDto extensionPointDto, xe2 xe2Var) {
        pv6 pv6VarB = this.z0;
        if (pv6VarB == null) {
            pv6VarB = e.b(gu9.x(xe2Var, new nr8(extensionPointDto, this, 5)), y97.G(this));
            this.z0 = pv6VarB;
        }
        return new bz6(pv6VarB, null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApps$lambda$0(ExtensionPointDto extensionPointDto, UpdateViewModel updateViewModel, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
        ArrayList arrayList = new ArrayList(wu0.V(apps, 10));
        for (ApplicationDTO applicationDTO : apps) {
            String title = applicationDTO.getTitle();
            js3.o(title, "getTitle(...)");
            boolean zIsMulti = extensionPointDto.isMulti();
            yl5 yl5Var = updateViewModel.D;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title, zIsMulti, yl5Var.a(packageName), updateViewModel.H.b, extensionPointDto.isDigested(), 64, 0)));
        }
        return arrayList;
    }

    private final bz6 getHeaderAppsExtension(String str, String str2, xe2 xe2Var) {
        return new bz6(e.b(gu9.x(xe2Var, new ot1(str, str2, 1)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHeaderAppsExtension$lambda$0(String str, String str2, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        ArrayList arrayList = new ArrayList();
        String title = homeExtensionAppsDto.getTitle();
        if (title != null && !f88.n0(title)) {
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new RecyclerItem(new ExtHeaderData(str, str2, homeExtensionAppsDto.getTitle(), homeExtensionAppsDto.getAdInfoDto(), false, null, false)));
        }
        return arrayList;
    }

    private final Object getIsCommentSubmittedFlow(String str, g51<? super v48> g51Var) {
        js3.p(str, "packageName");
        vr2 vr2Var = this.F;
        vr2Var.getClass();
        ir.mservices.market.common.model.a aVar = vr2Var.g;
        aVar.getClass();
        return d.B(new vb7(new SubmitCommentRepository$isCommentSubmitted$$inlined$transform$1(aVar.f, null, str)), y97.G(this), g51Var);
    }

    private final xe2 getSubmitCommentStateFlow(String str) {
        ir.mservices.market.common.model.a aVar = this.E.g;
        return new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFinishedUpdateAction() {
        for (DownloadDataModel downloadDataModel : this.E0) {
            sb7.p("update_list", "InstallApplication called in onEvent", "PackageName: " + downloadDataModel.a);
            this.B.C(downloadDataModel);
        }
        bt2.G(y97.G(this), null, null, new C01772(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUpdates() {
        this.Z = r30.j;
        bt2.G(y97.G(this), null, null, new C01781(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleUpdateState(bk3 bk3Var) {
        String str = bk3Var.a;
        String str2 = bk3Var.a;
        String str3 = bk3Var.c;
        if ((str == null || f88.n0(str)) && str3 != null && str3.length() > 0) {
            activatedStateError(str3);
        } else {
            if (str2 == null || str2.length() <= 0) {
                return;
            }
            activatedStateSuccess(str2, bk3Var.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateAllComparator$lambda$0(s30 s30Var, s30 s30Var2) {
        if (NearbyRepository.SERVICE_ID.equals(s30Var2.a.n)) {
            return 2;
        }
        if (NearbyRepository.SERVICE_ID.equals(s30Var.a.n)) {
            return -2;
        }
        long j = s30Var.a.b;
        long j2 = s30Var2.a.b;
        if (j < j2) {
            return 1;
        }
        return j > j2 ? -1 : 0;
    }

    public static final /* synthetic */ Object z(UpdateViewModel updateViewModel, g51 g51Var) {
        return updateViewModel.fillUpdateModel(null, g51Var);
    }

    public final void F(r82 r82Var) {
        js3.p(r82Var, "data");
        String str = r82Var.b;
        if (this.x0 == null) {
            this.x0 = str;
            this.v.d(str, "packageName");
            addRecommendationData();
        }
        int iL = this.C.l(str);
        bt2.G(y97.G(this), null, null, new UpdateViewModel$fastDownloadClick$1(this, r82Var, iL == 110 || iL == 100, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        bt2.G(y97.G(this), null, null, new UpdateViewModel$onCleared$1(this, null), 3);
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        if (((AppUpdateRepositoryImpl) this.y).a.i.a.getValue() == null) {
            refreshUpdates();
        } else {
            bt2.G(y97.G(this), null, null, new UpdateViewModel$doRequest$1(this, null), 3);
        }
    }

    public final void onEvent(e80 e80Var) {
        js3.p(e80Var, "event");
        bt2.G(y97.G(this), null, null, new C01761(null), 3);
    }

    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem != null && recyclerItem2 != null) {
            MyketRecyclerData myketRecyclerData = recyclerItem2.c;
            MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
            if (myketRecyclerData2 instanceof UpdateEmptyListData) {
                DividerData dividerData = new DividerData();
                dividerData.d = pq6.space_s;
                dividerData.b = false;
                return new RecyclerItem(dividerData);
            }
            if (myketRecyclerData2 instanceof UpdateHeaderData) {
                if (myketRecyclerData instanceof AppUpdateData) {
                    int iU = ((AppUpdateData) myketRecyclerData).U();
                    int i = AppUpdateData.o;
                    if (iU != AppUpdateData.p) {
                        DividerData dividerData2 = new DividerData();
                        dividerData2.g = pq6.space_s;
                        dividerData2.b = false;
                        return new RecyclerItem(dividerData2);
                    }
                }
                return null;
            }
            if (myketRecyclerData2 instanceof AppUpdateData) {
                if (!(myketRecyclerData instanceof AppUpdateData) && !(myketRecyclerData instanceof ExtHeaderRowData)) {
                    return null;
                }
                DividerData dividerData3 = new DividerData();
                dividerData3.d = pq6.space_s;
                dividerData3.b = false;
                return new RecyclerItem(dividerData3);
            }
            if ((myketRecyclerData2 instanceof HomeAppsRowData) && (myketRecyclerData instanceof AppUpdateData)) {
                DividerData dividerData4 = new DividerData();
                dividerData4.d = pq6.space_s;
                dividerData4.b = false;
                return new RecyclerItem(dividerData4);
            }
        }
        return null;
    }
}
