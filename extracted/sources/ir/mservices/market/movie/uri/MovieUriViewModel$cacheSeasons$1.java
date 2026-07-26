package ir.mservices.market.movie.uri;

import defpackage.b32;
import defpackage.br9;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.m88;
import defpackage.ml9;
import defpackage.no6;
import defpackage.pk7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vk7;
import defpackage.wu0;
import defpackage.z0;
import ir.mservices.market.movie.data.webapi.EpisodeDto;
import ir.mservices.market.movie.data.webapi.PlayerMovieDto;
import ir.mservices.market.movie.data.webapi.SeasonDto;
import ir.myket.movie.common.domain.models.EpisodeBannerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.uri.MovieUriViewModel$cacheSeasons$1", f = "MovieUriViewModel.kt", l = {162}, m = "invokeSuspend", v = 1)
final class MovieUriViewModel$cacheSeasons$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MovieUriViewModel b;
    public final /* synthetic */ PlayerMovieDto c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieUriViewModel$cacheSeasons$1(MovieUriViewModel movieUriViewModel, PlayerMovieDto playerMovieDto, List list, g51 g51Var) {
        super(2, g51Var);
        this.b = movieUriViewModel;
        this.c = playerMovieDto;
        this.d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieUriViewModel$cacheSeasons$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieUriViewModel$cacheSeasons$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        EpisodeBannerType episodeBannerType;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8Var;
        }
        b.b(obj);
        no6 no6Var = (no6) this.b.v.getValue();
        PlayerMovieDto playerMovieDto = this.c;
        String id = playerMovieDto.getId();
        List list = this.d;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                br9.P();
                throw null;
            }
            SeasonDto seasonDto = (SeasonDto) next2;
            String posterUrl = playerMovieDto.getPosterUrl();
            boolean z2 = i3 == br9.y(list) ? z : false;
            js3.p(seasonDto, "<this>");
            js3.p(posterUrl, "defaultBannerUrl");
            String id2 = seasonDto.getId();
            String title = seasonDto.getTitle();
            PlayerMovieDto playerMovieDto2 = playerMovieDto;
            List<EpisodeDto> episodes = seasonDto.getEpisodes();
            List list2 = list;
            Iterator it3 = it2;
            ArrayList arrayList2 = new ArrayList(wu0.V(episodes, i2));
            Iterator it4 = episodes.iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                Object next3 = it4.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    br9.P();
                    throw null;
                }
                EpisodeDto episodeDto = (EpisodeDto) next3;
                boolean z3 = z2 && i5 == br9.y(seasonDto.getEpisodes());
                String id3 = episodeDto.getId();
                String playId = episodeDto.getPlayId();
                String title2 = episodeDto.getTitle();
                String buttonText = episodeDto.getButtonText();
                if (buttonText == null) {
                    buttonText = "";
                }
                String str = buttonText;
                String bannerUrl = episodeDto.getBannerUrl();
                String bannerType = episodeDto.getBannerType();
                EpisodeBannerType episodeBannerType2 = EpisodeBannerType.b;
                Iterator it5 = ((z0) EpisodeBannerType.d).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        it = it4;
                        episodeBannerType = episodeBannerType2;
                        next = null;
                        break;
                    }
                    next = it5.next();
                    it = it4;
                    episodeBannerType = episodeBannerType2;
                    if (m88.T(((Enum) next).name(), bannerType, true)) {
                        break;
                    }
                    episodeBannerType2 = episodeBannerType;
                    it4 = it;
                }
                Enum r23 = (Enum) next;
                arrayList2.add(new b32(id3, playId, title2, str, bannerUrl, posterUrl, (EpisodeBannerType) (r23 == null ? episodeBannerType : r23), episodeDto.getSecondaryTitle(), episodeDto.getAnalyticsName(), z3));
                i5 = i6;
                it4 = it;
            }
            arrayList.add(new pk7(id2, title, ml9.z(arrayList2), seasonDto.getAnalyticsName()));
            i3 = i4;
            playerMovieDto = playerMovieDto2;
            list = list2;
            it2 = it3;
            z = true;
            i2 = 10;
        }
        js3.p(id, "movieId");
        this.a = 1;
        ((vk7) no6Var.g).a.a.put(id, arrayList);
        return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
    }
}
