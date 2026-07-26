package ir.mservices.market.movie.download.core;

import android.content.Context;
import android.content.res.Resources;
import defpackage.b56;
import defpackage.bj2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.c56;
import defpackage.d56;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.h60;
import defpackage.hk3;
import defpackage.hm0;
import defpackage.j25;
import defpackage.js3;
import defpackage.k68;
import defpackage.n25;
import defpackage.p25;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.q25;
import defpackage.qp2;
import defpackage.r25;
import defpackage.s25;
import defpackage.ss1;
import defpackage.t25;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u25;
import defpackage.v36;
import defpackage.vy2;
import defpackage.wq2;
import defpackage.xl5;
import defpackage.y97;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.movie.download.core.DownloadAction;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadViewModel extends ir.mservices.market.viewModel.a {
    public final i A;
    public final pv6 B;
    public final i C;
    public final pv6 D;
    public final i E;
    public final pv6 F;
    public MovieDownloadMetaData G;
    public final c24 H;
    public final n25 v;
    public final k68 w;
    public final b56 x;
    public final d56 y;
    public final Context z;

    /* JADX INFO: renamed from: ir.mservices.market.movie.download.core.MovieDownloadViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.download.core.MovieDownloadViewModel$1", f = "MovieDownloadViewModel.kt", l = {182}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDownloadViewModel.this.new AnonymousClass1(g51Var);
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
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            MovieDownloadViewModel movieDownloadViewModel = MovieDownloadViewModel.this;
            pv6 pv6Var = movieDownloadViewModel.u;
            bj2 bj2Var = new bj2(12, movieDownloadViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 12), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.download.core.MovieDownloadViewModel$handleFinishAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.download.core.MovieDownloadViewModel$handleFinishAction$1", f = "MovieDownloadViewModel.kt", l = {134}, m = "invokeSuspend", v = 1)
    public static final class C01871 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ MovieDownloadMetaData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01871(MovieDownloadMetaData movieDownloadMetaData, g51 g51Var) {
            super(2, g51Var);
            this.c = movieDownloadMetaData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDownloadViewModel.this.new C01871(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01871) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = MovieDownloadViewModel.this.E;
                String str = this.c.i;
                this.a = 1;
                if (iVar.emit(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.download.core.MovieDownloadViewModel$startDownload$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.download.core.MovieDownloadViewModel$startDownload$1", f = "MovieDownloadViewModel.kt", l = {100, 111}, m = "invokeSuspend", v = 1)
    public static final class C01881 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ MovieDownloadMetaData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01881(MovieDownloadMetaData movieDownloadMetaData, g51 g51Var) {
            super(2, g51Var);
            this.c = movieDownloadMetaData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieDownloadViewModel.this.new C01881(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01881) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[RETURN] */
        /* JADX WARN: Type inference failed for: r5v3, types: [ir.mservices.market.movie.download.core.b] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r9.a
                tx8 r2 = defpackage.tx8.a
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                kotlin.b.b(r10)
                return r2
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                kotlin.b.b(r10)
                return r2
            L1e:
                kotlin.b.b(r10)
                ir.mservices.market.movie.download.core.model.MovieDownloadMetaData r10 = r9.c
                long r5 = r10.h
                ir.mservices.market.movie.download.core.MovieDownloadViewModel r1 = ir.mservices.market.movie.download.core.MovieDownloadViewModel.this
                boolean r5 = ir.mservices.market.movie.download.core.MovieDownloadViewModel.u(r1, r5)
                if (r5 != 0) goto L38
                kotlinx.coroutines.flow.i r1 = r1.C
                r9.a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L84
                goto L83
            L38:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 28
                if (r5 > r6) goto L6e
                d56 r5 = r1.y
                android.content.Context r6 = r1.z
                ir.mservices.market.data.permission.Permission r7 = ir.mservices.market.movie.download.core.MovieDownloadViewModel.t(r1)
                java.lang.String r7 = r7.b
                java.lang.String r8 = "getManifestId(...)"
                defpackage.js3.o(r7, r8)
                r5.getClass()
                boolean r5 = defpackage.d56.c(r6, r7)
                if (r5 != 0) goto L6e
                t32 r0 = defpackage.t32.b()
                h60 r3 = new h60
                ir.mservices.market.data.permission.Permission r5 = ir.mservices.market.movie.download.core.MovieDownloadViewModel.t(r1)
                ir.mservices.market.data.permission.Permission[] r4 = new ir.mservices.market.data.permission.Permission[r4]
                r6 = 0
                r4[r6] = r5
                r3.<init>(r4)
                r0.j(r3)
                r1.G = r10
                return r2
            L6e:
                n25 r4 = r1.v
                ir.mservices.market.movie.download.core.b r5 = new ir.mservices.market.movie.download.core.b
                r5.<init>()
                r9.a = r3
                ir.mservices.market.movie.download.core.source.a r3 = r4.a
                java.lang.Object r10 = r3.d(r10, r1, r5, r9)
                if (r10 != r0) goto L80
                goto L81
            L80:
                r10 = r2
            L81:
                if (r10 != r0) goto L84
            L83:
                return r0
            L84:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.download.core.MovieDownloadViewModel.C01881.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDownloadViewModel(n25 n25Var, k68 k68Var, b56 b56Var, d56 d56Var, Context context) {
        super(false);
        js3.p(n25Var, "movieDownloadRepository");
        js3.p(k68Var, "storageUtils");
        js3.p(b56Var, "permissionFactory");
        js3.p(d56Var, "permissionHelper");
        this.v = n25Var;
        this.w = k68Var;
        this.x = b56Var;
        this.y = d56Var;
        this.z = context;
        i iVarE = vy2.e(0, 7, null);
        this.A = iVarE;
        this.B = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.C = iVarE2;
        this.D = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.E = iVarE3;
        this.F = new pv6(iVarE3);
        this.H = kotlin.a.a(new hk3(18, this));
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Permission getWriteStoragePermission() {
        return (Permission) this.H.getValue();
    }

    private final void handleFinishAction(MovieDownloadMetaData movieDownloadMetaData) {
        boolean zIsMovieFileExistInInternalStorage = isMovieFileExistInInternalStorage(movieDownloadMetaData);
        n25 n25Var = this.v;
        if (zIsMovieFileExistInInternalStorage) {
            try {
                n25Var.b(movieDownloadMetaData);
                handleFinishAction(movieDownloadMetaData);
                return;
            } catch (IllegalStateException unused) {
                t32.b().j(new h60(new Permission[]{getWriteStoragePermission()}));
                return;
            }
        }
        if (isMovieFileExistsInDownload(movieDownloadMetaData)) {
            bt2.G(y97.G(this), null, null, new C01871(movieDownloadMetaData, null), 3);
            return;
        }
        n25Var.getClass();
        js3.p(movieDownloadMetaData, "movieDownloadMetaData");
        ir.mservices.market.movie.download.core.source.a aVar = n25Var.a;
        aVar.getClass();
        xl5 xl5Var = aVar.a;
        j25 j25VarA = aVar.a(xl5Var.b((movieDownloadMetaData.a + "/" + movieDownloadMetaData.f) + "/media"));
        if (j25VarA != null) {
            j25VarA.a(new ss1(new hm0(xl5Var, 1)));
        }
        startDownload(movieDownloadMetaData);
    }

    private final boolean isMovieFileExistInInternalStorage(MovieDownloadMetaData movieDownloadMetaData) {
        boolean zExists;
        String str = movieDownloadMetaData.i;
        k68 k68Var = this.w;
        String strH = k68Var.h(str);
        boolean zExists2 = strH != null ? new File(strH).exists() : false;
        if (f88.n0(movieDownloadMetaData.j)) {
            zExists = true;
        } else {
            String strH2 = k68Var.h(movieDownloadMetaData.j);
            zExists = strH2 != null ? new File(strH2).exists() : false;
        }
        return zExists2 && zExists;
    }

    private final boolean isMovieFileExistsInDownload(MovieDownloadMetaData movieDownloadMetaData) {
        String str = movieDownloadMetaData.i;
        this.w.getClass();
        if (k68.q(str)) {
            return !f88.n0(movieDownloadMetaData.j) ? k68.q(movieDownloadMetaData.j) : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSpaceAvailable(long j) {
        return wq2.D() > j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToggleDownloadAction(DownloadAction.ToggleDownloadAction toggleDownloadAction) {
        u25 movieDownloadState = toggleDownloadAction.getMovieDownloadState();
        if (!(movieDownloadState instanceof q25) && !(movieDownloadState instanceof t25)) {
            if ((movieDownloadState instanceof r25) || (movieDownloadState instanceof p25)) {
                startDownload(toggleDownloadAction.getMovieDownloadMetaData());
                return;
            } else {
                if (!(movieDownloadState instanceof s25)) {
                    throw new NoWhenBranchMatchedException();
                }
                handleFinishAction(((s25) toggleDownloadAction.getMovieDownloadState()).a);
                return;
            }
        }
        MovieDownloadMetaData movieDownloadMetaData = toggleDownloadAction.getMovieDownloadMetaData();
        n25 n25Var = this.v;
        n25Var.getClass();
        js3.p(movieDownloadMetaData, "movieDownloadMetaData");
        ir.mservices.market.movie.download.core.source.a aVar = n25Var.a;
        aVar.getClass();
        xl5 xl5Var = aVar.a;
        j25 j25VarA = aVar.a(xl5Var.b((movieDownloadMetaData.a + "/" + movieDownloadMetaData.f) + "/media"));
        if (j25VarA != null) {
            j25VarA.a(new ss1(new v36(xl5Var)));
        }
    }

    private final void startDownload(MovieDownloadMetaData movieDownloadMetaData) {
        bt2.G(y97.G(this), null, null, new C01881(movieDownloadMetaData, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Permission writeStoragePermission_delegate$lambda$0(MovieDownloadViewModel movieDownloadViewModel) {
        b56 b56Var = movieDownloadViewModel.x;
        Resources resources = movieDownloadViewModel.z.getResources();
        b56Var.getClass();
        return b56.a(resources, 2, PermissionReasonId.h, Quality.OPTIONAL);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    public final void onEvent(c56 c56Var) {
        MovieDownloadMetaData movieDownloadMetaData;
        js3.p(c56Var, "event");
        Permission[] permissionArr = c56Var.a;
        if (permissionArr != null) {
            for (Permission permission : permissionArr) {
                if (2 == permission.a && permission.d == PermissionResult.GRANTED && (movieDownloadMetaData = this.G) != null) {
                    startDownload(movieDownloadMetaData);
                    this.G = null;
                }
            }
        }
    }
}
