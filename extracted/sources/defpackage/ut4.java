package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.core.CorruptionException;
import androidx.paging.m;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerListDto;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsRecyclerListFragment;
import ir.mservices.market.movie.ui.list.model.a;
import ir.mservices.market.myAccount.dialog.nickname.NicknameAction;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel;
import ir.mservices.market.social.list.common.ProfileListTitleDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.UrlAlertDialogFragment;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class ut4 implements m45, rm1, g71, p42, j6, el, d4, c70, tt5, dt5, zs5, at5 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ut4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static t46 j(Context context, AttributeSet attributeSet) {
        t46 t46Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rt6.PercentLayout_Layout);
        float fraction = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            t46Var = new t46();
            t46Var.a = fraction;
        } else {
            t46Var = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.c = fraction3;
            t46Var.d = fraction3;
            t46Var.e = fraction3;
            t46Var.f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(rt6.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (t46Var == null) {
                t46Var = new t46();
            }
            t46Var.i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        return t46Var;
    }

    @Override // defpackage.g71
    public Object a(CorruptionException corruptionException) {
        return ((ut3) this.b).invoke(corruptionException);
    }

    @Override // defpackage.d4
    public boolean b(View view) {
        o77 o77Var = (o77) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) o77Var.d;
        if (viewPager2.r) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.m45
    public void c() {
        if (((MovieReviewsRecyclerListFragment) this.b).i1 != null) {
            fw0.c("movie_all_reviews");
        } else {
            js3.V("commentAnalytics");
            throw null;
        }
    }

    @Override // defpackage.p42
    public yv6 d() throws Throwable {
        va7 va7VarB;
        IOException iOException = null;
        while (!((fw6) this.b).k.q) {
            try {
                va7VarB = ((fw6) this.b).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    wu8.f(iOException, e);
                }
                if (!((fw6) this.b).a(null)) {
                    throw iOException;
                }
            }
            if (!va7VarB.b()) {
                ua7 ua7VarD = va7VarB.d();
                if (ua7VarD.b == null && ua7VarD.c == null) {
                    ua7VarD = va7VarB.g();
                }
                va7 va7Var = ua7VarD.b;
                Throwable th = ua7VarD.c;
                if (th != null) {
                    throw th;
                }
                if (va7Var != null) {
                    ((fw6) this.b).p.addFirst(va7Var);
                }
            }
            return va7VarB.c();
        }
        throw new IOException("Canceled");
    }

    @Override // defpackage.m45
    public void e() {
        if (((MovieReviewsRecyclerListFragment) this.b).i1 != null) {
            fw0.e("movie_all_reviews");
        } else {
            js3.V("commentAnalytics");
            throw null;
        }
    }

    @Override // defpackage.p42
    public fw6 f() {
        return (fw6) this.b;
    }

    @Override // defpackage.zs5
    public void g() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.el
    public be2 get(int i) {
        return (le2) this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(int i, int i2) {
        t46 t46VarA;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        ViewGroup viewGroup = (ViewGroup) this.b;
        int paddingLeft = (size - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof u46) && (t46VarA = ((u46) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    t46VarA.a(marginLayoutParams, paddingLeft, size2);
                    v46 v46Var = t46VarA.j;
                    ((ViewGroup.MarginLayoutParams) v46Var).leftMargin = marginLayoutParams.leftMargin;
                    ((ViewGroup.MarginLayoutParams) v46Var).topMargin = marginLayoutParams.topMargin;
                    ((ViewGroup.MarginLayoutParams) v46Var).rightMargin = marginLayoutParams.rightMargin;
                    ((ViewGroup.MarginLayoutParams) v46Var).bottomMargin = marginLayoutParams.bottomMargin;
                    v46Var.setMarginStart(marginLayoutParams.getMarginStart());
                    v46Var.setMarginEnd(marginLayoutParams.getMarginEnd());
                    float f = t46VarA.c;
                    if (f >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(paddingLeft * f);
                    }
                    float f2 = t46VarA.d;
                    if (f2 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * f2);
                    }
                    float f3 = t46VarA.e;
                    if (f3 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(paddingLeft * f3);
                    }
                    float f4 = t46VarA.f;
                    if (f4 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * f4);
                    }
                    float f5 = t46VarA.g;
                    boolean z2 = true;
                    if (f5 >= 0.0f) {
                        marginLayoutParams.setMarginStart(Math.round(paddingLeft * f5));
                        z = true;
                    } else {
                        z = false;
                    }
                    float f6 = t46VarA.h;
                    if (f6 >= 0.0f) {
                        marginLayoutParams.setMarginEnd(Math.round(paddingLeft * f6));
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        WeakHashMap weakHashMap = q69.a;
                        marginLayoutParams.resolveLayoutDirection(childAt.getLayoutDirection());
                    }
                } else {
                    t46VarA.a(layoutParams, paddingLeft, size2);
                }
            }
        }
    }

    public xe2 i(HomeMovieBannerListDto homeMovieBannerListDto, String str, String str2, Object obj) {
        return (xe2) new m(gu9.n(false), new a(homeMovieBannerListDto, str, this, str2, obj)).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean k() {
        t46 t46VarA;
        ViewGroup viewGroup = (ViewGroup) this.b;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof u46) && (t46VarA = ((u46) layoutParams).a()) != null) {
                v46 v46Var = t46VarA.j;
                if ((childAt.getMeasuredWidthAndState() & (-16777216)) == 16777216 && t46VarA.a >= 0.0f && ((ViewGroup.MarginLayoutParams) v46Var).width == -2) {
                    layoutParams.width = -2;
                    z = true;
                }
                if ((childAt.getMeasuredHeightAndState() & (-16777216)) == 16777216 && t46VarA.b >= 0.0f && ((ViewGroup.MarginLayoutParams) v46Var).height == -2) {
                    layoutParams.height = -2;
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        bo9 bo9Var = (bo9) this.b;
        bo9Var.l.c(bo9Var, "connection");
        ku2 ku2Var = bo9Var.k;
        ku2Var.getClass();
        sh9 sh9Var = new sh9(bo9Var.f);
        jx jxVar = ku2Var.m;
        jxVar.sendMessage(jxVar.obtainMessage(14, sh9Var));
        ox9 ox9Var = sh9Var.b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o() {
        t46 t46VarA;
        ViewGroup viewGroup = (ViewGroup) this.b;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getChildAt(i).getLayoutParams();
            if ((layoutParams instanceof u46) && (t46VarA = ((u46) layoutParams).a()) != null) {
                v46 v46Var = t46VarA.j;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (!v46Var.b) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).width = ((ViewGroup.MarginLayoutParams) v46Var).width;
                    }
                    if (!v46Var.a) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).height = ((ViewGroup.MarginLayoutParams) v46Var).height;
                    }
                    v46Var.b = false;
                    v46Var.a = false;
                    marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) v46Var).leftMargin;
                    marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) v46Var).topMargin;
                    marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) v46Var).rightMargin;
                    marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) v46Var).bottomMargin;
                    marginLayoutParams.setMarginStart(v46Var.getMarginStart());
                    marginLayoutParams.setMarginEnd(v46Var.getMarginEnd());
                } else {
                    if (!v46Var.b) {
                        layoutParams.width = ((ViewGroup.MarginLayoutParams) v46Var).width;
                    }
                    if (!v46Var.a) {
                        layoutParams.height = ((ViewGroup.MarginLayoutParams) v46Var).height;
                    }
                    v46Var.b = false;
                    v46Var.a = false;
                }
            }
        }
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 3:
            case 6:
                break;
            default:
                UrlAlertDialogFragment urlAlertDialogFragment = (UrlAlertDialogFragment) this.b;
                urlAlertDialogFragment.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("BUNDLE_KEY_CANCEL_TEXT", true);
                urlAlertDialogFragment.N0(DialogResult.b, bundle);
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 3:
                NicknameDialogFragment nicknameDialogFragment = (NicknameDialogFragment) this.b;
                d5 d5Var = nicknameDialogFragment.j1;
                js3.m(d5Var);
                String string = d5Var.A.getEditableText().toString();
                if (string.length() != 0) {
                    nicknameDialogFragment.V0(MyketProgressState.c);
                    ((NicknameDialogViewModel) nicknameDialogFragment.k1.getValue()).r(new NicknameAction.UpdateNicknameAction(string));
                } else {
                    d5 d5Var2 = nicknameDialogFragment.j1;
                    js3.m(d5Var2);
                    MyketTextView myketTextView = d5Var2.y;
                    myketTextView.setVisibility(0);
                    myketTextView.setText(nicknameDialogFragment.L(rs6.account_state_nickname_length_error));
                    d5 d5Var3 = nicknameDialogFragment.j1;
                    js3.m(d5Var3);
                    d5Var3.z.setErrorEnabled(true);
                }
                break;
            case 6:
                ProfileListTitleDialogFragment profileListTitleDialogFragment = (ProfileListTitleDialogFragment) this.b;
                wm1 wm1Var = profileListTitleDialogFragment.i1;
                js3.m(wm1Var);
                Editable text = wm1Var.z.getText();
                if (text == null || f88.n0(text)) {
                    wm1 wm1Var2 = profileListTitleDialogFragment.i1;
                    js3.m(wm1Var2);
                    MyketTextView myketTextView2 = wm1Var2.x;
                    myketTextView2.setVisibility(0);
                    myketTextView2.setText(profileListTitleDialogFragment.L(rs6.profile_list_title_dialog_length_error));
                    wm1 wm1Var3 = profileListTitleDialogFragment.i1;
                    js3.m(wm1Var3);
                    wm1Var3.y.setErrorEnabled(true);
                } else {
                    DialogResult dialogResult = DialogResult.a;
                    Bundle bundle = new Bundle();
                    wm1 wm1Var4 = profileListTitleDialogFragment.i1;
                    js3.m(wm1Var4);
                    Editable text2 = wm1Var4.z.getText();
                    bundle.putString("BUNDLE_KEY_TITLE", text2 != null ? text2.toString() : null);
                    profileListTitleDialogFragment.R0(dialogResult, bundle);
                }
                break;
            default:
                ((UrlAlertDialogFragment) this.b).N0(DialogResult.a, new Bundle());
                break;
        }
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.b).countDown();
    }

    public /* synthetic */ ut4(int i) {
        this.a = i;
        switch (i) {
            case 21:
                this.b = new CountDownLatch(1);
                break;
        }
    }

    public ut4(c05 c05Var) {
        this.a = 1;
        js3.p(c05Var, "movieBannersService");
        this.b = c05Var;
    }

    public ut4(l78 l78Var) {
        this.a = 13;
        js3.p(l78Var, "streamersService");
        this.b = l78Var;
    }

    public ut4(v17 v17Var) {
        this.a = 8;
        js3.p(v17Var, "reelsService");
        this.b = v17Var;
    }

    public ut4(float f, float f2) {
        this.a = 18;
        this.b = new le2(f, f2, 0.01f);
    }

    private final void m() {
    }

    private final void n() {
    }
}
