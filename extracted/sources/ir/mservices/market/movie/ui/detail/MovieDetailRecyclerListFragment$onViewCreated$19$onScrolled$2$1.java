package ir.mservices.market.movie.ui.detail;

import com.google.android.material.tabs.TabLayout;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zl;
import ir.mservices.market.movie.ui.detail.recycler.e;
import ir.mservices.market.views.MovieTabView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$2$1", f = "MovieDetailRecyclerListFragment.kt", l = {1195}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$2$1(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$2$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$19$onScrolled$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.a = 1;
            if (kotlinx.coroutines.a.e(50L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
        e eVar = movieDetailRecyclerListFragment.B1;
        if (eVar == null) {
            js3.V("movieTabViewHolder");
            throw null;
        }
        int tabCount = eVar.x().z.getTabCount() - 1;
        e eVar2 = movieDetailRecyclerListFragment.B1;
        if (eVar2 == null) {
            js3.V("movieTabViewHolder");
            throw null;
        }
        MovieTabView movieTabView = eVar2.x().z;
        eVar2.y = true;
        com.google.android.material.tabs.b bVarJ = movieTabView.j(tabCount);
        if (bVarJ != null) {
            TabLayout tabLayout = bVarJ.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.n(bVarJ, true);
        }
        zl zlVar = new zl(tabCount, 6, eVar2);
        eVar2.z = zlVar;
        movieTabView.post(zlVar);
        return tx8.a;
    }
}
