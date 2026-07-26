package ir.mservices.market.social.requests;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.a67;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.ck4;
import defpackage.e71;
import defpackage.g51;
import defpackage.gu9;
import defpackage.ja1;
import defpackage.js3;
import defpackage.og6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.requests.RequestListAction;
import ir.mservices.market.social.requests.data.AccountDto;
import ir.mservices.market.social.requests.data.RequestListResponseDto;
import ir.mservices.market.social.requests.recycler.RequestAccountData;
import ir.mservices.market.viewModel.a;
import ir.mservices.market.views.MyketProgressState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestViewModel extends a {
    public final l A;
    public final l B;
    public final i C;
    public final pv6 D;
    public final ck4 v;
    public final l w;
    public final h x;
    public final i y;
    public final pv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.requests.RequestViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.requests.RequestViewModel$1", f = "RequestViewModel.kt", l = {138}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return RequestViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            RequestViewModel requestViewModel = RequestViewModel.this;
            pv6 pv6Var = requestViewModel.u;
            xk6 xk6Var = new xk6(8, requestViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 17), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.requests.RequestViewModel$onApproveAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.requests.RequestViewModel$onApproveAction$1", f = "RequestViewModel.kt", l = {104, 108, 116}, m = "invokeSuspend", v = 1)
    public static final class C02411 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;
        public final /* synthetic */ RequestListAction.ApproveAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02411(RequestListAction.ApproveAction approveAction, g51 g51Var) {
            super(2, g51Var);
            this.d = approveAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return RequestViewModel.this.new C02411(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02411) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e1, code lost:
        
            if (r1.emit(r0, r13) == r9) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0131, code lost:
        
            if (r0.emit(r1, r13) == r9) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.requests.RequestViewModel.C02411.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.requests.RequestViewModel$onDismissAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.requests.RequestViewModel$onDismissAction$1", f = "RequestViewModel.kt", l = {82, 86, 94}, m = "invokeSuspend", v = 1)
    public static final class C02421 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;
        public final /* synthetic */ RequestListAction.DismissAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02421(RequestListAction.DismissAction dismissAction, g51 g51Var) {
            super(2, g51Var);
            this.d = dismissAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return RequestViewModel.this.new C02421(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02421) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
        
            if (r1.emit(r0, r13) == r9) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0133, code lost:
        
            if (r0.emit(r1, r13) == r9) goto L36;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.requests.RequestViewModel.C02421.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public RequestViewModel(final ck4 ck4Var) {
        super(true);
        this.v = ck4Var;
        pv6 pv6VarB = e.b(gu9.x((xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.social.requests.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.a(new RequestRepositoryImpl$getFollowRequestList$1$1(ck4Var, this, null), null);
            }
        }).a, new a67(0, this)), y97.G(this));
        l lVarB = ja1.b(EmptyList.a);
        this.w = lVarB;
        this.x = new h(pv6VarB, lVarB, new RequestViewModel$items$1(3, null));
        i iVarE = vy2.e(0, 7, null);
        this.y = iVarE;
        this.z = new pv6(iVarE);
        this.A = ja1.b(new LinkedHashMap());
        this.B = ja1.b(new LinkedHashMap());
        i iVarE2 = vy2.e(0, 7, null);
        this.C = iVarE2;
        this.D = new pv6(iVarE2);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allItems$lambda$0(RequestViewModel requestViewModel, RequestListResponseDto requestListResponseDto) {
        js3.p(requestListResponseDto, "it");
        ArrayList<AccountDto> accounts = requestListResponseDto.getAccounts();
        ArrayList arrayList = new ArrayList(wu0.V(accounts, 10));
        for (AccountDto accountDto : accounts) {
            arrayList.add(new RecyclerItem(new RequestAccountData(accountDto, requestViewModel.getDismissLoadingFlow(accountDto.getAccountKey()), requestViewModel.getApproveFlow(accountDto.getAccountKey()))));
        }
        return arrayList;
    }

    private final v48 getApproveFlow(String str) {
        return d.A(new vb7(new RequestViewModel$getApproveFlow$$inlined$transform$1(this.B, null, str)), y97.G(this), ru7.b, MyketProgressState.b);
    }

    private final v48 getDismissLoadingFlow(String str) {
        return d.A(new vb7(new RequestViewModel$getDismissLoadingFlow$$inlined$transform$1(this.A, null, str)), y97.G(this), ru7.b, MyketProgressState.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onApproveAction(RequestListAction.ApproveAction approveAction) {
        bt2.G(y97.G(this), null, null, new C02411(approveAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDismissAction(RequestListAction.DismissAction dismissAction) {
        bt2.G(y97.G(this), null, null, new C02421(dismissAction, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new RequestViewModel$doRequest$1(this, null));
    }
}
