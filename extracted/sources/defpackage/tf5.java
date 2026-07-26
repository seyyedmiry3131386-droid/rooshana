package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import ir.mservices.market.common.base.BaseContentFragment;
import ir.mservices.market.reels.ui.recycler.ReelData;
import ir.mservices.market.social.profile.list.data.LikeSocialListDto;
import ir.mservices.market.social.profile.list.recycler.ProfileListButtonsData;
import ir.mservices.market.social.profile.list.recycler.b;
import ir.mservices.market.version2.fragments.dialog.TrackingAppPaymentBottomDialogFragment;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tf5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tf5(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String likeCount;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                MyketTextView myketTextView = (MyketTextView) obj3;
                bp2 bp2Var = (bp2) obj2;
                bp2 bp2Var2 = (bp2) obj;
                int i2 = MyketTextView.k;
                sf5 sf5Var = myketTextView.h;
                if (sf5Var != null) {
                    myketTextView.removeCallbacks(sf5Var);
                }
                myketTextView.h = null;
                myketTextView.setMaxLines(Integer.MAX_VALUE);
                bp2Var.invoke();
                if (bp2Var2 != null) {
                    bp2Var2.invoke();
                    return;
                }
                return;
            case 1:
                js3.m(view);
                ((og5) obj3).m(view, (qg5) obj2, obj);
                return;
            case 2:
                BaseContentFragment baseContentFragment = (BaseContentFragment) obj3;
                MenuItem menuItem = (MenuItem) obj2;
                PopupWindow popupWindow = (PopupWindow) obj;
                BaseContentFragment baseContentFragment2 = baseContentFragment.H() != null ? baseContentFragment : null;
                if (baseContentFragment2 == null || baseContentFragment2.g1(menuItem)) {
                    return;
                }
                popupWindow.dismiss();
                return;
            case 3:
                b bVar = (b) obj3;
                ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj2;
                x13 x13Var = (x13) obj;
                LikeSocialListDto likeSocialListDto = profileListButtonsData.g;
                if (likeSocialListDto == null || (likeCount = likeSocialListDto.getLikeCount()) == null) {
                    likeCount = "0";
                }
                LikeSocialListDto likeSocialListDto2 = profileListButtonsData.g;
                boolean z = likeSocialListDto2 != null && likeSocialListDto2.isLiked();
                x13 x13Var2 = bVar.A;
                if (x13Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                LottieAnimationView lottieAnimationView = x13Var2.x;
                lottieAnimationView.setEnabled(false);
                if (z) {
                    bVar.x(false);
                } else {
                    lottieAnimationView.setAnimation(qs6.small_heart_like);
                    lottieAnimationView.f();
                }
                Integer numA0 = m88.a0(likeCount);
                if (numA0 != null) {
                    int iIntValue = numA0.intValue();
                    bVar.y(String.valueOf(z ? Math.max(iIntValue - 1, 0) : iIntValue + 1));
                }
                LikeSocialListDto likeSocialListDto3 = profileListButtonsData.g;
                og5 og5Var = (likeSocialListDto3 == null || !likeSocialListDto3.isLiked()) ? bVar.y : bVar.z;
                LottieAnimationView lottieAnimationView2 = x13Var.x;
                js3.o(lottieAnimationView2, "likeAnim");
                og5Var.m(lottieAnimationView2, bVar, profileListButtonsData);
                return;
            case 4:
                ir.mservices.market.reels.ui.recycler.b bVar2 = (ir.mservices.market.reels.ui.recycler.b) obj3;
                ImageView imageView = (ImageView) obj2;
                ReelData reelData = (ReelData) obj;
                q07 q07Var = bVar2.M;
                if (q07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                q07Var.K.animate();
                gb6 gb6VarJ = bVar2.J();
                boolean zH = gb6VarJ != null ? gb6VarJ.H() : false;
                ImageView imageViewI = bVar2.I();
                AnimatorSet animatorSet = bVar2.X;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ObjectAnimator duration = ObjectAnimator.ofFloat(imageViewI, "scaleX", 0.8f).setDuration(100L);
                js3.o(duration, "setDuration(...)");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageViewI, "scaleY", 0.8f).setDuration(100L);
                js3.o(duration2, "setDuration(...)");
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(imageViewI, "scaleX", 1.0f).setDuration(100L);
                js3.o(duration3, "setDuration(...)");
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(imageViewI, "scaleY", 1.0f).setDuration(100L);
                js3.o(duration4, "setDuration(...)");
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(duration).with(duration2);
                animatorSet2.play(duration3).with(duration4).after(duration);
                animatorSet2.start();
                bVar2.X = animatorSet2;
                if (zH) {
                    imageView.setImageResource(yq6.ic_play);
                    bVar2.y();
                    og5 og5Var2 = bVar2.D;
                    View view2 = bVar2.a;
                    js3.o(view2, "itemView");
                    reelData.h = bVar2.H(reelData.b.getReelId(), reelData.b.getParams(), false);
                    og5Var2.m(view2, bVar2, reelData);
                } else {
                    imageView.setImageResource(yq6.ic_pause);
                    bVar2.z();
                }
                q07 q07Var2 = bVar2.M;
                if (q07Var2 != null) {
                    q07Var2.y.m();
                    return;
                } else {
                    js3.V("binding");
                    throw null;
                }
            default:
                TrackingAppPaymentBottomDialogFragment trackingAppPaymentBottomDialogFragment = (TrackingAppPaymentBottomDialogFragment) obj2;
                String str = (String) obj;
                Context context = ((MyketTextView) obj3).getContext();
                if (context != null) {
                    Object systemService = context.getSystemService("clipboard");
                    js3.n(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Myket user link", str));
                }
                FragmentActivity fragmentActivityF = trackingAppPaymentBottomDialogFragment.F();
                hh2.H(new hh2(fragmentActivityF, fragmentActivityF != null ? fragmentActivityF.getString(rs6.tracking_id_copied_clipboard) : null));
                return;
        }
    }
}
