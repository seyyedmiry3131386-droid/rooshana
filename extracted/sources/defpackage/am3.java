package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.a;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.inbox.recycler.InboxData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.views.MyketTextView;
import ir.myket.core.utils.PersianCalendar;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class am3 extends qg5 {
    public final og5 w;
    public final og5 x;
    public xl3 y;
    public final vl8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(View view, vl3 vl3Var, vl3 vl3Var2) {
        super(view);
        js3.p(vl3Var, "onMoreMenuClickListener");
        js3.p(vl3Var2, "onInboxClickListener");
        this.w = vl3Var;
        this.x = vl3Var2;
        this.z = (vl8) ((w91) qg5.r()).o0.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        String strJ;
        f57 f57VarH;
        InboxData inboxData = (InboxData) myketRecyclerData;
        js3.p(inboxData, "data");
        FrameLayout frameLayout = x().x;
        js3.o(frameLayout, "layout");
        View view = this.a;
        uy6.q(frameLayout, 0, Float.valueOf(view.getResources().getDimensionPixelSize(pq6.space_4)), 1);
        x().z.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.SRC_ATOP));
        x().y.setTypeface((Typeface) kh2.b.a.b);
        InboxInfoModel inboxInfoModel = inboxData.a;
        if (inboxInfoModel.t()) {
            x().A.setTypeface((Typeface) kh2.b.a.b);
            x().A.setTextColor(sj8.b().n);
            x().x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().p, PorterDuff.Mode.MULTIPLY));
        } else {
            x().A.setTypeface((Typeface) kh2.b.b.b);
            x().A.setTextColor(sj8.b().m);
            x().x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().q, PorterDuff.Mode.MULTIPLY));
        }
        x().A.setText(inboxInfoModel.o());
        x().y.setText(inboxInfoModel.i());
        String strG = inboxInfoModel.g();
        if (strG == null || f88.n0(strG)) {
            x().w.setImageResource(yq6.app_icon_gradient);
        } else {
            String strG2 = inboxInfoModel.g();
            if (strG2 == null || f88.n0(strG2)) {
                lw.g(null, "url is empty", null);
                strG2 = "empty_url";
            }
            try {
                f57VarH = a.f(view).q(new ne5(strG2, null));
                js3.m(f57VarH);
            } catch (Exception unused) {
                f57VarH = t61.h(strG2, null, a.e(ApplicationLauncher.o.getApplicationContext()), "load(...)");
            }
            ((f57) f57VarH.k(yq6.app_icon_gradient)).W(uv1.b()).P(x().w);
        }
        MyketTextView myketTextView = x().v;
        vl8 vl8Var = this.z;
        if (vl8Var == null) {
            js3.V("timeUtils");
            throw null;
        }
        long jN = inboxInfoModel.n();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jN);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        Locale locale = Locale.US;
        String str = String.format(locale, "%d:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        if (jr9.t(vl8Var.b)) {
            PersianCalendar persianCalendar = new PersianCalendar();
            persianCalendar.setTimeInMillis(jN);
            strJ = t61.j(String.format(locale, "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(persianCalendar.get(5)), vl8Var.b(persianCalendar.get(2))}, 2)), " ", str);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(jN);
            strJ = t61.j(str, " ", String.format(locale, "%s %d", Arrays.copyOf(new Object[]{gregorianCalendar.getDisplayName(2, 2, locale), Integer.valueOf(gregorianCalendar.get(5))}, 2)));
        }
        myketTextView.setText(lw8.e(vl8Var.a, strJ));
        qg5.v(view, this.x, this, inboxData);
        ImageView imageView = x().z;
        js3.o(imageView, "more");
        qg5.v(imageView, this.w, this, inboxData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof xl3) {
            this.y = (xl3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final xl3 x() {
        xl3 xl3Var = this.y;
        if (xl3Var != null) {
            return xl3Var;
        }
        js3.V("binding");
        throw null;
    }
}
