package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.c;
import ir.mservices.market.app.detail.subReviews.recycler.SubReviewData;
import ir.mservices.market.app.home.MainHomeFragment;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.a;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.search.BaseSearchFragment;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.movie.recycler.MovieDownloadData;
import ir.mservices.market.movie.analytics.MovieClickEventBuilder;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.movie.data.webapi.MovieFullDto;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityData;
import ir.mservices.market.movie.download.quality.recycler.b;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.views.MiniPlayerView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.MyketVideoView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w50(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String type;
        String playId;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppUpdateData appUpdateData = (AppUpdateData) obj2;
                a aVar = (a) obj;
                boolean z = !appUpdateData.m;
                appUpdateData.m = z;
                aVar.z(z, appUpdateData.l, true, ((Boolean) appUpdateData.h.getValue()).booleanValue());
                og5 og5Var = aVar.y;
                View view2 = aVar.a;
                js3.o(view2, "itemView");
                og5Var.m(view2, aVar, appUpdateData);
                break;
            case 1:
                BaseSearchFragment baseSearchFragment = (BaseSearchFragment) obj2;
                jy1 jy1Var = (jy1) obj;
                FragmentActivity fragmentActivityF = baseSearchFragment.F();
                String action = jy1Var.a.getAction();
                if (action != null) {
                    t61.w(action, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                }
                baseSearchFragment.Z1();
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("dynamic_button_" + jy1Var.a.getId());
                clickEventBuilder.a();
                break;
            case 2:
                b bVar = (b) obj2;
                bVar.A = true;
                og5 og5Var2 = bVar.w;
                js3.m(view);
                og5Var2.m(view, bVar, (DownloadQualityData) obj);
                break;
            case 3:
                l5 l5Var = (l5) obj;
                MyketTextView myketTextView = ((gl3) obj2).y;
                js3.m(myketTextView);
                l5Var.x(!(myketTextView.getVisibility() == 0));
                if (myketTextView.getVisibility() == 0) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(myketTextView.getMeasuredHeight(), 0);
                    valueAnimatorOfInt.setDuration(200L);
                    valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt.addUpdateListener(new yz3(3, myketTextView));
                    valueAnimatorOfInt.addListener(new rj(9, myketTextView));
                    valueAnimatorOfInt.start();
                    break;
                } else if (myketTextView.getVisibility() != 0) {
                    ViewParent parent = myketTextView.getParent();
                    js3.n(parent, "null cannot be cast to non-null type android.view.View");
                    myketTextView.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = myketTextView.getMeasuredHeight();
                    myketTextView.getLayoutParams().height = 1;
                    myketTextView.setVisibility(0);
                    myketTextView.requestLayout();
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(1, measuredHeight);
                    valueAnimatorOfInt2.setDuration(200L);
                    valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimatorOfInt2.addUpdateListener(new yz3(2, myketTextView));
                    valueAnimatorOfInt2.start();
                    break;
                }
                break;
            case 4:
                int i2 = MainHomeFragment.H1;
                pk5.g(((MainHomeFragment) obj2).J0, (NavIntentDirections) obj, -1);
                break;
            case 5:
                MiniPlayerView.v((MiniPlayerView) obj2, (Context) obj);
                break;
            case 6:
                MovieFullDto movieFullDto = (MovieFullDto) obj2;
                MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = (MovieDetailRecyclerListFragment) obj;
                int i3 = MovieDetailRecyclerListFragment.H1;
                MovieClickEventBuilder movieClickEventBuilder = new MovieClickEventBuilder();
                if (movieFullDto == null || (type = movieFullDto.getType()) == null) {
                    type = CommonDataKt.MOVIE_TYPE_MOVIE;
                }
                String str = "";
                movieClickEventBuilder.b("detail_play_" + type + ((movieFullDto != null ? movieFullDto.getSubscriptionInfo() : null) == null ? "" : "_full") + "_toolbar");
                movieClickEventBuilder.a();
                MovieClickEventBuilder movieClickEventBuilder2 = new MovieClickEventBuilder();
                movieClickEventBuilder2.b("detail_play");
                movieClickEventBuilder2.a();
                MovieDetailRecyclerListFragment.h2(movieFullDto != null ? movieFullDto.getPlayId() : null, movieFullDto != null ? movieFullDto.getButtonAction() : null, "detail_play_external_toolbar");
                if (movieFullDto != null && (playId = movieFullDto.getPlayId()) != null) {
                    str = playId;
                }
                movieDetailRecyclerListFragment.g2(str, movieFullDto != null ? movieFullDto.getButtonAction() : null);
                break;
            case 7:
                ir.mservices.market.download.movie.recycler.a aVar2 = (ir.mservices.market.download.movie.recycler.a) obj2;
                aVar2.D = true;
                og5 og5Var3 = aVar2.x;
                js3.m(view);
                og5Var3.m(view, aVar2, (MovieDownloadData) obj);
                break;
            case 8:
                d dVar = (d) obj2;
                MenuItem menuItem = (MenuItem) obj;
                BaseContentFragment baseContentFragment = dVar instanceof BaseContentFragment ? (BaseContentFragment) dVar : null;
                if (baseContentFragment != null) {
                    baseContentFragment.g1(menuItem);
                }
                break;
            case 9:
                MyketVideoView.d((MyketVideoView) obj2, (Context) obj);
                break;
            case 10:
                MyketTextView myketTextView2 = (MyketTextView) obj2;
                js3.m(myketTextView2);
                myketTextView2.setVisibility(8);
                gb6 gb6VarF = ((ir.mservices.market.reels.ui.recycler.a) obj).F();
                if (gb6VarF != null) {
                    gb6VarF.c();
                }
                break;
            case 11:
                MyketTextView myketTextView3 = (MyketTextView) obj2;
                js3.m(myketTextView3);
                myketTextView3.setVisibility(8);
                gb6 gb6VarJ = ((ir.mservices.market.reels.ui.recycler.b) obj).J();
                if (gb6VarJ != null) {
                    gb6VarJ.c();
                }
                break;
            case 12:
                int i4 = ReelsFragment.i1;
                MyketTextView myketTextView4 = ((km2) obj2).z;
                js3.o(myketTextView4, "retry");
                myketTextView4.setVisibility(8);
                v07 v07Var = ((ReelsFragment) obj).Z0;
                if (v07Var != null) {
                    v07Var.A();
                }
                break;
            case 13:
                lt5 lt5Var = ((c) obj2).w;
                ReviewDto reviewDto = ((ReviewData) obj).a;
                js3.m(view);
                ((by4) lt5Var).b(reviewDto);
                break;
            default:
                lt5 lt5Var2 = ((ir.mservices.market.app.detail.subReviews.recycler.b) obj2).w;
                ReviewDto reviewDto2 = ((SubReviewData) obj).a;
                js3.m(view);
                ((by4) lt5Var2).b(reviewDto2);
                break;
        }
    }
}
