package ir.mservices.market.social.level;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.g54;
import defpackage.gu9;
import defpackage.hh2;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.level.data.LevelInfoDto;
import ir.mservices.market.social.level.data.LevelPageDto;
import ir.mservices.market.social.level.data.XpDetailDto;
import ir.mservices.market.social.level.recycler.AchievementInfoData;
import ir.mservices.market.social.level.recycler.AchievementTitleData;
import ir.mservices.market.social.level.recycler.LevelDetailData;
import ir.mservices.market.social.level.recycler.LevelInfoData;
import ir.mservices.market.social.level.recycler.LevelNestedData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.level.LevelViewModel$doRequest$1", f = "LevelViewModel.kt", l = {39}, m = "invokeSuspend", v = 1)
final class LevelViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ LevelViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelViewModel$doRequest$1(LevelViewModel levelViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = levelViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LevelViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LevelViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        final LevelViewModel levelViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            final hh2 hh2Var = levelViewModel.w;
            final String str = levelViewModel.x.a;
            this.a = 1;
            hh2Var.getClass();
            obj = (xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.social.level.model.a
                @Override // defpackage.bp2
                public final Object invoke() {
                    return new ir.mservices.market.model.paging.b(new LevelRepositoryImpl$getLevelDetail$2$1(hh2Var, str, levelViewModel, null));
                }
            }).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new dp2() { // from class: ir.mservices.market.social.level.a
            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                LevelPageDto levelPageDto = (LevelPageDto) obj2;
                js3.p(levelPageDto, "levelPageDto");
                ListBuilder listBuilderS = br9.s();
                XpDetailDto xpDetail = levelPageDto.getLevelDetail().getXpDetail();
                LevelViewModel levelViewModel2 = levelViewModel;
                if (xpDetail != null) {
                    g54 g54Var = levelViewModel2.x;
                    listBuilderS.add(new RecyclerItem(new LevelInfoData(g54Var.b, g54Var.c, xpDetail)));
                }
                XpDetailDto xpDetail2 = levelPageDto.getLevelDetail().getXpDetail();
                if (xpDetail2 != null) {
                    listBuilderS.add(new RecyclerItem(new LevelDetailData(xpDetail2)));
                }
                ListBuilder listBuilderS2 = br9.s();
                String string = levelViewModel2.v.getString(rs6.score_earning_guide);
                js3.o(string, "getString(...)");
                listBuilderS2.add(new RecyclerItem(new AchievementTitleData(string)));
                List<LevelInfoDto> achievements = levelPageDto.getAchievements();
                ArrayList arrayList = new ArrayList(wu0.V(achievements, 10));
                Iterator<T> it = achievements.iterator();
                while (it.hasNext()) {
                    arrayList.add(new RecyclerItem(new AchievementInfoData((LevelInfoDto) it.next())));
                }
                listBuilderS2.addAll(arrayList);
                listBuilderS.add(new RecyclerItem(new LevelNestedData(new bz6(br9.q(listBuilderS2), (GeneralFilter) null, new LevelViewModel$setLevelList$1$3(2, levelViewModel2, LevelViewModel.class, "setNestedDivider", "setNestedDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), new LevelViewModel$setLevelList$1$4(1, levelViewModel2, LevelViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0))));
                return br9.q(listBuilderS);
            }
        }), y97.G(levelViewModel)), null, null, null, 14);
    }
}
