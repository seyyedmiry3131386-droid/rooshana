package ir.mservices.market.myAccount.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.og5;
import defpackage.q39;
import defpackage.qg5;
import defpackage.qs3;
import defpackage.s4;
import defpackage.sj8;
import defpackage.yq6;
import defpackage.z0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.myAccount.dialog.MessageAccessLevel;
import ir.mservices.market.myAccount.dialog.PrivacyAccessLevel;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallBoldTextButton;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends qg5 {
    public final og5 w;
    public s4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view, qs3 qs3Var) {
        super(view);
        js3.p(qs3Var, "onClickListener");
        this.w = qs3Var;
    }

    public static int y(Pair pair) {
        Object obj = pair.a;
        Object obj2 = pair.b;
        Object obj3 = null;
        if (obj == MyAccountItemsType.h) {
            String str = (String) obj2;
            PrivacyAccessLevel.c.getClass();
            Iterator it = ((z0) PrivacyAccessLevel.f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((PrivacyAccessLevel) next).a.equals(str)) {
                    obj3 = next;
                    break;
                }
            }
            PrivacyAccessLevel privacyAccessLevel = (PrivacyAccessLevel) obj3;
            return privacyAccessLevel != null ? privacyAccessLevel.b : PrivacyAccessLevel.d.b;
        }
        String str2 = (String) obj2;
        MessageAccessLevel.c.getClass();
        Iterator it2 = ((z0) MessageAccessLevel.f).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((MessageAccessLevel) next2).a.equals(str2)) {
                obj3 = next2;
                break;
            }
        }
        MessageAccessLevel messageAccessLevel = (MessageAccessLevel) obj3;
        return messageAccessLevel != null ? messageAccessLevel.b : MessageAccessLevel.d.b;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) myketRecyclerData;
        js3.p(myAccountLinkItemData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new MyAccountLinkItemViewHolder$onAttach$1(null, myAccountLinkItemData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        int i;
        MyAccountLinkItemData myAccountLinkItemData = (MyAccountLinkItemData) myketRecyclerData;
        js3.p(myAccountLinkItemData, "data");
        SmallBoldTextButton smallBoldTextButton = x().v;
        smallBoldTextButton.setTextColor(sj8.b().c);
        View view = this.a;
        smallBoldTextButton.setText(view.getResources().getString(y((Pair) myAccountLinkItemData.c.a.getValue())));
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i2 = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i2, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i2, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        smallBoldTextButton.setSmallIcon(drawable);
        MyketTextView myketTextView = x().y;
        myketTextView.setBold(true);
        myketTextView.setTextColor(sj8.b().m);
        myketTextView.setText(view.getResources().getString(myAccountLinkItemData.a));
        MyketTextView myketTextView2 = x().x;
        js3.o(myketTextView2, "tag");
        Integer num = myAccountLinkItemData.b;
        if (num != null) {
            int iIntValue = num.intValue();
            MyketTextView myketTextView3 = x().x;
            myketTextView3.setTextColor(sj8.b().n);
            myketTextView3.setText(view.getResources().getString(iIntValue));
            i = 0;
        } else {
            i = 8;
        }
        myketTextView2.setVisibility(i);
        FrameLayout frameLayout = x().w;
        js3.o(frameLayout, "rootLayout");
        qg5.v(frameLayout, this.w, this, myAccountLinkItemData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof s4) {
            this.x = (s4) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final s4 x() {
        s4 s4Var = this.x;
        if (s4Var != null) {
            return s4Var;
        }
        js3.V("binding");
        throw null;
    }
}
