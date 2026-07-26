package ir.mservices.market.download.app;

import android.net.Uri;
import androidx.paging.e;
import defpackage.at;
import defpackage.br9;
import defpackage.bt;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.dw1;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.gu9;
import defpackage.is3;
import defpackage.ja1;
import defpackage.js3;
import defpackage.l99;
import defpackage.lw;
import defpackage.m;
import defpackage.n99;
import defpackage.ot1;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.qt1;
import defpackage.r4;
import defpackage.rt1;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sl0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.wv8;
import defpackage.xe2;
import defpackage.xs;
import defpackage.y97;
import defpackage.yg2;
import defpackage.yl5;
import defpackage.ys;
import defpackage.zs;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.home.ui.recycler.HomeAppsRowData;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderData;
import ir.mservices.market.common.ext.ui.recycler.ExtHeaderRowData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.download.app.RecentDownloadAction;
import ir.mservices.market.download.app.data.DownloadAppStateData;
import ir.mservices.market.download.app.data.DownloadListModel;
import ir.mservices.market.download.app.model.NeneDownloadRepository$downloadInfoFlowByDownloadInfoStatus$$inlined$transform$1;
import ir.mservices.market.download.app.model.a;
import ir.mservices.market.download.app.recycler.AppDownloadData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadViewModel extends BaseMultiSelectViewModel {
    public final yl5 G;
    public final a H;
    public final ps1 I;
    public final ir.mservices.market.version2.manager.install.a J;
    public final wv8 K;
    public final ArrayList L;
    public final rv6 M;
    public pv6 N;
    public final i O;
    public final pv6 P;
    public final l Q;
    public final rv6 R;
    public final i S;

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$1", f = "DownloadViewModel.kt", l = {420}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadViewModel.this.new AnonymousClass1(g51Var);
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
            DownloadViewModel downloadViewModel = DownloadViewModel.this;
            pv6 pv6Var = downloadViewModel.u;
            r4 r4Var = new r4(24, downloadViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(r4Var, 0), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$2", f = "DownloadViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$2$1", f = "DownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public final /* synthetic */ DownloadViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DownloadViewModel downloadViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = downloadViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new AnonymousClass1(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tx8) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                this.a.refreshRecyclerItems();
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadViewModel.this.new AnonymousClass2(g51Var);
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
                DownloadViewModel downloadViewModel = DownloadViewModel.this;
                xe2 xe2VarI = d.i(downloadViewModel.S);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(downloadViewModel, null);
                this.a = 1;
                if (d.f(xe2VarI, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$1", f = "DownloadViewModel.kt", l = {237, 238}, m = "invokeSuspend", v = 1)
    public static final class C01801 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$1$2, reason: invalid class name */
        @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$1$2", f = "DownloadViewModel.kt", l = {245}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ DownloadViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DownloadViewModel downloadViewModel, g51 g51Var) {
                super(2, g51Var);
                this.c = downloadViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, g51Var);
                anonymousClass2.b = obj;
                return anonymousClass2;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((String) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object next;
                DownloadViewModel downloadViewModel = this.c;
                ArrayList arrayList = downloadViewModel.L;
                String str = (String) this.b;
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
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof AppDownloadData) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (js3.i(((AppDownloadData) next).m, str)) {
                        break;
                    }
                }
                AppDownloadData appDownloadData = (AppDownloadData) next;
                if (appDownloadData != null && arrayList.remove(appDownloadData)) {
                    i iVar = downloadViewModel.S;
                    this.b = null;
                    this.a = 1;
                    if (iVar.emit(tx8Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return tx8Var;
            }
        }

        public C01801(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadViewModel.this.new C01801(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01801) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r8, r1, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r7.a
                r2 = 0
                r3 = 2
                r4 = 1
                ir.mservices.market.download.app.DownloadViewModel r5 = ir.mservices.market.download.app.DownloadViewModel.this
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.b.b(r8)
                goto L53
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.b.b(r8)
                goto L43
            L1f:
                kotlin.b.b(r8)
                yl5 r8 = r5.G
                sl0 r1 = new sl0
                r6 = 6
                r1.<init>(r6)
                rv6 r8 = r8.e
                ir.mservices.market.download.app.model.NeneDownloadRepository$downloadInfoFlowByStatus$$inlined$transform$1 r6 = new ir.mservices.market.download.app.model.NeneDownloadRepository$downloadInfoFlowByStatus$$inlined$transform$1
                r6.<init>(r8, r2, r1)
                vb7 r8 = new vb7
                r8.<init>(r6)
                fu0 r1 = defpackage.y97.G(r5)
                r7.a = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r1, r7)
                if (r8 != r0) goto L43
                goto L52
            L43:
                xe2 r8 = (defpackage.xe2) r8
                ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$1$2 r1 = new ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$1$2
                r1.<init>(r5, r2)
                r7.a = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r8, r1, r7)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                tx8 r8 = defpackage.tx8.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.app.DownloadViewModel.C01801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$2, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$2", f = "DownloadViewModel.kt", l = {255, 256}, m = "invokeSuspend", v = 1)
    public static final class C01812 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$2$2, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$2$2", f = "DownloadViewModel.kt", l = {263, 277}, m = "invokeSuspend", v = 1)
        final class C00212 extends SuspendLambda implements qp2 {
            public Object a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ DownloadViewModel d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00212(DownloadViewModel downloadViewModel, g51 g51Var) {
                super(2, g51Var);
                this.d = downloadViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00212 c00212 = new C00212(this.d, g51Var);
                c00212.c = obj;
                return c00212;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00212) create((String) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objA;
                DownloadViewModel downloadViewModel = this.d;
                ArrayList arrayList = downloadViewModel.L;
                String str = (String) this.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.b;
                tx8 tx8Var = tx8.a;
                if (i == 0) {
                    b.b(obj);
                    AppDownloadInfo appDownloadInfoI = downloadViewModel.I.i(str, null);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (obj2 instanceof AppDownloadData) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (js3.i(((AppDownloadData) it.next()).m, str)) {
                                break;
                            }
                        }
                    }
                    if (appDownloadInfoI != null) {
                        a aVar = downloadViewModel.H;
                        Map mapM = kotlin.collections.b.M(new Pair(str, appDownloadInfoI));
                        this.c = str;
                        this.b = 1;
                        objA = aVar.a(mapM, downloadViewModel, this);
                        if (objA != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    return tx8Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                    return tx8Var;
                }
                b.b(obj);
                objA = obj;
                n99 n99Var = (n99) objA;
                if (n99Var instanceof l99) {
                    DownloadAppStateData downloadAppStateData = (DownloadAppStateData) ((l99) n99Var).a;
                    if (!downloadAppStateData.getDownloadAppModel().isEmpty()) {
                        rv6 rv6Var = downloadViewModel.E;
                        yl5 yl5Var = downloadViewModel.G;
                        xe2 xe2VarA = yl5Var.a(str);
                        arrayList.add(0, new AppDownloadData(rv6Var, (vb7) xe2VarA, (vb7) yl5Var.b(str), downloadViewModel.J.b, downloadAppStateData.getDownloadAppModel().get(0)));
                        i iVar = downloadViewModel.S;
                        this.c = null;
                        this.a = objA;
                        this.b = 2;
                        if (iVar.emit(tx8Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return tx8Var;
            }
        }

        public C01812(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadViewModel.this.new C01812(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01812) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (kotlinx.coroutines.flow.d.f((defpackage.xe2) r8, r1, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r7.a
                r2 = 0
                r3 = 2
                r4 = 1
                ir.mservices.market.download.app.DownloadViewModel r5 = ir.mservices.market.download.app.DownloadViewModel.this
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.b.b(r8)
                goto L53
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                kotlin.b.b(r8)
                goto L43
            L1f:
                kotlin.b.b(r8)
                yl5 r8 = r5.G
                sl0 r1 = new sl0
                r6 = 7
                r1.<init>(r6)
                rv6 r8 = r8.e
                ir.mservices.market.download.app.model.NeneDownloadRepository$downloadInfoFlowByStatus$$inlined$transform$1 r6 = new ir.mservices.market.download.app.model.NeneDownloadRepository$downloadInfoFlowByStatus$$inlined$transform$1
                r6.<init>(r8, r2, r1)
                vb7 r8 = new vb7
                r8.<init>(r6)
                fu0 r1 = defpackage.y97.G(r5)
                r7.a = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.d.B(r8, r1, r7)
                if (r8 != r0) goto L43
                goto L52
            L43:
                xe2 r8 = (defpackage.xe2) r8
                ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$2$2 r1 = new ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$2$2
                r1.<init>(r5, r2)
                r7.a = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.d.f(r8, r1, r7)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                tx8 r8 = defpackage.tx8.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.app.DownloadViewModel.C01812.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$3", f = "DownloadViewModel.kt", l = {289}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$3$2, reason: invalid class name */
        @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$initDownloadInfoObserver$3$2", f = "DownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ DownloadViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DownloadViewModel downloadViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = downloadViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
                anonymousClass2.a = obj;
                return anonymousClass2;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((String) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass2.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                DownloadViewModel downloadViewModel = this.b;
                ArrayList arrayList = downloadViewModel.L;
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        br9.P();
                        throw null;
                    }
                    MyketRecyclerData myketRecyclerData = (MyketRecyclerData) obj2;
                    if (myketRecyclerData instanceof AppDownloadData) {
                        AppDownloadData appDownloadData = (AppDownloadData) myketRecyclerData;
                        if (js3.i(appDownloadData.m, str) && !((Boolean) appDownloadData.e.a.getValue()).booleanValue()) {
                            appDownloadData.f = false;
                            l lVar = appDownloadData.d;
                            Boolean bool = Boolean.TRUE;
                            lVar.getClass();
                            lVar.p(null, bool);
                            arrayList.set(i, myketRecyclerData);
                            downloadViewModel.t();
                        }
                    }
                    i = i2;
                }
                return tx8.a;
            }
        }

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                DownloadViewModel downloadViewModel = DownloadViewModel.this;
                yl5 yl5Var = downloadViewModel.G;
                sl0 sl0Var = new sl0(8);
                yl5Var.getClass();
                pv6 pv6VarZ = d.z(new vb7(new NeneDownloadRepository$downloadInfoFlowByDownloadInfoStatus$$inlined$transform$1(sl0Var, null, yl5Var.e)), y97.G(downloadViewModel), ru7.a, 0);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(downloadViewModel, null);
                this.a = 1;
                if (d.f(pv6VarZ, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$onRemoveAllAppsAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel", f = "DownloadViewModel.kt", l = {337}, m = "onRemoveAllAppsAction", v = 1)
    public static final class C01821 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public C01821(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DownloadViewModel.this.onRemoveAllAppsAction(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$onRemoveAllMultiSelectedItemsAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel", f = "DownloadViewModel.kt", l = {324}, m = "onRemoveAllMultiSelectedItemsAction", v = 1)
    public static final class C01831 extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public C01831(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DownloadViewModel.this.onRemoveAllMultiSelectedItemsAction(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$refreshRecyclerItems$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.download.app.DownloadViewModel$refreshRecyclerItems$1", f = "DownloadViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C01841 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;

        /* JADX INFO: renamed from: ir.mservices.market.download.app.DownloadViewModel$refreshRecyclerItems$1$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((DownloadViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
            }
        }

        public C01841(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            C01841 c01841 = DownloadViewModel.this.new C01841(g51Var);
            c01841.a = obj;
            return c01841;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01841) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            bz6 bz6Var = (bz6) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            DownloadViewModel downloadViewModel = DownloadViewModel.this;
            ArrayList arrayList = downloadViewModel.L;
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RecyclerItem recyclerItem = new RecyclerItem((MyketRecyclerData) it.next());
                downloadViewModel.F.add(recyclerItem);
                arrayList2.add(recyclerItem);
            }
            return new bz6(arrayList2, bz6Var != null ? bz6Var.b : null, new AnonymousClass2(2, downloadViewModel, DownloadViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadViewModel(yl5 yl5Var, a aVar, ps1 ps1Var, ir.mservices.market.version2.manager.install.a aVar2, wv8 wv8Var) {
        super(true);
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(ps1Var, "downloadManager");
        js3.p(aVar2, "installQueue");
        this.G = yl5Var;
        this.H = aVar;
        this.I = ps1Var;
        this.J = aVar2;
        this.K = wv8Var;
        this.L = new ArrayList();
        this.M = yl5Var.e;
        i iVarE = vy2.e(0, 7, null);
        this.O = iVarE;
        this.P = new pv6(iVarE);
        l lVarB = ja1.b(Boolean.FALSE);
        this.Q = lVarB;
        this.R = new rv6(lVarB);
        this.S = vy2.e(0, 7, null);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    private final List<MyketRecyclerData> addRecommendationData(ExtensionPointDto extensionPointDto) {
        ArrayList arrayList = new ArrayList();
        if (extensionPointDto != null) {
            String url = extensionPointDto.getUrl();
            ExtensionPointDto extensionPointDto2 = (url == null || f88.n0(url)) ? null : extensionPointDto;
            if (extensionPointDto2 != null) {
                String type = extensionPointDto2.getType();
                if (type == null) {
                    long j = is3.p + 1;
                    is3.p = j;
                    type = String.valueOf(j);
                }
                String str = type;
                String url2 = extensionPointDto.getUrl();
                if (url2 == null) {
                    url2 = "";
                }
                String string = Uri.parse(url2).toString();
                js3.o(string, "toString(...)");
                pv6 pv6VarB = e.b(dw1.e(this.K, string, this, true), y97.G(this));
                arrayList.add(new ExtHeaderRowData(getExtHeaderApps(extensionPointDto2.getType(), extensionPointDto2.getUrl(), pv6VarB), str, false, new DownloadViewModel$addRecommendationData$2$1(1, this, DownloadViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 60));
                arrayList.add(new HomeAppsRowData(null, extensionPointDto2, getExtensionApps(extensionPointDto2, pv6VarB), null, str, false, new DownloadViewModel$addRecommendationData$2$2(1, this, DownloadViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0), 40));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillData(DownloadAppStateData downloadAppStateData) {
        List listJ0;
        List listJ02;
        List listJ03;
        ArrayList arrayList = this.L;
        arrayList.clear();
        lw.d("database result is null", null, downloadAppStateData);
        List<DownloadListModel> downloadAppModel = downloadAppStateData.getDownloadAppModel();
        ArrayList arrayList2 = new ArrayList(wu0.V(downloadAppModel, 10));
        for (DownloadListModel downloadListModel : downloadAppModel) {
            String packageName = downloadListModel.getApp().getPackageName();
            js3.o(packageName, "getPackageName(...)");
            yl5 yl5Var = this.G;
            xe2 xe2VarA = yl5Var.a(packageName);
            String packageName2 = downloadListModel.getApp().getPackageName();
            js3.o(packageName2, "getPackageName(...)");
            arrayList2.add(new AppDownloadData(this.E, (vb7) xe2VarA, (vb7) yl5Var.b(packageName2), this.J.b, downloadListModel));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList2) {
            bt btVar = ((AppDownloadData) obj).z;
            Object arrayList3 = linkedHashMap.get(btVar);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(btVar, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        ys ysVar = ys.a;
        List list = (List) linkedHashMap.get(ysVar);
        if (list != null && (listJ03 = kotlin.collections.a.J0(list, new qt1(this, 1))) != null) {
            arrayList.addAll(listJ03);
        }
        ExtensionPointDto extensionData = downloadAppStateData.getExtensionData();
        if (extensionData != null) {
            List list2 = (List) linkedHashMap.get(ysVar);
            this.O.e(Integer.valueOf(getExtAnalyticsPosition(list2 != null ? list2.size() : 0)));
            arrayList.addAll(addRecommendationData(extensionData));
        }
        List list3 = (List) linkedHashMap.get(at.a);
        if (list3 != null && (listJ02 = kotlin.collections.a.J0(list3, new yg2(17))) != null) {
            arrayList.addAll(listJ02);
        }
        List list4 = (List) linkedHashMap.get(xs.a);
        if (list4 != null) {
            List listJ04 = kotlin.collections.a.J0(list4, new rt1(0, new qt1(this, 0)));
            if (listJ04 != null) {
                arrayList.addAll(listJ04);
            }
        }
        List list5 = (List) linkedHashMap.get(zs.a);
        if (list5 != null && (listJ0 = kotlin.collections.a.J0(list5, new yg2(18))) != null) {
            arrayList.addAll(listJ0);
        }
        ArrayList arrayList4 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RecyclerItem recyclerItem = new RecyclerItem((MyketRecyclerData) it.next());
            this.F.add(recyclerItem);
            arrayList4.add(recyclerItem);
        }
        return arrayList4;
    }

    private final int getExtAnalyticsPosition(int i) {
        if (i == 0) {
            return 0;
        }
        if (1 <= i && i < 4) {
            return 3;
        }
        if (4 > i || i >= 7) {
            return (7 > i || i >= 10) ? 10 : 9;
        }
        return 6;
    }

    private final bz6 getExtHeaderApps(String str, String str2, xe2 xe2Var) {
        return new bz6(e.b(gu9.x(xe2Var, new ot1(str, str2, 0)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtHeaderApps$lambda$0(String str, String str2, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        ArrayList arrayList = new ArrayList();
        String title = homeExtensionAppsDto.getTitle();
        if (title != null && !f88.n0(title) && !homeExtensionAppsDto.getApps().isEmpty()) {
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new RecyclerItem(new ExtHeaderData(str, str2, homeExtensionAppsDto.getTitle(), homeExtensionAppsDto.getAdInfoDto(), false, null, false)));
        }
        return arrayList;
    }

    private final bz6 getExtensionApps(ExtensionPointDto extensionPointDto, xe2 xe2Var) {
        pv6 pv6VarB = this.N;
        if (pv6VarB == null) {
            pv6VarB = e.b(gu9.x(xe2Var, new m(this, extensionPointDto, 14)), y97.G(this));
            this.N = pv6VarB;
        }
        return new bz6(pv6VarB, null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getExtensionApps$lambda$0(DownloadViewModel downloadViewModel, ExtensionPointDto extensionPointDto, HomeExtensionAppsDto homeExtensionAppsDto) {
        js3.p(homeExtensionAppsDto, "it");
        List<ApplicationDTO> apps = homeExtensionAppsDto.getApps();
        ArrayList arrayList = new ArrayList(wu0.V(apps, 10));
        for (ApplicationDTO applicationDTO : apps) {
            String title = applicationDTO.getTitle();
            js3.o(title, "getTitle(...)");
            yl5 yl5Var = downloadViewModel.G;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title, false, yl5Var.a(packageName), downloadViewModel.J.b, extensionPointDto.isDigested(), 64, 0)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDownloadInfoObserver() {
        bt2.G(y97.G(this), null, null, new C01801(null), 3);
        bt2.G(y97.G(this), null, null, new C01812(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPauseAllActiveDownloadAction(RecentDownloadAction.PauseAllActiveDownload pauseAllActiveDownload) {
        this.I.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRemoveAllAppsAction(ir.mservices.market.download.app.RecentDownloadAction.RemoveAllApps r10, defpackage.g51<? super defpackage.tx8> r11) {
        /*
            r9 = this;
            boolean r10 = r11 instanceof ir.mservices.market.download.app.DownloadViewModel.C01821
            if (r10 == 0) goto L13
            r10 = r11
            ir.mservices.market.download.app.DownloadViewModel$onRemoveAllAppsAction$1 r10 = (ir.mservices.market.download.app.DownloadViewModel.C01821) r10
            int r0 = r10.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.c = r0
            goto L18
        L13:
            ir.mservices.market.download.app.DownloadViewModel$onRemoveAllAppsAction$1 r10 = new ir.mservices.market.download.app.DownloadViewModel$onRemoveAllAppsAction$1
            r10.<init>(r11)
        L18:
            java.lang.Object r11 = r10.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r10.c
            tx8 r2 = defpackage.tx8.a
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            kotlin.b.b(r11)
            goto L95
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            kotlin.b.b(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r1 = r9.L
            java.util.Iterator r4 = r1.iterator()
        L3f:
            boolean r5 = r4.hasNext()
            java.lang.String r6 = "null cannot be cast to non-null type ir.mservices.market.download.app.recycler.AppDownloadData"
            ps1 r7 = r9.I
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()
            r8 = r5
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r8 = (ir.mservices.market.common.ui.recycler.MyketRecyclerData) r8
            defpackage.js3.n(r8, r6)
            ir.mservices.market.download.app.recycler.AppDownloadData r8 = (ir.mservices.market.download.app.recycler.AppDownloadData) r8
            java.lang.String r6 = r8.m
            r8 = 0
            ir.mservices.market.download.common.data.AppDownloadInfo r6 = r7.i(r6, r8)
            if (r6 == 0) goto L67
            int r6 = r6.getStatus()
            r7 = 100
            if (r6 != r7) goto L67
            goto L3f
        L67:
            r11.add(r5)
            goto L3f
        L6b:
            java.util.Iterator r11 = r11.iterator()
        L6f:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r11.next()
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r4 = (ir.mservices.market.common.ui.recycler.MyketRecyclerData) r4
            defpackage.js3.n(r4, r6)
            r5 = r4
            ir.mservices.market.download.app.recycler.AppDownloadData r5 = (ir.mservices.market.download.app.recycler.AppDownloadData) r5
            java.lang.String r5 = r5.m
            r7.v(r5)
            r1.remove(r4)
            goto L6f
        L8a:
            r10.c = r3
            kotlinx.coroutines.flow.i r11 = r9.S
            java.lang.Object r10 = r11.emit(r2, r10)
            if (r10 != r0) goto L95
            return r0
        L95:
            r9.s()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.app.DownloadViewModel.onRemoveAllAppsAction(ir.mservices.market.download.app.RecentDownloadAction$RemoveAllApps, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRemoveAllMultiSelectedItemsAction(ir.mservices.market.download.app.RecentDownloadAction.RemoveAllMultiSelectedItems r11, defpackage.g51<? super defpackage.tx8> r12) {
        /*
            r10 = this;
            boolean r11 = r12 instanceof ir.mservices.market.download.app.DownloadViewModel.C01831
            if (r11 == 0) goto L13
            r11 = r12
            ir.mservices.market.download.app.DownloadViewModel$onRemoveAllMultiSelectedItemsAction$1 r11 = (ir.mservices.market.download.app.DownloadViewModel.C01831) r11
            int r0 = r11.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r11.c = r0
            goto L18
        L13:
            ir.mservices.market.download.app.DownloadViewModel$onRemoveAllMultiSelectedItemsAction$1 r11 = new ir.mservices.market.download.app.DownloadViewModel$onRemoveAllMultiSelectedItemsAction$1
            r11.<init>(r12)
        L18:
            java.lang.Object r12 = r11.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r11.c
            tx8 r2 = defpackage.tx8.a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            kotlin.b.b(r12)
            goto Lc2
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            kotlin.b.b(r12)
            java.util.ArrayList r12 = r10.L
            java.util.Iterator r1 = r12.iterator()
        L3b:
            boolean r4 = r1.hasNext()
            java.lang.String r5 = "null cannot be cast to non-null type ir.mservices.market.download.app.recycler.AppDownloadData"
            ps1 r6 = r10.I
            if (r4 == 0) goto L65
            java.lang.Object r4 = r1.next()
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r4 = (ir.mservices.market.common.ui.recycler.MyketRecyclerData) r4
            defpackage.js3.n(r4, r5)
            ir.mservices.market.download.app.recycler.AppDownloadData r4 = (ir.mservices.market.download.app.recycler.AppDownloadData) r4
            java.lang.String r5 = r4.m
            r7 = 0
            ir.mservices.market.download.common.data.AppDownloadInfo r5 = r6.i(r5, r7)
            if (r5 == 0) goto L3b
            int r5 = r5.getStatus()
            r6 = 100
            if (r5 != r6) goto L3b
            r5 = 0
            r4.f = r5
            goto L3b
        L65:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r12.iterator()
        L6e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L99
            java.lang.Object r7 = r4.next()
            r8 = r7
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r8 = (ir.mservices.market.common.ui.recycler.MyketRecyclerData) r8
            boolean r9 = r8 instanceof ir.mservices.market.download.app.recycler.AppDownloadData
            if (r9 == 0) goto L6e
            ir.mservices.market.download.app.recycler.AppDownloadData r8 = (ir.mservices.market.download.app.recycler.AppDownloadData) r8
            boolean r9 = r8.f
            if (r9 == 0) goto L6e
            rv6 r8 = r8.e
            v48 r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6e
            r1.add(r7)
            goto L6e
        L99:
            r12.removeAll(r1)
            java.util.Iterator r12 = r1.iterator()
        La0:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r12.next()
            ir.mservices.market.common.ui.recycler.MyketRecyclerData r1 = (ir.mservices.market.common.ui.recycler.MyketRecyclerData) r1
            defpackage.js3.n(r1, r5)
            ir.mservices.market.download.app.recycler.AppDownloadData r1 = (ir.mservices.market.download.app.recycler.AppDownloadData) r1
            java.lang.String r1 = r1.m
            r6.v(r1)
            goto La0
        Lb7:
            r11.c = r3
            kotlinx.coroutines.flow.i r12 = r10.S
            java.lang.Object r11 = r12.emit(r2, r11)
            if (r11 != r0) goto Lc2
            return r0
        Lc2:
            r10.s()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.app.DownloadViewModel.onRemoveAllMultiSelectedItemsAction(ir.mservices.market.download.app.RecentDownloadAction$RemoveAllMultiSelectedItems, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowMoreItemMenuAction(RecentDownloadAction.ShowMoreItemMenu showMoreItemMenu) {
        l lVar;
        Object value;
        do {
            lVar = this.Q;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(showMoreItemMenu.getShow())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshRecyclerItems() {
        this.F.clear();
        p(new C01841(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem != null && recyclerItem2 != null) {
            MyketRecyclerData myketRecyclerData = recyclerItem2.c;
            MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
            if (myketRecyclerData2 instanceof AppDownloadData) {
                if (!(myketRecyclerData instanceof AppDownloadData) && !(myketRecyclerData instanceof ExtHeaderRowData)) {
                    return null;
                }
                DividerData dividerData = new DividerData();
                dividerData.d = pq6.space_s;
                dividerData.b = false;
                return new RecyclerItem(dividerData);
            }
            if ((myketRecyclerData2 instanceof HomeAppsRowData) && (myketRecyclerData instanceof AppDownloadData)) {
                DividerData dividerData2 = new DividerData();
                dividerData2.d = pq6.space_s;
                dividerData2.b = false;
                return new RecyclerItem(dividerData2);
            }
        }
        return null;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new DownloadViewModel$doRequest$1(this, null), 3);
    }
}
