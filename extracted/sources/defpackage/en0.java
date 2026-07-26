package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationBarItemView;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        d50 d50Var;
        int height;
        int height2;
        int i9 = this.a;
        int i10 = 2;
        int i11 = 1;
        Object obj = this.b;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new b7(8, carouselLayoutManager));
                }
                break;
            case 1:
                int i12 = MovieSeasonsRecyclerListFragment.s1;
                ((MovieSeasonsRecyclerListFragment) obj).O1();
                break;
            case 2:
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) obj;
                View view2 = navigationBarItemView.r;
                ImageView imageView = navigationBarItemView.t;
                if (imageView.getVisibility() == 0 && (d50Var = navigationBarItemView.x0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    d50Var.setBounds(rect);
                    d50Var.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) navigationBarItemView.q.getLayoutParams();
                int i13 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i14 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                if (navigationBarItemView.y0 == 1 && navigationBarItemView.S == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (navigationBarItemView.S == -2 && view2.getMeasuredWidth() != i13) {
                        layoutParams2.width = Math.max(i13, Math.min(navigationBarItemView.Q, navigationBarItemView.getMeasuredWidth() - (navigationBarItemView.V * 2)));
                        i = 1;
                    }
                    if (view2.getMeasuredHeight() < i14) {
                        layoutParams2.height = i14;
                    } else {
                        i11 = i;
                    }
                    if (i11 != 0) {
                        view2.setLayoutParams(layoutParams2);
                    }
                    break;
                }
                break;
            case 3:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                int i15 = playerControlView.r;
                PopupWindow popupWindow = playerControlView.q;
                int i16 = i4 - i2;
                int i17 = i8 - i6;
                if ((i3 - i != i7 - i5 || i16 != i17) && popupWindow.isShowing()) {
                    playerControlView.v();
                    popupWindow.update(view, (playerControlView.getWidth() - popupWindow.getWidth()) - i15, (-popupWindow.getHeight()) - i15, -1, -1);
                }
                break;
            default:
                qd6 qd6Var = (qd6) obj;
                PlayerControlView playerControlView2 = qd6Var.a;
                int width = (playerControlView2.getWidth() - playerControlView2.getPaddingLeft()) - playerControlView2.getPaddingRight();
                int height3 = (playerControlView2.getHeight() - playerControlView2.getPaddingBottom()) - playerControlView2.getPaddingTop();
                ViewGroup viewGroup = qd6Var.c;
                int iC = qd6.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, qd6.c(qd6Var.k) + qd6.c(qd6Var.i));
                ViewGroup viewGroup2 = qd6Var.d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (qd6Var.A != z) {
                    qd6Var.A = z;
                    view.post(new md6(qd6Var, i11));
                }
                i = i3 - i != i7 - i5 ? 1 : 0;
                if (!qd6Var.A && i != 0) {
                    view.post(new md6(qd6Var, i10));
                    break;
                }
                break;
        }
    }
}
