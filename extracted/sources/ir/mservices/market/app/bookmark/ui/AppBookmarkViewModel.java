package ir.mservices.market.app.bookmark.ui;

import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.pv6;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.y97;
import defpackage.yl5;
import ir.mservices.market.app.bookmark.data.BookmarkApplicationListDto;
import ir.mservices.market.app.bookmark.data.BookmarkDeleteRequestDto;
import ir.mservices.market.app.bookmark.ui.recycler.BookmarkApplicationData;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public final class AppBookmarkViewModel extends BaseMultiSelectViewModel {
    public final c5 G;
    public final a H;
    public final yl5 I;
    public final ql4 J;

    /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$1", f = "AppBookmarkViewModel.kt", l = {53}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$1$1", f = "AppBookmarkViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00151 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ AppBookmarkViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00151(AppBookmarkViewModel appBookmarkViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = appBookmarkViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00151 c00151 = new C00151(this.b, g51Var);
                c00151.a = obj;
                return c00151;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00151 c00151 = (C00151) create((List) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00151.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                AppBookmarkViewModel appBookmarkViewModel = this.b;
                appBookmarkViewModel.m(true);
                appBookmarkViewModel.deleteSelectedItems(list);
                return tx8.a;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppBookmarkViewModel.this.new AnonymousClass1(g51Var);
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
                AppBookmarkViewModel appBookmarkViewModel = AppBookmarkViewModel.this;
                pv6 pv6Var = appBookmarkViewModel.y;
                C00151 c00151 = new C00151(appBookmarkViewModel, null);
                this.a = 1;
                if (d.f(pv6Var, c00151, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$deleteSelectedItems$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel$deleteSelectedItems$1", f = "AppBookmarkViewModel.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class C01551 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ List b;
        public final /* synthetic */ AppBookmarkViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01551(List list, AppBookmarkViewModel appBookmarkViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = list;
            this.c = appBookmarkViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new C01551(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01551) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            AppBookmarkViewModel appBookmarkViewModel = this.c;
            if (i == 0) {
                b.b(obj);
                List list = this.b;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RecyclerItem) it.next()).c);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof BookmarkApplicationData) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((BookmarkApplicationData) it2.next()).j.getPackageName());
                }
                ql4 ql4Var = appBookmarkViewModel.J;
                String strA = appBookmarkViewModel.G.a();
                js3.o(strA, "getAccountId(...)");
                BookmarkDeleteRequestDto bookmarkDeleteRequestDto = new BookmarkDeleteRequestDto(strA, arrayList3);
                this.a = 1;
                obj = ql4Var.z(appBookmarkViewModel, bookmarkDeleteRequestDto, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            if (((n99) obj) instanceof l99) {
                appBookmarkViewModel.w();
            } else {
                appBookmarkViewModel.s();
            }
            appBookmarkViewModel.m(false);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBookmarkViewModel(c5 c5Var, a aVar, yl5 yl5Var, ql4 ql4Var) {
        super(false);
        js3.p(c5Var, "accountManager");
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "neneDownloadRepository");
        this.G = c5Var;
        this.H = aVar;
        this.I = yl5Var;
        this.J = ql4Var;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteSelectedItems(List<RecyclerItem> list) {
        bt2.G(y97.G(this), null, null, new C01551(list, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> generateBookmarkApplicationData(BookmarkApplicationListDto bookmarkApplicationListDto) {
        List<DownloadSummeryApplicationDto> applications = bookmarkApplicationListDto.getApplications();
        ArrayList arrayList = new ArrayList(wu0.V(applications, 10));
        for (DownloadSummeryApplicationDto downloadSummeryApplicationDto : applications) {
            String packageName = downloadSummeryApplicationDto.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            xe2 xe2VarA = this.I.a(packageName);
            pv6 pv6Var = this.H.b;
            RecyclerItem recyclerItem = new RecyclerItem(new BookmarkApplicationData(this.E, (vb7) xe2VarA, pv6Var, downloadSummeryApplicationDto));
            this.F.add(recyclerItem);
            arrayList.add(recyclerItem);
        }
        return arrayList;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new AppBookmarkViewModel$doRequest$1(this, null));
    }
}
